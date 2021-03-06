package com.luke.hot_list.controller;

import cn.hutool.core.date.DateUtil;
import com.luke.hot_list.annotation.Log;
import com.luke.hot_list.dao.CommentDao;
import com.luke.hot_list.entity.Comment;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 摸鱼
 */
@RestController
@CrossOrigin
@RequestMapping("/comment")
public class CommentController {

    @Resource
    private CommentDao commentDao;

    @Log(title = "保存评论")
    @PostMapping("/save")
    public void save(@RequestBody Comment comment) {
        comment.setCreateTime(DateUtil.now());
        commentDao.save(comment);
    }

    @Log(title = "获取所有评论")
    @GetMapping("/getAll")
    public List<Comment> getAll() {
        return commentDao.getAll();
    }
}
