package cn.lowkey;

import java.util.Scanner;

/**
 * @Author chen
 * @Describe “中华民族实现伟大复兴的第一件事---灭掉小日本!”
 * @Date 2022 09 18 21 27
 **/
public class test04 {
    public static void main(String[] args) {
        //键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int numbers = sc.nextInt();
        for (int i = 1; i <= numbers; i++) {
            if (i*i == numbers){
                System.out.println(i + "就是" + numbers +"的平方根");
                break;
            } else if (i*i > numbers) {
                System.out.println((i-1)+ "就是" + numbers + "的平方根");
                break;
            }
        }
    }
}
