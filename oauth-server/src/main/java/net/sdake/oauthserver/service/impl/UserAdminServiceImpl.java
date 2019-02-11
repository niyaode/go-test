package net.sdake.oauthserver.service.impl;

import net.sdake.oauthserver.entities.UserAdminEntity;
import net.sdake.oauthserver.mapper.UserAdminMapper;
import net.sdake.oauthserver.service.UserAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAdminServiceImpl implements UserAdminService {

    @Autowired
    private UserAdminMapper userAdminMapper;

    @Override
    public UserAdminEntity findOneByPhone(String phone) {
        return userAdminMapper.findOneByPhone(phone);
    }

//    @Autowired
//    private RoleMapper roleMapper;
//
//    @Autowired
//    private RoleUserMapper roleUserMapper;
//
//        PasswordEncoder passwordEncoder =  PasswordEncoderFactories.createDelegatingPasswordEncoder();
//
//    @Override
//    public int addOne(UserAdminEntity userAdminEntity) throws Exception {
//        //密码加密
//        userAdminEntity.setPassword(passwordEncoder.encode(userAdminEntity.getPassword()));
//        UserAdminEntity userAdmin = userAdminMapper.selectDynamicWhere(userAdminEntity);
//        checkRepetition(userAdmin);
//        return userAdminMapper.addOne(userAdminEntity);
//    }
//
//    @Override
//    public List<UserAdminEntity> selectAllPage(int page, int pagesize) {
//        PageHelper.startPage(page, pagesize);
//        return userAdminMapper.selectPage();
//    }
//
//    @Override
//    public UserAdminEntity selectOne(long id) {
//        return userAdminMapper.selectOne(id);
//    }
//
//    @Override
//    public int modifyOne(UserAdminEntity userAdminEntity) {
//        //密码加密
//        UserAdminEntity selectOne = userAdminMapper.selectOne(userAdminEntity.getId());
////        {bcrypt}$2a$10$Y8Q47PzSUgF5JHD9Qlw8Zuv3qlMGalYdXqtY9bo1tJTrGShHFbQ7u
//
//        if (!"".equals(userAdminEntity.getPassword())){
//            userAdminEntity.setPassword(passwordEncoder.encode(userAdminEntity.getPassword()));
//        }
//        UserAdminEntity userAdmin = userAdminMapper.selectDynamicWhere(userAdminEntity);
//        checkRepetition(userAdmin);
//
//        return userAdminMapper.updateOne(userAdminEntity);
//    }
//
//    @Override
//    public List<RoleEntity> getRoleList() {
//        return roleMapper.selectAllPage();
//    }
//
//    @Override
//    public int modifyRoleUser(Long id, String[] roles) {
//
//        //添加之前先删除
//        roleUserMapper.deleteAll(id);
//        return roleUserMapper.insertAll(id, roles);
//    }
//
//    @Override
//    public int deleteById(long userId) throws Exception {
//        try {
//            int u = userAdminMapper.deleteById(userId);
//            if (u != 0) {
//                //用户拥有的权限
//                int d = roleUserMapper.deleteByUserId(userId);
//            }
//        } catch (Exception e) {
//            throw new RuntimeException("删除失败");
//        }
//        return 0;
//    }
//
//    @Override
//    public UserAdminEntity selectOneCheck(String username2, String userPhone, String userEmail) {
//        return userAdminMapper.selectOneCheck(username2,userPhone,userEmail);
//    }
//
//    @Override
//    public List<RoleMenuEntity> selectRoleMenuByUserId() {
//        return null;
//    }
//
//    /**
//     * 检查重复
//     *
//     * @param userAdmin
//     */
//    private void checkRepetition(UserAdminEntity userAdmin) {
//        if (userAdmin != null) {
//            if (userAdmin.getUsername() != null) {
//                throw new RuntimeException("用户名有重复");
//            }
//            if (userAdmin.getPhone() != null) {
//                throw new RuntimeException("手机号有重复");
//            }
//            if (userAdmin.getEmail() != null) {
//                throw new RuntimeException("邮箱有重复");
//            }
//        }
//    }

}
