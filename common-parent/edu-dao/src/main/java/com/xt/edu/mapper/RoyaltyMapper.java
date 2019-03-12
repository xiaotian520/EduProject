package com.xt.edu.mapper;

import java.util.List;

import com.xt.edu.model.Royalty;
import com.xt.edu.model.RoyaltyExample;
import org.apache.ibatis.annotations.Param;

public interface RoyaltyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_royalty
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    long countByExample(RoyaltyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_royalty
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    int deleteByExample(RoyaltyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_royalty
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_royalty
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    int insert(Royalty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_royalty
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    int insertSelective(Royalty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_royalty
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    List<Royalty> selectByExample(RoyaltyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_royalty
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    Royalty selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_royalty
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    int updateByExampleSelective(@Param("record") Royalty record, @Param("example") RoyaltyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_royalty
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    int updateByExample(@Param("record") Royalty record, @Param("example") RoyaltyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_royalty
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    int updateByPrimaryKeySelective(Royalty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_royalty
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    int updateByPrimaryKey(Royalty record);
}