package sRect;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String text = "У Сени и Сани в сенях сом с усами";
        Pattern pattern = Pattern.compile("\\b[Сс]\\D*?\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }

}