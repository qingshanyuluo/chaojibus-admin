package cn.chaojibus.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.ReferenceTableType;

@Entity
@Erupt(name = "班车路线")
@Table(name = "t_line")
public class Line {
    
    @Id
    @GeneratedValue
    @Column
    @EruptField
    private Long id;

    @EruptField(
            views = @View(title = "订单编号"),
            edit = @Edit(title = "订单编号")
    )
    private String uid;

    @EruptField(
            views = @View(title = "发车时间"),
            edit = @Edit(title = "发车时间")
    )
    private String time;

    @EruptField(
        views = @View(title = "线路详情"),
        edit = @Edit(title = "线路详情")
    )
    private String value;

    @EruptField(
            views = @View(title = "负责司机"),
            edit = @Edit(title = "负责司机")
    )
    @OneToOne
    private Driver driver;

    @EruptField(
        views = @View(title = "所属企业", column = "name"),
        edit = @Edit(title = "所属企业", type = EditType.REFERENCE_TABLE,
                    referenceTableType = @ReferenceTableType(id = "id", label = "name"))
    )
    @ManyToOne
    private Enterprise enterprise;


    @EruptField(
        views = @View(title = "合约开始时间"),
        edit = @Edit(title = "合约开始时间")
    )
    private String startTime;
    
    @EruptField(
        views = @View(title = "合约结束时间"),
        edit = @Edit(title = "合约结束时间")
    )
    private String endTime;
    
    @EruptField(
        views = @View(title = "班次"),
        edit = @Edit(title = "班次")
    )
    private String TrainNum;

}
