/**
 * @Author chen
 * @Describe “中华民族实现伟大复兴的第一件事---灭掉小日本!”
 * @Date 2022 09 25 20 19
 **/
public class Method06 {
    public static void main(String[] args) {
        //带返回值的方法调用
        double area1 = getArea(1.3,2.4);
        double area2 = getArea(2.6,3.4);

        //再对计算结果进行比较
        if (area1 > area2){
            System.out.println("第一个周长大些！");
        }else {
            System.out.println("第二个周长大些！");
        }
    }
    //定义一个求长方形周长的方法，因为会对结果在进行比较，所以需要带返回值
    public static double getArea(double num1,double num2){
        double result = ( num1 + num2 ) * 2;
        return result;
    }
}
