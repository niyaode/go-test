package net.sdake.oauthserver.entities;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * 用户拥有的权限
 */
public class RoleUserAdminEntity {

    @NotNull(message = "ID不能为空",groups = edit.class)
    private Long id;

    private Long roleId;

    private Long userAdminId;

    private Date gmtCreate;

    //分组校验
    public interface edit{}

    public RoleUserAdminEntity() {
    }

    public RoleUserAdminEntity(@NotNull(message = "ID不能为空", groups = edit.class) Long id, Long roleId, Long userAdminId, Date gmtCreate) {
        this.id = id;
        this.roleId = roleId;
        this.userAdminId = userAdminId;
        this.gmtCreate = gmtCreate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getUserAdminId() {
        return userAdminId;
    }

    public void setUserAdminId(Long userAdminId) {
        this.userAdminId = userAdminId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
