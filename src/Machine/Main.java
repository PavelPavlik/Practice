package Machine;

public class Main {

    public static void main(String[] args) {
        Machine machine = new Machine("Siemens",0);
        machine.operation(10);
        Machine machine1 = new Machine("Thompson",75);
        machine1.operation(50);
//        machine.operation(85);
        machine.printDoneDetail();
        machine1.printDoneDetail();
    }

    private static void printTotalDetail() {
//        System.out.println(totalDetail);
    }
}
