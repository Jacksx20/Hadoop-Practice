```shell
# 解压
cd ~/Downloads/
sudo tar -zxvf phoenix-hbase-*-bin.tar.gz -C /usr/local

cd /usr/local
sudo mv phoenix-hbase-*-bin/ phoenix
sudo chown -R jack:jack ./phoenix
 
vim ~/.bashrc
# 添加下面两行
export PHOENIX_HOME=/usr/local/phoenix
export PHOENIX_CLASSPATH=$PHOENIX_HOME
export PATH=$PHOENIX_HOME/bin:$PATH
 
# 加载生效
source ~/.bashrc

#复制依赖文件
sudo cp $PHOENIX_HOME/phoenix-server-hbase-*-5.1.3.jar $HBASE_HOME/lib/
sudo cp $HBASE_HOME/conf/hbase-site.xml $PHOENIX_HOME/bin/

# 将 Hadoop 配置文件复制到 HBase 配置目录下，
# 以解决 java.lang.IllegalArgumentException: java.net.UnknownHostException: mycluster 问题
sudo cp $HADOOP_HOME/etc/hadoop/core-site.xml $HBASE_HOME/conf/
sudo cp $HADOOP_HOME/etc/hadoop/hdfs-site.xml $HBASE_HOME/conf/

#重启HBase
stop-hbase.sh
start-hbase.sh

#安装验证
# 连接，参数为 Zookeeper 节点
sqlline.py Hadoopjc
# 列出表
!table

```

