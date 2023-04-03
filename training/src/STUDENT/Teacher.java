package STUDENT;

public class Teacher {
    String name;
    String phNo;
    String branch;
    Teacher(String name,String phNo,String branch){
        this.name=name;
        this.phNo=phNo;
        this.branch=branch;
    }
    void print(){
        System.out.println("Teachers name is\t"+this.name);
        System.out.println("teachers phone numbers\t"+this.phNo);
        System.out.println("Teachers bramch is\t"+this.branch);
    }

}
