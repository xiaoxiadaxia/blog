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
@TableName("t_blog")
public class Blog implements Serializable {

private static final long serialVersionUID=1L;

    /**
     * 博客编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 博客标题
     */
    private String title;

    /**
     * 博客摘要信息
     */
    private String summary;

    /**
     * 博客发布时间
     */
    @TableField("releaseDate")
    private LocalDateTime releaseDate;

    /**
     * 点击阅读量
     */
    @TableField("clickHit")
    private Integer clickHit;

    /**
     * 评论数量
     */
    @TableField("replyHit")
    private Integer replyHit;

    /**
     * 博客内容
     */
    private String content;

    /**
     * 博客所属分类
     */
    @TableField("typeId")
    private Integer typeId;

    /**
     * 关键词
     */
    @TableField("keyWord")
    private String keyWord;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getClickHit() {
        return clickHit;
    }

    public void setClickHit(Integer clickHit) {
        this.clickHit = clickHit;
    }

    public Integer getReplyHit() {
        return replyHit;
    }

    public void setReplyHit(Integer replyHit) {
        this.replyHit = replyHit;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    @Override
    public String toString() {
        return "Blog{" +
        "id=" + id +
        ", title=" + title +
        ", summary=" + summary +
        ", releaseDate=" + releaseDate +
        ", clickHit=" + clickHit +
        ", replyHit=" + replyHit +
        ", content=" + content +
        ", typeId=" + typeId +
        ", keyWord=" + keyWord +
        "}";
    }
}
