package org.example;

//unit5.hw
//Group members: Kevin Frazier, Devin Seepersaud

//imports…

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


    abstract static class GraduateStudent extends Student {
    // . . .
        String name;
        String id;
        int crn;

        public GraduateStudent (String name , String id , int crn ) {
    //crn is the crn that the grad student is a teaching assistant for

            super ( name , id );
            // . . .
            this.crn = crn;

        }

        public int getCrn() {
            return crn;
        }

        public void setCrn(int crn) {
            this.crn = crn;
        }
    }

    static class MsStudent extends GraduateStudent {

        private String name;
        private String id;
        private int [] gradCrnsTaken;
        private int crn;


        public MsStudent (String name, String id , int [] gradCrnsTaken , int crn ) {
            // gradCoursesTaken is the array of the crns that the Ms student is taking
            //crn is the course number that the Phd student is a teaching assistant for

            super ( name , id , crn );
            this.name = name;
            this.id = id;
            this.crn = crn;


            this.gradCrnsTaken = gradCrnsTaken;


        }


        private double calculateTotalPayment() {

            double healthFee = 35.00;
            double totalPayment = 0;

            for(Integer crn : gradCrnsTaken) {
                switch(crn) {
                    case 8997:
                        totalPayment += 1 * 300.00;
                        break;
                    case 9696:
                        totalPayment += 3 * 300.00;
                        break;
                    case 5696:
                        totalPayment += 1 * 300.00;
                        break;
                    case 6997:
                        totalPayment += 1 * 300.00;
                        break;
                    case 7587:
                        totalPayment += 5 * 300.00;
                        break;
                    case 5580:
                        totalPayment += 2 * 300.00;
                        break;
                }
            }

            return totalPayment + healthFee;
        }
        @Override
        public void printInvoice() {
            System.out.println("\nVALENCE COLLEGE");
            System.out.println("ORLANDO FL 10101");
            System.out.println("--------------------");
            System.out.print("\n");
            System.out.println("Fee Invoice Prepared for Student: " + "\n" + id + " - " + name);
            System.out.println("\n1 Credit Hour = $300.00 \n");
            System.out.println("CRN     CR_PREFIX   CR_HOURS");

            for(Integer crn : gradCrnsTaken) {
                switch(crn) {
                    case 8997:
                    System.out.println("8997    GOL 124     1" + "       $" + String.format("%.2f", 300.00 * 1));
                    break;
                    case 9696:
                        System.out.println("9696    COP 100     3" + "       $" + String.format("%.2f", 300.00 * 3));
                        break;
                    case 5696:
                        System.out.println("5696    KOL 110     2" + "       $" + String.format("%.2f", 300.00 * 2));
                        break;
                    case 7587:
                        System.out.println("7587    MAT 936     5" + "       $" + String.format("%.2f", 300.00 * 5));
                        break;
                    case 6996:
                        System.out.println("6996    GOL 109     1" + "       $" + String.format("%.2f", 300.00 * 1));
                        break;
                    case 5580:
                        System.out.println("5580    MAT 636     2" + "       $" + String.format("%.2f", 300.00 * 3));
                        break;
                }
            }

            System.out.print("\n");
            System.out.println("\tHealth & id fees    $35.00");
            System.out.println("-----------------------------------");
            System.out.println("\tTotal Payments:     $" + String.format("%.2f", calculateTotalPayment()));
        }

        }

    static class PhdStudent extends GraduateStudent {

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
            this.crn = crn;
            this.advisor = advisor;
            this.researchSubject = researchSubject;


        }

        public String getAdvisor() {
            return advisor;
        }

        public void setAdvisor(String advisor) {
            this.advisor = advisor;
        }

        public String getResearchSubject() {
            return researchSubject;
        }

        public void setResearchSubject(String researchSubject) {
            this.researchSubject = researchSubject;
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

    abstract public static class Student {

        // . . .
        String name;
        String id;


        // This is the constructor (All abstract classes got this)
        public Student ( String name , String id) {

            // . . .
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        abstract public void printInvoice();



    }

    static class UndergraduateStudent extends Student {

    // Private data fields
        private String name;
        private String id;
        private double gpa;
        private int [] undergradCrnsTaken;
        private boolean resident;


        public UndergraduateStudent(String name , String id , int [] undergradCrnsTaken , double gpa, boolean resident) {
            super (name , id );

            this.name = name;
            this.id = id;
            this.undergradCrnsTaken = undergradCrnsTaken;
            this.gpa = gpa;
            this.resident = resident;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        public int[] getUndergradCrnsTaken() {
            return undergradCrnsTaken;
        }

        public void setUndergradCrnsTaken(int[] undergradCrnsTaken) {
            this.undergradCrnsTaken = undergradCrnsTaken;
        }

        public boolean isResident() {
            return resident;
        }

        public void setResident(boolean resident) {
            this.resident = resident;
        }

        private double calculateTotalPayment() {

            double totalPayment = 0;

            if (resident == true) {

                for (Integer crn : undergradCrnsTaken) {
                    // Adjust total payment based on credit hours for each course
                    switch (crn) {
                        case 4587:
                            totalPayment += 4 * 120.25; // Credit hours * cost per credit hour
                            break;
                        case 2599:
                            totalPayment += 3 * 120.25;
                            break;
                        case 8997:
                            totalPayment += 1 * 120.25;
                            break;
                        case 9696:
                            totalPayment += 3 * 120.25;
                            break;
                       case 4580:
                           totalPayment += 4 * 120.25;
                           break;
                        case 1997:
                            totalPayment += 3 * 120.25;
                            break;
                        case 1599:
                            totalPayment += 1 * 120.25;
                            break;
                        case 2696:
                            totalPayment += 3 * 120.25;
                            break;
                        case 2099:
                            totalPayment += 4 * 120.25;
                            break;
                        case 4997:
                            totalPayment += 3 * 120.25;
                            break;
                        case 3696:

                        // Add cases for other CRNs similarly
                    }
                }
            } else {
                for (Integer crn : undergradCrnsTaken) {
                    // Adjust total payment based on credit hours for each course
                    switch (crn) {
                        case 4587:
                            totalPayment += (4 * 120.25) * 2; // Credit hours * cost per credit hour
                            break;
                        case 2599:
                            totalPayment += (3 * 120.25) * 2;
                            break;
                        case 8997:
                            totalPayment += (1 * 120.25) * 2 ;
                            break;
                        case 9696:
                            totalPayment += (3 * 120.25) * 2;
                            break;
                        case 4580:
                            totalPayment += (1 * 120.25) * 2 ;
                            break;
                        case 1997:
                            totalPayment += (3 * 120.25) * 2;
                            break;
                        case 1599:
                            totalPayment += (4 * 120.25) * 2;
                            break;
                        case 2696:
                            totalPayment += (3 * 120.25) * 2;
                            break;
                        case 2099:
                            totalPayment += (1 * 120.25) * 2 ;
                            break;
                        case 4997:
                            totalPayment += (3 * 120.25) * 2;
                            break;
                        case 3696:
                            totalPayment += (3 * 120.25) * 2;
                            break;

                    }
                }
            }



            // Add health and id fees
            totalPayment += 35;
            double discount = totalPayment * 0.25;
            // Apply discount if GPA is 3.5 or higher and total payments exceed $500
            if (gpa >= 3.5 && totalPayment > 500) {
                System.out.println("               $" + totalPayment);
                System.out.println("\n            -$" + String.format("%.2f", discount));
                System.out.println("                  -----");
                ;totalPayment *= 0.75; // 25% discount
            }
            return totalPayment;
        }

        @Override
        public void printInvoice() {
            // . . .
            System.out.println("\nVALENCE COLLEGE");
            System.out.println("ORLANDO FL 10101");
            System.out.println("-----------------------------------");

            System.out.println("Fee Invoice Prepared for Student: " + "\n"+
                    id + " - " + name);
            System.out.println(" 1 Credit Hour = $120.25 \n");
            System.out.println("CRN     CR_PREFIX   CR_HOURS");



            double totalCost = 0;
            for (Integer crn : undergradCrnsTaken) {

                switch (crn) {
                    case 4599:
                        System.out.println("4599    COP 220     3" + "      $"  + (120.25 * 3));
                        break;
                    case 4587:
                        System.out.println("4587    MAT 236     4" + "      $"  + (120.25 * 4));
                        break;
                    case 8997:
                        System.out.println("8997    GOL 124     1" +  "     $" + (120.25 * 1));
                        break;
                    case 9696:
                        System.out.println("9696    COP 100     3" + "      $" + (120.25 * 3));
                        break;
                    case 4580:
                        System.out.println("4580    MAT 136     1" + "      $ " + (120.25 * 1));
                        break;
                    case 2599:
                        System.out.println("2599    COP 260     3" + "      $ " + (120.25 * 3));
                        break;
                    case 1997:
                        System.out.println("1997    CAP 424     1" + "      $ " + (120.25 * 1));
                        break;
                    case 3696:
                        System.out.println("3696    KOL 110     2" + "      $ " + (120.25 * 2));
                        break;


                }
            }

            System.out.println("Health & id fees $      35.00");
            //System.out.println("--------------------------------------");



            // Calculating total payments
            System.out.println("-----------------------------------");
            System.out.println("Total Payments: $" + String.format("%.2f", calculateTotalPayment()));



        }
    }
}
