package net.sdake.oauthserver.entities;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Date;

@Component
public class UserAdminEntity implements UserDetails {

//    private static final long serialVersionUID = 500L;

    @NotNull(message = "ID不能为空", groups = edit.class)
    private Long id;
    @Length(max = 20, message = "昵称过长", groups = edit.class)
    private String nickname;

    @NotBlank(message = "用户名不能为空", groups = edit.class)
    @Length(max = 20, message = "用户名过长", groups = edit.class)
    private String username;

    @NotBlank(message = "密码不能为空")
    @Length(max = 100, message = "密码过长")
    private String password;

    @NotBlank(message = "电话不能为空", groups = edit.class)
    @Length(max = 20, message = "电话过长", groups = edit.class)
    private String phone;

    @Email(message = "邮箱格式不正确", groups = edit.class)
    @NotBlank(message = "邮箱不能为空", groups = edit.class)
    @Length(max = 50, message = "邮箱过长", groups = edit.class)
    private String email;

    private int isLock;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date expTime;
    private Date gmtCreate;
    private Date gmtModified;
    private Date isDel;

    //分组校验
    public interface edit {
    }


    private Collection<? extends GrantedAuthority> authorities;
    private boolean accountNonExpired = false; //是否过期
    private boolean accountNonLocked = true; //是否锁定
    private boolean credentialsNonExpired = true; //是否有凭证
    private boolean enabled = true; //是否存在用户

    public static long getSerialVersionUID() {
        return 510L;
    }

    public void setAccountNonLocked(boolean accountNonLocked) {
//        this.accountNonLocked = accountNonLocked;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }


    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    public void setAccountNonExpired(boolean accountNonExpired) {
        this.accountNonExpired = accountNonExpired;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public int getIsLock() {
        return isLock;
    }

    public void setIsLock(int isLock) {
//        accountNonLocked = isLock == 1 ? false : true;
        this.isLock = isLock;
    }

    public Date getExpTime() {
        return expTime;
    }


    public void setExpTime(Date expTime) {
        this.expTime = expTime;
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
        enabled = isDel == null ? true : false;
        this.isDel = isDel;
    }
}
