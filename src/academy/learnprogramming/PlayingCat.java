package academy.learnprogramming;

public class PlayingCat {

    public static boolean isPlayingCat (boolean summer, int temperature){
        boolean isPlaying = (temperature >= 25 && temperature <= 35);
        if (summer){
            isPlaying = (temperature >= 25 && temperature <= 45);
        }
        return isPlaying;
    }

}
