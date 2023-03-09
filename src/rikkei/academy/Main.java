package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng: ");
        double width = scanner.nextDouble();
        System.out.println("Nhập chiều dài: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println("Your Rectangle \n" +rectangle.display());
        System.out.println("Primeter of the rectangle: " +rectangle.getPerimeter());
        System.out.println("Area of the rectangle: "+ rectangle.getArea());
    }
}
