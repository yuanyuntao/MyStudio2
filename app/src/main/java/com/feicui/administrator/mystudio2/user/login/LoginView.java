package com.feicui.administrator.mystudio2.user.login;

/**
 * Created by gqq on 2017/1/3.
 */

// 登录的视图接口
public interface LoginView {

    void showProgress();
    void hideProgress();
    void showMessage(String msg);
    void navigationToHome();

}
