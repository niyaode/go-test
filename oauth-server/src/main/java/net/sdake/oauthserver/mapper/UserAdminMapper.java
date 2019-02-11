package net.sdake.oauthserver.mapper;

import net.sdake.oauthserver.entities.UserAdminEntity;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by 煮剑焚酒.
 * QQ:1397257618
 * User: sdake
 * Date: 2019/1/26
 * Time: 13:46
 */
@Repository
public interface UserAdminMapper {

    @Select("select * from wg_user_admin WHERE phone = #{phone}")
    UserAdminEntity findOneByPhone(String phone);
}
