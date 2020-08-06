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
@Table ( name ="bus_rent" )
public class Rent  implements Serializable {

	private static final long serialVersionUID =  1531991536815008827L;

    @Id
   	@Column(name = "rentid" )
	private String rentid;

   	@Column(name = "price" )
	private BigDecimal price;

   	@Column(name = "begindate" )
	private Date begindate;

   	@Column(name = "returndate" )
	private Date returndate;

   	@Column(name = "rentflag" )
	private Long rentflag;

   	@Column(name = "identity" )
	private String identity;

   	@Column(name = "carnumber" )
	private String carnumber;

   	@Column(name = "opername" )
	private String opername;

   	@Column(name = "createtime" )
	private Date createtime;

  public String getRentid() {
    return rentid;
  }

  public void setRentid(String rentid) {
    this.rentid = rentid;
  }


  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public Date getBegindate() {
    return begindate;
  }

  public void setBegindate(Date begindate) {
    this.begindate = begindate;
  }


  public Date getReturndate() {
    return returndate;
  }

  public void setReturndate(Date returndate) {
    this.returndate = returndate;
  }


  public Long getRentflag() {
    return rentflag;
  }

  public void setRentflag(Long rentflag) {
    this.rentflag = rentflag;
  }


  public String getIdentity() {
    return identity;
  }

  public void setIdentity(String identity) {
    this.identity = identity;
  }


  public String getCarnumber() {
    return carnumber;
  }

  public void setCarnumber(String carnumber) {
    this.carnumber = carnumber;
  }


  public String getOpername() {
    return opername;
  }

  public void setOpername(String opername) {
    this.opername = opername;
  }


  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }

}
