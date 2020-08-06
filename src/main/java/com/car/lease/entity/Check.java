package com.car.lease.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;
/** 
 * @team mackie Studio 
 * @Author QQ:15577969 
 * @Date 2020-08-06 16:50:10 
 */
@Entity
@Table ( name ="bus_check" )
public class Check  implements Serializable {

	private static final long serialVersionUID =  1830732251893726563L;

    @Id
   	@Column(name = "checkid" )
	private String checkid;

   	@Column(name = "checkdate" )
	private Date checkdate;

   	@Column(name = "checkdesc" )
	private String checkdesc;

   	@Column(name = "problem" )
	private String problem;

   	@Column(name = "paymoney" )
	private BigDecimal paymoney;

   	@Column(name = "opername" )
	private String opername;

   	@Column(name = "rentid" )
	private String rentid;

   	@Column(name = "createtime" )
	private Date createtime;

  public String getCheckid() {
    return checkid;
  }

  public void setCheckid(String checkid) {
    this.checkid = checkid;
  }


  public Date getCheckdate() {
    return checkdate;
  }

  public void setCheckdate(Date checkdate) {
    this.checkdate = checkdate;
  }


  public String getCheckdesc() {
    return checkdesc;
  }

  public void setCheckdesc(String checkdesc) {
    this.checkdesc = checkdesc;
  }


  public String getProblem() {
    return problem;
  }

  public void setProblem(String problem) {
    this.problem = problem;
  }


  public BigDecimal getPaymoney() {
    return paymoney;
  }

  public void setPaymoney(BigDecimal paymoney) {
    this.paymoney = paymoney;
  }


  public String getOpername() {
    return opername;
  }

  public void setOpername(String opername) {
    this.opername = opername;
  }


  public String getRentid() {
    return rentid;
  }

  public void setRentid(String rentid) {
    this.rentid = rentid;
  }


  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }

}
