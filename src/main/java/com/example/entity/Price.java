package com.example.entity;

import java.math.BigDecimal;

public class Price {

    private Long id;

    private Long userId;

    private Long videoId;

    private BigDecimal itemPrice;

    private Long sellAmount;

    public Long getId() {
        return id;
    }

    public Price setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getUserId() {
        return userId;
    }

    public Price setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    public Long getVideoId() {
        return videoId;
    }

    public Price setVideoId(Long videoId) {
        this.videoId = videoId;
        return this;
    }

    public BigDecimal getItemPrice() {
        return itemPrice;
    }

    public Price setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
        return this;
    }

    public Long getSellAmount() {
        return sellAmount;
    }

    public Price setSellAmount(Long sellAmount) {
        this.sellAmount = sellAmount;
        return this;
    }
}
