package cn.chaojibus.server.model;

import java.util.Date;

import javax.persistence.*;

import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.View;

@Entity
@Erupt(name = "车辆")
@Table(name = "t_bus")
public class Bus {

    @Id
    @GeneratedValue
    @Column(name = "id")
    @EruptField
    private Long id;

    @EruptField(
        views = @View(title = "车牌号"),
        edit = @Edit(title = "车牌号")
    )
    private String cph;

    @EruptField(
        views = @View(title = "车驾号"),
        edit = @Edit(title = "车驾号")
    )
    private String cjh;

    @EruptField(
        views = @View(title = "品牌"),
        edit = @Edit(title = "品牌")
    )
    private String pp;

    @EruptField(
        views = @View(title = "车型"),
        edit = @Edit(title = "车型")
    )
    private String cx;

    @EruptField(
        views = @View(title = "车座"),
        edit = @Edit(title = "车座")
    )
    private Integer num;

    @EruptField(
        views = @View(title = "运营证"),
        edit = @Edit(title = "运营证")
    )
    private String yyz;

    @EruptField(
    views = @View(title = "发证日期"),
    edit = @Edit(title = "发证日期")
    )
    private Date fzdate;
    
    @EruptField(
        views = @View(title = "gps安装时间"),
        edit = @Edit(title = "gps安装时间")
    )
    private Date gpsDate;

            

    
}
