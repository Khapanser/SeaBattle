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
        int shiplength = 3;
        ShipSetter ship = new ShipSetter(shiplength);
        SimpleDotCom dot = new SimpleDotCom();
        HashMap<Integer, Integer> map = ship.Coordinates();  //Записали в карту координаты
        dot.setLocationCells(map);    //Передали карту в класс ДОТ
        String userGuess = null;
        String userGuess1 = null;
        String userGuess2 = null;
        boolean orient = ship.Orientation();
        boolean hitORaway = true;
        int clk = 0;

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
          //  System.out.println(userGuess1 +" mean --> " +guess1int);

            dot.checkYourself(guess1int,guess2int, orient);

//Part for AI
            while (hitORaway) {
                System.out.println("AI trying..");
                // 0.5 second delay:
                try {
                    Thread.sleep(500);
                    // any action
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                aichoice.GetValueTest(AIChoice.map);
                AIHitOrAway aihitoraway = new AIHitOrAway();
                //TODO Rebuild

                hitORaway = aihitoraway.AIHit(AIChoice.Num, AIChoice.Lit, HumanPosition.humanMAP);
                if (hitORaway) {
                    System.out.println("AI HIT YOU!");
                    clk++;
                } else {
                    System.out.println("AI away!");
                    hitORaway = false;
                }
            }
            hitORaway =true;


            if (clk == shiplength)
            {
                System.out.println("YOU LOSE!");
                break;
            }

            //Check if human lose:
            if (!aichoice.ArrayNotNullChecker())
            {
                System.out.println("YOU LOSE!");
                break;
            }
            //TODO пустой ли массив
            if (dot.locationCells.isEmpty())
            {
                System.out.println("YOU WIN!");
                break;
            }
//ВРЕМЕННЫЙ КОД
        }

    }
}
