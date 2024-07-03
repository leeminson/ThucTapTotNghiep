/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author pc
 */
public class Bai5 {
    
    private static void wordBreak(String s, int i, Set<String> dict, List<String> cur, List<String> res) {
        if (i == s.length()) {
            if (!cur.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < cur.size(); j++) {
                    if (j > 0) {
                        sb.append(' ');
                    }
                    sb.append(cur.get(j));
                }
                res.add(sb.toString());
            }
            return;
        }

        for (int j = i + 1; j <= s.length(); j++) {
            if (dict.contains(s.substring(i, j))) {
                cur.add(s.substring(i, j));
                wordBreak(s, j, dict, cur, res);
                cur.remove(cur.size() - 1);
            }
        }
    }
    
    public static List<String> WordBreakResult(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        List<String> res = new ArrayList<>();
        List<String> cur = new ArrayList<>();
        wordBreak(s, 0, dict, cur, res);
        return res;
    }
    public static void main(String[] args) {
        String s="catsanddog";
        List<String> wordDict = Arrays.asList("cat", "cats", "and", "sand", "dog");
        List<String> result=WordBreakResult(s,wordDict);
        System.out.println(result.size());
        for (String string : result) {
            System.out.println(string);
        }
    }
}

