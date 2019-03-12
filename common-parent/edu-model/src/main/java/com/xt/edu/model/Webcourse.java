package com.xt.edu.model;

public class Webcourse {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_webcourse.id
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_webcourse.name
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_webcourse.teacher
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    private String teacher;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_webcourse.detail
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    private String detail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_webcourse.price
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    private Long price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_webcourse.discount
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    private String discount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_webcourse.picture
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    private String picture;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_webcourse.id
     *
     * @return the value of t_webcourse.id
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_webcourse.id
     *
     * @param id the value for t_webcourse.id
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_webcourse.name
     *
     * @return the value of t_webcourse.name
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_webcourse.name
     *
     * @param name the value for t_webcourse.name
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_webcourse.teacher
     *
     * @return the value of t_webcourse.teacher
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_webcourse.teacher
     *
     * @param teacher the value for t_webcourse.teacher
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_webcourse.detail
     *
     * @return the value of t_webcourse.detail
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_webcourse.detail
     *
     * @param detail the value for t_webcourse.detail
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_webcourse.price
     *
     * @return the value of t_webcourse.price
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    public Long getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_webcourse.price
     *
     * @param price the value for t_webcourse.price
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_webcourse.discount
     *
     * @return the value of t_webcourse.discount
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_webcourse.discount
     *
     * @param discount the value for t_webcourse.discount
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    public void setDiscount(String discount) {
        this.discount = discount == null ? null : discount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_webcourse.picture
     *
     * @return the value of t_webcourse.picture
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    public String getPicture() {
        return picture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_webcourse.picture
     *
     * @param picture the value for t_webcourse.picture
     *
     * @mbg.generated Thu Jan 17 19:49:31 CST 2019
     */
    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }
}