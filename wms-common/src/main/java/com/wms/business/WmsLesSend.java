package com.wms.business;
// Generated 2017-3-22 16:50:30 by Hibernate Tools 5.2.1.Final

import java.util.List;

import com.plat.common.beans.BaseModel;

/**
 * WmsLesSend generated by hbm2java
 */
public class WmsLesSend extends BaseModel {

	private static final long serialVersionUID = 1L;
	private String deliveryRec;
	private String deliveryRecType;
	private String deliverySend;
	private Long isEmerge;
	private Integer isReturn;
	private String lastRecRequrieTime;
	private String lastUpdateTime;
	private String mapSheetNo;
	private String mriCreateTime;
	private String mriStatus;
	private String mriType;
	private String plantNo;
	private String pullType;
	private String sheetStatus;
	private String sheetSuppRecTime;
	private Integer status;
	private String whCode;
	private String beginTime;
	private String endTime;
	private String gtype;
	private List<WmsLesSendList> wmsLesSendList;

	public String getDeliveryRec() {
		return deliveryRec;
	}

	public String getDeliveryRecType() {
		return deliveryRecType;
	}

	public String getDeliverySend() {
		return deliverySend;
	}

	public Long getIsEmerge() {
		return isEmerge;
	}

	public Integer getIsReturn() {
		return isReturn;
	}

	public String getLastRecRequrieTime() {
		return lastRecRequrieTime;
	}

	public String getLastUpdateTime() {
		return lastUpdateTime;
	}

	public String getMapSheetNo() {
		return mapSheetNo;
	}

	public String getMriCreateTime() {
		return mriCreateTime;
	}

	public String getMriStatus() {
		return mriStatus;
	}

	public String getMriType() {
		return mriType;
	}

	public String getPlantNo() {
		return plantNo;
	}

	public String getPullType() {
		return pullType;
	}

	public String getSheetStatus() {
		return sheetStatus;
	}

	public String getSheetSuppRecTime() {
		return sheetSuppRecTime;
	}

	public Integer getStatus() {
		return status;
	}

	public String getWhCode() {
		return whCode;
	}

	public List<WmsLesSendList> getWmsLesSendList() {
		return wmsLesSendList;
	}

	public void setDeliveryRec(String deliveryRec) {
		this.deliveryRec = deliveryRec;
	}

	public void setDeliveryRecType(String deliveryRecType) {
		this.deliveryRecType = deliveryRecType;
	}

	public void setDeliverySend(String deliverySend) {
		this.deliverySend = deliverySend;
	}

	public void setIsEmerge(Long isEmerge) {
		this.isEmerge = isEmerge;
	}

	public void setIsReturn(Integer isReturn) {
		this.isReturn = isReturn;
	}

	public void setLastRecRequrieTime(String lastRecRequrieTime) {
		this.lastRecRequrieTime = lastRecRequrieTime;
	}

	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public void setMapSheetNo(String mapSheetNo) {
		this.mapSheetNo = mapSheetNo;
	}

	public void setMriCreateTime(String mriCreateTime) {
		this.mriCreateTime = mriCreateTime;
	}

	public void setMriStatus(String mriStatus) {
		this.mriStatus = mriStatus;
	}

	public void setMriType(String mriType) {
		this.mriType = mriType;
	}

	public void setPlantNo(String plantNo) {
		this.plantNo = plantNo;
	}

	public void setPullType(String pullType) {
		this.pullType = pullType;
	}

	public void setSheetStatus(String sheetStatus) {
		this.sheetStatus = sheetStatus;
	}

	public void setSheetSuppRecTime(String sheetSuppRecTime) {
		this.sheetSuppRecTime = sheetSuppRecTime;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setWhCode(String whCode) {
		this.whCode = whCode;
	}

	public void setWmsLesSendList(List<WmsLesSendList> wmsLesSendList) {
		this.wmsLesSendList = wmsLesSendList;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getGtype() {
		return gtype;
	}

	public void setGtype(String gtype) {
		this.gtype = gtype;
	}

	@Override
	public String toString() {
		return "WmsLesSend [mapSheetNo=" + mapSheetNo + ", isEmerge=" + isEmerge + ", lastRecRequrieTime="
				+ lastRecRequrieTime + ", mriCreateTime=" + mriCreateTime + ", lastUpdateTime=" + lastUpdateTime
				+ ", mriStatus=" + mriStatus + ", mriType=" + mriType + ", sheetSuppRecTime=" + sheetSuppRecTime
				+ ", deliveryRec=" + deliveryRec + ", deliveryRecType=" + deliveryRecType + ", deliverySend="
				+ deliverySend + ", pullType=" + pullType + ", sheetStatus=" + sheetStatus + ", plantNo=" + plantNo
				+ ", status=" + status + ", whCode=" + whCode + ", isReturn=" + isReturn + ", wmsLesSendList="
				+ wmsLesSendList + "]";
	}

}