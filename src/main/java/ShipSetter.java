package main.java;
import java.lang.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.io.*;

public class ShipSetter {

    // TODO Add static data about already busy fields
    private static ArrayList <Integer> BusyFields = new ArrayList<Integer>();

    private int ShipLength;
  //  private boolean Orient = false;   //Vertical
  //  private ArrayList<Integer> Loc_X = new ArrayList<Integer>();
  //  private int Loc_1 = 0;


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
     //   this.Orient =  ans;
        return ans;
    }

    //TODO Find "ShipLength" random number;
    public ArrayList<Integer> CheckLocations_X ( int ShipLength){
        int start = (int) (Math.random()*9);   // find start num
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < ShipLength; i++)
        {
            list.add(start+i);
            System.out.println((i+1)+"th element -->"+(start+i));
        }
      //  this.Loc_X = list;
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
      //  this.Loc_1 = start;
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

 /*   public ArrayList<Integer> ShipSet ( int ShipLength)
        {

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
    }*/

}
