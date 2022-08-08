package recursion;

public class SortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {2,4,5,18,9};
        System.out.println(sortArray(arr,0));
    }
    public static boolean sortArray(int[] arr, int index){
        // base condition
        if(index == arr.length-1) return true;

        return arr[index] < arr[index+1] && sortArray(arr,index+1);
    }
}
