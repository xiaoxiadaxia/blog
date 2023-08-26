package com.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@TableName("t_comment")
public class Comment implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 评论编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ip地址
     */
    @TableField("userIp")
    private String userIp;

    /**
     * 所属博客id
     */
    @TableField("blogId")
    private Integer blogId;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 评论时间
     */
    @TableField("commentDate")
    private LocalDateTime commentDate;

    /**
     * 审核状态：1：待审核2：已通过
     */
    private Integer state;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(LocalDateTime commentDate) {
        this.commentDate = commentDate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Comment{" +
        "id=" + id +
        ", userIp=" + userIp +
        ", blogId=" + blogId +
        ", content=" + content +
        ", commentDate=" + commentDate +
        ", state=" + state +
        "}";
    }
}
