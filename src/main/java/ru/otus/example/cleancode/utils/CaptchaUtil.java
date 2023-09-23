package ru.otus.example.cleancode.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import java.util.stream.IntStream;

public class CaptchaUtil {

    private String captchaString = "";

    private final Color BACKGROUND_COLOR = Color.white;
    private final Color BORDER_COLOR = Color.black;
    private final Color TEXT_COLOR = Color.black;
    private final Color CIRCLE_COLOR = new Color(190, 160, 150);

    private final int WIDTH = 200;
    private final int HEIGHT = 35;

    private final Font TEXT_FONT = new Font("Verdana", Font.PLAIN, 24);

    public BufferedImage getCaptchaImage() {

        try {

            BufferedImage bufferedImage = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

            Graphics2D graphics2D = (Graphics2D) bufferedImage.getGraphics();
            graphics2D.setColor(BACKGROUND_COLOR);
            graphics2D.fillRect(0, 0, WIDTH, HEIGHT);
            graphics2D.setColor(CIRCLE_COLOR);

            IntStream.range(0, 25).map(i -> (int) (Math.random() * HEIGHT / 2.0)).forEach(L -> {
                int X = (int) (Math.random() * WIDTH - L);
                int Y = (int) (Math.random() * HEIGHT - L);
                graphics2D.draw3DRect(X, Y, L * 2, L * 2, true);
            });

            graphics2D.setColor(TEXT_COLOR);
            graphics2D.setFont(TEXT_FONT);

            FontMetrics fontMetrics = graphics2D.getFontMetrics();

            int maxAdvance = fontMetrics.getMaxAdvance();
            int fontHeight = fontMetrics.getHeight();

            String elegibleChars = "ABCDEFGHJKLMNPQRSTUVWXYabcdefghjkmnpqrstuvwxy23456789";
            char[] chars = elegibleChars.toCharArray();
            float horizMargin = 12.0f;
            float spaceForLetters = -horizMargin * 2 + WIDTH;
            int charsToPrint = 6;
            float spacePerChar = spaceForLetters / (charsToPrint - 1.0f);
            StringBuilder finalString = new StringBuilder();
            IntStream.range(0, charsToPrint).forEach(i -> {
                double randomValue = Math.random();
                int randomIndex = (int) Math.round(randomValue * (chars.length - 1));
                char characterToShow = chars[randomIndex];
                finalString.append(characterToShow);
                int charWidth = fontMetrics.charWidth(characterToShow);
                int charDim = Math.max(maxAdvance, fontHeight);
                int halfCharDim = charDim / 2;
                BufferedImage charImage = new BufferedImage(charDim, charDim, BufferedImage.TYPE_INT_ARGB);
                Graphics2D charGraphics = charImage.createGraphics();
                charGraphics.translate(halfCharDim, halfCharDim);
                double rotationRange = 0.8;
                double angle = (Math.random() - 0.5) * rotationRange;
                charGraphics.transform(AffineTransform.getRotateInstance(angle));
                charGraphics.translate(-halfCharDim, -halfCharDim);
                charGraphics.setColor(TEXT_COLOR);
                charGraphics.setFont(TEXT_FONT);
                int charX = (int) (0.5 * charDim - 0.5 * charWidth);
                charGraphics.drawString("" + characterToShow, charX, ((charDim - fontMetrics.getAscent()) / 2 + fontMetrics.getAscent()));
                float x = horizMargin + spacePerChar * (i) - charDim / 2.0f;
                int y = (HEIGHT - charDim) / 2;
                graphics2D.drawImage(charImage, (int) x, y, charDim, charDim, null, null);
                charGraphics.dispose();
            });
            graphics2D.setColor(BORDER_COLOR);
            graphics2D.drawRect(0, 0, WIDTH - 1, HEIGHT - 1);
            graphics2D.dispose();
            captchaString = finalString.toString();
            return bufferedImage;
        } catch (Exception ioe) {
            throw new RuntimeException("Unable to build image", ioe);
        }

    }

    public String getCaptchaString() {
        return captchaString;
    }

}