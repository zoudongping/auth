package com.hzit.dao;

import com.hzit.entity.Userinfo;

/**
 * Created by 李晨曦 on 2017/8/3.
 */
public interface UserinfoDao {
    public int insertuser(Userinfo userinfo) ;
    public Userinfo findUser(String uname);
    public boolean updatePwd(String uname,String oldpwd,String newpwd);
    public int deleteuser(String uname) ;
}
