package main.java;
import java.util.ArrayList;
import java.util.HashMap;

public class ShipSetter {

    // TODO Add static data about already busy fields
    private static ArrayList <Integer> BusyFields = new ArrayList<Integer>();
    private int ShipLength;


    //Constructor for ShipLength
    public ShipSetter(int ShipLength)
    {
        this.ShipLength = ShipLength;
    }

    //TODO  Check Hor or Vert orientation of ship
    public boolean Orientation (){
        int i = 10;
        boolean ans = true;      //Horizontal
        boolean trigger = false;
        while (!trigger) {
            i = (int) (Math.random() * 3);
            if (i == 1) {
                ans = true;     //Horizontal
                System.out.println("Horizontal");
                trigger = true;
            }
            else if (i == 2 ){
                ans = false;    //Vertical
                System.out.println("Vertical");
                trigger = true;
            }
        }
        return ans;
    }

    //TODO Find "ShipLength" random number;
    public ArrayList<Integer> CheckLocations_X ( int ShipLength){
        int start = 0;
        while (start == 0) {
             start = (int) (Math.random() * 9);   // find start num
        }
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < ShipLength; i++) {
                list.add(start + i);
                System.out.println((i + 1) + "th element -->" + (start + i));
            }
            return list;

    }

    //TODO Find 1 random number
    public int CheckLocations_1 (){
        boolean trigger = false;
        int start = 1;
        while (!trigger) {
            start = (int) (Math.random() * 11);   // find start num
            if (start > 0)                            //check not zero
                trigger = true;
        }
        System.out.println("start = "+start);
        return start;
    }

        //TODO Return coordinates of the ship
    //НАДО ДОБАВИТЬ ПРОВЕРКУ ОРИЕНТАЦИИ КОРАБЛЯ В SimpleDotCom

    public HashMap<Integer, Integer> Coordinates (){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int b = this.CheckLocations_1();
            for (int a: CheckLocations_X(ShipLength)) {
               map.put(a,b);
               System.out.println("цель - "+a+" / "+b); //
            }
            return map;
    }

}
