package com.baitap;

public class ShapeDrawer {
    public void drawSolidTriangle(int h) {
        int i;
        int j;
        for (i = 0; i < h; i++) {

            for (j = 0; j < h - i; j++) {
                System.out.println(" ");

            }
            for (j = 0; j <=i; j ++) {
                System.out.println("* ");
            }
            System.out.println("");
        }
    }
}
