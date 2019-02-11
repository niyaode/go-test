package net.sdake.oauthserver.service;

import net.sdake.oauthserver.entities.RoleUserAdminEntity;
import net.sdake.oauthserver.entities.UserAdminEntity;
import net.sdake.oauthserver.mapper.RoleUserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by 煮剑焚酒.
 * QQ:1397257618
 * User: sdake
 * Date: 2019/1/26
 * Time: 13:10
 */
@Service
public class UsersDetailsService implements UserDetailsService {

    private Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    private UserAdminService userAdminService;

    @Autowired
    private RoleUserMapper roleUserMapper;

    @Override
    public UserDetails loadUserByUsername(String phone) throws UsernameNotFoundException {
        UserAdminEntity users = userAdminService.findOneByPhone(phone);
        if (users == null) {
            throw new UsernameNotFoundException("用户不存在");
        }
        //给用户授权
        Date date = new Date();
        boolean accountNonExpired = true;
//        logger.info(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
        if (users.getExpTime() != null && (users.getExpTime().before(date))) { //检查用户过期
            accountNonExpired = false;
        }
        users.setAccountNonExpired(accountNonExpired);

        if (users.getId() != 1) {
            List<RoleUserAdminEntity> roleUserAll = roleUserMapper.selectAllByUserId(users.getId());
            ArrayList<SimpleGrantedAuthority> authorities = new ArrayList();
            if (roleUserAll != null) {
                for (int i = 0; i < roleUserAll.size(); i++) {
                    authorities.add(new SimpleGrantedAuthority("" + roleUserAll.get(i).getRoleId()));
                }
                users.setAuthorities(authorities);
            }
        } else {
            users.setAuthorities(AuthorityUtils.commaSeparatedStringToAuthorityList("All,ROLE_All"));
        }
        return users;
    }
}
