package main.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by AKhaperskiy on 22.06.2017.
 */
public class LitToNum {

    private static HashMap<String, Integer> map = new HashMap<String, Integer>();
    public void Setter(){
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);
        map.put("f",6);
        map.put("g",7);
        map.put("h",8);
        map.put("i",9);
        map.put("j",10);
    }

    public int Replacer (String x)
    {

        for (HashMap.Entry<String, Integer> pair : LitToNum.map.entrySet())
        {
            if (pair.getKey().equals(x))
                return pair.getValue();

        }
        //TODO bad return condition
        return 0;
    }




}
