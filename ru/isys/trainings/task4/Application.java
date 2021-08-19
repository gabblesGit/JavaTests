package ru.isys.trainings.task4;

import ru.isys.trainings.task4.figure.triangle.Triangle;
import ru.isys.trainings.task4.figure.rectangle.Rectangle;

import java.util.*;

public class Application {


    public static String  generateRandomStr(int len){
        String Symbols = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        String str = "";

        for (int i = 0; i < len; i++) {
            str = str + Symbols.charAt(random.nextInt(Symbols.length()));
        }
        return str;
    }

    public static void main(String[] args) {

        Rectangle Rctngl = new Rectangle (10, 5);
        Rectangle Rctngl2 = new Rectangle (2, 5);

        System.out.println(Rctngl);

        System.out.println(Rctngl2);

        System.out.println(Rctngl.compareTo(Rctngl2));


        ArrayList<Triangle.tTriangle> arrTriangle = new ArrayList<>();
        arrTriangle.add( new Triangle.tTriangle(10,10,90));
        arrTriangle.add( new Triangle.tTriangle(6,7,40));
        arrTriangle.add( new Triangle.tTriangle(8,9,60));
        arrTriangle.add( new Triangle.tTriangle(10,11,40));


        ArrayList<Rectangle> arrRectangle = new ArrayList<>();
        arrRectangle.add( new Rectangle(20,10));
        arrRectangle.add( new Rectangle(50,10));
        arrRectangle.add( new Rectangle(30,10));
        arrRectangle.add( new Rectangle(10,10));
        arrRectangle.add( new Rectangle(40,10));


        Collections.sort(arrTriangle);

        for (Triangle.tTriangle t : arrTriangle)
            System.out.println("list " + t.toString());

        Collections.sort(arrTriangle, new Triangle.TriCompare());

        for (Triangle.tTriangle t : arrTriangle)
            System.out.println("list " + t.toString());

        Collections.sort(arrRectangle);

        Map<Double, Rectangle> treeMapRectangle = new TreeMap<>();

        for (Rectangle t : arrRectangle) {
            System.out.println("list rectangle  " + t.toString());
            treeMapRectangle.put(t.GetPerimeter(), t);
        }

        System.out.println(" treemap: ");
        for (Map.Entry<Double, Rectangle> e : treeMapRectangle.entrySet()){
            System.out.println(e.getKey() + "" + e.getValue());
        }

        ArrayList<String> arr = new ArrayList<String>();

        LinkedList<String> arrLink = new LinkedList<String>();

        String genStr = "";

        class diff {
            long TimeStart= 0;
            long TimeEnd = 0;

            public diff(long timeStart) {
                TimeStart = timeStart;
            }

            public long getDiff(){
                return this.TimeEnd-this.TimeStart;
            }


            @Override
            public String toString() {
                return "diff = " + this.getDiff() ;
            }
        }

        for (int i = 0; i < 1000000; i++){
            genStr = generateRandomStr(20) ;
            arr.add(genStr);
            arrLink.add(genStr);
        }

        System.out.println("добавление");
        genStr = generateRandomStr(20) ;

        diff arrDiff = new diff(System.nanoTime());
        arr.add(0, genStr);
        arrDiff.TimeEnd = System.nanoTime();

        diff arrLinkDiff = new diff(System.nanoTime());
        arrLink.add(0, genStr);
        arrLinkDiff.TimeEnd = System.nanoTime();
        System.out.println("в начало списка arr " + arrDiff + " arrLink " + arrLinkDiff);

        arrDiff.TimeStart = System.nanoTime();
        arr.add(50000, genStr);
        arrDiff.TimeEnd = System.nanoTime();

        arrLinkDiff.TimeStart = System.nanoTime();
        arrLink.add(50000, genStr);
        arrLinkDiff.TimeEnd = System.nanoTime();
        System.out.println("в середину списка arr " + arrDiff + " arrLink " + arrLinkDiff);

        arrDiff.TimeStart = System.nanoTime();
        arr.add(100000, genStr);
        arrDiff.TimeEnd = System.nanoTime();

        arrLinkDiff.TimeStart = System.nanoTime();
        arrLink.add(100000, genStr);
        arrLinkDiff.TimeEnd = System.nanoTime();
        System.out.println("в конец списка arr " + arrDiff + " arrLink " + arrLinkDiff);


////////////////////
        System.out.println("удаление");

        arrDiff.TimeStart = System.nanoTime();
        arr.remove(0);
        arrDiff.TimeEnd = System.nanoTime();

        arrLinkDiff.TimeStart = System.nanoTime();
        arrLink.remove(0);
        arrLinkDiff.TimeEnd = System.nanoTime();
        System.out.println("из начала списка arr " + arrDiff + " arrLink " + arrLinkDiff);

        arrDiff.TimeStart = System.nanoTime();
        arr.remove(50000);
        arrDiff.TimeEnd = System.nanoTime();

        arrLinkDiff.TimeStart = System.nanoTime();
        arrLink.remove(50000);
        arrLinkDiff.TimeEnd = System.nanoTime();
        System.out.println("из середины списка arr " + arrDiff + " arrLink " + arrLinkDiff);

        arrDiff.TimeStart = System.nanoTime();
        arr.remove(100000);
        arrDiff.TimeEnd = System.nanoTime();

        arrLinkDiff.TimeStart = System.nanoTime();
        arrLink.remove(100000);
        arrLinkDiff.TimeEnd = System.nanoTime();
        System.out.println("из конца списка arr " + arrDiff + " arrLink " + arrLinkDiff);

        ////////////////////
        System.out.println("получение");
        String element = "";
        arrDiff.TimeStart = System.nanoTime();
        element = arr.get(0);
        arrDiff.TimeEnd = System.nanoTime();

        arrLinkDiff.TimeStart = System.nanoTime();
        element = arrLink.get(0);
        arrLinkDiff.TimeEnd = System.nanoTime();
        System.out.println("из начала списка arr " + arrDiff + " arrLink " + arrLinkDiff);

        arrDiff.TimeStart = System.nanoTime();
        element = arr.get(50000);
        arrDiff.TimeEnd = System.nanoTime();

        arrLinkDiff.TimeStart = System.nanoTime();
        element = arrLink.get(50000);
        arrLinkDiff.TimeEnd = System.nanoTime();
        System.out.println("из середины списка arr " + arrDiff + " arrLink " + arrLinkDiff);

        arrDiff.TimeStart = System.nanoTime();
        element = arr.get(100000);
        arrDiff.TimeEnd = System.nanoTime();

        arrLinkDiff.TimeStart = System.nanoTime();
        element = arrLink.get(100000);
        arrLinkDiff.TimeEnd = System.nanoTime();
        System.out.println("из конца списка arr " + arrDiff + " arrLink " + arrLinkDiff);

////////////////////
        System.out.println("проход");
        arrDiff.TimeStart = System.nanoTime();
        for (String t : arr)
            element = t;
        arrDiff.TimeEnd = System.nanoTime();
        arrLinkDiff.TimeStart = System.nanoTime();
        for (String t : arrLink)
            element = t;
        arrLinkDiff.TimeEnd = System.nanoTime();
        System.out.println("перебор arr  " + arrDiff + " arrLink " + arrLinkDiff);

    }


}
