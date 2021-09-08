package com.company;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        String regex = ".*?\\s(#\\w+).*?";
        String regex1 = ".*?\\s(@\\w+).*?";


        List<String> hashtags = new ArrayList<String>();
        List<String> mentions = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Pattern pattern = Pattern.compile(regex);
        Pattern pattern1 = Pattern.compile(regex1);

        Matcher matcher = pattern.matcher(s);
        Matcher matcher1 = pattern1.matcher(s);

        MatchResult result = matcher.toMatchResult();
        MatchResult result1 = matcher.toMatchResult();

        while (matcher.find()){
            hashtags.add(matcher.group(1));
        }
        while (matcher1.find()){
            mentions.add(matcher1.group(1));
        }
        Iterator hash = hashtags.iterator();
        Iterator ment = mentions.iterator();

        while(hash.hasNext()) {
            System.out.println("hashtags: " + hash.next());
        }
        while(ment.hasNext()) {
            System.out.println("mentions: " + ment.next());
        }
    }
}
