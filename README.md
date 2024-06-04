# Hadoop-Practice

Basic Programming Practice of Big Data

```bash
cd /usr/local/hadoop
start-dfs.sh
start-yarn.sh
mr-jobhistory-daemon.sh start historyserver

start-hbase.sh

hive --service metastore &
hive --service hiveserver2 &



STOP-----------------------------------------------------
stop-yarn.sh
stop-dfs.sh
mr-jobhistory-daemon.sh stop historyserver
stop-hbase.sh
```

**注意：若在操作HBase的过程中发生错误，可以通过{HBASE\_HOME}目录（/usr/local/hbase）下的logs子目录中的日志文件查看错误原因。**

** 这里启动关闭Hadoop和HBase的顺序一定是：**

** 启动Hadoop—>启动HBase—>关闭HBase—>关闭Hadoop**


| HDFS               | http://172.16.222.20:9870  |
| ------------------ | -------------------------- |
| YARN               | http://172.16.222.20:8088  |
| HBase Master       | http://172.16.222.20:60010 |
| HBase RegionServer | http://172.16.222.20:60030 |
| Hive               | http://172.16.222.20:10002 |

