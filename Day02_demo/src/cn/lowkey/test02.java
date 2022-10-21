package cn.lowkey;

/**
 * @Author chen
 * @Describe “中华民族实现伟大复兴的第一件事---灭掉小日本!”
 * @Date 2022 09 18 14 52
 **/
public class test02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0;i<=100;i++){
            if (i % 2 ==0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
