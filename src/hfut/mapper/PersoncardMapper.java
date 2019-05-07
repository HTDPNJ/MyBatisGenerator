package hfut.mapper;

import hfut.entity.Personcard;
import hfut.entity.PersoncardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersoncardMapper {
    long countByExample(PersoncardExample example);

    int deleteByExample(PersoncardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Personcard record);

    int insertSelective(Personcard record);

    List<Personcard> selectByExample(PersoncardExample example);

    Personcard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Personcard record, @Param("example") PersoncardExample example);

    int updateByExample(@Param("record") Personcard record, @Param("example") PersoncardExample example);

    int updateByPrimaryKeySelective(Personcard record);

    int updateByPrimaryKey(Personcard record);
}