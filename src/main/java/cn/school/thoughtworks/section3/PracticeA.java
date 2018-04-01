package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> sameElementSet =new HashMap<String, Integer>();
        for (String s2:collectionA.keySet()) {
            //System.out.println(s2);
            for (String s1:object.get("value")) {
               // System.out.println(s1);
                if (s2.equals(s1)) {
                    sameElementSet.put(s2,(collectionA.get(s2)-1));
                    break;
                }else
                    sameElementSet.put(s2,collectionA.get(s2));
            }
        }
        return sameElementSet;
    }
}
