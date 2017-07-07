package main.java;

import java.util.ArrayList;

public class FieldBuilder {
    static ArrayList<String> Graphics = new ArrayList<String>();

    static String aa = "a|__|__|__|__|__|__|__|__|__|__|";
    static String bb = "b|__|__|__|__|__|__|__|__|__|__|";
    static String cc = "c|__|__|__|__|__|__|__|__|__|__|";
    static String dd = "d|__|__|__|__|__|__|__|__|__|__|";
    static String ee = "e|__|__|__|__|__|__|__|__|__|__|";
    static String ff = "f|__|__|__|__|__|__|__|__|__|__|";
    static String gg = "g|__|__|__|__|__|__|__|__|__|__|";
    static String hh = "h|__|__|__|__|__|__|__|__|__|__|";
    static String ii = "i|__|__|__|__|__|__|__|__|__|__|";
    static String jj = "j|__|__|__|__|__|__|__|__|__|__|";

    public FieldBuilder(){
            Graphics.add(aa);
            Graphics.add(bb);
            Graphics.add(cc);
            Graphics.add(dd);
            Graphics.add(ee);
            Graphics.add(ff);
            Graphics.add(gg);
            Graphics.add(hh);
            Graphics.add(ii);
            Graphics.add(jj);
    }

    public static void StartField() {
        System.out.println("     SeaBattle! Field 10x10");
        System.out.println("  __ __ __ __ __ __ __ __ __ __ ");
        String s = null;
        for (int i = 0; i <10 ; i++)
        {
            s = Graphics.get(i);
            System.out.println(s);
        }

        System.out.println("   1  2  3  4  5  6  7  8  9 10");
        System.out.println("");
    }

    public static void AwayPositionSetter (){
        //TODO add your location on the map


    }


    public static void HitPositionSetter () {
        //TODO add your hits on the map
    }


}
