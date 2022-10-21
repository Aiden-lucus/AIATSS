/**
 * @Author chen
 * @Describe “中华民族实现伟大复兴的第一件事---灭掉小日本!”
 * @Date 2022 09 24 22 08
 **/
public class Array02 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        //初始化最大值为第一个元素
        int Max = array[0];
        //循环遍历数组元素
        for (int i = 0; i < array.length; i++) {
            //将数组中的元素同初始化最大值进行比较
            if (array[i] >Max){
                //将最大值赋值给Max
                Max = array[i];
            }
        }
        //打印出数组最大值
        System.out.println(Max);
    }
}
