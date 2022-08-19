package org.example;

public class Main {
    public static void main(String[] args) {

        String test = "임희정 바보";
        int test2 = 12321313;
        int test3 = 10;

        System.out.println("임희정바보");
        System.out.println(test);
        System.out.println(test2 / test3);

        if(test.equals("임희정 바보")){
            System.out.println("바보바보");
        } else{
            System.out.println("천재천재");
        }
        for (int i = 0; i < test3; i++) {
                System.out.println(test + "  = " + i);
        }
    }



}