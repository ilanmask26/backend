package STUDENT;

public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("ilhan","05555555555","mth");
        Teacher t2=new Teacher("furkan","0555555555","phy");
        Teacher t3=new Teacher("kokbiyik","0555555555","htr");

        Lessons Physics=new Lessons("Physics","phy","101");
        Physics.addTeacher(t2);

        Lessons history=new Lessons("history","htr","101");
        history.addTeacher(t3);

        Lessons mats=new Lessons("mats","mth","101");

        Student inekSaban=new Student("inek saban","1025",mats,Physics,history);
        inekSaban.addBulkExamine(50,60,70);
        inekSaban.addBulkQuiz(50,50,50);
        inekSaban.average(50,60,70,50,50,50);
        inekSaban.isPass();


    }
}
