package Machine;


public class Machine {

    public Object totalDetailx;
    String nameMachine = "";
    int oil;
    private int detail;
    int totalDetail=0;

    public Machine(String name, int oil) {
        this.nameMachine = name;
        this.oil = oil;
    }

    public void operation(int i) {
        if (oil <= i && oil == 0) {
            System.out.println("Машина " + nameMachine + " не готова");
        }
        else if (oil >= i) {
            oil -= i;
            this.detail += i;
        }
        else if (oil < i) {
            i=this.oil;
            this.detail+=i;
            oil=0;
            System.out.println("В станке " + nameMachine + " закончилось масло");
        }
        totalDetailx(detail);
    }

    public void printDoneDetail() {
        System.out.println("Остаток масла " + nameMachine + ": " + this.oil + "; выпущено деталей: " + this.detail);
    }

    public void totalDetailx(int i){
        totalDetail+= i;
    }
}
