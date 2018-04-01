package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> sameElementSet = new HashMap<String,Integer>();
        Map<String,Integer> collection3 = new HashMap<String,Integer>();
        for (String s1:collectionA) {
            if (collection3.containsKey(s1)) {
                collection3.put(s1, collection3.get(s1) + 1);
            } else {
                collection3.put(s1,1);
            }
        }
        for (String s2:collection3.keySet()) {
            //System.out.println(s2);
            for (String s1:object.get("value")) {
                // System.out.println(s1);
                if (s2.equals(s1)) {
                    sameElementSet.put(s2,(collection3.get(s2)-(collection3.get(s2)/3)));
                    break;
                }else
                    sameElementSet.put(s2,collection3.get(s2));
            }
        }
        return sameElementSet;
    }

}
