package net.sdake.oauthserver.mapper;


import net.sdake.oauthserver.entities.RoleUserAdminEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleUserMapper {

    @Select("select * from wg_role_user WHERE user_id=#{userId} ")
    List<RoleUserAdminEntity> selectAllByUserId(Long userId);

}
