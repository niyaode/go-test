package net.sdake.oauthserver.entities;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 角色授权表
 */
public class RoleMenuEntity implements Serializable {

    //@NotNull(message = "ID不能为空",groups = RoleMenuEntity.edit.class)
    private Long id;

    @NotNull(message = "角色表ID不能为空")
    private Long menuId;

    @NotNull(message = "菜单表ID不能为空")
    private Long roleId;

    @NotNull(message = "父级菜单不能为空")
    private Long pid;

    @NotBlank(message = "菜单名称不能为空")
    @Length(max = 50,message = "菜单名称过长")
    private String name;

    @Length(max = 20,message = "图标名称过长")
    private String icon ;

    @NotBlank(message = "请求路径不能为空")
    @Length(max = 50,message = "请求路径过长")
    private String url;

    @NotBlank(message = "授权路径不能为空")
    @Length(max = 50,message = "授权路径过长")
    private String authUrl;

    @Length(max = 50,message = "参数过长")
    private String param;

    private int type = 1;

    @NotNull(message = "请求类型不能为空")
    private int httpMethod ;

    private int menuType;

    private int status;

    private float listOrder;

    @Length(max = 50,message = "备注过长")
    private String remark;

    private Date gmtCreate;
    private Date gmtModified;
    private Date isDel;

    private List<RoleMenuEntity> children = new ArrayList<>();


    private String str = "";
    private String tableStr = "";
    private String menuList = "";

    //分组校验
    public interface edit{}

    public RoleMenuEntity() {
    }

    public RoleMenuEntity(Long id, @NotNull(message = "角色表ID不能为空") Long menuId, @NotNull(message = "菜单表ID不能为空") Long roleId, @NotNull(message = "父级菜单不能为空") Long pid, @NotBlank(message = "菜单名称不能为空") @Length(max = 50, message = "菜单名称过长") String name, @Length(max = 20, message = "图标名称过长") String icon, @NotBlank(message = "请求路径不能为空") @Length(max = 50, message = "请求路径过长") String url, @NotBlank(message = "授权路径不能为空") @Length(max = 50, message = "授权路径过长") String authUrl, @Length(max = 50, message = "参数过长") String param, int type, @NotNull(message = "请求类型不能为空") int httpMethod, int menuType, int status, float listOrder, @Length(max = 50, message = "备注过长") String remark, Date gmtCreate, Date gmtModified, Date isDel) {
        this.id = id;
        this.menuId = menuId;
        this.roleId = roleId;
        this.pid = pid;
        this.name = name;
        this.icon = icon;
        this.url = url;
        this.authUrl = authUrl;
        this.param = param;
        this.type = type;
        this.httpMethod = httpMethod;
        this.menuType = menuType;
        this.status = status;
        this.listOrder = listOrder;
        this.remark = remark;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.isDel = isDel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthUrl() {
        return authUrl;
    }

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(int httpMethod) {
        this.httpMethod = httpMethod;
    }

    public int getMenuType() {
        return menuType;
    }

    public void setMenuType(int menuType) {
        this.menuType = menuType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public float getListOrder() {
        return listOrder;
    }

    public void setListOrder(float listOrder) {
        this.listOrder = listOrder;
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

    public List<RoleMenuEntity> getChildren() {
        return children;
    }

    public void setChildren(List<RoleMenuEntity> children) {
        this.children = children;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str += str;
    }

    public String getTableStr() {
        return tableStr;
    }

    public void setTableStr(String tableStr) {
        this.tableStr += tableStr;
    }
}
