package org.jeecg.modules.edusport.mapper;

import org.apache.ibatis.annotations.Param;
import org.jeecg.modules.edusport.entity.DormAthleteLeave;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * @Description: 宿舍运动员请假表
 * @Author: jeecg-boot
 * @Date:   2019-12-13
 * @Version: V1.0
 */
public interface DormAthleteLeaveMapper extends BaseMapper<DormAthleteLeave> {
	public void updateWorkflowState(@Param("id") String id);
}
