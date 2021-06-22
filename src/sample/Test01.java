package sample;

public class Test01 {
    public static void main(String[] args) {

        /*

         * 分配内存是底层代码，观察不到，

         * 只能看到自己的运算代码

         *

         * f8 连续向后执行，

         * 直到遇到下一个断点

         */

        new B();
        System.out.println("----------------");
        new B();

    }

}//Test1结束



class A {

    int v1 = 1;

    static int v2 = 2;

    static {

        System.out.println("A静态块");

    }

    A() {

        System.out.println("A构造");

    }

}

class B extends A {

    int v3 = 3;

    static int v4 = 4;

    static {

        System.out.println("B静态块");

    }

    B() {

        System.out.println("B构造");

    }

}
