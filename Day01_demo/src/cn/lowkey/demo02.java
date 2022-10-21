package cn.lowkey;

public class demo02 {
    public static void main(String[] args) {
        //new语句创建一个FreshJuice对象；为声明的对象juice  “new”出一个储存空间；
        FreshJuice juice = new FreshJuice();
        //为juice的成员变量size（即枚举类FreshJuiceSize的一个对象）
        //赋值一个枚举类JuiceSize中的常量
        juice.size = FreshJuice.JuiceSize.LARGE;
        System.out.println(juice.size);
    }

}
class FreshJuice{
    //枚举类作为FreshJuice 的内部类
    enum JuiceSize{SMALL,MEDIUM,LARGE}
    //枚举类作为FreshJuice 的内部类
    JuiceSize size;
}
