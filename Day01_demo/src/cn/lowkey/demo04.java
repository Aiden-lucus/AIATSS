package cn.lowkey;

import java.util.Scanner;

public class demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入自我评分:");
        int myScore = sc.nextInt();
        System.out.println("请输入女嘉宾评分:");
        int girlsScore = sc.nextInt();
        Boolean result = girlsScore>myScore;
        System.out.println(result);
    }
}
