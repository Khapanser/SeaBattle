package main.java;
import java.io.*;
import java.util.ArrayList;
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
        //TODO написать код чтения двух чисел с клавиатуры и передачи их в checkYourself
        String userGuess1 = null;
        String userGuess2 = null;
        boolean orient = ship.Orientation();
        while (true)
        {
            //ВОДИМ ПЕРВОЕ ЧИСЛО
            System.out.println("Enter a number from  1 to 10");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                userGuess1 = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int guess1 = Integer.parseInt(userGuess1);

            //ВВОДИМ ВТОРОЕ ЧИСЛО
            System.out.println("Enter a number from  1 to 10");
            BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));

            try {
                userGuess2 = reader2.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int guess2 = Integer.parseInt(userGuess2);

            //ЗАКИДЫВАЕМ В ПРОВЕРКУ ОБА ЧИСЛА И САМ КОРАБЛЬ
            dot.checkYourself(guess1,guess2, orient);


// ВРЕМЕННЫЙ КОД:
            if (SimpleDotCom.numOfHits == 3)
            {
                System.out.println("Win!");
                break;
            }
//ВРЕМЕННЫЙ КОД
        }


   /*     SimpleDotCom dot = new SimpleDotCom();
        ShipSetter Ship = new ShipSetter();
        ArrayList<Integer> list = Ship.ShipSet();
        dot.setLocationCells(list);
        String userGuess = null;
        while (true)
        {
            System.out.println("Enter a number from  1 to 10");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                userGuess = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            GuessValidator validator = new GuessValidator();

//            if (validator.verifyLastName(userGuess))  //validator OFF
                dot.checkYourself(userGuess);
 //           else
  //              System.out.println("Enter a number...");

            if (SimpleDotCom.numOfHits == 3)
            {
                System.out.println("Win!");
                break;
            }
        }
*/
    }
}
