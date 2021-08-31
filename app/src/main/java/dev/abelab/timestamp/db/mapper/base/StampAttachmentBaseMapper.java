package dev.abelab.timestamp.db.mapper.base;

import dev.abelab.timestamp.db.entity.StampAttachment;
import dev.abelab.timestamp.db.entity.StampAttachmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StampAttachmentBaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stamp_attachment
     *
     * @mbg.generated
     */
    long countByExample(StampAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stamp_attachment
     *
     * @mbg.generated
     */
    int deleteByExample(StampAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stamp_attachment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stamp_attachment
     *
     * @mbg.generated
     */
    int insert(StampAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stamp_attachment
     *
     * @mbg.generated
     */
    int insertSelective(StampAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stamp_attachment
     *
     * @mbg.generated
     */
    List<StampAttachment> selectByExampleWithBLOBs(StampAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stamp_attachment
     *
     * @mbg.generated
     */
    List<StampAttachment> selectByExample(StampAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stamp_attachment
     *
     * @mbg.generated
     */
    StampAttachment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stamp_attachment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") StampAttachment record, @Param("example") StampAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stamp_attachment
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") StampAttachment record, @Param("example") StampAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stamp_attachment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") StampAttachment record, @Param("example") StampAttachmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stamp_attachment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(StampAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stamp_attachment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(StampAttachment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stamp_attachment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(StampAttachment record);
}