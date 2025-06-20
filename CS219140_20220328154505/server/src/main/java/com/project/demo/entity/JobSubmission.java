package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *作业提交：(JobSubmission)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "JobSubmission")
public class JobSubmission implements Serializable {

    //JobSubmission编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_submission_id")
    private Integer job_submission_id;
   //  发布教师
   @Basic
    private Integer release_teacher;
   // 作业名称
   @Basic
    private String job_name;
   // 发布时间
   @Basic
    private Timestamp release_time;
   // 要求时间
   @Basic
    private Timestamp required_time;
   // 学生用户
   @Basic
    private Integer student_user;
   // 提交作业
   @Basic
    private String submit_job;
   // 提交时间
   @Basic
    private Timestamp submission_time;
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
