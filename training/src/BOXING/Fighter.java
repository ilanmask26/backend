package BOXING;

public class Fighter {
    int heal;
    int damage;
    String name;
    int dodge;
    int weight;
    Fighter(String name,int weight,int heal,int damage,int dodge){
        this.name=name;
        this.weight=weight;
        this.heal=heal;
        this.damage=damage;
        this.dodge=dodge;

    }
    public  int hit(Fighter foe){
        if (isDodge()){
            System.out.println(foe.name+" is block that damage");
            return foe.heal;
        }
        if (foe.heal-this.damage<0){
            return 0;
        }

        return foe.heal-this.damage;


    }
    boolean isDodge(){
        double random= Math.random()*100;
        return this.dodge<=random;
    }


}
