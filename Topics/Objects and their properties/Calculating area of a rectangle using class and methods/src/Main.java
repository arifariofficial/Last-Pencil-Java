import java.util.Scanner;

public class Main {
    /**
     * Create the Rectangle class here
     * Add a constructor and a method "calculateArea"
     * Don't forget to mark the instance variables as private!
     */

    public static class Rectangle {
        private double width;
        private  double height;

        public Rectangle(double height, double width){
            this.height = height;
            this.width = width;
        }
        public double calculateArea (){
           return width * height;
        }
    }

    public static void main(String[] args) {
        //  Create a Scanner object to read input from console
        Scanner scanner = new Scanner(System.in);

        //  Read the width and the height of the rectangle from console
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        /**
         * Create an object of your Rectangle class, using width and height read from the console
         * then call your "calculateArea" method and print the result
         */

       Rectangle rectangle = new Rectangle(height, width);

        System.out.printf("%.2f", rectangle.calculateArea());
    }
}