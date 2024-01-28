package cn.net.zerocode.loco.service.impl;

import cn.net.zerocode.loco.entity.Route;
import cn.net.zerocode.loco.mapper.RouteMapper;
import cn.net.zerocode.loco.service.RouteService;
import com.java2e.martin.common.data.mybatis.service.impl.MartinServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 路由管理 服务实现类
 * </p>
 *
 * @author zerocode
 * @version 1.0
 * @date 2022-11-22
 * @describtion
 * @since 1.0
 */
@Service
public class RouteServiceImpl extends MartinServiceImpl<RouteMapper, Route> implements RouteService {
    @Override
    protected void setEntity() {
        this.clz = Route.class;
    }
}
