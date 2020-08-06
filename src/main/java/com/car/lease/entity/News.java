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
@Table ( name ="sys_news" )
public class News  implements Serializable {

	private static final long serialVersionUID =  3838263797766741872L;

	@Id
   	@Column(name = "id" )
	private Long id;

   	@Column(name = "title" )
	private String title;

   	@Column(name = "content" )
	private String content;

   	@Column(name = "createtime" )
	private Date createtime;

   	@Column(name = "opername" )
	private String opername;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public Date getCreatetime() {
    return createtime;
  }

  public void setCreatetime(Date createtime) {
    this.createtime = createtime;
  }


  public String getOpername() {
    return opername;
  }

  public void setOpername(String opername) {
    this.opername = opername;
  }

}
