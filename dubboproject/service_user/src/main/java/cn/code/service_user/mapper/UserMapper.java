package cn.code.service_user.mapper;

import cn.code.service_user.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select(value = "select * from tb_user where id = #{id}")
    public User getUserById(int id);

    @Insert(value = "insert into tb_user(id,userName,account,phone,mail,salt,password,imageUrl) values(#{id}," +
            "#{userName}," +
            "#{account}," +
            "#{phone}," +
            "#{mail}," +
            "#{salt}," +
            "#{password}," +
            "#{imageUrl}) ")
    public int add(User user);
}
