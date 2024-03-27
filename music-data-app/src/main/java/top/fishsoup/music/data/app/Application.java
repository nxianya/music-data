package top.fishsoup.music.data.app;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xianyu
 * @version 1.0
 * @BelongsProject: music-data
 * @BelongsPackage: top.fishsoup.music.data.app
 * @CreateTime: 2024-03-27  18:02
 * @Description: 启动类
 */
@SpringBootApplication
@Configurable
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }
}
