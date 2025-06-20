package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *作业发布：(JobRelease)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "JobRelease")
public class JobRelease implements Serializable {

    //JobRelease编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_release_id")
    private Integer job_release_id;
   //  发布教师
   @Basic
    private Integer release_teacher;
   // 作业名称
   @Basic
    private String job_name;
   // 作业文件
   @Basic
    private String job_file;
   // 发布时间
   @Basic
    private Timestamp release_time;
   // 要求时间
   @Basic
    private Timestamp required_time;
   // 作业详情
   @Basic
    private String job_details;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
