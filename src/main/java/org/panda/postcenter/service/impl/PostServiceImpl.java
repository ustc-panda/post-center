package org.panda.postcenter.service.impl;

import org.panda.postcenter.mapper.PostMapper;
import org.panda.postcenter.model.entity.Post;
import org.panda.postcenter.service.PostService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
* @author panda
* @description 针对表【post(帖子)】的数据库操作Service实现
* @createDate 2024-03-11 23:25:24
*/
@Service
public class PostServiceImpl extends ServiceImpl<PostMapper, Post>
    implements PostService {

}




