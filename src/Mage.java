public class Mage {
    String name, type;
    int level, damage;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    public String getInfo(Mage mage) {
        return "Name: " + name + ", " + "Level: " + level + ", " + "Damage: " + damage + ", " + "Type: " + type + ".";
    }

    public static String fight(Mage mage, Mage mage2) {
        if(String type==fire)
    }
}
