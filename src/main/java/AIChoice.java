package main.java;


import java.util.ArrayList;
import java.util.Collections;

public class AIChoice {
             private static ArrayList<Integer> map;
             static int CLK = 0;

            //TODO massive [0..99]
            //TODO Mixing with Collection.shuffle
    public AIChoice()
    {
        for (int i = 0; i < 100; i++)
        {
            map.add(i);
        }

        Collections.shuffle(map);
    }

    //TODO Get "random" value (repeat while not hit)
    public int GetValueTest(ArrayList<Integer> map)
    {
        int ans = 0;
        ans = map.get(CLK);
        //TODO parsing "ans" for checking HIT (x%10--> line, x-(x%10) --> column)
        //a/b
        int Lit = ans/10;
        //a%b
        int Num = ans%10;
        map.remove(CLK);
        CLK++;
        return ans;
    }

    public boolean ArrayNotNullChecker()
    {
        if (map.size() !=0)
            return true;
        else
            return false;
    }
    //TODO Hit left/right/up/down

    //TODO repeat left/right/up/down if Hit (check field zone)

}
