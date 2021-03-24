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
import xyz.erupt.annotation.sub_field.View;

@Entity
@Table(name = "t_rorder")
@Erupt(name = "班车订单",
power = @Power(add = true, delete = false, 
                      edit = true, query = true, 
                      importable = false, export = true))
public class RegulerOrder {
    

    @Id
    @GeneratedValue
    @EruptField
    private Long id;


    @EruptField(views = @View(title = "用户", column = "name"))
    @ManyToOne
    private User user;

    @EruptField(views = @View(title = "路线", column = "value"))
    @ManyToOne
    private Line line;

    @EruptField(views = @View(title = "时间"))
    private Date date;

    @EruptField(views = @View(title = "所属企业", column = "name"))
    @ManyToOne
    private Enterprise enterprise;

}
