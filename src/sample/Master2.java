package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Master2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("你好，北京");
        list.add("我好想你");
        list.add("可惜不是我");
        list.add("为你到最后");

        List<Integer> intList = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        list2 =intList.stream().filter(x->!x.equals(2)).collect(Collectors.toList());

        System.out.println(list2.toString());
        System.out.println(UUID.randomUUID().toString().replaceAll("-",""));

        int [] array = new int[]{1,3,22,12,45,5,67,98,88};
        for(int i=0;i<array.length;i++){
            //boolean flag =false;
            for (int j= i;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    //flag = true;
                }
            }
          /*  if(! flag) {

                break;

            }*/

        }
        System.out.println(Arrays.toString(array));



    }
}
