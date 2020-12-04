package com.example.demo.com.test;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @ClassName CameraDevice
 * @Description 实体类
 * @Author Helena
 * @Date 2020/11/18 19:12
 */
@Data
@Entity(name = "terminal_device")
public class CameraDevice {
    private String name;
    private String camera_type;
    private String camera_capture_type;
    private String task_id;
    private String camera_code;
    private String camera_vendor;
    private String camera_video_stream;
    private String stream_using_tcp;
    private String camera_video_preview_url;
    private String stream_preview_mode;
    private String camera_location;
    private String camera_latitude;
    private String camera_longitude;
    private String camera_sip_id;
    private String camera_status;
    private String ftp_config;
    private String created_at;
    private String updated_at;
    private String deleted_at;
    private String create_by;
    private String update_by;
    private String guard_type;
    private String community_code;
    private String community_name;
    private String manufacturer;
    private String guard_model;
    private String sn;
    private String ip;
    private String mac;
    private String guard_status;
    private String port;
    private String building_code;
    private String building_name;
    private String unit_code;
    private String unit_name;
    private String ispush;
    private String remark;
    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    @Id
    public Integer getId() {
        return id;
    }
}
