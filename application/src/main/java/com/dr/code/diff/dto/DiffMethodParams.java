package com.dr.code.diff.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @ProjectName: base-service
 * @Package: com.dr.jenkins.jenkins.dto
 * @Description: 差异代码参数
 * @Author: duanrui
 * @CreateDate: 2020/6/20 21:41
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Data
@Builder
public class DiffMethodParams {


    /**
     * git 远程仓库地址
     */
    private String gitUrl;

    /**
     * git原始分支或tag
     */
    private String baseVersion;

    /**
     * git现分支或tag
     */
    private String nowVersion;


}
