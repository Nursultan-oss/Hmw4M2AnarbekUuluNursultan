package com.company;
import java.util.*;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args){

        System.out.print("введите имя своих знакомых: ");
        Scanner scan = new Scanner(System.in);
        ArrayList <String>arrayList=new ArrayList<>();
        ArrayList <String>arrayList1=new ArrayList<>();
        while (true){
            for (int i = 0; i < 5; i++) {
                System.out.println ("имя ваших знакомых:"  + arrayList.add(scan.nextLine()));
            }
            break;
        }

        while (true){
            for (int i = 0; i < 5; i++) {
                System.out.println ("имя ваших знакомых:" + arrayList1.add(scan.nextLine()));
            }
            break;
        }
        ArrayList<String> A = new ArrayList<>();
        A.addAll(arrayList);
        System.out.println(A);

        ArrayList<String> B = new ArrayList<>();
        B.addAll(arrayList1);
        System.out.println(B);

        ArrayList <String > C = new ArrayList<>();
        C.addAll(A);
        Collections.reverse(B);
        C.addAll(B);
        Collections.rotate(C.subList(1,6), -1);
        Collections.rotate(C.subList(1,7), -1);
        Collections.rotate(C.subList(1,8), -1);
        Collections.rotate(C.subList(1,9), -1);
        System.out.println(C);
        C.sort(Comparator.comparingInt(String::length));
           C.forEach(System.out::println);








    }
}
