package com.atguigu.gmall.usermanage.service.impl;

import com.atguigu.gmall.usermanage.entity.UmsMember;
import com.atguigu.gmall.usermanage.dao.UmsMemberDao;
import com.atguigu.gmall.usermanage.service.UmsMemberService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * 会员表(UmsMember)表服务实现类
 *
 * @author makejava
 * @since 2020-03-22 19:46:01
 */
@Service("umsMemberService")
public class UmsMemberServiceImpl implements UmsMemberService {
    @Resource
    private UmsMemberDao umsMemberDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UmsMember queryById(Long id) {
        return this.umsMemberDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UmsMember> queryAllByLimit(int offset, int limit) {
        return this.umsMemberDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param umsMember 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMember insert(UmsMember umsMember) {
        this.umsMemberDao.insert(umsMember);
        return umsMember;
    }

    /**
     * 修改数据
     *
     * @param umsMember 实例对象
     * @return 实例对象
     */
    @Override
    public UmsMember update(UmsMember umsMember) {
        this.umsMemberDao.update(umsMember);
        return this.queryById(umsMember.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.umsMemberDao.deleteById(id) > 0;
    }

    @Override
    public List<UmsMember> getAllUser(Long id) {
        return this.umsMemberDao.selectAll();
    }

    @Override
    public List<UmsMember> getUser(Long id) {
        Example example = new Example(UmsMember.class);
        example.createCriteria().andEqualTo("id",id);
        return this.umsMemberDao.selectByExample(example);
    }
}