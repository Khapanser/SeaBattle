package main.java;
import java.lang.*;
import java.util.ArrayList;

public class ShipSetter {

    public ArrayList<Integer> ShipSet (){
        Integer start = (int) Math.random()*7;
        Integer start2 = start++;
        Integer start3 = start2++;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(start);
        list.add(start2);
        list.add(start3);
        return list;
    }

}
