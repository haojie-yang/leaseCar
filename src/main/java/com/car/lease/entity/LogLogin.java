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
@Table ( name ="sys_log_login" )
public class LogLogin  implements Serializable {

	private static final long serialVersionUID =  9136042033440733378L;

	@Id
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "loginname" )
	private String loginname;

   	@Column(name = "loginip" )
	private String loginip;

   	@Column(name = "logintime" )
	private Date logintime;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getLoginname() {
    return loginname;
  }

  public void setLoginname(String loginname) {
    this.loginname = loginname;
  }


  public String getLoginip() {
    return loginip;
  }

  public void setLoginip(String loginip) {
    this.loginip = loginip;
  }


  public Date getLogintime() {
    return logintime;
  }

  public void setLogintime(Date logintime) {
    this.logintime = logintime;
  }

}
