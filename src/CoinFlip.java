import java.util.Random;

public class CoinFlip {
        /*
        You have n fair coins, and you flip
        them all at the same time. Any that come up
        tails you set aside.The ones that come up heads you flip
        again. How many rounds do you expect to play before only one coin remains?

        Write a function that, given n, returns the number
        of rounds you'd expect to play until one coin remains.
         */
        public int flipTimes(int n){
        int counter = 0;
        String[] choices = {"HEAD","TAIL"};
        while(n>1){
            for(int i =0;i<n;i++){
                Random ran = new Random();
                String res = choices[ran.nextInt(choices.length)];
                if(res == "TAIL")n--;
            }
            counter++;
        }
        return counter;
    }

}
