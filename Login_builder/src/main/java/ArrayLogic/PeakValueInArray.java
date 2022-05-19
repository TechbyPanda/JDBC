package ArrayLogic;

public class PeakValueInArray {
    public static void peakValueIs(int[] arr){
        for(int i=0;i<arr.length;i++){
            // remeber arr.length will generate ArrayIndexOutOfBoundsException
            // so right arr.length-1
            if(arr[i]>arr[i+1] && arr[i]>arr[i-1])
                System.out.println("Peak Value is : "+arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {23,45,23,45,33,54,23};
        peakValueIs(arr);
    }
}
