public class TwoSums {

    //given array,find the indexes of two elements that sums up
    //to the target number
    public int[] twoSums(int[] list,int target){
        for(int i =0 ;i<list.length;i++){
            for(int j=i+1;j<list.length;j++){
                if(list[i]+list[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return list;
    }
}
