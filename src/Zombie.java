public class Zombie extends Monster {

    public Zombie(String name ) {
        super.name();
        System.out.println("Monster "+name + " the Zombie was created");
        super.growl();
        System.out.println("Raaaauuughhhh "+name + " the Zombie growled");
        super.attack();
        System.out.println("Monster "+name + " the Zombie attacked with damage 5");
    }

//    @Override
//    public void growl(){
//
//
//    }
//
//    @Override
//    public void attack(){
//        super.attack();
//
//    }

}