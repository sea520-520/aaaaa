import java.util.Arrays;

public class Demo2 {

    public static void main(String[] args) {

        int[] arr = {1,3,5,7,9};
        int temp;
        System.out.println("反转前的数组：" + Arrays.toString(arr));
        for(int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println("反转后的数组：" + Arrays.toString(arr));
    }
}
