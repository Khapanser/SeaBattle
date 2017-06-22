package main.java;


import java.util.ArrayList;
import java.util.HashMap;

class SimpleDotCom {
    HashMap<Integer, Integer> locationCells;
    static int numOfHits = 0;
    static int SCORE = 0;

  //  public SimpleDotCom(ShipSetter)
  public void setLocationCells (HashMap<Integer, Integer> locs){
      this.locationCells = locs;
  }

  public String checkYourself (int a, int b, ShipSetter ship)
    {
        for (HashMap.Entry<Integer, Integer> pair : this.locationCells.entrySet())
        {
            if (!ship.Orientation())
            {

                if (pair.getKey()==a && pair.getValue()==b)
                    return "HIT";
                else
                    return "AWAY" ;
            }
            else
            {
                if (pair.getKey() == b && pair.getValue() == a)
                    return "HIT";
                else
                    return "AWAY";
            }
        }
        return "NOT WORK";
    }







   /* public String checkYourself (String stringGuess){
       SCORE++;
        int guess = Integer.parseInt(stringGuess);
        String result = "Away";
        for (int cell : locationCells)  {

            if (guess == cell)  {
                result = "Hit";
                numOfHits++;
                // Remove hited fileds.
                Integer deleter = guess;
                locationCells.remove(deleter);


                break;
            }
        }


        if (locationCells.size()==0) {
            result = "Killed for "+ SCORE +" moves";
        }
        System.out.println(result);
        return result;

    }

*/

}
