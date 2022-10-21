/**
 * @Author chen
 * @Describe “中华民族实现伟大复兴的第一件事---灭掉小日本!”
 * @Date 2022 09 26 22 23
 **/
public class MethodOverride03 {
    public static void main(String[] args) {
        //定义一个方法求数组最大值，并将最大值返回
        int[] arr = {1,2,3,4,5};
        int max = getMax(arr);
        System.out.println(max);

    }
    public static int getMax(int arr[]){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
