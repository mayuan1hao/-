package cn.gsw.smbms.pojo;

import java.util.Date;
import java.util.List;

public class Provider {
	private int id;
	private String proCode;
	private String proName;
	private String proDesc;
	private String proContact;
	private String proPhone;
	private String proAddress;
	private String proFax;
	private int createdBy;
	private Date creationDate;
	private Date modifyDate;
	private int modifyBy;
	private List<Bill> billList;
	
	public List<Bill> getBillList() {
		return billList;
	}
	public void setBillList(List<Bill> billList) {
		this.billList = billList;
	}
	public Provider(int id, String proCode, String proName, String proDesc,
			String proContact, String proPhone, String proAddress,
			String proFax, int createdBy, Date creationDate, Date modifyDate,
			int modifyBy) {
		super();
		this.id = id;
		this.proCode = proCode;
		this.proName = proName;
		this.proDesc = proDesc;
		this.proContact = proContact;
		this.proPhone = proPhone;
		this.proAddress = proAddress;
		this.proFax = proFax;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.modifyDate = modifyDate;
		this.modifyBy = modifyBy;
	}
	public Provider() {
		super();
	}
	public int getId() {
		return id;
	}
	public String getProCode() {
		return proCode;
	}
	public String getProName() {
		return proName;
	}
	public String getProDesc() {
		return proDesc;
	}
	public String getProContact() {
		return proContact;
	}
	public String getProPhone() {
		return proPhone;
	}
	public String getProAddress() {
		return proAddress;
	}
	public String getProFax() {
		return proFax;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public int getModifyBy() {
		return modifyBy;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setProCode(String proCode) {
		this.proCode = proCode;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public void setProDesc(String proDesc) {
		this.proDesc = proDesc;
	}
	public void setProContact(String proContact) {
		this.proContact = proContact;
	}
	public void setProPhone(String proPhone) {
		this.proPhone = proPhone;
	}
	public void setProAddress(String proAddress) {
		this.proAddress = proAddress;
	}
	public void setProFax(String proFax) {
		this.proFax = proFax;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
	}
	
}
