package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> wordLenMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {
            String word = entry.getKey();
            wordLenMap.put(word.length(), new HashSet<>());
        }
        for (Map.Entry<Integer, Set<String>> entryWordLenMap : wordLenMap.entrySet()) {
            for (Map.Entry<String, Integer> entrySourceMap : sourceMap.entrySet()) {
                String word = entrySourceMap.getKey();
                if(word.length() == entryWordLenMap.getKey()) {
                    Set<String> words = entryWordLenMap.getValue();
                    words.add(word);
                    entryWordLenMap.setValue(words);
                }
            }
        }
        return wordLenMap;
    }
}
