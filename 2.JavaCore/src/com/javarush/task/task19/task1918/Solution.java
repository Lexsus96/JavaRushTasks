package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        StringBuilder stringBuilder = new StringBuilder();
        reader = new BufferedReader(new FileReader(file));
        while (reader.ready()) {
            stringBuilder.append(reader.readLine());
        }
        reader.close();
        Document doc = Jsoup.parse(stringBuilder.toString(), "", Parser.xmlParser());
        Elements elements = doc.getElementsByTag(args[0]);
        for (Element e: elements) {
            System.out.println(e);
        }
    }
}
