public class Zombie extends Monster {



    //Унаследовать конструктор конструкторы не наследуются
    @Override
    public void attack(){
        int damage=5;
        System.out.println(damage);
        super.attack();

    }

    @Override
    public void growl(){
        System.out.print("Raaaauuughhhh ");//Сделать так что бы получилось Raaaauuughhhh Bob the Zombie growled
        super.growl();
    }
}