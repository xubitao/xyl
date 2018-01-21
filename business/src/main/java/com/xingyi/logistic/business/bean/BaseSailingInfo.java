package com.xingyi.logistic.business.bean;

import com.xingyi.logistic.common.annotation.AllowedNumber;
import com.xingyi.logistic.common.annotation.NotNullEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 航次信息
 */
public class BaseSailingInfo extends BaseModelAndDO {

    @NotNullEmpty
    private Long shipId;//船id
    @NotNullEmpty
    private Long orderId;//订单id
    @AllowedNumber(values = {1, 2, 3, 4, 5}, message = "航次信息类型错误")
    private Integer status;//航次信息类型  1：空船到港  2：空船装后  3:重船到港  4：重船卸后  5：重船离港
    private Long arriveSPortTime;//实际到装货港时间
    private Long loadTime;//实际装货时间
    private Long loadWeight;//装货吨位
    private Long preArriveEPortTime;//预计到卸货港时间
    private Long actualArriveEPortTime;//实际到达卸货港时间
    private Long dischargeTime;//实际卸货时间
    private Long dischargeWeight;//实际卸货重量
    private Float dischargeDelayFee;//卸货延迟费用
    private Float allowance;//异常补助
    private Long departPortTime;//离港日期
    private String description;//备注

    public Long getDepartPortTime() {
        return departPortTime;
    }

    public void setDepartPortTime(Long departPortTime) {
        this.departPortTime = departPortTime;
    }

    public Long getShipId() {
        return shipId;
    }

    public void setShipId(Long shipId) {
        this.shipId = shipId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getArriveSPortTime() {
        return arriveSPortTime;
    }

    public void setArriveSPortTime(Long arriveSPortTime) {
        this.arriveSPortTime = arriveSPortTime;
    }

    public Long getLoadTime() {
        return loadTime;
    }

    public void setLoadTime(Long loadTime) {
        this.loadTime = loadTime;
    }

    public Long getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(Long loadWeight) {
        this.loadWeight = loadWeight;
    }

    public Long getPreArriveEPortTime() {
        return preArriveEPortTime;
    }

    public void setPreArriveEPortTime(Long preArriveEPortTime) {
        this.preArriveEPortTime = preArriveEPortTime;
    }

    public Long getActualArriveEPortTime() {
        return actualArriveEPortTime;
    }

    public void setActualArriveEPortTime(Long actualArriveEPortTime) {
        this.actualArriveEPortTime = actualArriveEPortTime;
    }

    public Long getDischargeTime() {
        return dischargeTime;
    }

    public void setDischargeTime(Long dischargeTime) {
        this.dischargeTime = dischargeTime;
    }

    public Long getDischargeWeight() {
        return dischargeWeight;
    }

    public void setDischargeWeight(Long dischargeWeight) {
        this.dischargeWeight = dischargeWeight;
    }

    public Float getDischargeDelayFee() {
        return dischargeDelayFee;
    }

    public void setDischargeDelayFee(Float dischargeDelayFee) {
        this.dischargeDelayFee = dischargeDelayFee;
    }

    public Float getAllowance() {
        return allowance;
    }

    public void setAllowance(Float allowance) {
        this.allowance = allowance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}