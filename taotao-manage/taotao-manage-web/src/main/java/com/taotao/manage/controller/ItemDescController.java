package com.taotao.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.taotao.manage.pojo.ItemDesc;
import com.taotao.manage.service.ItemDescService;

@RequestMapping("item/desc")
@Controller
public class ItemDescController {
    
    @Autowired
    private ItemDescService itemDescService;
    /*
     * 根据id查询商品描述数据
     * */
    @RequestMapping(value="{id}",method=RequestMethod.GET)
    public ResponseEntity<ItemDesc> queryByItemId(
            @PathVariable("itemId")Long itemId){
        try{
            ItemDesc itemDesc = this.itemDescService.queryById(itemId);
            if(null==itemDesc){
                //资源不存在404
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        //500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
    
}
