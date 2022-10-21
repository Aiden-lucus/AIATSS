/**
 * @Author chen
 * @Describe “中华民族实现伟大复兴的第一件事---灭掉小日本!”
 * @Date 2022 09 27 21 15
 **/
public class MethodOverride05 {
    public static void main(String[] args) {
        //定义一个int类型数组
        int[] arr = {1,2,3,4,5,6,7,8,9};
        //拷贝数据
        int[] copyArr = copyOfRange(arr, 3, 5);
        //便利copyArr
        for (int i = 0; i < copyArr.length; i++) {
            System.out.println(copyArr[i]+" ");
        }
    }
    public static int[] copyOfRange(int[] arr,int from,int to){
        //定义一个新数组，用于接收原数组中from-to的数据
        int[] newArr = new int[to - from];
        //定义一个index作为数组的索引
        int index = 0;
        //遍历newArr,将to到from的索引的数据复制给arr数组
        for (int i = from; i < to; i++) {
            newArr[index] = arr[i];
            index++;
        }
        return newArr;
    }
}
