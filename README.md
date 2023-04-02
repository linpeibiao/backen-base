# backen-base
后台管理系统模板,带有用户模块的后台管理系统模板，由于每一次有点想法想要新开一个项目，都得创建用户登录注册等用户管理功能，
所以将此模块抽取出来单独作为一个小项目，以后再要新开项目直接在此项目基础上进行扩展即可。

## 技术栈
1. 数据库: mysql 8.0.24
2. java8 
3. ssm，mp, springboot 
4. rabbit MQ, redis
5. swagger, knife4j, junit
6. hutools, jwt, commons-langs

## 功能点
1. 结合 spring aop 和 Java 注解，解决权限认证的问题，在需要某种权限才能访问的接口上加上某角色的注解即可自行判断
2. 使用 JWT + redis 实现了分布式 session, 并结合 ThreadLocal 实现登录拦截器，同时满足客户端有操作时自动刷新 token 有效时长
3. 设计了短信验证登录，并保留了短信服务的接口，用于用户手机验证码登录
4. 其它常规的用户管理功能，例如登陆注册，用户信息更新更改等。

