package STUDENT;

public class Student {

    String name;
    float averageNote;
    Lessons l1;
    Lessons l2;
    Lessons l3;
    String stdNo;
    Student(String name,String stdNo,Lessons l1,Lessons l2,Lessons l3){
        this.name=name;
        this.stdNo=stdNo;
        this.l1=l1;
        this.l2=l2;
        this.l3=l3;
        averageNote=0;

    }
    void addBulkExamine(int note1,int note2,int note3){
        if (note1 >= 0 && note1 <= 100) {
            this.l1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.l2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.l3.note = note3;
        }
    }
    void addBulkQuiz(int extra1,int extra2,int extra3){
        if (extra1 >= 0 && extra1 <= 100) {
            this.l1.extra = extra1;
        }
        if (extra2 >= 0 && extra2 <= 100) {
            this.l2.extra = extra2;
        }
        if (extra3 >= 0 && extra3 <= 100) {
            this.l3.extra = extra3;
        }
    }
    public void average(int note1,int extra1,int note2,int extra2,int note3,int extra3){
        this.l1.fin = ((note1 * 80)/100) + ((extra1 * 20)/100);
        this.l2.fin=((note2*80)/100)+((extra2*20)/100);
        this.l3.fin=((note3*80)/100)+((extra3*20)/100);

    }
    boolean isPass(){
        this.averageNote=(l1.fin+l2.fin+l3.fin)/3;
        if (averageNote>=50){
            System.out.println(this.name+"is pass");
            return true;

        }
        else {
            System.out.println(this.name+"fail lame");
            return false;
        }

    }


}
