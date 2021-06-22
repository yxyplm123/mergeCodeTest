package tada;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyHandle implements InvocationHandler {

    private  Object target = null;
    public MyHandle(Object target){
        this.target= target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //调用目标方法，执行print()得到2
        Object res = method.invoke(target, args);
        if(res !=null){
            Integer num = (Integer) res;
            res = num*2;
        }
        return res;
    }
}
