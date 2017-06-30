package main.java;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HumanPosition {
    public static HashMap<Integer,Integer> humanMAP = new HashMap<Integer,Integer>();
    private static int CLK = 1;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public HumanPosition()
    {
        System.out.println("Add your position. E.g. \"a1\" or \"f10\"");
    }

    public void AddPosition()
    {
        HashMap<Integer,Integer> humanMAPP = new HashMap<Integer,Integer>();

       /* int a = 0;
        int b = 0;
        LitToNum litToNum = new LitToNum();*/

        for (int i = 0; i<3 ; i++)
        {
            System.out.println("Add "+CLK+" position:");

//TEST считываем сразу и число и букву
            String userGuess1 = null;
            try {
                userGuess1 = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String guess1string = userGuess1.substring(0,1);
            String guess2str = userGuess1.substring(1);
            //try-catch for NumberFormatException
            int guess2int = 0;
            try {
                guess2int = Integer.parseInt(guess2str);
            }
            catch (NumberFormatException ex)
            {
                System.out.println("guess2int missing value --> Wrong number format");
            }

            LitToNum litTonum = new LitToNum();

            int guess1int = 0;
            try {
                guess1int = litTonum.Replacer(guess1string);
            }
            catch (NumberFormatException ex)
            {
                System.out.println("guess1int missing value --> Wrong number format");
            }

            try
            {
                humanMAP.put(guess2int,guess1int);
            }
            catch (NullPointerException ex)
            {
                System.out.println("NullPointExcept");
            }
            CLK++;




        }

    }
}
