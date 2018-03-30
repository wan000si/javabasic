package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> sameElementSet = new HashMap<String, Integer>();
        for (String s1:collectionA.keySet()) {
            //boolean flag = false;
            if (object.containsKey(s1)) {
                    //flag = true;
                    sameElementSet.put(s1,collectionA.get(s1).intValue()-1);
                    continue;
                }
        }

        return sameElementSet;
    }
}
