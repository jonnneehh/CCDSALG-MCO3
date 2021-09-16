package bst;

import java.io.*;
import java.util.*;

public class WordCounter {
    public ArrayList<String> words;

    public WordCounter() throws IOException {
        bst.node root= null;
        words = new ArrayList<>();

        File inputFile = new File("inputFile.txt");
        FileWriter outputFile = new FileWriter("outputFile.txt");

        Scanner scan = new Scanner(inputFile);

        while(scan.hasNext()){
            root = bst.insert(root, scan.next());
        }

        bst.inorder(this,root);

        for (String word : words) {
            outputFile.write(word + "\n");
        }
        outputFile.close();
    }
}