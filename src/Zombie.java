public class Zombie extends Monster {

    public Zombie(String name) {
        super(name + " the Zombie", 5);
        System.out.println(name+ " the Zombie was created");
    }

    @Override
    public void attack(){
        super.attack();

    }

    @Override
    public void growl(){
        System.out.print("Raaaauuughhhh ");//Сделать так что бы получилось Raaaauuughhhh Bob the Zombie growled
        super.growl();
    }
}