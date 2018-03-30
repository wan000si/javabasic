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
            for (int i = 0; i < s1.length();++i) {
                if((i!=s1.length()-1) && ((s1.charAt(i)=='-')|| (s1.charAt(i) == '['))){
                    for (int j=i+1;(j<s1.length()) && (s1.charAt(j)!=']');++j) {
                        sum=sum*10+s1.charAt(j)-'0';
                    }
                }
                break;
            }
            if (sameElementSet.containsKey(String.valueOf(s1.charAt(0)))) {
                sameElementSet.put(String.valueOf(s1.charAt(0)), sameElementSet.get(String.valueOf(s1.charAt(0))) + sum);
            } else {
                sameElementSet.put(String.valueOf(s1.charAt(0)),1);
            }
        }
        return sameElementSet;
    }
}
