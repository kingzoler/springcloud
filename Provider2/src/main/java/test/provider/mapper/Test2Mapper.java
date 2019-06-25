package test.provider.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface Test2Mapper {

  @Insert("INSERT INTO `test2` (`name`) VALUES (#{name})")
  Integer insertTest2(@Param("name") String name);
}
