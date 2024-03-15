package org.example;

class UndergraduateStudent extends Student{

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

                }   }       }



        // Add health and id fees
        totalPayment += 35;
        double discount = totalPayment * 0.25;
        // Apply discount if GPA is 3.5 or higher and total payments exceed $700
        if (gpa >= 3.5 && totalPayment > 700) {
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
                case 4587:
                    System.out.println("4587    MAT 236     4" + "      $"  + (120.25 * 4));
                    break;
                case 4599:
                    System.out.println("4599    COP 220     3" + "      $"  + (120.25 * 3));
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

                /*    //finish rest of crns from hw
                case 2599:
                    System.out.println("2599    COP 260     3" + "      $ " + (120.25 * 3));
                    break;
                case 1997:
                    System.out.println("1997    CAP 424     1" + "      $ " + (120.25 * 1));
                    break;
                case 3696:
                    System.out.println("3696    KOL 110     2" + "      $ " + (120.25 * 2));
                    break;

*/
            }
        }

        System.out.println("Health & id fees $      35.00");
        //System.out.println("--------------------------------------");



        // Calculating total payments
        System.out.println("-----------------------------------");
        System.out.println("Total Payments: $" + String.format("%.2f", calculateTotalPayment()));



    }
}


