package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class Solution {

    public pair indexes(long v[], long x)
    {
        HashMap<Integer, Long> foundMap = new HashMap<>();
        // Your code goes here
        for (var i = 0; i < v.length; i ++){
            if (v[i] == x){
                foundMap.put(i, v[i]);
            }
        }

        int xx = 30;
        int y = 60;
        System.out.printf("Before swap 'x': %d, 'y': %d %n", xx, y);
        xx = xx ^ y;
        System.out.println(xx);
        y = xx ^ y;
        System.out.println(y);
        xx = xx ^ y;
        System.out.println(xx);
        System.out.printf("After swapping, 'x': %d, 'y': %d %n", xx, y);




        if (foundMap.isEmpty()){
            return new pair(-1, -1);
        } else{
            List<Integer> keys = new ArrayList<>(foundMap.keySet());
            Collections.sort(keys);
            return new pair(keys.get(0), keys.get(foundMap.size() -1));
        }

    }
}


class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
