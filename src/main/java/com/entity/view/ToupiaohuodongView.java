package com.entity.view;

import com.baomidou.mybatisplus.annotations.TableName;
import com.entity.ToupiaohuodongEntity;
import org.apache.commons.beanutils.BeanUtils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;


/**
 * 投票活动
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 *
 * @author
 * @email
 * @date 2022-03-25 19:57:55
 */
@TableName("toupiaohuodong")
public class ToupiaohuodongView extends ToupiaohuodongEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    public ToupiaohuodongView() {
    }

    public ToupiaohuodongView(ToupiaohuodongEntity toupiaohuodongEntity) {
        try {
            BeanUtils.copyProperties(this, toupiaohuodongEntity);
        } catch (IllegalAccessException | InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
