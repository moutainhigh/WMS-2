package com.wms.business;
// Generated 2017-3-22 16:50:30 by Hibernate Tools 5.2.1.Final

import com.plat.common.beans.BaseModel;

/**
 * WmsHandworkReceiveList generated by hbm2java
 */
public class WmsHandworkReceiveList extends BaseModel {

	private static final long serialVersionUID = 1L;
	private String mapSheetNo;
	private String partNo;
	private String supplNo;
	private String sxCardNo;
	private String sendPackageNo;
	private Integer sendPackageNum;
	private Integer reqPackageNum;
	private Integer reqQty;
	private Integer sendQty;
	private Integer receiveQty;
	private String gtype;
	private String whCode;
	public String getMapSheetNo() {
		return mapSheetNo;
	}

	public void setMapSheetNo(String mapSheetNo) {
		this.mapSheetNo = mapSheetNo;
	}

	public String getPartNo() {
		return partNo;
	}

	public void setPartNo(String partNo) {
		this.partNo = partNo;
	}

	public String getSupplNo() {
		return supplNo;
	}

	public void setSupplNo(String supplNo) {
		this.supplNo = supplNo;
	}

	public String getSxCardNo() {
		return sxCardNo;
	}

	public void setSxCardNo(String sxCardNo) {
		this.sxCardNo = sxCardNo;
	}

	public String getSendPackageNo() {
		return sendPackageNo;
	}

	public void setSendPackageNo(String sendPackageNo) {
		this.sendPackageNo = sendPackageNo;
	}

	public Integer getSendPackageNum() {
		return sendPackageNum;
	}

	public void setSendPackageNum(Integer sendPackageNum) {
		this.sendPackageNum = sendPackageNum;
	}

	public Integer getReqPackageNum() {
		return reqPackageNum;
	}

	public void setReqPackageNum(Integer reqPackageNum) {
		this.reqPackageNum = reqPackageNum;
	}

	public Integer getReqQty() {
		return reqQty;
	}

	public void setReqQty(Integer reqQty) {
		this.reqQty = reqQty;
	}

	public Integer getSendQty() {
		return sendQty;
	}

	public void setSendQty(Integer sendQty) {
		this.sendQty = sendQty;
	}

	public Integer getReceiveQty() {
		return receiveQty;
	}

	public void setReceiveQty(Integer receiveQty) {
		this.receiveQty = receiveQty;
	}

	public String getGtype() {
		return gtype;
	}

	public void setGtype(String gtype) {
		this.gtype = gtype;
	}

	public String getWhCode() {
		return whCode;
	}

	public void setWhCode(String whCode) {
		this.whCode = whCode;
	}
}