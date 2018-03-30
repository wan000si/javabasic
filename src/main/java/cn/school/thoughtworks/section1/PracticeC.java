package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.Map;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> SameElementSet = new ArrayList<String>();
        for (String s2:collection1) {
            boolean flag = false;
            for (String s1:collection2.keySet()) {
                if (s2.equals(collection2.get(s1))) {
                    flag = true;
                    break;
                }
            }
        }
        return SameElementSet;
    }
}
