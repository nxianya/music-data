package top.fishsoup.music.data.types.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author xianyu
 * @version 1.0
 * @BelongsProject: music-data
 * @BelongsPackage: top.fishsoup.music.data.types.common
 * @CreateTime: 2024-03-27  18:30
 * @Description: 常量
 */

public class Constants {

    public final static String SPLIT = ",";

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    public enum ResponseCode {
        SUCCESS("0000", "成功"),
        UN_ERROR("0001", "未知失败"),
        ILLEGAL_PARAMETER("0002", "非法参数"),
        TOKEN_ERROR("0003", "权限拦截"),
        ;

        private String code;
        private String info;

    }
}
