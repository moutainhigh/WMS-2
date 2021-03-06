package com.wms.business;
// Generated 2017-3-22 16:50:30 by Hibernate Tools 5.2.1.Final

import com.plat.common.beans.BaseModel;

/**
 * WmsLesReceiveList generated by hbm2java
 */
public class WmsLesReceiveList extends BaseModel {

	private static final long serialVersionUID = 1L;
	private String mapSheetNo;// 对应配送单号
	private String partNo;// 零件号
	private String supplNo;// 供应商编码
	private String sxCardNo;// 随箱卡号
	private String sendPackageNo;// 发运包装编号
	private Integer sendPackageNum;// 发运包装容量
	private Integer reqPackageNum;// 需求箱数
	private Integer reqQty;// 需求数量
	private Integer sendQty;// 实发数量
	private Integer receiveQty;// 实收数量
	private Integer status;// 收货状态 0获取单据1收货登记 2 收货完成3单据取消
	private String gtype;// 零件类型
	private String whCode;// 仓库代码

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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
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
