package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Master1 {
    public static void main(String[] args) {
       String b = "master1";
        System.out.println("aaa");

        System.out.println("bbb");
        System.out.println("ccc");
        System.out.println("ddd");

        System.out.println("sss");

        List<String> ipList = new ArrayList<>();
        ipList.add("172.190.114.51");
        ipList.add("172.190.114.54");
        ipList.add("172.190.114.53");
        ipList.add("172.190.114.55");
        List<String> cloud = new ArrayList<>();
        cloud.add("172.190.114.51");
        cloud.add("172.190.114.53");
        cloud.add("172.145.2.3");
        List<String> nal = new ArrayList<>();
        List<Controller> controllerList = new ArrayList<>();
        Controller controller1 = new Controller("172.190.114.51",0);
        Controller controller2 = new Controller("172.190.114.53",0);
        Controller controller3 = new Controller("172.190.114.56",0);
        controllerList.add(controller1);
        controllerList.add(controller2);
        controllerList.add(controller3);
        for(String ip:ipList){
            for (Controller vo:controllerList){
                if(vo.getIp().equals(ip)){
                    vo.setIsMonitor(1);
                    nal.add(ip);
                    break;
                }
            }
        }

        ipList = ipList.stream().filter(x->!nal.contains(x)).collect(Collectors.toList());
        System.out.println("ip列表:"+ipList);

        System.out.println("新对象数据:"+controllerList);
    }
}
