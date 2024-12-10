public class Monster {
    private int damage;
    private String name;
    public Monster(String name, int damage){
        this.damage = damage;
        this.name=name;
    }

    public void growl() {
        System.out.print("Raaaauuughhhh "+name);
    }

    public void attack() {
        System.out.print("Monster "+name+ " attacked with damage "+damage);
    }
}
