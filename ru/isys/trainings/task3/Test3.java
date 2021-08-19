package ru.isys.trainings.task3;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Scanner;


public class Test3 {

    public static String getFirstUpper(String str){
        return str.substring(0, 1).toUpperCase()+str.substring(1);

    }

    public static String GetGetter(String type, String fieldName){
        String result = "public "+ type + " get"+getFirstUpper(fieldName)+"() {\n" +
                "    return this."+fieldName+";\n" +
                "}";

        return result;
    }

    public static String GetSetter(String type, String fieldName){
        String result = "public "+ type + " set"+getFirstUpper(fieldName)+"("+type+" "+fieldName+") {\n" +
                "    return this."+fieldName+" = "+fieldName+ ";\n" +
                "}";
        return result;
    }

    public static void printList( Student[] array) {
        for(Student student : array){
            System.out.println(student.toString());
        }
    }


    public static void getDiff() {
        int secondDay = LocalTime.now().get(ChronoField.SECOND_OF_DAY);
        System.out.println(" current sec =" + secondDay);
        int result = 60 * 60 * 24 - secondDay;
        System.out.println(" sec to midnight =" + result);
    }


   /* public static int[] selectionsort(  int* r) {
        for (int *i = l; i < r; i++) {
            int minz = *i, *ind = i;
            for (int *j = i + 1; j < r; j++) {
                if (*j < minz) minz = *j, ind = j;
            }
            swap(*i, *ind);
        }
    }*/


    public static void main(String[] args){
        System.out.println("TASK3");
        System.out.println("------------------------------------------");
        System.out.println(" 1");
        System.out.println(GetGetter("String", "firstName"));
        System.out.println("------------------------------------------");
        System.out.println(GetSetter("String", "firstName"));
        System.out.println("------------------------------------------");
        System.out.println(" 2");

        Student st1 = new Student();
        st1.setStudentId(1);
        st1.setStudentName("Иванов Иван Иванович");
        st1.setSalary(100.1);
        Student st2 = new Student();
        st2.setStudentId(2);
        st2.setStudentName("Петров Иван Иванович");
        st2.setSalary(102.1);
        Student st3 = new Student();
        st3.setStudentId(3);
        st3.setStudentName("Сидоров Иван Иванович");
        st3.setSalary(103.1);

        Student[] array = new Student[3];
        array[0] = st1;
        array[1] = st2;
        array[2] = st3;

        printList(array);

        System.out.println("------------------------------------------");
        System.out.println(" 3");
        getDiff();






    }




}