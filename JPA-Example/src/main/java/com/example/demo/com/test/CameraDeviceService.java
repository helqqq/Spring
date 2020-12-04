package com.example.demo.com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

/**
 * @ClassName CameraDeviceService
 * @Description Serive层
 * @Author Helena
 * @Date 2020/11/18 19:16
 */
@Service
public class CameraDeviceService {

    @Autowired
    private CameraDeviceRepository cameraDeviceRepository;
    /**
     * @Description 全量查询
     * @Author Helena
     * @Date  2020/11/19 
     * @Param 
     **/
    public void testFindByExample(){
        CameraDevice cameraDevice = new CameraDevice();
        cameraDeviceRepository.findAll(Example.of(cameraDevice)).forEach(System.out::println);
    }
    /**
     * @Description 模糊查询
     * @Author Helena
     * @Date  2020/11/19 
     * @Param 
     **/
    public void testFindByName(String name){
        CameraDevice cameraDevice = new CameraDevice();
        cameraDevice.setName(name);
        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withMatcher("name", ExampleMatcher.GenericPropertyMatchers.contains());
//      ExampleMatcher.GenericPropertyMatchers.contains()  %name%
//      ExampleMatcher.GenericPropertyMatchers.startsWith() name%
//      ExampleMatcher.GenericPropertyMatchers.endsWith() %name
        cameraDeviceRepository.findAll(Example.of(cameraDevice,exampleMatcher)).forEach(System.out::println);
    }
    /**
     * @Description 模糊查找，排除id属性
     * @Author Helena
     * @Date  2020/11/19 
     * @Param 
     **/
    public void testFindByNameAndId(String name,Integer status){
        CameraDevice cameraDevice = new CameraDevice();
        cameraDevice.setName(name);
        cameraDevice.setId(83);
        ExampleMatcher exampleMatcher;
        if(status == 1){//忽略属性id
            exampleMatcher = ExampleMatcher.matching()
                    .withMatcher("name", ExampleMatcher.GenericPropertyMatchers.contains()).withIgnorePaths("id");
        }else{
            exampleMatcher = ExampleMatcher.matching()
                    .withMatcher("name", ExampleMatcher.GenericPropertyMatchers.contains());
        }
        cameraDeviceRepository.findAll(Example.of(cameraDevice,exampleMatcher)).forEach(System.out::println);

    }
    /**
     * @Description lambda表达式简化
     * @Author Helena
     * @Date  2020/11/19 
     * @Param 
     **/
    public void testlambda(String name){
        CameraDevice cameraDevice = new CameraDevice();
        cameraDevice.setName(name);
        ExampleMatcher exampleMatcher = ExampleMatcher.matching().withMatcher("name",t->t.contains());
    }

}
