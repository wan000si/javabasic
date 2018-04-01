package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> sameElementSet = new HashMap<String, Integer>();
        for (String s1:collection1) {
            int sum=0;
            //List<String> collection3 = Arrays.asList(s1.split("-"));
            String[] collection3= s1.split("\\-|\\[|\\]|\\:");
            if (collection3.length > 1) {
                for (int i = 0; i <collection3[1] .length(); i++) {
                    sum = sum*10 + collection3[1].charAt(i)-'0';
                }
            }else
                sum = 1;

            if (sameElementSet.containsKey(collection3[0])) {
                sameElementSet.put(String.valueOf(s1.charAt(0)), sameElementSet.get(String.valueOf(s1.charAt(0))) + sum);
            } else {
                sameElementSet.put(String.valueOf(s1.charAt(0)),sum);
            }
        }
        return sameElementSet;
    }
}
