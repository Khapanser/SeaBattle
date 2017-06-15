package main.java;


import java.util.ArrayList;

class SimpleDotCom {
    ArrayList<Integer> locationCells;
    int numOfHits;

    {
        numOfHits = 0;
    }

    public void setLocationCells (ArrayList<Integer> locs){
        locationCells = locs;
    }

    public String checkYourself (String stringGuess){
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
            result = "Killed";
        }
        System.out.println(result);
        return result;

    }



}
