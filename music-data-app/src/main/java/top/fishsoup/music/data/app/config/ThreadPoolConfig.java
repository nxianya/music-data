package top.fishsoup.music.data.app.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.*;

/**
 * @author xianyu
 * @version 1.0
 * @BelongsProject: cloud-music-data
 * @BelongsPackage: top.fishsoup.cloud.music.data.config
 * @CreateTime: 2024-03-27  11:53
 * @Description: 线程池配置
 */
@Configuration
@EnableConfigurationProperties(ThreadPoolConfigProperties.class)
@EnableAsync
public class ThreadPoolConfig {

    @Bean
    @ConditionalOnMissingBean
    public ThreadPoolExecutor threadPoolExecutor(ThreadPoolConfigProperties properties) {
        // 实例化策略
        RejectedExecutionHandler handler;
        switch (properties.getPolicy()) {
            case "AbortPolicy":
                handler = new ThreadPoolExecutor.AbortPolicy();
                break;
            case "DiscardPolicy":
                handler = new ThreadPoolExecutor.DiscardPolicy();
                break;
            case "DiscardOldestPolicy":
                handler = new ThreadPoolExecutor.DiscardOldestPolicy();
                break;
            case "CallerRunsPolicy":
                handler = new ThreadPoolExecutor.CallerRunsPolicy();
                break;
            default:
                handler = new ThreadPoolExecutor.AbortPolicy();
        }

        // 创建线程池
        return new ThreadPoolExecutor(
                properties.getCorePoolSize(),
                properties.getCorePoolSize(),
                properties.getKeepAliveTime(),
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(properties.getBlockQueueSize()),
                Executors.defaultThreadFactory(),
                handler);
    }
}
