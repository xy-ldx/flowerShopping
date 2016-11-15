package com.flowershopping.entity;
// Generated 2016-9-6 20:01:04 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import org.apache.struts2.json.annotations.JSON;

/**
 * Orders generated by hbm2java
 */
public class Orders implements java.io.Serializable {

	private static final long serialVersionUID = -3423401953125465122L;
	private Integer ordersId;
	private String username;
	private int num;
	private BigDecimal sum;
	private Timestamp createTime;
	@SuppressWarnings("rawtypes")
	private Set ordersdetailses = new HashSet(0);

	public Orders() {
	}

	public Orders(String username, int num, BigDecimal sum, Timestamp createTime) {
		this.username = username;
		this.num = num;
		this.sum = sum;
		this.createTime = createTime;
	}

	@SuppressWarnings("rawtypes")
	public Orders(String username, int num, BigDecimal sum, Timestamp createTime, Set ordersdetailses) {
		this.username = username;
		this.num = num;
		this.sum = sum;
		this.createTime = createTime;
		this.ordersdetailses = ordersdetailses;
	}

	public Integer getOrdersId() {
		return this.ordersId;
	}

	public void setOrdersId(Integer ordersId) {
		this.ordersId = ordersId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public BigDecimal getSum() {
		return this.sum;
	}

	public void setSum(BigDecimal sum) {
		this.sum = sum;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}
	
	@JSON(serialize=false)
	@SuppressWarnings("rawtypes")
	public Set getOrdersdetailses() {
		return this.ordersdetailses;
	}

	@SuppressWarnings("rawtypes")
	public void setOrdersdetailses(Set ordersdetailses) {
		this.ordersdetailses = ordersdetailses;
	}

}
