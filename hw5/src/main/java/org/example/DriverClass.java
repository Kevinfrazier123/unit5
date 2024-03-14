package org.example;

//unit5.hw
//Group members: Kevin Frazier

//imports…
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DriverClass {


    // DO NOT CHANGE ANYTHING IN THIS CLASS (DriverClass)

    public static void main(String[] args) {

        Student s;
        //***********
        s = new PhdStudent ("Zaydoun BenSellam",
                "zb5954" ,
                "Gary Richarson",
                "Fuzzy Topology" ,
                2599 );

        s.printInvoice();

        //***********
        int [] gradCrnsTaken = {7587,8997} ;
        s = new MsStudent ( "Emily Jones",
                "em1254",
                gradCrnsTaken,
                1997);


        s.printInvoice();

        //***********
        int [] undergradCrnsTaken = {4587,2599};

        s = new UndergraduateStudent ("Jamila Jones" ,
                "ja5225" ,
                undergradCrnsTaken ,
                3.0,
                false );


        s.printInvoice();




    }//end of main

}
