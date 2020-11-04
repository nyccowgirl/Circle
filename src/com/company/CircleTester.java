package com.company;

/*
Trang Hoang
CS111B - Assignment 3A
 */

public class CircleTester {

    public static void main(String[] args) {
        // Circle 1:
        Circle circle1 = new Circle();
        circle1.setX(3);
        circle1.setY(4);
        circle1.setRadius(5);
        double areaCircle1 = circle1.getArea();
        System.out.println("C1 x: " + circle1.getX() + "\tC1 y: " + circle1.getY() + "\tC1 area: " + areaCircle1);

        // Circle 2:
        Circle circle2 = new Circle();
        circle2.setX(14);
        circle2.setY(18);
        circle2.setRadius(8);
        double areaCircle2 = circle2.getArea();
        System.out.println("C2 x: " + circle2.getX() + "\tC2 y: " + circle2.getY() + "\tC2 area: " + areaCircle2);


        // Circle 3:
        Circle circle3 = new Circle();
        circle3.setX(2);
        circle3.setY(3);
        circle3.setRadius(12);
        double areaCircle3 = circle3.getArea();
        System.out.println("C3 x: " + circle3.getX() + "\tC3 y: " + circle3.getY() + "\tC3 area: " + areaCircle3);


        // Circle 4:
        Circle circle4 = new Circle();
        circle4.setX(15);
        circle4.setY(28);
        circle4.setRadius(10);
        double areaCircle4 = circle4.getArea();
        System.out.println("C4 x: " + circle4.getX() + "\tC4 y: " + circle4.getY() + "\tC4 area: " + areaCircle4);

        // Circle 5:
        Circle circle5 = new Circle();
        circle5.setX(-10);
        circle5.setY(8);
        circle5.setRadius(30);
        double areaCircle5 = circle5.getArea();
        System.out.println("C5 x: " + circle5.getX() + "\tC5 y: " + circle5.getY() + "\tC5 area: " + areaCircle5);

        // Circle 6:
        Circle circle6 = new Circle();
        circle6.setX(14);
        circle6.setY(-24);
        circle6.setRadius(10);
        double areaCircle6 = circle6.getArea();
        System.out.println("C6 x: " + circle6.getX() + "\tC6 y: " + circle6.getY() + "\tC6 area: " + areaCircle6);

        // Circle 7:
        Circle circle7 = new Circle();
        circle7.setX(3);
        circle7.setY(3);
        circle7.setRadius(1);
        double areaCircle7 = circle7.getArea();
        System.out.println("C7 x: " + circle7.getX() + "\tC7 y: " + circle7.getY() + "\tC7 area: " + areaCircle7);

        // Circle 8:
        Circle circle8 = new Circle();
        circle8.setX(4);
        circle8.setY(2);
        circle8.setRadius(1);
        double areaCircle8 = circle8.getArea();
        System.out.println("C8 x: " + circle8.getX() + "\tC8 y: " + circle8.getY() + "\tC8 area: " + areaCircle8);

        // Test overlapping
        System.out.println("Overlap (C1 + C2)? " + circle1.doesOverlap(circle2));
        System.out.println("Overlap (C3 + C4)? " + circle3.doesOverlap(circle4));
        System.out.println("Overlap (C5 + C6)? " + circle5.doesOverlap(circle6));
        System.out.println("Overlap (C7 + C8)? " + circle7.doesOverlap(circle8));
    }
}


/*
C1 x: 3.0	C1 y: 4.0	C1 area: 78.537975
C2 x: 14.0	C2 y: 18.0	C2 area: 201.057216
C3 x: 2.0	C3 y: 3.0	C3 area: 452.378736
C4 x: 15.0	C4 y: 28.0	C4 area: 314.1519
C5 x: -10.0	C5 y: 8.0	C5 area: 2827.3671
C6 x: 14.0	C6 y: -24.0	C6 area: 314.1519
C7 x: 3.0	C7 y: 3.0	C7 area: 3.141519
C8 x: 4.0	C8 y: 2.0	C8 area: 3.141519
distance: 17.804493814764857
radius sum: 13.0
Overlap (C1 + C2)? false
distance: 28.178005607210743
radius sum: 22.0
Overlap (C3 + C4)? false
distance: 40.0
radius sum: 40.0
Overlap (C5 + C6)? true
distance: 1.4142135623730951
radius sum: 2.0
Overlap (C7 + C8)? true

Process finished with exit code 0
 */
