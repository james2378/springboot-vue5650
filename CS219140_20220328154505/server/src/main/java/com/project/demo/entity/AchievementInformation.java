package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 *成绩信息：(AchievementInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "AchievementInformation")
public class AchievementInformation implements Serializable {

    //AchievementInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "achievement_information_id")
    private Integer achievement_information_id;
   // 试卷名称
   @Basic
    private String test_paper_name;
   // 考试时间
   @Basic
    private Timestamp examination_time;
   // 结束时间
   @Basic
    private Timestamp end_time;
   // 试卷总分
   @Basic
    private Integer total_score_of_test_paper;
   // 学生学号
   @Basic
    private Integer student_number;
   // 学生姓名
   @Basic
    private String student_name;
   // 学生分数
   @Basic
    private Integer student_score;

    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
