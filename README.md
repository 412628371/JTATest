# JTATest
分布式事务学习

**项目描述：**
一个service方法中操作两个数据库，使用`jdbcTemplate`来进行操作。

* `insertTest`
两个库进行插入。
结果：都成功。
* `insertWithError`
数据库1插入成功，数据库2插入异常。
结果：两个数据库都回滚。
* `insertWithChildTransaction`
数据库1插入，数据库2使用新事务进行插入，然后抛出异常。
结果：数据库2插入成功，数据库1回滚。
* `insertWithChildTransactionError`
service的写法有问题，导致没有新建子事务。
结果：全部回滚