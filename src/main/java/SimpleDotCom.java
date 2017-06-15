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
        String result = "Мимо";
        int CLK = 0;
        for (int cell : locationCells)  {

            if (guess == cell)  {
                result = "Попал";
                numOfHits++;
                // Необходимо удалить из массива номер поля, в который уже попадали.
               // locationCells[CLK] = 0;
                locationCells.remove(cell);


                break;
            }
            CLK++;
        }


        if (locationCells.size()==0) {
            result = "Попал и потопил";
        }
        System.out.println(result);
        return result;

    }



}
