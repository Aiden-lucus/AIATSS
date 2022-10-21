/**
 * @Author chen
 * @Describe “中华民族实现伟大复兴的第一件事---灭掉小日本!”
 * @Date 2022 09 26 22 00
 **/
public class MethodOverride01 {
    public static void main(String[] args) {
        //方法重载
        //在同一个类中，方法名相同，方法的参数不同
        override(1,2);

        override(1.2,2.4);
    }
    public static void override(int a, int b){
        int sum = a + b;
        System.out.println("int");
    }
    public static void override(double a,double b){
        double c = a + b;
        System.out.println("double");
    }
}
