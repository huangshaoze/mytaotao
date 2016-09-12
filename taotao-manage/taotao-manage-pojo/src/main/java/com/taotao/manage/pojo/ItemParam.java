package com.taotao.manage.pojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name= "tb_item_param")
public class ItemParam extends BasePojo{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Long itemCateId;
    private String paramData;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getItemCateId() {
        return itemCateId;
    }
    public void setItemCateId(Long itemCateId) {
        this.itemCateId = itemCateId;
    }
    public String getParamData() {
        return paramData;
    }
    public void setParamData(String paramData) {
        this.paramData = paramData;
    }
}
