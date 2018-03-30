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
        for (String s1:collection3.keySet()) {
            //boolean flag = false;
            if (object.containsKey(s1)) {
                //flag = true;
                if (collection3.get(s1)>3) {
                    int sub = collection3.get(s1)/3;
                    sameElementSet.put(s1,collection3.get(s1)-sub);
                }
            }
        }
        return sameElementSet;
    }

}
