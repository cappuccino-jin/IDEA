package com.atguigu.gmall.usermanage.controller;

import com.atguigu.gmall.usermanage.entity.UmsMember;
import com.atguigu.gmall.usermanage.service.UmsMemberService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 会员表(UmsMember)表控制层
 *
 * @author makejava
 * @since 2020-03-22 19:46:01
 */
@RestController
@RequestMapping("umsMember")
public class UmsMemberController {
    /**
     * 服务对象
     */
    @Resource
    private UmsMemberService umsMemberService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UmsMember selectOne(Long id) {
        return this.umsMemberService.queryById(id);
    }

    @RequestMapping("getAllUser")
    public List<UmsMember> getAllUser(Long id){
        return this.umsMemberService.getAllUser(id);
    }

    @RequestMapping("getUser")
    public List<UmsMember> getUser(Long id){
        return this.umsMemberService.getUser(id);
    }
}