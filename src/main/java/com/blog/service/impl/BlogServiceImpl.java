package com.blog.service.impl;

import com.blog.entity.Blog;
import com.blog.dao.BlogMapper;
import com.blog.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author XiaZhongzhen
 * @since 2023-08-26
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
