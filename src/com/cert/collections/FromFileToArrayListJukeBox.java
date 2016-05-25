package com.cert.collections;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by sridhar on 4/4/16.
 */
public class FromFileToArrayListJukeBox {
    private ArrayList<String> songs = new ArrayList<>();

    public void go(){
            File file = new File("songs.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ( (line = reader.readLine()) != null){
                    addSong(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addSong(String line){
        songs.add(line);
    }

    public void list(){
        System.out.println(songs);
    }

    public void sort(){
        Collections.sort(songs);
    }

    public static void main(String[] args) {
        FromFileToArrayListJukeBox jukeBox = new FromFileToArrayListJukeBox();
        jukeBox.go();
        jukeBox.list();
        jukeBox.sort();
        jukeBox.list();
    }
}
