public class Zombie extends Monster {

    public Zombie(String name) {
        super(name + " the Zombie", 5);
        System.out.println(name+ " the Zombie was created");
    }

    @Override
    public void attack(){
        super.attack();
        growl();
    }

    @Override
    public void growl(){
        System.out.print("Raaaauuughhhh");
        super.growl();
    }
}