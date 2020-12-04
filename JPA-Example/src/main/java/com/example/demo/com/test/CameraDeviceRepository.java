package com.example.demo.com.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @ClassName CameraDeviceRepository
 * @Description
 * @Author Helena
 * @Date 2020/11/18 19:12
 */
@Repository
public interface CameraDeviceRepository extends JpaRepository<CameraDevice, Serializable> {

}
