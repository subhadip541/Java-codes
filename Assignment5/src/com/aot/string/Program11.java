package com.aot.string;

public class Program11 {
    public static void main(String[] args) {
        String s = "Java";
        s.concat(" Class");
        System.out.println(s);
        StringBuffer sb = new StringBuffer("study");
        System.out.println(sb);
        sb.append("tonight");
        System.out.println(sb);
    }
}
