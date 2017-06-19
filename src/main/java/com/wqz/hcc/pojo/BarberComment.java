package com.wqz.hcc.pojo;

import java.util.Date;

public class BarberComment {
    private Integer id;

    private Integer barberId;

    private Integer userId;

    private Integer score;

    private Double srcPrize;

    private Double targetPrize;

    private String content;

    private String pics;

    private Date datetime;

    private Integer seeNum;

    private Integer likeNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBarberId() {
        return barberId;
    }

    public void setBarberId(Integer barberId) {
        this.barberId = barberId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Double getSrcPrize() {
        return srcPrize;
    }

    public void setSrcPrize(Double srcPrize) {
        this.srcPrize = srcPrize;
    }

    public Double getTargetPrize() {
        return targetPrize;
    }

    public void setTargetPrize(Double targetPrize) {
        this.targetPrize = targetPrize;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPics() {
        return pics;
    }

    public void setPics(String pics) {
        this.pics = pics == null ? null : pics.trim();
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Integer getSeeNum() {
        return seeNum;
    }

    public void setSeeNum(Integer seeNum) {
        this.seeNum = seeNum;
    }

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }
}