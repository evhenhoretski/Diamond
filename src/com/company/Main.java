package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/*
 * Evhen Horetski
 * 2019.09.09
 * 243 group
 * department Software Engineer
 * IFTKN
 */

//Copyright Lusuy


public class Main {

    public static void main(String[] args)
    {
        Diamond r1 = new Diamond(3, 1/2)
        {
            @Override
            public void setSide() {

            }

            @Override
            public float IGeometry() {
                return 0;
            }

            @Override
            public float getInscribedRadius() {
                return 0;
            }
        };

        Square s1 = new Square(6) {
            @Override
            public void setSide() {

            }

            @Override
            public float getDescribedRadius() {
                return 0;
            }
        };
        Square s2 = new Square(9) {
            @Override
            public void setSide() {

            }

            @Override
            public float getDescribedRadius() {
                return 0;
            }
        };

        List<IGeometry> list = new ArrayList<>();

        list.add(r1);

        list.add(s1);
        list.add(s2);

        int a = 3;
        double sum1 = 0;

        for (IGeometry figure : list) sum1 += figure.getArea();

        double totalArea = list.stream().mapToDouble(figure -> figure.getArea()).sum();
        double maxArea = list.stream().mapToDouble(IGeometry::getArea).max().orElse(0);
        double minArea = list.stream().mapToDouble(IGeometry::getArea).min().orElse(0);
        double avArea = list.stream().mapToDouble(IGeometry::getArea).average().orElse(0);
        double areaCount = list.stream().mapToDouble(IGeometry::getArea).count();


        Stream<IGeometry> over20 = list.stream().filter(element -> element.getArea() > 20);


        System.out.println(r1.toString());


        DiamondService service = new DiamondService() {
            @Override
            public float IGeometry() {
                return 0;
            }

            @Override
            public float getDescribedRadius() {
                return 0;
            }
        };

        service.setDiamond(new Diamond(3, 1/2)
        {
            @Override
            public void setSide() {

            }

            @Override
            public float IGeometry() {
                return 0;
            }

            @Override
            public float getInscribedRadius()
            {
                return (float)((getArea() /  (2 * a)));
            }
        });

        System.out.println(service.getArea());
    }
}


/*
public class Main
{

    public static void main(String[] args)
    {
        int a = 4;
        //int b = 4;
        float radius = (float)(((a * Math.sqrt(2 + 2 * Math.sqrt(3)/2)) * (a * Math.sqrt(2 - 2 * Math.sqrt(3)/2))) / (4 * a));
        float perimeter = 2 * (a + a);
        float area =  (float)(Math.pow(a, 2) * Math.sqrt(3)/2);
        float D = (float)(a * Math.sqrt(2 + 2 * Math.sqrt(3)/2));
        float d = (float)(a * Math.sqrt(2 - 2 * Math.sqrt(3)/2));


        Diamond myDiamond = new Diamond(4, (float) ( Math.sqrt(3) / 2 )) {
            @Override
            public float getInscribedRadius() {
                return (float)((getArea() /  (2 * a)));
            }
        };

        System.out.println("Radius = " + myDiamond.getInscribedRadius());
        System.out.println("Perimeter = " + myDiamond.getPerimeter());
        System.out.println("Area = " + myDiamond.getArea());
        System.out.println(myDiamond.toString());
        System.out.println(myDiamond.hashCode());

        Person evhen = new Person("Evhen", LocalDate.of(2001, 02, 25), true);
        Student evhenStudent = new Student(evhen, "0683501313", "243");

    }
}
*/

