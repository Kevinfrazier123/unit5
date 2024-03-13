class PhdStudent extends GraduateStudent {
// . . .


    public PhdStudent (String name, String id , String advisor, String researchSubject , int crn ) {
//crn is the course number that the Phd student is a teaching assistant for

        super ( name , id , crn );
        // . . .

    }

    @Override
    public void printInvoice() {
        // . . .

    }
}

