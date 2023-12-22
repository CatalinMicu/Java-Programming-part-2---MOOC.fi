/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CiCi
 */
public class SaveableDictionary {
    private HashMap<String, String> dictionar;
    private File file;
    
    public SaveableDictionary() {
        this.dictionar = new HashMap<>();
    }
    
    public SaveableDictionary(String file) {
        this.dictionar = new HashMap<>();
        this.file = new File(file);
    }
    
    public void add(String words, String translation) {
        dictionar.putIfAbsent(words, translation);
    }
    
    public String translate(String word) {
        for (String p : dictionar.keySet()) {
            if (dictionar.get(p).equals(word)) {
                return p;
            } else if (this.dictionar.get(word) != null) {
                return this.dictionar.get(word);
            } 
        }
        return null;
    }
    
    public void delete(String word) {
    if (this.dictionar.containsKey(word)) {
        dictionar.remove(word);
    } else {
        String keyToRemove = null;
        for (String key : dictionar.keySet()) {
            if (dictionar.get(key).equals(word)) {
                keyToRemove = key;
                break;
            }
        }
        if (keyToRemove != null) {
            dictionar.remove(keyToRemove);
        }
    }
}
    
    public boolean load() {
        try (Scanner scanner = new Scanner(Paths.get(this.file.getName()))) {
            while (scanner.hasNextLine()) {
                String linie = scanner.nextLine();
                String[] bucati = linie.split(":");
                this.dictionar.putIfAbsent(bucati[0], bucati[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("BULEALA");
            return false;
        }
    }
    
    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.file.getName())) {
            for (String p : this.dictionar.keySet()) {
                String traducere = this.dictionar.get(p);
                writer.println(p + ":" + traducere);
          }
            writer.close();
            return true;
        } catch (Exception e) {
            System.out.println("BULEALA");
            return false;
        }
    }
    
}
