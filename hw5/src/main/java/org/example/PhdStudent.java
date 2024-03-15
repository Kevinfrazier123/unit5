package org.example;

class PhdStudent extends GraduateStudent {

    // Private fields

private String name;
private String id;
private String advisor;
private String researchSubject;
private int crn;


    public PhdStudent (String name, String id , String advisor, String researchSubject , int crn ) {
//crn is the course number that the Phd student is a teaching assistant for

        super ( name , id , crn );
        // . . .
        this.name = name;
        this.id = id;
        this.advisor = advisor;
        this.researchSubject = researchSubject;
        this.crn = crn;

    }

    @Override
    public void printInvoice() {

        double research = 700;
        double health = 35;
        double total = research + health;
        


        System.out.println("\nVALENCE COLLEGE");
        System.out.println("ORLANDO FL 10101");
        System.out.println("-----------------------------------");

        System.out.println("Fee Invoice Prepared for Student: " + "\n"+
                id + " - " + name);
        System.out.println("\n RESEARCH                 $" + research + "");
        System.out.println(researchSubject + "\n");
        System.out.println("         Health & id fees " + "$" + health );
        System.out.println("-----------------------------");
        System.out.println("Total Payments      $" + total);




    }














}