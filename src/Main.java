import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
//        String str = "оывмровмиыПавел4ыысмиовс всы лорырыл ориАлександр олфсфысор3123 3213риа" +
//                " к2ацроиым оррилоФёдор2лорсмыим илорсия лориывс";
//        Pattern pattern = Pattern.compile("\\D+...\s");
//        Matcher matcher = pattern.matcher(str);
//        while (matcher.find()){
//            System.out.println(matcher.toString());
//        }

        Mage mage1 = new Mage("Darvin", 70, 120, "fire");
        Mage mage2 = new Mage("Markus", 75, 110, "ice");
        Mage mage3 = new Mage("Glent",69,125,"earth");

        System.out.println(mage1.getInfo(mage1));
        System.out.println(mage2.getInfo(mage2));
        System.out.println(mage3.getInfo(mage3));
        System.out.println("WIN: " + fight(mage1,mage2));
    }
}