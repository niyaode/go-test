package net.sdake.oauthserver.entities;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 后台菜单表
 */
public class RoleEntity {
    @NotNull(message = "ID不能为空",groups = edit.class)
    private Long id;

    @NotBlank(message = "角色名称不能为空")
    @Length(max = 20,message = "角色名称过长")
    private String roleName;

    private int status;

    @Length(max = 50,message = "备注过长")
    private String remark;

    private Date gmtCreate;
    private Date gmtModified;
    private Date isDel;

    private boolean selected;

    //分组校验
    public interface edit{}

    public RoleEntity() {
    }

    public RoleEntity(Long id, @NotBlank(message = "角色名称不能为空") @Length(max = 20, message = "角色名称过长") String roleName, int status, @Length(max = 50, message = "备注过长") String remark, Date gmtCreate, Date gmtModified, Date isDel) {
        this.id = id;
        this.roleName = roleName;
        this.status = status;
        this.remark = remark;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.isDel = isDel;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Date getIsDel() {
        return isDel;
    }

    public void setIsDel(Date isDel) {
        this.isDel = isDel;
    }
}
