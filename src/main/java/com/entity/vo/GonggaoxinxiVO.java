package com.entity.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * 公告信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 *
 * @author
 * @email
 * @date 2022-03-25 19:57:55
 */
public class GonggaoxinxiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 公告类型
     */

    private String gonggaoleixing;

    /**
     * 公告图片
     */

    private String gonggaotupian;

    /**
     * 公告内容
     */

    private String gonggaoneirong;

    /**
     * 发布日期
     */

    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat
    private Date faburiqi;

    /**
     * 获取：公告类型
     */
    public String getGonggaoleixing() {
        return gonggaoleixing;
    }

    /**
     * 设置：公告类型
     */

    public void setGonggaoleixing(String gonggaoleixing) {
        this.gonggaoleixing = gonggaoleixing;
    }

    /**
     * 获取：公告图片
     */
    public String getGonggaotupian() {
        return gonggaotupian;
    }

    /**
     * 设置：公告图片
     */

    public void setGonggaotupian(String gonggaotupian) {
        this.gonggaotupian = gonggaotupian;
    }

    /**
     * 获取：公告内容
     */
    public String getGonggaoneirong() {
        return gonggaoneirong;
    }

    /**
     * 设置：公告内容
     */

    public void setGonggaoneirong(String gonggaoneirong) {
        this.gonggaoneirong = gonggaoneirong;
    }

    /**
     * 获取：发布日期
     */
    public Date getFaburiqi() {
        return faburiqi;
    }

    /**
     * 设置：发布日期
     */

    public void setFaburiqi(Date faburiqi) {
        this.faburiqi = faburiqi;
    }

}
