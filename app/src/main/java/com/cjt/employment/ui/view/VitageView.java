package com.cjt.employment.ui.view;

import com.cjt.employment.bean.VitageBean;
import com.cjt.employment.bean.WorkExperience;

import java.util.List;

/**
 * 作者: 陈嘉桐 on 2016/9/17
 * 邮箱: 445263848@qq.com.
 */
public interface VitageView {
    public void getWorkExperienceSuccess(List<WorkExperience.DataBean> data);
    public void getVitageSuccess(VitageBean.DataBean data);
    public void showProgressBar();
    public void hideProgressBar();
}
