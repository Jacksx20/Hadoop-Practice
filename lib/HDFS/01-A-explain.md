1、为了编写一个能够与HDFS交互的Java应用程序，一般需要向Java工程中添加以下JAR包：

(1)“/hadoop/share/hadoop/common”目录下的所有JAR包，包括hadoop-common-3.3.5.jar、hadoop-common-3.3.5-tests.jar、haoop-nfs-3.3.5.jar、haoop-kms-3.3.5.jar和hadoop-registry-3.3.5.jar，注意，不包括目录jdiff、lib、sources和webapps；

(2)“/hadoop/share/hadoop/common/lib”目录下的所有JAR包；

(3)“/hadoop/share/hadoop/hdfs”目录下的所有JAR包，注意，不包括目录jdiff、lib、sources和webapps；

(4)“/hadoop/share/hadoop/hdfs/lib”目录下的所有JAR包。
