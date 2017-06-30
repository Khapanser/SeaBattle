package main.java;


import java.util.ArrayList;
import java.util.Collections;

public class AIChoice {
            public static ArrayList<Integer> map = new ArrayList<Integer>();
            private int CLK = 0;
            public static int Lit = 0;
            public static int Num = 0;

            //TODO massive [0..99]
            //TODO Mixing with Collection.shuffle
    public AIChoice()
    {
        for (int i = 0; i < 100; i++)
        {
            map.add(i);
        }

        Collections.shuffle(map);
       // System.out.println("Размер массива: "+ map.size());
    /*    for (int j = 0; j < map.size(); j++) {
            System.out.println(j+" элемент!"+map.get(j));

        }*/
    }

    //TODO Get "random" value (repeat while not hit)
    public void GetValueTest(ArrayList<Integer> map)
    {
        int ans = 0;
        ans = map.get(0);
        //TODO parsing "ans" for checking HIT (x%10--> line, x-(x%10) --> column)
        //a/b
        Num = ans/10;
        System.out.println("AI num = "+ Num);
        //a%b
        Lit = ans%10;
        System.out.println("AI lit = "+ Lit);
        map.remove(0);
        CLK++;
       // System.out.println("Now, CLK = "+ CLK);
       // return ans;
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
