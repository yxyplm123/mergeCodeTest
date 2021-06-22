package tada;

public class Goneng implements HelloService{
    @Override
    public int function(String name) {
        System.out.println("写好的功能"+name);
        return 2;
    }
}
