package main.java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

//MAIN CLASS
public class SimpleDotTestDrive {

    public static void main (String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //TODO HumanPosition:
        HumanPosition HP = new HumanPosition();
        HP.AddPosition();
        AIChoice aichoice = new AIChoice();


        //TEST START
        ShipSetter ship = new ShipSetter(3);
        SimpleDotCom dot = new SimpleDotCom();
        HashMap<Integer, Integer> map = ship.Coordinates();  //Записали в карту координаты
        dot.setLocationCells(map);    //Передали карту в класс ДОТ
        String userGuess = null;
        String userGuess1 = null;
        String userGuess2 = null;
        boolean orient = ship.Orientation();
        boolean hitORaway;
        while (true)
        {


            //TEST считываем сразу и число и букву

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
        //    litTonum.Setter();
            //
            int guess1int = 0;
            try {
                guess1int = litTonum.Replacer(guess1string);
            }
            catch (NumberFormatException ex)
            {
                System.out.println("guess1int missing value --> Wrong number format");
            }
            System.out.println(userGuess1 +" mean --> " +guess1int);

            dot.checkYourself(guess1int,guess2int, orient);

//Part for AI
            System.out.println("AI trying..");
            aichoice.GetValueTest(AIChoice.map);
            AIHitOrAway aihitoraway = new AIHitOrAway();
            //TODO Rebuild

            hitORaway = aihitoraway.AIHit(AIChoice.Lit, AIChoice.Num, HumanPosition.humanMAP);
            if (hitORaway)
                    System.out.println("AI_HIT!");
            else
                System.out.println("AI_AWAY!");

            //Check if human lose:
            if (!aichoice.ArrayNotNullChecker())
            {
                System.out.println("Lose!");
                break;
            }
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
