import java.util.Random;
import java.util.Scanner;

/**
 * @Author chen
 * @Describe “中华民族实现伟大复兴的第一件事---灭掉小日本!”
 * @Date 2022 09 20 21 59
 **/
public class batch02 {
    public static void main(String[] args) {
        int count = 0;
        Random r = new Random();
        int number = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入一个数字:");
            int guessNumber = sc.nextInt();
            //会员机制，三次必中！
            count++;
            if (count == 3){
                System.out.println("猜对了！");
                break;
            }
            if (guessNumber > number){
                System.out.println("猜大了!");
            } else if (guessNumber < number) {
                System.out.println("猜小了！");
            }else {
                System.out.println("猜对了！");
                break;
            }
        }


    }
}
