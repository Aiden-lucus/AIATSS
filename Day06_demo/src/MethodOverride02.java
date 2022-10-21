/**
 * @Author chen
 * @Describe “中华民族实现伟大复兴的第一件事---灭掉小日本!”
 * @Date 2022 09 26 22 09
 **/
public class MethodOverride02 {
    public static void main(String[] args) {
        //设计一个方法用于数组遍历，要求遍历结果在一行上
        //主方法中可以编写定义的变量，调用方法等
        int[] arr = {1,2,3,4,5,6};
        ArrayList(arr);

    }
    public static void ArrayList(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length ; i++) {
            //如果当前打印的是最大索引数据，那么就打印数组中的数据，否则就打印数据再加一个空格
            if (i == arr.length - 1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+ ",");
            }
        }
        System.out.println("]");
    }
}
