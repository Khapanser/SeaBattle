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
        System.out.println("Add your position");
    }

    public void AddPosition()
    {
        HashMap<Integer,Integer> humanMAPP = new HashMap<Integer,Integer>();

        int a = 0;
        int b = 0;
        LitToNum litToNum = new LitToNum();

        for (int i = 0; i<3 ; i++)
        {
            System.out.println(CLK+" position..");
            try {
                a = Integer.parseInt(reader.readLine());
                b = litToNum.Replacer(reader.readLine());
                System.out.println("Пробуем положить в массив значения а="+a +"  и  b=" +b);
                }
            catch (IOException e)
                {
                System.out.println("Change your input data");
                }
                try
                {
                    humanMAP.put(a, b);
                }
                catch (NullPointerException ex)
                {
                System.out.println("NullPointExcept");
                }
            CLK++;
        }

    }
}
