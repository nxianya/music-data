package top.fishsoup.music.data.types.exception;

/**
 * @author xianyu
 * @version 1.0
 * @BelongsProject: music-data
 * @BelongsPackage: top.fishsoup.music.data.types.exception
 * @CreateTime: 2024-03-27  18:36
 * @Description: 全局异常
 */

public class GlobalException extends RuntimeException {

    private String code;
    private String message;

    public GlobalException(String code) {
        this.code = code;
    }

    public GlobalException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public GlobalException(String code, String message, Throwable cause) {
        this.code = code;
        this.message = message;
        this.initCause(cause);
    }
}
