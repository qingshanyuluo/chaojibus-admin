package cn.chaojibus.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.View;

@Entity
@Erupt(name = "路线")
@Table(name = "t_line")
public class Line {
    
    @Id
    @GeneratedValue
    @Column
    @EruptField
    private Long id;

    @EruptField(
        views = @View(title = "线路详情"),
        edit = @Edit(title = "线路详情")
    )
    private String value;

    @EruptField(
        views = @View(title = "所属企业id"),
        edit = @Edit(title = "所属企业")
    )
    private Long enterpriseId;

    @EruptField(
        views = @View(title = "开始时间"),
        edit = @Edit(title = "开始时间")
    )
    private String startTime;
    
    @EruptField(
        views = @View(title = "结束时间"),
        edit = @Edit(title = "结束时间")
    )
    private String endTime;
    
    @EruptField(
        views = @View(title = "班次"),
        edit = @Edit(title = "班次")
    )
    private String TrainNum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getTrainNum() {
        return TrainNum;
    }

    public void setTrainNum(String trainNum) {
        TrainNum = trainNum;
    }
}
