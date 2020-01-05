package net.puzatin.kyu6.smileFaces;

import java.util.List;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {

        int countSmileyFaces = 0;
        for (String smile : arr) {
        if(smile.matches("[:;][-~]?[)D]")) countSmileyFaces++;
    }

        return countSmileyFaces;
    }

}
