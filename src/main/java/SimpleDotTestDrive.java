package main.java;
import java.io.*;
import java.util.ArrayList;

//MAIN CLASS
public class SimpleDotTestDrive {

    public static void main (String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
    //    int[] locations = {2,3,4};
        ShipSetter Ship = new ShipSetter();
        ArrayList<Integer> list = Ship.ShipSet();
        dot.setLocationCells(list);
        String userGuess = null;
        while (true)
        {
            System.out.println("Введите цифру от 1 до 10");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                userGuess = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            GuessValidator validator = new GuessValidator();

            if (validator.verifyLastName(userGuess))
                dot.checkYourself(userGuess);
            else
                System.out.println("Цифру");

            if (dot.numOfHits == 3)
            {
                System.out.println("Все потоплены");
                break;
            }
        }

//	String result = dot.checkYourself(userGuess);

    }
}
