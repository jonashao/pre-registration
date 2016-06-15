# Pre-order
在线挂号系统

项目地址：https://github.com/JonasHao/pre-registration

## Todo List
按照重要程度排序，完成之后， “-” 变成 “+”

+ 需求文档

+ 为以下项设计数据库、类（Service/DAO/PO...)、动态图，这些都不需考虑权限
    + 查询医院
        + 查询所有
        + 根据区域
        + 医院名字
    + 查询科室
        + 根据医院ID
        - 医院名字
        + 科室ID
        + 科室名字
    + 查询医生
        + 根据科室ID
        + 医生ID
        + 医生名字
        - 专长科
    + 查询余量
        + 根据时间和医生ID

+ 权限设计和解决方案

- 前端
    + 列表页
        + 首页医院列表
        + 医生列表
        + 医院后台管理页
        + 科室后台管理页
        + 医生后台管理页
    + 详细页
        + 医院详细页（医院介绍和科室列表）
        + 医生详细页（医生介绍和医生挂号余量日历表）
    + 欢迎页
        - 后台管理页面
    + 登录注册页

+ 用户管理
    + 用户注册
    + 用户登录
    - 用户修改个人信息
    + 用户查询联系人
    + 用户添加联系人
    + 用户修改联系人
    + 用户删除联系人

+ 订单管理
    + 创建订单
    + 取消订单

+ 增删改
    + 医院
    + 科室
    + 医生

