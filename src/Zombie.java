public class Zombie extends Monster {

    public Zombie(String name) {
        super(name +" the Zombie" , 5);
        System.out.println("Monster "+name+" the Zombie was created");
    }

    @Override
    public void attack(){
        super.attack();
        System.out.println();
    }

    @Override
    public void growl(){
        super.growl();
        System.out.println(" growled");
    }

}