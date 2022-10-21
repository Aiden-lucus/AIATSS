/**
 * @Author chen
 * @Describe “中华民族实现伟大复兴的第一件事---灭掉小日本!”
 * @Date 2022 09 25 19 54
 **/
public class Method05 {
    public static void main(String[] args) {
        //带返回值的方法的定义与三种调用格式
        //第一种直接调用，没有返回结果打印出来
        getSum(1,3,2);

        //第二种赋值调用，常用的调用方法
        int sum = getSum(1,2,3);
        System.out.println(sum);

        //第三种输出调用，直接在输出语句小括号中调用方法
        System.out.println(getSum(1,2,3));
    }
    public static int getSum(int a,int b,int c){
        int result = a + b + c;
        return result;
    }
}
