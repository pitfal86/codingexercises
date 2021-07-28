package academy.learnprogramming;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Blarg {


    @Test
    public void testSomething() {
        // assertEquals("expected", "actual");
        Double result = Multiply.multiply(3d, 3d);
        String str = "";
        boolean isogram = true;
        char[] charStr = str.toCharArray();
        for (var i = 0; i < charStr.length; i ++){
            if (!isogram){
                break;
            }
            for (var j = 0; j < charStr.length; j ++){
                if (String.valueOf(charStr[i]).equalsIgnoreCase(String.valueOf(charStr[j])) && i != j){
                    isogram = false;
                    break;
                }
            }
        }
        System.out.println(isogram);


        assertEquals((Object)result, (Object)9d);
    }
}

class Multiply {
    public static Double multiply(Double a, Double b) {
        return a * b;
    }
}