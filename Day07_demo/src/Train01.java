import java.util.Scanner;

/**
 * @Author chen
 * @Describe “中华民族实现伟大复兴的第一件事---灭掉小日本!”
 * @Date 2022 09 27 22 02
 **/
public class Train01 {
    public static void main(String[] args) {
        //卖飞机票
        //机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或者经济舱
        //按照如下规则计算机票价格:旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月-4月）头等舱7折，经济舱6.5折

        //首先录入机票的原价、月份、舱位级别
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票价格:");
        int ticketPrice = sc.nextInt();
        System.out.println("请输入购买月份:");
        int monthNum = sc.nextInt();
        System.out.println("请输入舱位级别:0 头等舱、1 经济舱");
        int seat = sc.nextInt();
        //使用if嵌套对规则进行判断
        if (monthNum >= 5 && monthNum <= 10){
            if (seat == 0){
                //需要使用（int）进行强制转换
                ticketPrice = (int)(ticketPrice * 0.9);
            }else if (seat == 1){
                ticketPrice = (int)(ticketPrice * 0.85);
            }else {
                System.out.println("没有你选择的舱位，请核实你的舱位信息！");
            }
            
        } else if (monthNum >= 1 && monthNum <= 4 || monthNum >=11 && monthNum <=12) {
            if (seat == 0){
                //需要使用（int）进行强制转换
                ticketPrice = (int)(ticketPrice * 0.7);
            }else if (seat == 1){
                ticketPrice = (int)(ticketPrice * 0.65);
            }else {
                System.out.println("没有你选择的舱位，请核实你的舱位信息！");
            }
        }else {
            System.out.println("你输入的月份不合法！");
        }
        System.out.println("你的机票价格是:"+ ticketPrice + "元！");
    }
    
    public static int getPrice(int ticket,int seat,double v0,double v1){
        if (seat == 0){
            ticket = (int)(ticket * v0);
        } else if (seat == 1) {
            ticket = (int)(ticket * v1);
        }else {
            System.out.println("没有该舱位！");
        }
        return ticket;
    }
}
