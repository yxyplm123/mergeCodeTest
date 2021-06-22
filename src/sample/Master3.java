package sample;

import java.util.Comparator;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class Master3 {
    public static void main(String[] args) {
        String str= "我知道，就像大雨变成城市变老";

        String name = "是他就是他，我们的小英雄，小哪吒";

        System.out.println("uuid:"+ UUID.randomUUID().toString());
        System.out.println(str+":"+name);

      int i = 6;

      switch (i){
          case 1:
              System.out.println("1");break;
          case 2:
              System.out.println("2");break;
          case 5:
          case 4:
              System.out.println("5");
            break;
          default:
              System.out.println("1111111");
      }

        System.out.println("你好，北京，你好，上海");

        System.out.println("我不好");

        System.out.println("你好吗，北京，在吗.北京炸酱面");

        String str1 = "123456";
        int i1 = str1.indexOf("45");
        System.out.println(i1);

        int ai = 1;
        int a= ai++;
        int b = ++ai;
        System.out.println("第一个值:"+a+",第二个值："+b);
    }
}
