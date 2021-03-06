package com.xt.edu.mapper;


import com.xt.edu.model.Department;
import com.xt.edu.model.DepartmentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    long countByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    int deleteByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    int insert(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    int insertSelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    List<Department> selectByExample(DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    Department selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    int updateByPrimaryKeySelective(Department record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_department
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    int updateByPrimaryKey(Department record);
}