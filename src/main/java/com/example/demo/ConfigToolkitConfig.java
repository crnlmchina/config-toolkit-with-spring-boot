package com.example.demo;

import com.dangdang.config.service.ConfigGroup;
import com.dangdang.config.service.zookeeper.ZookeeperConfigGroup;
import com.dangdang.config.service.zookeeper.ZookeeperConfigProfile;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yuxuanwang on 2017/6/6.
 */
@Configuration
public class ConfigToolkitConfig {

    @Bean
    public ZookeeperConfigProfile getConfigProfile(@Value("${config-toolkit.connect-str}") String connectStr,
                                                   @Value("${config-toolkit.root-node}") String rootNode,
                                                   @Value("${config-toolkit.version}") String version) {
        return new ZookeeperConfigProfile(connectStr, rootNode, version);
    }

    @Bean
    public ConfigGroup getConfigGroup(ZookeeperConfigProfile configProfile) {
        return new ZookeeperConfigGroup(configProfile, "property-group1");
    }

}
