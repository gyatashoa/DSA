import java.util.Arrays;

class MainClass{

    public static void main(String[] args){
        TwoSums twoSums = new TwoSums();

        Arrays.stream(twoSums.twoSumsWithHashMap(new int[]{6, 7, 4, 6, 5}, 9)).forEach(System.out::println);
    }
}