# Hadoop-Practice

Basic Programming Practice of Big Data

```bash
cd /usr/local/hadoop
zkServer.sh start
hdfs --daemon start journalnode
start-dfs.sh
start-yarn.sh
mr-jobhistory-daemon.sh start historyserver

/usr/local/hbase start-hbase.sh

hive --service metastore &
hive --service hiveserver2 &

/usr/local/flink/start-cluster.sh
/usr/local/spark/sbin/start-all.sh


STOP-----------------------------------------------------

stop-hbase.sh
/usr/local/flink/stop-cluster.sh
/usr/local/spark/sbin/stop-all.sh

stop-yarn.sh
stop-dfs.sh
mr-jobhistory-daemon.sh stop historyserver
hdfs --daemon stop journalnode

zkServer.sh stop
```

**注意：若在操作HBase的过程中发生错误，可以通过{HBASE\_HOME}目录（/usr/local/hbase）下的logs子目录中的日志文件查看错误原因。**

** 这里启动关闭Hadoop和HBase的顺序一定是：**

** 启动Hadoop—>启动HBase—>关闭HBase—>关闭Hadoop**


| 服务               | IP                    |
| ------------------ | --------------------- |
| HDFS               | http://Hadoopjc:9870  |
| YARN               | http://Hadoopjc:8088  |
| HBase Master       | http://Hadoopjc:60010 |
| HBase RegionServer | http://Hadoopjc:60030 |
| Hive               | http://Hadoopjc:10002 |
| Flink              | http://Hadoopjc:8081  |
| Spark Master       | http://Hadoopjc:6060/ |
| Spark Worker       | http://Hadoopjc:6066/ |

