package Other;

public class Programmer {

    String name, company;
    String position= "intern";

    public Programmer(String name, String company) {
        this.name = name;
        this.company = company;
    }

    public String getPosition() {
        return this.position;
    }

    public void work() {
        switch (position) {
            case "intern":
                position = "junior";
                break;
            case "junior":
                position = "middle";
                break;
            case "middle":
                position = "senior";
                break;
            case "senior":
                position = "lead";
                break;
        }
    }
}