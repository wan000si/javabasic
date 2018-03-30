package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> sameElementSet = new HashMap<String, Integer>();
        for (String s1:collection1) {
            if (sameElementSet.containsKey(s1)) {
                sameElementSet.put(s1, sameElementSet.get(s1).intValue() + 1);
            } else {
                sameElementSet.put(s1,1);
            }
        }
        return sameElementSet;

        return null;
    }
}
