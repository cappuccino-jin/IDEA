package com.atguigu.gmall.usermanage.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 会员表(UmsMember)实体类
 *
 * @author makejava
 * @since 2020-03-22 19:45:58
 */
public class UmsMember implements Serializable {
    private static final long serialVersionUID = -94320789033190194L;
    
    private Long id;
    
    private Long memberLevelId;
    /**
    * 用户名
    */
    private String username;
    /**
    * 密码
    */
    private String password;
    /**
    * 昵称
    */
    private String nickname;
    /**
    * 手机号码
    */
    private String phone;
    /**
    * 帐号启用状态:0->禁用；1->启用
    */
    private Integer status;
    /**
    * 注册时间
    */
    private Date createTime;
    /**
    * 头像
    */
    private String icon;
    /**
    * 性别：0->未知；1->男；2->女
    */
    private Integer gender;
    /**
    * 生日
    */
    private Date birthday;
    /**
    * 所做城市
    */
    private String city;
    /**
    * 职业
    */
    private String job;
    /**
    * 个性签名
    */
    private String personalizedSignature;
    /**
    * 用户来源
    */
    private Integer sourceType;
    /**
    * 积分
    */
    private Integer integration;
    /**
    * 成长值
    */
    private Integer growth;
    /**
    * 剩余抽奖次数
    */
    private Integer luckeyCount;
    /**
    * 历史积分数量
    */
    private Integer historyIntegration;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Integer getIntegration() {
        return integration;
    }

    public void setIntegration(Integer integration) {
        this.integration = integration;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Integer getLuckeyCount() {
        return luckeyCount;
    }

    public void setLuckeyCount(Integer luckeyCount) {
        this.luckeyCount = luckeyCount;
    }

    public Integer getHistoryIntegration() {
        return historyIntegration;
    }

    public void setHistoryIntegration(Integer historyIntegration) {
        this.historyIntegration = historyIntegration;
    }

}