package org.example;

abstract class GraduateStudent extends Student {
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

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCrn(int crn) {
        this.crn = crn;
    }

    public int getCrn() {
        return crn;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

}
