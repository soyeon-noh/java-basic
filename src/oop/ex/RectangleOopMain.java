package oop.ex;

public class RectangleOopMain {

    public static void main(String[] args) {
        Ractangle ractangle = new Ractangle();
        ractangle.width = 5;
        ractangle.height = 8;

        int area = ractangle.calculateArea(ractangle.width, ractangle.height);
        System.out.println("넓이: " + area);

        int perimeter = ractangle.calculatePerimeter(ractangle.width, ractangle.height);
        System.out.println("둘레 길이: " + perimeter);

        boolean square = ractangle.isSquare(ractangle.width, ractangle.height);
        System.out.println("정사각형 여부: " + square);
    }

}
