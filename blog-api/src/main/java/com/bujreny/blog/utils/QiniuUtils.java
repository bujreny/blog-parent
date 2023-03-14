package com.bujreny.blog.utils;

import com.alibaba.fastjson2.JSON;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.Region;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


/**
 * @author Administrator
 * @description TODO
 * @date 2023/3/13
 */
@Component
public class QiniuUtils {
    public static final String url = "http://rrg6i7ha6.hb-bkt.clouddn.com/";
    @Value("${qiniu.accessKey}")
    private String accessKey;
    @Value("${qiniu.accessSecretKey}")
    private String accessSecretKey;

    public boolean upload(MultipartFile file, String filename) {
        // 构造一个带指定Region对象的配置类
        Configuration cfg = new Configuration(Region.huabei());
        // 其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        // 生成上传凭证，然后准备上传
        String bucket = "bujrenyimage";
        // 默认不指定key的前提下，以文件内容的hash值作为文件名
        try {
            byte[] uploadBytes = file.getBytes();
            Auth auth = Auth.create(accessKey, accessSecretKey);
            String upToken = auth.uploadToken(bucket);
            Response response = uploadManager.put(uploadBytes, filename, upToken);
            // 解析上传成功的结果
            DefaultPutRet putRet = JSON.parseObject(response.bodyString(), DefaultPutRet.class);
            return true;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
