package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> sameElementSet = new HashMap<String,Integer>();
        Map<String,Integer> collection3 = new HashMap<String,Integer>();
        for (String s1:collectionA) {
            int sum=0;
            //List<String> collection3 = Arrays.asList(s1.split("-"));
            String[] collectiontemp= s1.split("\\-");
            if (collectiontemp.length > 1) {
                for (int i = 0; i <collectiontemp[1] .length(); i++) {
                    sum = sum*10 + collectiontemp[1].charAt(i)-'0';
                }
            }else
                sum = 1;
            if (collection3.containsKey(collectiontemp[0])) {
                collection3.put(String.valueOf(s1.charAt(0)), collection3.get(String.valueOf(s1.charAt(0))) + sum);
            } else {
                collection3.put(String.valueOf(s1.charAt(0)),sum);
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
