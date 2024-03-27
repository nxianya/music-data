package top.fishsoup.music.data.app.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xianyu
 * @version 1.0
 * @BelongsProject: cloud-music-data
 * @BelongsPackage: top.fishsoup.cloud.music.data.config
 * @CreateTime: 2024-03-27  11:51
 * @Description: 线程池配置属性类
 */


@Data
@ConfigurationProperties(prefix = "thread.pool.executor.config",ignoreInvalidFields = true)
public class ThreadPoolConfigProperties {

    //核心线程数
    private Integer corePoolSize=20;
    //最大线程数
    private Integer maxPoolSize=200;
    //最大等待时间
    private Long KeepAliveTime= 10L;
    //最大队列数
    private Integer blockQueueSize=5000;
    /*
     * AbortPolicy：丢弃任务并抛出RejectedExecutionException异常。
     * DiscardPolicy：直接丢弃任务，但是不会抛出异常
     * DiscardOldestPolicy：将最早进入队列的任务删除，之后再尝试加入队列的任务被拒绝
     * CallerRunsPolicy：如果任务添加线程池失败，那么主线程自己执行该任务
     * */
    //拒绝策略
    private String policy ="AbortPolicy";
}
