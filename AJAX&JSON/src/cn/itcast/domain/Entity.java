package cn.itcast.domain;

/**
 * 实体类
 * 所有模块实体类的父类
 * 职责：封装数据
 */

public class Entity {
    //数据唯一的标识
    private String id;
    //创建时间
    private String creatTime;
    //删除时间
    private String deleteTime;
    //删除状态，0已删除，1正常。默认值1
    private String idDel = "1";


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(String creatTime) {
        this.creatTime = creatTime;
    }

    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime;
    }

    public String getIdDel() {
        return idDel;
    }

    public void setIdDel(String idDel) {
        this.idDel = idDel;
    }
}
