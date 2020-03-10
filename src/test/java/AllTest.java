import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:/*.xml")
public class AllTest {
    @Test
    public void liatTest(){
        LinkedList linkedList=new LinkedList();
        LinkedList linkedList1=new LinkedList();
        LinkedList linkedList2=new LinkedList();
        linkedList.add("西");
        linkedList.add("游");
        linkedList.add("记");
        linkedList1.push("红");
        linkedList1.push("楼");
        linkedList1.push("梦");
        linkedList2.offer("三");
        linkedList2.offer("国");
        linkedList2.offer("演");
        linkedList2.offer("义");
        System.out.print(linkedList);
        System.out.print((String)linkedList1.pop());
        System.out.print((String)linkedList1.pop());
        System.out.print((String)linkedList1.pop());
        System.out.println(linkedList2.poll());
        System.out.println(linkedList2.poll());
        System.out.println(linkedList2.poll());
        System.out.println(linkedList2.poll());
//        System.out.print((String)linkedList1.pop());
    }

    @Test
    public void jsonTest(){
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("string","123");
        jsonObject.put("int",2);
        jsonObject.put("bollean",true);
        List<Integer> integers = Arrays.asList(1,2,3);
        jsonObject.put("list",integers);
        jsonObject.put("null",null);
        System.out.print(jsonObject);

        JSONObject object = JSONObject
                .parseObject("{\"boolean\":true,\"string\":\"string\",\"list\":[1,2,3],\"int\":2}");
        String s = object.getString("string");
        String str = jsonObject.getString("string");
        Integer in =jsonObject.getInteger("int");
        System.out.println(in+"老大去武汉了！！");
    }
}
