package net.sdake.oauthserver.service;

import net.sdake.oauthserver.entities.UserAdminEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserAdminService {


    UserAdminEntity findOneByPhone(String Phone);

//    int addOne(UserAdminEntity userAdminEntity) throws Exception;
//
//    List<UserAdminEntity> selectAllPage(int page, int pagesize);
//
//    UserAdminEntity selectOne(long id);
//
//    int modifyOne(UserAdminEntity userAdminEntity);
//
//    List<RoleEntity> getRoleList();
//
//    int modifyRoleUser(Long id, String[] roles);
//
//    int deleteById(long userId) throws Exception;
//
//    UserAdminEntity selectOneCheck(String username2, String userPhone, String userEmail);
//
//    List<RoleMenuEntity> selectRoleMenuByUserId();

}
