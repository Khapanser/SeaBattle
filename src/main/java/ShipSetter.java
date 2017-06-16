package main.java;
import java.lang.*;
import java.util.ArrayList;

public class ShipSetter {

    public ArrayList<Integer> ShipSet (){

        int start = (int) (Math.random()*10);
     //   System.out.println(start);
        int start2 = start+1;
     //   System.out.println(start2);
        int start3 = start2+1;
     //  System.out.println(start3);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(start);
        list.add(start2);
        list.add(start3);
        return list;
    }

}
