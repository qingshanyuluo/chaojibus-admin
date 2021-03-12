package cn.chaojibus.server.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.View;

@Entity
@Table(name = "t_order")
@Erupt(name = "路线")
public class Order {
    

    @Id
    @GeneratedValue
    @EruptField
    private Long id;

    @EruptField(
        views = @View(title = "订单类型"),
        edit = @Edit(title = "订单类型")
    )
    private Byte type; //订单类型 目前都为0 班车订单

    @EruptField(
        views = @View(title = "用户id"),
        edit = @Edit(title = "用户id")
    )
    private Long userId;

    @EruptField(
        views = @View(title = "司机id"),
        edit = @Edit(title = "司机id")
    )
    private Long driverId;

    @EruptField(
        views = @View(title = "车牌号"),
        edit = @Edit(title = "车牌号")
    )
    private String busNo;

    @EruptField(
        views = @View(title = "日期"),
        edit = @Edit(title = "日期")
    )
    private Date date;

    @EruptField(
        views = @View(title = "开始地点"),
        edit = @Edit(title = "开始地点")
    )
    private String start;

    @EruptField(
        views = @View(title = "结束地点"),
        edit = @Edit(title = "结束地点")
    )
    private String end;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public String getBusNo() {
        return busNo;
    }

    public void setBusNo(String busNo) {
        this.busNo = busNo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
}
