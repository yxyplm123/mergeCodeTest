package tada;

import com.sun.org.apache.xalan.internal.xslt.Process;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Stack;

public class Stringreverse {
    public static void main(String[] args) {
        String str = "abcdefc";
        StringBuffer sb = new StringBuffer();
        Stack<Character> s = new Stack<>();//创建只装字符型的stack
        for (int i=0;i<str.length();i++){
            s.add(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            sb.append(s.pop());//出栈，StringBuffer.append()添加到sb的缓冲区末端；.insert(int index,添加的内容)添加到指定位置
        }
        System.out.println("转换后的字符串："+sb);

        Goneng goneng = new Goneng();
        System.out.println("值为："+goneng.function("你好"));

        Goneng goneng1 = new Goneng();
        InvocationHandler myHandle = new MyHandle(goneng1);
        HelloService proxy =(HelloService)
                Proxy.newProxyInstance(goneng1.getClass().getClassLoader(), goneng1.getClass().getInterfaces(), myHandle);

        int num = proxy.function("市场");
        System.out.println("期望值:"+num);

    }
}
