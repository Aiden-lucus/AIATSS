import java.util.Random;

/**
 * @Author chen
 * @Describe “中华民族实现伟大复兴的第一件事---灭掉小日本!”
 * @Date 2022 09 24 23 31
 **/
public class Array05 {
    public static void main(String[] args) {
        //随机打乱数组元素
        int[] arr = {1,2,3,4,5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int RandowIndex = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] =arr[RandowIndex];
            arr[RandowIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
