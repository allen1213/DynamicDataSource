package com.example.entity;

import java.math.BigDecimal;

public class Summery {

    private Long userId;

    private Long videoId;

    private BigDecimal remotePrice;

    private BigDecimal remoteSell;

    private BigDecimal remoteAmount;

    private BigDecimal price;

    private BigDecimal sell;

    private BigDecimal amount;

    public Long getUserId() {
        return userId;
    }

    public Summery setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getVideoId() {
        return videoId;
    }

    public Summery setVideoId(Long videoId) {
        this.videoId = videoId;
        return this;
    }

    public BigDecimal getRemotePrice() {
        return remotePrice;
    }

    public Summery setRemotePrice(BigDecimal remotePrice) {
        this.remotePrice = remotePrice;
        return this;
    }

    public BigDecimal getRemoteSell() {
        return remoteSell;
    }

    public Summery setRemoteSell(BigDecimal remoteSell) {
        this.remoteSell = remoteSell;
        return this;
    }

    public BigDecimal getRemoteAmount() {
        return remoteAmount;
    }

    public Summery setRemoteAmount(BigDecimal remoteAmount) {
        this.remoteAmount = remoteAmount;
        return this;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Summery setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }

    public BigDecimal getSell() {
        return sell;
    }

    public Summery setSell(BigDecimal sell) {
        this.sell = sell;
        return this;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Summery setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }
}
