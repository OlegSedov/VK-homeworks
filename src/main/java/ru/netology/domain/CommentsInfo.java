package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private int canPost;
    private int groupCanPost;
    private int canClose;
    private int canOpen;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCanPost() {
        return canPost;
    }

    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }

    public int getGroupCanPost() {
        return groupCanPost;
    }

    public void setGroupCanPost(int groupCanPost) {
        this.groupCanPost = groupCanPost;
    }

    public int getCanClose() {
        return canClose;
    }

    public void setCanClose(int canClose) {
        this.canClose = canClose;
    }

    public int getCanOpen() {
        return canOpen;
    }

    public void setCanOpen(int canOpen) {
        this.canOpen = canOpen;
    }
}
