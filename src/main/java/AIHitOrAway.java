package main.java;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AIHitOrAway {

  /*  public void AIHitIniciator()
    {
        AIChoice aichoice = new AIChoice();
    }*/



    //public void AIHit(AIChoice aichoice, HashMap<Integer, Integer> HP)
    public boolean AIHit(int a, int b, HashMap<Integer, Integer> HP)
    {
        Iterator<HashMap.Entry<Integer, Integer>> iterator1 = HP.entrySet().iterator();
        while (iterator1.hasNext()) {
            HashMap.Entry<Integer, Integer> pair1 = iterator1.next();
            if (pair1.getKey() == a && pair1.getValue() == b) {
                iterator1.remove();
                System.out.println("HIT_3");
                return true;
            }
            /*else
            {
                System.out.println("AWAY_3");
                return false ;
            }*/
        }
        return false;

    }

}
