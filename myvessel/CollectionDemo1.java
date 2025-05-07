package myvessel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {

        //1.
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");


        //2.
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("------------------------");
        //3. 增强for循环
        //底层也是迭代器
        for (String s : coll) {
            System.out.println(s);
        }
        System.out.println("------------------------");
        //4.lambda表达式
        //底层也是迭代器
        coll.forEach(s -> System.out.println(s));

    }
}
