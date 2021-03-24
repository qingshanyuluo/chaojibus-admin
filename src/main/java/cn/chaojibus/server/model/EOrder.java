package cn.chaojibus.server.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_erupt.Power;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.ReferenceTableType;

@Entity
@Table(name = "t_eorder")
@Erupt(name = "企业订单", power = @Power(add = true, delete = false, edit = true, query = true, importable = false, export = true))
public class EOrder {
    @Id
    @GeneratedValue
    @EruptField
    private Long id;

    @EruptField(views = @View(title = "所属企业", column = "name"),
                edit = @Edit(title = "所属企业", type = EditType.REFERENCE_TABLE,
                            referenceTableType = @ReferenceTableType(id = "id", label = "name")))
    @ManyToOne
    private Enterprise enterprise;
                            


    @EruptField(views = @View(title = "企业负责人", column = "name"),
                edit = @Edit(title = "企业负责人", type = EditType.REFERENCE_TABLE,
                            referenceTableType = @ReferenceTableType(id = "id", label = "name")))
    @ManyToOne
    private User admin;

    @EruptField(views = @View(title = "分配的司机", column = "name"),
                edit = @Edit(title = "分配的司机", type = EditType.REFERENCE_TABLE,
                            referenceTableType = @ReferenceTableType(id = "id", label = "name")))
    @ManyToOne
    private Driver driver;

    @EruptField(
        views = @View(title = "人数"),
        edit = @Edit(title = "人数")
    )
    private Integer pnum;

    @EruptField(
        views = @View(title = "用途"),
        edit = @Edit(title = "用途")
    )
    private String uses;
    
    @EruptField(
        views = @View(title = "出发地"),
        edit = @Edit(title = "出发地")
    )
    private String start;
    
    @EruptField(
        views = @View(title = "目的地"),
        edit = @Edit(title = "目的地")
    )
    private String end;
    
    @EruptField(
        views = @View(title = "停靠点1"),
        edit = @Edit(title = "停靠点1")
    )
    private String station1;
    
    @EruptField(
        views = @View(title = "停靠点2"),
        edit = @Edit(title = "停靠点2")
    )
    private String station2;
    
    @EruptField(
        views = @View(title = "备注"),
        edit = @Edit(title = "备注")
    )
    private String remark;
    
    @EruptField(
        views = @View(title = "路线时常"),
        edit = @Edit(title = "路线时常")
    )
    private String duration;
    
    @EruptField(
        views = @View(title = "出发时间"),
        edit = @Edit(title = "出发时间")
    )
    private Date date;

    @EruptField(
        views = @View(title = "金额(元)"),
        edit = @Edit(title = "金额")
    )
    private Integer money;
    
    @EruptField(
        views = @View(title = "是否完成"),
        edit = @Edit(title = "是否完成")
    )
    private Boolean finished;
    
    @EruptField(
        views = @View(title = "是否已取消"),
        edit = @Edit(title = "是否已取消")
    )
    private Boolean revocation;

    @EruptField(
        views = @View(title = "是否往返"),
        edit = @Edit(title = "是否往返")
    )
    private Boolean round;


}
