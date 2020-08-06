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
@Table ( name ="bus_car" )
public class Car  implements Serializable {

	private static final long serialVersionUID =  3660528044333309190L;

	@Id
   	@Column(name = "carnumber" )
	private String carnumber;

   	@Column(name = "cartype" )
	private String cartype;

   	@Column(name = "color" )
	private String color;

   	@Column(name = "price" )
	private BigDecimal price;

   	@Column(name = "rentprice" )
	private BigDecimal rentprice;

   	@Column(name = "deposit" )
	private BigDecimal deposit;

   	@Column(name = "isrenting" )
	private Long isrenting;

   	@Column(name = "description" )
	private String description;

   	@Column(name = "carimg" )
	private String carimg;

   	@Column(name = "createtime" )
	private Date createtime;

  public String getCarnumber() {
    return carnumber;
  }

  public void setCarnumber(String carnumber) {
    this.carnumber = carnumber;
  }


  public String getCartype() {
    return cartype;
  }

  public void setCartype(String cartype) {
    this.cartype = cartype;
  }


  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }


  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public BigDecimal getRentprice() {
    return rentprice;
  }

  public void setRentprice(BigDecimal rentprice) {
    this.rentprice = rentprice;
  }


  public BigDecimal getDeposit() {
    return deposit;
  }

  public void setDeposit(BigDecimal deposit) {
    this.deposit = deposit;
  }


  public Long getIsrenting() {
    return isrenting;
  }

  public void setIsrenting(Long isrenting) {
    this.isrenting = isrenting;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getCarimg() {
    return carimg;
  }

  public void setCarimg(String carimg) {
    this.carimg = carimg;
  }


  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }

}
