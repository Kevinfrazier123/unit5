package org.example;

class MsStudent extends GraduateStudent {
    // . . .


    public MsStudent (String name, String id , int [] gradCrnsTaken , int crn ) {
        // gradCoursesTaken is the array of the crns that the Ms student is taking
        //crn is the course number that the Phd student is a teaching assistant for

        super ( name , id , crn );
        // . . .


    }
    @Override
    public void printInvoice() {
        // . . .


    }

}
