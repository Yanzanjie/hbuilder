package com.yzj.springboot.hbuilder.service;

public interface UlService {
    //通过ID查看是否存在点赞
    int getLikeById(int uid);

//    存在多少个赞
    int findCount();

//    取消赞
    void findDelDz(int uid);

//    添加点赞
    void findAddDz(int uid);

}
