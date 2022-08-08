package recursion;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {2,7,8,41,52,45};
        int target = 8;
        System.out.println(linear(arr,target,0));
    }
    public static boolean linear(int[] arr , int target , int index){
        if(index == arr.length) return false;

        return arr[index] == target || linear(arr,target,index+1);
    }
}
