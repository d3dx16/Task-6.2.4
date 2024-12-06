public class Monster {


    private final String name;
    private final int damage;

    //    Конструктор с именем и уроном
    public Monster(String name, int damage) {
        this.name = name;
        System.out.print("Monster ");
        this.damage = damage;

    }

    public String getName() {
        return name;
    }


    public void growl() {
        System.out.println(name+" growled");
    }

    public void attack() {
        System.out.println("Monster "+name+" attacked with damage 5");
    }
}
