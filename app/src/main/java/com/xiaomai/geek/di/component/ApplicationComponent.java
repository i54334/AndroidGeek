package com.xiaomai.geek.di.component;

import com.xiaomai.geek.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by XiaoMai on 2017/3/29 17:42.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
}
