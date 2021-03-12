package cn.chaojibus.server.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.View;

@Entity
@Erupt(name = "司机")
@Table(name = "t_driver")
public class Driver {

    @Id
    @GeneratedValue
    @Column(name = "id")
    @EruptField
    private Long id;

    @EruptField(views = @View(title = "姓名"), edit = @Edit(title = "姓名"))
    private String name;

    @EruptField(views = @View(title = "年龄"), edit = @Edit(title = "年龄"))
    private Integer age;

    @EruptField(views = @View(title = "身份证号"), edit = @Edit(title = "身份证号"))
    private String idNumber;

    @EruptField(views = @View(title = "电话"), edit = @Edit(title = "电话"))
    @Column(unique = true, nullable = false, length = 20)
    private String phone;// 手机号

    @EruptField(views = @View(title = "密码"), edit = @Edit(title = "密码"))
    private String password;

    @EruptField(views = @View(title = "1可用，0不可用"), edit = @Edit(title = "1可用，0不可用"))
    private Integer status;// 1可用，0不可用

    @EruptField(views = @View(title = "车牌号"), edit = @Edit(title = "车牌号"))
    private Long busId;// 车牌号

    @EruptField(views = @View(title = "0为女 1 为男"), edit = @Edit(title = "0为女 1 为男"))
    private Integer gender; // 0为女 1 为男

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getBusId() {
        return busId;
    }

    public void setBusId(Long busId) {
        this.busId = busId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
