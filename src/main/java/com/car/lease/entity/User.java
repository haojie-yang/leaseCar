package com.car.lease.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
/** 
 * @team mackie Studio 
 * @Author QQ:15577969 
 * @Date 2020-08-06 16:50:10 
 */
@Entity
@Table ( name ="sys_user" )
public class User  implements Serializable {

	private static final long serialVersionUID =  7271100714503787269L;

    @Id
   	@Column(name = "userid" )
	private Long userid;

   	@Column(name = "loginname" )
	private String loginname;

   	@Column(name = "identity" )
	private String identity;

   	@Column(name = "realname" )
	private String realname;

	/**
	 * 0女1男
	 */
   	@Column(name = "sex" )
	private Long sex;

   	@Column(name = "address" )
	private String address;

   	@Column(name = "phone" )
	private String phone;

   	@Column(name = "pwd" )
	private String pwd;

   	@Column(name = "position" )
	private String position;

	/**
	 * 1，超级管理员,2，系统用户
	 */
   	@Column(name = "type" )
	private Long type;

   	@Column(name = "available" )
	private Long available;

  public Long getUserid() {
    return userid;
  }

  public void setUserid(Long userid) {
    this.userid = userid;
  }


  public String getLoginname() {
    return loginname;
  }

  public void setLoginname(String loginname) {
    this.loginname = loginname;
  }


  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
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


  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }


  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public Long getType() {
    return type;
  }

  public void setType(Long type) {
    this.type = type;
  }


  public Long getAvailable() {
    return available;
  }

  public void setAvailable(Long available) {
    this.available = available;
  }

}
