/**
 * @Author chen
 * @Describe “中华民族实现伟大复兴的第一件事---灭掉小日本!”
 * @Date 2022 09 25 19 44
 **/
public class Method03 {
    public static void main(String[] args) {
        //求长方形周长
        getLength(12.3,23.4);
    }
    //定义计算方法
    public static void getLength(double length,double wight){
        double result = (length + wight ) * 2;
        System.out.println("长方形周长为:" +result);
    }
}
