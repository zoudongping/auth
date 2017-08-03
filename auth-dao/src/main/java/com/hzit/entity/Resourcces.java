package com.hzit.entity;

import java.util.Date;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年08月03日 - 17:01
 * |    @description   资源信息表实体类
 * +---------------------------------Oooo---------------------------------------+
 */
public class Resourcces {
    private int rid;
    private String rname;
    private String resurl;
    private int resorderno;
    private String redsdes;
    private Date createTime;
    private Date updatetime;
    private String createMan;
    private String updateMan;
    private int parentID;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getResurl() {
        return resurl;
    }

    public void setResurl(String resurl) {
        this.resurl = resurl;
    }

    public int getResorderno() {
        return resorderno;
    }

    public void setResorderno(int resorderno) {
        this.resorderno = resorderno;
    }

    public String getRedsdes() {
        return redsdes;
    }

    public void setRedsdes(String redsdes) {
        this.redsdes = redsdes;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getCreateMan() {
        return createMan;
    }

    public void setCreateMan(String createMan) {
        this.createMan = createMan;
    }

    public String getUpdateMan() {
        return updateMan;
    }

    public void setUpdateMan(String updateMan) {
        this.updateMan = updateMan;
    }

    public int getParentID() {
        return parentID;
    }

    public void setParentID(int parentID) {
        this.parentID = parentID;
    }

    @Override
    public String toString() {
        return "Resourcces{" +
                "rid=" + rid +
                ", rname='" + rname + '\'' +
                ", resurl='" + resurl + '\'' +
                ", resorderno=" + resorderno +
                ", redsdes='" + redsdes + '\'' +
                ", createTime=" + createTime +
                ", updatetime=" + updatetime +
                ", createMan='" + createMan + '\'' +
                ", updateMan='" + updateMan + '\'' +
                ", parentID=" + parentID +
                '}';
    }
}
