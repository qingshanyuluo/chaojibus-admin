package cn.chaojibus.server.model;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.ViewType;
import xyz.erupt.annotation.sub_field.sub_edit.ReferenceTableType;

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

    @EruptField(views = @View(title = "状态（1可用，0不可用）"), edit = @Edit(title = "1可用，0不可用"))
    private Integer status;// 1可用，0不可用

    @EruptField(
                views = @View(title = "车辆", column = "cph" ),
                edit = @Edit(title = "车辆", type = EditType.REFERENCE_TABLE,
                             referenceTableType = @ReferenceTableType(id= "id", label = "cph")    )
    )
    @OneToOne()
    private Bus bus;// 车牌号

    @EruptField(
        views = @View(title = "分配班车路线", column = "value"),
        edit = @Edit(title = "分配司机", type = EditType.REFERENCE_TABLE,
                    referenceTableType = @ReferenceTableType(id = "id", label = "value"))
    )
    @OneToOne
    private Line line;

    @EruptField(
        views = @View(title = "分配的企业订单", column = "end"),
        edit = @Edit(title = "分配的企业订单", type = EditType.REFERENCE_TABLE,
                    referenceTableType = @ReferenceTableType(id = "id", label = "end"))
    )
    @OneToOne
    private EOrder eOrder;

}
