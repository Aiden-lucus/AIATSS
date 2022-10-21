/**
 * @Author chen
 * @Describe “中华民族实现伟大复兴的第一件事---灭掉小日本!”
 * @Date 2022 09 26 22 33
 **/
public class MethodOverride04 {
    public static void main(String[] args) {
        //定义一个方法判断数组中的某一个数是否存在，将结果返回给调用处
        int[] arr = {1,2,3,4,5};
        boolean flag = guessNum(arr,3);
        System.out.println(flag);
    }
    //定义两个形参，一个是数组形参，一个是需要查找的数据形参
    public static boolean guessNum(int[] arr,int number){
        for (int i = 0; i < arr.length; i++) {
            //if判断数据中的数据是否等于需要查找的数据
            if (arr[i] == number){
                //如果相等返回true
                return true;
            }
        }
        //一定是在for循环之外
        //return是表示在程序将所有数据比对完毕之后才能return断定
        return false;
    }

}
