import java.util.Random;

/**
 * @Author chen
 * @Describe “中华民族实现伟大复兴的第一件事---灭掉小日本!”
 * @Date 2022 09 24 22 48
 **/
public class Array03 {
    public static void main(String[] args) {
        //定义一个动态数组
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //随机数范围为0-100
            int number = r.nextInt(100) + 1;
            //将随机数赋值给数组中去
            arr[i] = number;
        }
        //循环打印出10个随机数
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        //求10个随机数的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("随机数的和:"+sum);

        //求10个随机数的平均值
        int avg = sum/ arr.length;
        System.out.println("随机数的平均值:"+avg);
        //随机数中比平均值小的个数
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <avg ){
                count++;
            }
        }
        System.out.println("随机数中比平均值小的个数有:"+count+"个！");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
