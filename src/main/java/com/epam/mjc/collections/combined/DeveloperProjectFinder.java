package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> listOfProjects = new LinkedList<>();
        for (String project : projects.keySet()) {
            if(projects.get(project).contains(developer)) {
                listOfProjects.add(project);
            }
        }
        return listOfProjects;
    }
}
