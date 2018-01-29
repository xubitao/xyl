package com.xingyi.logistic.qiangdan.bean;

import com.xingyi.logistic.business.bean.BaseModelAndDO;

import javax.validation.constraints.NotNull;

public class BaseReservation extends BaseModelAndDO {

    private Integer leftDispatchId;

    /**
     * 用户id
     */
    @NotNull
    private Integer userId;

    /**
     * 船舶经度
     */
    @NotNull
    private Integer shipLongitude;

    /**
     * 船舶纬度
     */
    @NotNull
    private Integer shipLatitude;

    /**
     * 预报吨位
     */
    @NotNull
    private Integer preLoad;

    /**
     * 预计到达港口时间
     */
    @NotNull
    private Integer preArrivePortTime;

    /**
     * 空船照片
     */
    private String shipEmptyPhoto;

    /**
     * 参照物照片
     */
    private String shipReference;

    /**
     * 状态
     */
    private Integer status;

    private Integer checkStatus;
    private Double actualTransferPrice;
    private Double preSettleAmount;
    private String shipNo;
    private String name;
    private String mobile;

    public Integer getLeftDispatchId() {
        return leftDispatchId;
    }

    public void setLeftDispatchId(Integer leftDispatchId) {
        this.leftDispatchId = leftDispatchId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getShipLongitude() {
        return shipLongitude;
    }

    public void setShipLongitude(Integer shipLongitude) {
        this.shipLongitude = shipLongitude;
    }

    public Integer getShipLatitude() {
        return shipLatitude;
    }

    public void setShipLatitude(Integer shipLatitude) {
        this.shipLatitude = shipLatitude;
    }

    public Integer getPreLoad() {
        return preLoad;
    }

    public void setPreLoad(Integer preLoad) {
        this.preLoad = preLoad;
    }

    public Integer getPreArrivePortTime() {
        return preArrivePortTime;
    }

    public void setPreArrivePortTime(Integer preArrivePortTime) {
        this.preArrivePortTime = preArrivePortTime;
    }

    public String getShipEmptyPhoto() {
        return shipEmptyPhoto;
    }

    public void setShipEmptyPhoto(String shipEmptyPhoto) {
        this.shipEmptyPhoto = shipEmptyPhoto;
    }

    public String getShipReference() {
        return shipReference;
    }

    public void setShipReference(String shipReference) {
        this.shipReference = shipReference;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Double getActualTransferPrice() {
        return actualTransferPrice;
    }

    public void setActualTransferPrice(Double actualTransferPrice) {
        this.actualTransferPrice = actualTransferPrice;
    }

    public Double getPreSettleAmount() {
        return preSettleAmount;
    }

    public void setPreSettleAmount(Double preSettleAmount) {
        this.preSettleAmount = preSettleAmount;
    }

    public String getShipNo() {
        return shipNo;
    }

    public void setShipNo(String shipNo) {
        this.shipNo = shipNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}