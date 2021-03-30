package cn.chaojibus.server.model;

import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_erupt.Power;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.ReferenceTableType;
import xyz.erupt.annotation.sub_field.sub_edit.TagsType;

import javax.persistence.*;

@Erupt(name = "客户",
power = @Power(add = false, delete = false, 
                      edit = true, query = true, 
                      importable = false, export = true))
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    @EruptField
    private Long id;

    @EruptField(views = @View(title = "姓名"), edit = @Edit(title = "姓名"))
    private String name;

    @EruptField(views = @View(title = "年龄"), edit = @Edit(title = "年龄"))
    private Integer age;

    @EruptField(views = @View(title = "性别"), edit = @Edit(title = "性别", type = EditType.TAGS, tagsType = @TagsType(tags = {
            "女", "男" })))
    private String gender;

    @EruptField(views = @View(title = "身份证号"), edit = @Edit(title = "身份证号"))
    private String idNumber;
    // 文本输入
    @EruptField(views = @View(title = "手机号"), edit = @Edit(title = "手机号"))
    @Column(nullable = false, unique = true)
    private String phone;

    @Column(nullable = false)
    private String password;

    private String salt;
    

    @EruptField(views = @View(title = "是否为企业负责人"), edit = @Edit(title = "是否为企业负责人"))
    private Boolean type; // 0为管理员 1 为普通用户


    @EruptField(views = @View(title = "所属企业", column = "name"), edit = @Edit(title = "所属企业", type = EditType.REFERENCE_TABLE, referenceTableType = @ReferenceTableType(id = "id", label = "name")))
    @ManyToOne
    private Enterprise enterprise;

}
