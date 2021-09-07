package com.lyh;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException{
        List<String> total = getList("G:\\workspace\\fund\\total.txt");
        List<String> one = getList("G:\\workspace\\fund\\one.txt");
        List<String> three = getList("G:\\workspace\\fund\\three.txt");

        total.retainAll(three);
        total.forEach(item->{
            System.out.println(item);
        });
        System.out.println("--------------");

        three.retainAll(one);
        three.forEach(item->{
            System.out.println(item);
        });
    }

    public static List<String> getList(String path)throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader reader = new BufferedReader(fileReader);
        List<String> list = new ArrayList<>();

        String line = reader.readLine();
        while (line != null){
            //System.out.println(line);
            list.add(new String(line.getBytes(),"utf-8"));
            line = reader.readLine();
        }
        return list;
    }
}
