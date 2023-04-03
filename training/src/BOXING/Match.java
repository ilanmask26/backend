package BOXING;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Match(Fighter f1,Fighter f2,int minWeight,int maxWeight){
        if (whoFirst()){
            this.f1=f1;
            this.f2=f2;
        }
        else {
            this.f2=f1;
            this.f1=f2;
        }
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;

    }



    boolean whoFirst(){
        double a=Math.random()*100;
        return a<=50;

    }
    public void run(){
        if (isCheck()){
            while (this.f1.heal>=0||this.f2.heal>=0){
                System.out.println("----NEW ROUND------");
                this.f2.heal=this.f1.hit(f2);
                System.out.println("the "+this.f2.name+" heal is "+this.f2.heal+" the"+this.f1.name+" punched "+this.f1.damage);
                System.out.println("---------------------------------------------");
                if (isWin()){
                    break;
                }
                this.f1.heal=this.f2.hit(f1);
                System.out.println("the "+this.f1.name+" heal is"+this.f1.heal+" the "+this.f2.name+" punched "+this.f2.damage);
                if (isWin()){

                    break;
                }
            }


        }
        else {
            System.out.println("the fighters weight categories are not fitted ");
        }
    }
    boolean isWin(){
        if(this.f1.heal==0){
            System.out.println(f2.name+" is win");
            return true;
        }
        if (this.f2.heal==0){
            System.out.println(f1.name+ " is win");
            return true;

        }
        return false;
    }
    boolean isCheck(){
        return (this.f1.weight>=this.minWeight)&&(this.f2.weight>=this.minWeight)&&(this.f1.weight<=this.maxWeight)&&(this.f2.weight<=this.maxWeight);
    }

}
