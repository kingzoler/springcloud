package test.provider.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TestMapper {

  @Insert("INSERT INTO `test` (`name`) VALUES (#{name})")
  Integer insertTest(@Param("name") String name);
}
