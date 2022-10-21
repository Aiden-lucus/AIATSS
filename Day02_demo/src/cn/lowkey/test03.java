package cn.lowkey;

/**
 * @Author chen
 * @Describe “中华民族实现伟大复兴的第一件事---灭掉小日本!”
 * @Date 2022 09 18 19 19
 **/
public class test03 {
    public static void main(String[] args) {
        //定义数字
        int x = 12345;
        //定义临时变量记录原值
        int temp = x;
        //定义最后生成的回文值
        int num = 0;
        while (x != 0){
            //先去个位数
            int gewei = x%10;
            //修改x每次更新所记录的值
            x = x/10;
            //从左往右拼接数字
            num = num * 10 + gewei;
            //第一次:拿到个位数5
            //第二次:拿到个位数4+5*10
            //第三次:拿到个位数3+54*10
            //第四次:拿到个位数2+543*10
            //第五次:拿到个位数1+5432*10
        }
        System.out.println(num);
        System.out.println(num == temp);
    }
}
