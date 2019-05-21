package com.zzx.life;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

/**
 * @ClassName ThreeLife
 * @Description 考公之路
 * @Author zhangzx
 * @Date 2019/5/21 15:32
 * Version 1.0
 **/
public class ThreeLife extends Life{

    public boolean lucky = true;

    @Override
    public void threeLife() {
        if (lucky) {
            System.out.println("两年考上公务员，此时26岁");
            if (lucky) {
                System.out.println("10年内，36岁，达到正科级别，甚至更高");
                System.out.println("某县局长级别");
                System.out.println("部队任职，衣食无忧, 房车不愁，轻松惬意");
                System.out.println("子女上学有保障");
                System.out.println("收获荣誉");
            } else {
                System.out.println("10年内，36岁，普通员工");
                System.out.println("底薪普工，工作稳定");
                System.out.println("勤俭持家，安逸，但没有太多钱");
                System.out.println("子女走自己老路，但不用照顾自己");
            }
        } else {
            System.out.println("考不上公务员");
            System.out.println("直接进入OneLife普通生活，可能更差");
        }
    }
}
