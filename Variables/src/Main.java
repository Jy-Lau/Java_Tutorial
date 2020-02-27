import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Classroom c=new Classroom();
        c.doors=10;
        c.block="F3";
        c.classroom=new String[]{"F3B06","F3B12"};  //direct initialize
        c.classroom=new String[2];
        c.classroom[0]="F3B06";
        c.classroom[1]="F3B12";
        c.toilets=new ArrayList<>(Arrays.asList(1,2,3));c.toilets.add(10);
        System.out.println(c.doors);
        System.out.println(c.block);
        for (String s:
             c.classroom) {
            System.out.println(s);
        }
        for (Integer s:
                c.toilets) {
            System.out.println(s);
        }
    }
}
