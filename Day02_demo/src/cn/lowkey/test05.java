package cn.lowkey;

/**
 * @Author chen
 * @Describe “中华民族实现伟大复兴的第一件事---灭掉小日本!”
 * @Date 2022 09 20 19 27
 **/
public class test05 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
//        for (int i = 1; i <= 100 ; i++) {
//            sum += i;
//        }
        while (i <= 100){
            sum = sum +(-1)^(i-1) * i ;
            i=i+1;
        }
        System.out.println(sum);
    }
}
