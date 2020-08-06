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
@Table ( name ="sys_role" )
public class Role  implements Serializable {

	private static final long serialVersionUID =  384949693914423414L;

    @Id
   	@Column(name = "roleid" )
	private Long roleid;

   	@Column(name = "rolename" )
	private String rolename;

   	@Column(name = "roledesc" )
	private String roledesc;

   	@Column(name = "available" )
	private Long available;

  public Long getRoleid() {
    return roleid;
  }

  public void setRoleid(Long roleid) {
    this.roleid = roleid;
  }


  public String getRolename() {
    return rolename;
  }

  public void setRolename(String rolename) {
    this.rolename = rolename;
  }


  public String getRoledesc() {
    return roledesc;
  }

  public void setRoledesc(String roledesc) {
    this.roledesc = roledesc;
  }


  public Long getAvailable() {
    return available;
  }

  public void setAvailable(Long available) {
    this.available = available;
  }

}
