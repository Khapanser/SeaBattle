package main.java;


import java.util.HashMap;
import java.util.Iterator;

class SimpleDotCom {
    HashMap<Integer, Integer> locationCells;
    static int numOfHits = 0;
    static int SCORE = 0;


  //  public SimpleDotCom(ShipSetter)
  public void setLocationCells (HashMap<Integer, Integer> locs){
      this.locationCells = locs;
  }

  public String checkYourself (int a, int b, boolean orient)
    {

        //TEST

        Iterator<HashMap.Entry<Integer, Integer>> iterator1 = locationCells.entrySet().iterator();
        if (!orient) {
            while (iterator1.hasNext()) {
                HashMap.Entry<Integer, Integer> pair1 = iterator1.next();
                if (pair1.getKey() == a && pair1.getValue() == b) {
                    iterator1.remove();
                    System.out.println("YOU HIT AI!");
                    return "HIT";
                }
                else
                {
                    System.out.println("away...");
                    return "AWAY" ;
                }
            }
        }

        else
        {
            while (iterator1.hasNext()) {
                HashMap.Entry<Integer, Integer> pair1 = iterator1.next();
                if (pair1.getKey() == b && pair1.getValue() == a) {
                    iterator1.remove();
                    System.out.println("YOU HIT AI!");
                    return "HIT";
                }
                else
                {
                    System.out.println("away...");
                    return "AWAY" ;
                }
            }
        }

        return "NOT WORK";

        //TEST

    }}