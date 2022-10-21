import java.util.Scanner;

/**
 * @Author chen
 * @Describe “中华民族实现伟大复兴的第一件事---灭掉小日本!”
 * @Date 2022 09 19 20 42
 **/
public class batch01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        //默认为number赋初值为质数数据
        boolean flag = true;
        int numbers = sc.nextInt();
        for (int i = 2; i < numbers; i++) {
            if (numbers % i == 0){
                flag = false;
//                System.out.println(numbers + "不是一个质数！");
                break;
            }
        }
        if (flag){
            System.out.println(numbers + "是一个质数！");
        }else {
            System.out.println(numbers + "不是一个质数！");
        }
    }
}
