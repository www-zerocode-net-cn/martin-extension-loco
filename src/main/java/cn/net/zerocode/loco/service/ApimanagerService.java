package cn.net.zerocode.loco.service;

import cn.net.zerocode.loco.entity.Apimanager;
import com.java2e.martin.common.data.mybatis.service.MartinService;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 核心模型 服务类
 * </p>
 *
 * @author zerocode
 * @version 1.0
 * @date 2022-11-22
 * @describtion
 * @since 1.0
 */
@Transactional(rollbackFor = Exception.class)
public interface ApimanagerService extends MartinService<Apimanager> {

}
