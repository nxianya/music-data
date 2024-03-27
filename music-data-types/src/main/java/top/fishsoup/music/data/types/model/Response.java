package top.fishsoup.music.data.types.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author xianyu
 * @version 1.0
 * @BelongsProject: music-data
 * @BelongsPackage: top.fishsoup.music.data.types.model
 * @CreateTime: 2024-03-27  18:41
 * @Description: 响应类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Response<T> implements Serializable {
    private String code;
    private String info;
    private T data;

}
