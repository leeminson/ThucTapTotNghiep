/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tuan1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author pc
 */
public class Bai2 {
    public static void main(String[] args) {
        String regex="^(https?://)(www\\.)?([a-zA-Z0-9]+)\\.([a-z]{2,6})(/[^\s]*)$";
        String s1="https://www.tikisdsdsdds.vn/dien-thoai-may-tinh-bang/c1789?src=mega-menu";
        String url1 = "https://tiki.vn/dien-thoai-may-tinh-bang/c1789?src=mega-menu";
        String url2 = "http://vidu.com/ptit loi";
        System.out.println("URL 1: "+url1.matches(regex));
        System.out.println("URL 2: "+url2.matches(regex));
    }
}
