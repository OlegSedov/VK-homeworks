package ru.netology.domain;

public class LikesInfo {
    private int count;
    private int userLikesInfo;
    private int canLike;
    private boolean canPublish;

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

    public boolean isCanPublish() {
        return canPublish;
    }

    public void setCanPublish(boolean canPublish) {
        this.canPublish = canPublish;
    }
}
