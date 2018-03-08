package com.lzy.utils.file;

import android.os.Environment;

import java.io.File;

/**
 * 文件目录管理器，统一管理客户端的文件目录
 *
 * @author: cyli8
 * @date: 2018/2/11 16:07
 */

public class FolderManager {
    private static final String DEFAULT_BASE_DIR = Environment
            .getExternalStorageDirectory().getAbsolutePath()
            + File.separator
            + "fastdevelop"
            + File.separator;

    private static FolderManager mInstance;

    public static synchronized FolderManager getInstance() {
        if (mInstance == null) {
            mInstance = new FolderManager();
        }
        return mInstance;
    }

    /**
     * 获取客户端的目录
     *
     * @return 客户端目录
     */
    public String getClientDir() {
        FileUtil.ensureDirExist(DEFAULT_BASE_DIR);
        return DEFAULT_BASE_DIR;
    }
}
