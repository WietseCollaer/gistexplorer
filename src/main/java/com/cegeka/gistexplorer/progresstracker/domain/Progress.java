package com.cegeka.gistexplorer.progresstracker.domain;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class Progress {
    private String username;
    private List<String> completedItems = newArrayList();
    private List<String> uncompletedItems = newArrayList();
    private List<String> uncertainItems = newArrayList();
    private int totalItems = 0;

    public Progress(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public List<String> getCompletedItems() {
        return completedItems;
    }

    public void addToCompletedItems(String item) {
        completedItems.add(item);
    }

    public List<String> getUncompletedItems() {
        return uncompletedItems;
    }

    public void addToUncompletedItems(String item) {
        uncompletedItems.add(item);
    }

    public List<String> getUncertainItems() {
        return uncertainItems;
    }

    public void addToUncertainItems(String item) {
        uncertainItems.add(item);
    }

    public int getTotalItems() {
        return totalItems;
    }

    public int getNumberOfCompletedItems() {
        return completedItems.size();
    }

    public void calculateProgress() {
        this.totalItems = completedItems.size() + uncompletedItems.size() + uncertainItems.size();
    }

}
