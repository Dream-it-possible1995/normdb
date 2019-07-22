package com.glodon.normdb.controller;


import com.glodon.normdb.entity.JsonResult;
import com.glodon.normdb.entity.NormDB;
import com.glodon.normdb.service.NormDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class NormDBController {

    @Autowired
    private NormDBService normDBService;

    /**
     * 查询定额库列表
     * @return
     */
    @GetMapping
    public ResponseEntity<JsonResult> getUserList () {
        JsonResult r = new JsonResult();
        try {
            List<NormDB> normdbs = normDBService.getNormDBList();
            r.setResult(normdbs);
            r.setStatus("ok");
        } catch (Exception e) {
            r.setResult(e.getClass().getName() + ":" + e.getMessage());
            r.setStatus("error");
            e.printStackTrace();
        }
        return ResponseEntity.ok(r);
    }

}
