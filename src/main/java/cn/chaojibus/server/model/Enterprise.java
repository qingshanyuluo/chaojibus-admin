package cn.chaojibus.server.model;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

import xyz.erupt.annotation.Erupt;
import xyz.erupt.annotation.EruptField;
import xyz.erupt.annotation.sub_field.Edit;
import xyz.erupt.annotation.sub_field.EditType;
import xyz.erupt.annotation.sub_field.View;
import xyz.erupt.annotation.sub_field.sub_edit.ReferenceTableType;


/**
 * @author Trey
 * @since 2020/12/19
 */

@Entity
@Table(name = "t_enterprise")
@Erupt(name = "企业")
public class Enterprise {
    @Id
    @GeneratedValue
    @EruptField
    private Long id;

    @EruptField(
        views = @View(title = "名称"),
        edit = @Edit(title = "名称")
    )
    private String name;

    @EruptField(
        views = @View(title = "法人代表"),
        edit = @Edit(title = "法人代表")
    )
    private String legalPerson;

    @EruptField(
        views = @View(title = "公司地址"),
        edit = @Edit(title = "公司地址")
    )
    private String address;

    @EruptField(
        views = @View(title = "合作状态"),
        edit = @Edit(title = "合作状态")
    )
    private String cooperationStatus;//合作状态

    @EruptField(
        views = @View(title = "所属行业"),
        edit = @Edit(title = "所属行业")
    )
    private String industry;//所属行业

    @EruptField(
        views = @View(title = "信用等级"),
        edit = @Edit(title = "信用等级")
    )
    private Integer creditRating;//信用等级
    @EruptField(
        views = @View(title = "工商信用代码"),
        edit = @Edit(title = "工商信用代码")
    )
    private String industrialAndCommercialCreditCode;//工商信用代码
    @EruptField(
        views = @View(title = "开户行名称"),
        edit = @Edit(title = "开户行名称")
    )
    private String openingBank;//开户行名称
    @EruptField(
        views = @View(title = "开户行账户"),
        edit = @Edit(title = "开户行账户")
    )
    private String bankAccountNumber;//开户行账户
    @EruptField(
        views = @View(title = "营业执照"),
        edit = @Edit(title = "营业执照")
    )
    private String businessLicense;//营业执照
    
    private Long enterpriseAdminId;

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

    public Long getEnterpriseAdminId() {
        return enterpriseAdminId;
    }

    public void setEnterpriseAdminId(Long enterpriseAdminId) {
        this.enterpriseAdminId = enterpriseAdminId;
    }



}
