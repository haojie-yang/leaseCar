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
@Table ( name ="sys_menu" )
public class Menu  implements Serializable {

	private static final long serialVersionUID =  4305885429450750292L;

	@Id
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "pid" )
	private Long pid;

   	@Column(name = "title" )
	private String title;

   	@Column(name = "href" )
	private String href;

	/**
	 * 0不展开1展开
	 */
   	@Column(name = "spread" )
	private Long spread;

   	@Column(name = "target" )
	private String target;

   	@Column(name = "icon" )
	private String icon;

	/**
	 * 0不可用1可用
	 */
   	@Column(name = "available" )
	private Long available;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public Long getPid() {
    return pid;
  }

  public void setPid(Long pid) {
    this.pid = pid;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  public Long getSpread() {
    return spread;
  }

  public void setSpread(Long spread) {
    this.spread = spread;
  }


  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  public Long getAvailable() {
    return available;
  }

  public void setAvailable(Long available) {
    this.available = available;
  }

}
