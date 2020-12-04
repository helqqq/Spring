package com.example.demo.com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName CameraController
 * @Description Controller
 * @Author Helena
 * @Date 2020/11/18 19:50
 */
@RestController
public class CameraController {
    @Autowired
    CameraDeviceService cameraDeviceService;
    /**
     * @Description 全量查询
     * @Author Helena
     * @Date  2020/11/18 
     * @Param 
     **/
    @PostMapping("/test")
    public String test(){
        cameraDeviceService.testFindByExample();
        return "ok";
    }
    /**
     * @Description 模糊查询
     * @Author Helena
     * @Date  2020/11/18
     * @Param
     **/
    @PostMapping("/test02")
    public String test02(@RequestParam("name") String name){
        cameraDeviceService.testFindByName(name);
        return "ok";
    }
    /**
     * @Description 模糊查找，排除id属性
     * @Author Helena
     * @Date  2020/11/19 
     * @Param 
     **/
    @PostMapping("/test03")
    public String test03(@RequestParam("name") String name,@RequestParam("status") Integer status){
         cameraDeviceService.testFindByNameAndId(name,status);
         return "ok";
    }
}
