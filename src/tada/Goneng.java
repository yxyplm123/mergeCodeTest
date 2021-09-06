package tada;

public class Goneng implements HelloService{
    @Override
    public int function(String name) {
        System.out.println("写好的功能"+name);
        System.out.println("11111");
        System.out.println("22222");
        System.out.println("33333");
        return 2;
    }
}
