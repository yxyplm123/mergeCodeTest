package sample.base;

public class SingleTon {
    public static void main(String[] args) {
        singleTest1 s1 = singleTest1.getInstance();
        singleTest3 s3 = singleTest3.getInstance();
    }
}

/**
 * 单例设计模式
 * 饿汉式
 */
class singleTest1{

    //1.私有化构造器
    private singleTest1(){}

    //2.内部创建类对象
    private static singleTest1 instance = new singleTest1();

    //3.提供公共方法返回类对象
    public   static singleTest1 getInstance(){
        return instance;
    }
}

/**
 * 单例设计模式
 * 懒汉式
 */
class singleTest3 {

    private singleTest3(){}

    private static singleTest3  instance =null;

    public static  singleTest3 getInstance(){
        if(instance == null){
            instance = new singleTest3();
        }
        return instance;
    }
}
