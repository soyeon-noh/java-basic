package oop.ex;

// 객체에게 물어보고 답을 구할 수 있음.
public class Ractangle {
    int width;
    int height;

    int calculateArea(int width, int height) {
        return width * height;
    }

    int calculatePerimeter(int width, int heigth) {
        return 2 * (width + heigth);
    }

    boolean isSquare(int width, int height) {
        return width == height;
    }
}
