package bst;

import java.io.*;
import java.util.*;

public class WordCounter {
    public ArrayList<String> words;
    private Object[] strings;
    private File inputFile;
    private FileWriter outputFile;

    public WordCounter() throws IOException {
        bst.node root= null;
        words = new ArrayList<>();
        String filename;

        Scanner kb = new Scanner(System.in);
        System.out.println("Enter filename (not case sensitive): ");
        filename = kb.nextLine();

        try{
            inputFile = new File(filename + ".txt");

            Scanner scan = new Scanner(inputFile);

            while(scan.hasNext()){
                root = bst.insert(root, scan.next());
            }

            bst.inorder(this,root);

            strings = words.toArray();


            countFreq(strings, strings.length);
        } catch(Exception e){
            System.out.println("File not found");
        }
    }

    public void countFreq(Object arr[], int n) throws IOException {
        Map<Object, Integer> mp = new HashMap<>();
        outputFile = new FileWriter("WORDS.txt");

        for (int i = 0; i < n; i++)
        {
            mp.put(arr[i], mp.get(arr[i]) == null ? 1 : mp.get(arr[i]) + 1);
        }

        for (int i = 0; i < n; i++)
        {
            if (mp.get(arr[i]) != -1)
            {
                outputFile.write(arr[i] + " " + mp.get(arr[i]) + "\n");
                mp.put(arr[i], -1);
            }
        }
        outputFile.close();
    }
}