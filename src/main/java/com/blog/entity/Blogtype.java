package com.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author XiaZhongzhen
 * @since 2023-08-26
 */
@TableName("t_blogtype")
public class Blogtype implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 博客分类编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 博客分类名称
     */
    @TableField("typeName")
    private String typeName;

    /**
     * 博客优先级排序
     */
    @TableField("orderNo")
    private Integer orderNo;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "Blogtype{" +
        "id=" + id +
        ", typeName=" + typeName +
        ", orderNo=" + orderNo +
        "}";
    }
}
