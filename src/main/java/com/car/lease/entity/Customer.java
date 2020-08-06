package com.car.lease.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import java.util.Date;
/** 
 * @team mackie Studio 
 * @Author QQ:15577969 
 * @Date 2020-08-06 16:50:10 
 */
@Entity
@Table ( name ="bus_customer" )
public class Customer  implements Serializable {

	private static final long serialVersionUID =  6846644572846015286L;

	/**
	 * 身份证
	 */
    @Id
   	@Column(name = "identity" )
	private String identity;

	/**
	 * 姓名
	 */
   	@Column(name = "custname" )
	private String custname;

	/**
	 * 性别
	 */
   	@Column(name = "sex" )
	private Long sex;

	/**
	 * 地址
	 */
   	@Column(name = "address" )
	private String address;

	/**
	 * 电话
	 */
   	@Column(name = "phone" )
	private String phone;

	/**
	 * 职位
	 */
   	@Column(name = "career" )
	private String career;

   	@Column(name = "createtime" )
	private Date createtime;

  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public String getCustname() {
    return custname;
  }

  public void setCustname(String custname) {
    this.custname = custname;
  }


  public Long getSex() {
    return sex;
  }

  public void setSex(Long sex) {
    this.sex = sex;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public String getCareer() {
    return career;
  }

  public void setCareer(String career) {
    this.career = career;
  }


  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }

}
