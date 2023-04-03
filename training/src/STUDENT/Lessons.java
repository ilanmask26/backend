package STUDENT;

public class Lessons {
    String prefix;
    String code;
    String name;
    int note;
    int extra;

    int fin;
    Teacher teacher;
    Lessons(String name,String prefix,String code){
        this.name=name;
        this.code=code;

        this.prefix=prefix;
        this.note=0;
    }
    void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch)){
            this.teacher=t;
        }
        else {
            System.out.println("this academicians branch has to be compromised");
        }
    }
    void printTeacher(){
        this.teacher.print();

    }

}
