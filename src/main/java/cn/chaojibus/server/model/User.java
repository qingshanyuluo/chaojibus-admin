package cn.chaojibus.server.model;

import org.hibernate.annotations.GenericGenerator;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.View;

import javax.persistence.*;

@Erupt(name = "客户")
@Entity
@Table(name = "t_user")
public class User {
    
    @Id
    @GeneratedValue
    @Column(name = "id")
    @EruptField
    private Long id;
    //文本输入
    @EruptField(
            views = @View(title = "手机号"),
            edit = @Edit(title = "手机号")
    )
    @Column(nullable = false, unique = true)
    private String phone;

    @Column(nullable = false)
    private String password;

    private String salt;

    private String imgUrl;

    @EruptField(
        views = @View(title = "性别"),
        edit = @Edit(title = "0为女 1 为男")
    )
    private Integer gender; //0为女 1 为男

    private Integer type; //0为管理员 1 为普通用户

    @EruptField(
        views = @View(title = "所属企业"),
        edit = @Edit(title = "企业")
    )
    private String eid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    
}
