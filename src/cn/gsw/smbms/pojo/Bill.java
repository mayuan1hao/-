package cn.gsw.smbms.pojo;

import java.util.Date;

public class Bill {
	private Integer id;
	private String billCode;
	private String productName;
	private String productDesc;
	private String productUnit;
	private Double productCount;
	private Double totalPrice;
	private Integer isPayment;
	private Integer createdBy;
	private Date creationDate;
	private Integer modifyBy;
	private String modifyDate;
	private Provider provider;
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	private Integer providerId;
	private String providerName;
	public Bill() {
		super();
	}
	public Bill(Integer id, String billCode, String productName,
			String productDesc, String productUnit, Double productCount,
			Double totalPrice, Integer isPayment, Integer createdBy,
			Date creationDate, Integer modifyBy, String modifyDate,
			Integer providerId) {
		super();
		this.id = id;
		this.billCode = billCode;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productUnit = productUnit;
		this.productCount = productCount;
		this.totalPrice = totalPrice;
		this.isPayment = isPayment;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
		this.providerId = providerId;
	}
	public Integer getId() {
		return id;
	}
	public String getBillCode() {
		return billCode;
	}
	public String getProductName() {
		return productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public String getProductUnit() {
		return productUnit;
	}
	public Double getProductCount() {
		return productCount;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public Integer getIsPayment() {
		return isPayment;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public String getModifyDate() {
		return modifyDate;
	}
	public Integer getProviderId() {
		return providerId;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}
	public void setProductCount(Double productCount) {
		this.productCount = productCount;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public void setIsPayment(Integer isPayment) {
		this.isPayment = isPayment;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public void setModifyDate(String modifyDate) {
		this.modifyDate = modifyDate;
	}
	public void setProviderId(Integer providerId) {
		this.providerId = providerId;
	}
}
