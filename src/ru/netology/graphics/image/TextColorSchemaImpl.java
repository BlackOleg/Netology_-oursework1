package ru.netology.graphics.image;

public class TextColorSchemaImpl implements TextColorSchema {
    final static char[] pixel = {'#', '$', '@', '%', '*', '+', '-', '`'};
    @Override
    public char convert(int color) {
        final double coef = 7 * (double) color/255;
        final int colorItem = (int) Math.round(coef);
        return pixel[colorItem];
    }
}
