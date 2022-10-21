/**
 * @Author chen
 * @Describe “中华民族实现伟大复兴的第一件事---灭掉小日本!”
 * @Date 2022 09 24 23 18
 **/
public class Array04 {
    public static void main(String[] args) {
        //循环交换数组中的数据
        int[] arr = {1,2,3,4,5};
        for (int i = 0,j=arr.length-1;i<j;i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
