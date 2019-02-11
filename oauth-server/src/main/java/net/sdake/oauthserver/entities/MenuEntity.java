package net.sdake.oauthserver.entities;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 后台菜单表
 */
public class MenuEntity implements Serializable {

    @NotNull(message = "ID不能为空",groups = MenuEntity.edit.class)
    private Long id;

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
    //是否展开
    private boolean spread = false;

    private float listOrder;

    @Length(max = 50,message = "备注过长")
    private String remark;

    private Date gmtCreate;

    public boolean isSpread() {
        return spread;
    }

    public void setSpread(boolean spread) {
        this.spread = spread;
    }

    private Date gmtModified;
    private Date isDel;

    private List<MenuEntity> children = new ArrayList<>();


    private String str = "";
    private String tableStr = "";
    private String menuList = "";

    //分组校验
    public interface edit{}

    public MenuEntity() {
    }

    public MenuEntity(@NotNull(message = "ID不能为空", groups = MenuEntity.edit.class) Long id, @NotNull(message = "父级菜单不能为空") Long pid, @NotBlank(message = "菜单名称不能为空") @Length(max = 50, message = "菜单名称过长") String name, @Length(max = 20, message = "图标名称过长") String icon, @NotBlank(message = "请求路径不能为空") @Length(max = 50, message = "请求路径过长") String url, @NotBlank(message = "授权路径不能为空") @Length(max = 50, message = "授权路径过长") String authUrl, @Length(max = 50, message = "参数过长") String param, int type, @NotNull(message = "请求类型不能为空") int httpMethod, int menuType, int status, float listOrder, @Length(max = 50, message = "备注过长") String remark, Date gmtCreate, Date gmtModified, Date isDel, List<MenuEntity> children, String str, String tableStr, String menuList) {
        this.id = id;
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
        this.children = children;
        this.str = str;
        this.tableStr = tableStr;
        this.menuList = menuList;
    }

    public int getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(int httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getMenuList() {
        return menuList;
    }

    public void setMenuList(String menuList) {
        this.menuList += menuList +  "</ul></li>";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        this.icon = "".equals(icon)?"fa fa-caret-right":icon;
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

    public List<MenuEntity> getChildren() {
        return children;
    }

    public void setChildren(List<MenuEntity> children) {
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


    @Override
    public String toString() {
        return "MenuEntity{" +
                "id=" + id +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", url='" + url + '\'' +
                ", authUrl='" + authUrl + '\'' +
                ", param='" + param + '\'' +
                ", type=" + type +
                ", httpMethod=" + httpMethod +
                ", menuType=" + menuType +
                ", status=" + status +
                ", spread=" + spread +
                ", listOrder=" + listOrder +
                ", remark='" + remark + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", isDel=" + isDel +
                ", children=" + children +
                ", str='" + str + '\'' +
                ", tableStr='" + tableStr + '\'' +
                ", menuList='" + menuList + '\'' +
                '}';
    }
}
