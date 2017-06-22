package main.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//MAIN CLASS
public class SimpleDotTestDrive {

    public static void main (String[] args) {


        //TEST START

        ShipSetter ship = new ShipSetter(3);
        SimpleDotCom dot = new SimpleDotCom();
        HashMap<Integer, Integer> map = ship.Coordinates();  //Записали в карту координаты
        dot.setLocationCells(map);    //Передали карту в класс ДОТ
        String userGuess = null;
        String userGuess1 = null;
        String userGuess2 = null;
        boolean orient = ship.Orientation();
        while (true)
        {


            //TEST считываем сразу и число и букву
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                userGuess1 = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            String guess1string = userGuess1.substring(0,1);
            String guess2str = userGuess1.substring(1);
            int guess2int = Integer.parseInt(guess2str);

            LitToNum litTonum = new LitToNum();
            litTonum.Setter();
            int guess1int = litTonum.Replacer(guess1string);
            System.out.println(userGuess1 +" mean --> " +guess1int);

            dot.checkYourself(guess1int,guess2int, orient);

// ВРЕМЕННЫЙ КОД:
            //TODO пустой ли массив
            if (dot.locationCells.isEmpty())
            {
                System.out.println("Win!");
                break;
            }
//ВРЕМЕННЫЙ КОД
        }

    }
}
