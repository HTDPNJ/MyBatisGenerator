package hfut.mapper;

import hfut.entity.Personclass;
import hfut.entity.PersonclassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonclassMapper {
    long countByExample(PersonclassExample example);

    int deleteByExample(PersonclassExample example);

    int insert(Personclass record);

    int insertSelective(Personclass record);

    List<Personclass> selectByExample(PersonclassExample example);

    int updateByExampleSelective(@Param("record") Personclass record, @Param("example") PersonclassExample example);

    int updateByExample(@Param("record") Personclass record, @Param("example") PersonclassExample example);
}