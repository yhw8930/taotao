package com.taotao.manager.controller.api;

import com.taotao.common.bean.ItemCatResult;
import com.taotao.manager.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("api/item/cat")
@Controller
public class ApiItemCatController {

    @Autowired
    private ItemCatService itemCatService;
    /**
     * 对外提供接口服务，查询所有类目数据
     *
     * @return import org.springframework.web.bind.annotation.RequestParam;
     */
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<ItemCatResult> queryItemCatList(){
        try {
            ItemCatResult itemCatResult = this.itemCatService.queryAllToTree();
            if(null == itemCatResult){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
            }
            return ResponseEntity.ok(itemCatResult);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }
    /*@RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> queryItemCatList(@RequestParam(value = "callback", required = false) String callback) {
        try {
            ItemCatResult itemCatResult = this.itemCatService.queryAllToTree();
            String json = MAPPER.writeValueAsString(itemCatResult);
            if (StringUtils.isEmpty(callback)) {
                return ResponseEntity.ok(json);
            }
            return ResponseEntity.ok(callback + "(" + json + ");" );
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }*/
}
