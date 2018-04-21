package cn.gz.leecky.controller;

import cn.gz.leecky.pojo.Resource;
import cn.gz.leecky.utils.JsonResult;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {

    @Autowired
    private Resource resource;

    @RequestMapping("getResource")
    public JsonResult getResource() {

        Resource resource1 = new Resource();

        BeanUtils.copyProperties(resource, resource1);

        JsonResult json = new JsonResult(resource1);

        json.setMessage("返回成功！");

        return json;

    }
}
