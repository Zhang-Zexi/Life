package com.zzx.life;

/**
 * @ClassName TwoLife
 * @Description 考研人生
 * @Author zhangzx
 * @Date 2019/5/21 14:46
 * Version 1.0
 **/
public class TwoLife extends Life {

    public boolean lucky = true;
    public boolean scientificResearch = true;
    public boolean army = true;
    public boolean publicFunctionary = true;

    @Override
    public void twoLife() {
        if (lucky) {
            System.out.println("花费两年时间考上名牌大学研究生，此时26岁");
            if (lucky) {
                System.out.println("考上热门专业，大数据，人工智能");
                if (lucky) {
                    System.out.println("5年后读到人工智能博士毕业，此时31岁");
                    System.out.println("可选择-继续做科研当大学老师/部队/体制/公司");
                    // 科研之路
                    if (scientificResearch) {
                        if(lucky) {
                            System.out.println("拿到大项目，获得资助，发表学术论文");
                            System.out.println("成为国际计算机专家");
                            // 1.国家资助 2.企业挂靠 3.科研变现 ...总之衣食无忧吧
                            System.out.println("实现财务自由");
                            System.out.println("子女上学有保障");
                            System.out.println("收获荣誉");
                        } else {
                            System.out.println("拿到小项目，获得资助，发表学术论文");
                            System.out.println("行业小牛，资深专家");
                            System.out.println("校内职称，衣食无忧, 房车不愁，轻松惬意");
                            System.out.println("子女上学有保障");
                            System.out.println("收获荣誉");
                        }
                    }
                    // 部队之路
                    if (army) {
                        System.out.println("参军入伍");
                        System.out.println("入伍即副营级别");
                        System.out.println("计算机博士入伍，竞争力较高");
                        if (lucky) {
                            System.out.println("参与部队核心工作，获得晋升");
                            System.out.println("实现财务自由");
                            System.out.println("子女上学有保障");
                            System.out.println("收获荣誉");
                        } else {
                            System.out.println("参与部队一般工作，获得晋升");
                            System.out.println("部队任职，衣食无忧, 房车不愁，轻松惬意");
                            System.out.println("子女上学有保障");
                            System.out.println("收获荣誉");
                        }
                    }
                    // 考公之路
                    if (publicFunctionary) {
                        System.out.println("1年时间考上公务员，32岁");
                        if (lucky) {
                            System.out.println("10年内，42岁，达到正厅级别，甚至更高");
                            System.out.println("某市局长级别");
                            System.out.println("实现财务自由");
                            System.out.println("子女上学有保障");
                            System.out.println("收获荣誉");
                        } else {
                            System.out.println("10年内，42岁，达到正科级别");
                            System.out.println("某县局长级别");
                            System.out.println("部队任职，衣食无忧, 房车不愁，轻松惬意");
                            System.out.println("子女上学有保障");
                            System.out.println("收获荣誉");
                        }
                    }
                } else {
                    System.out.println("由于种种原因，没有选择读博，研究生毕业28岁");
                    System.out.println("毕业后跟本科生竞争");
                    System.out.println("进入某大型互联网公司");
                    if (lucky) {
                        System.out.println("赶上大数据/人工智能的潮流");
                        System.out.println("发家致富");
                    } else {
                        System.out.println("进入OneLife中lucky生活");
                    }
                }
            } else {
                System.out.println("考上一般专业");
                if (lucky) {
                    System.out.println("进入OneLife中lucky生活");
                } else {
                    System.out.println("进入Onelife中普通生活");
                }
            }
        } else {
            System.out.println("考不上，浪费2-3年, 此时26岁");
            System.out.println("进入OneLife中普通生活，甚至更差");
        }
    }

}
