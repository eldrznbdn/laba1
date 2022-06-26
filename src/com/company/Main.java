package com.company;

public class Main {
    public static void main(String[] args) {
        laptop firstLaptop = new laptop();
        laptop secLaptop = new laptop(23,32,"qatar");
        laptop thirdLaptop = new laptop(302303,242,"cercenitida",32324,2010);

        System.out.println(firstLaptop);
        System.out.println("----------");
        System.out.println(secLaptop);
        System.out.println("----------");
        System.out.println(thirdLaptop);
        System.out.println("----------");
        System.out.println(laptop.getVideoCard());
        System.out.println("----------");

    }

}

