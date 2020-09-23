package ru.netology.domain;

public class LikesInfo {
    private int count;
    private int userLikesInfo;
    private int canLike;
    private int canPublish;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserLikesInfo() {
        return userLikesInfo;
    }

    public void setUserLikesInfo(int userLikesInfo) {
        this.userLikesInfo = userLikesInfo;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }
}
