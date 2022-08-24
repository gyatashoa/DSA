import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        var w = 0;
        for (var x: nums) if (nums[w] != x) nums[++w] = x;
        return ++w;
    }
}
