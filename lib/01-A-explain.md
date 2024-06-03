1、为了编写一个能够与HDFS交互的Java应用程序，一般需要向Java工程中添加以下JAR包：

(1)“/hadoop/share/hadoop/common”目录下的所有JAR包，包括hadoop-common-3.3.5.jar、hadoop-common-3.3.5-tests.jar、haoop-nfs-3.3.5.jar、haoop-kms-3.3.5.jar和hadoop-registry-3.3.5.jar，注意，不包括目录jdiff、lib、sources和webapps；

(2)“/hadoop/share/hadoop/common/lib”目录下的所有JAR包；

(3)“/hadoop/share/hadoop/hdfs”目录下的所有JAR包，注意，不包括目录jdiff、lib、sources和webapps；

(4)“/hadoop/share/hadoop/hdfs/lib”目录下的所有JAR包。


2、为了编写一个能够与HBase交互的Java应用程序，需要在这个界面中加载该Java工程所需要用到的JAR包，这些JAR包中包含了可以访问HBase的Java  API。这些JAR包都位于Linux系统的HBase安装目录的lib目录下

(1)"/hbase/lib”目录下的所有JAR包（注意，不要选中client-facing-thirdparty、jdk11、ruby、shaded-clients、trace和zkcli这六个目录）

(2)在“/hbase/lib/client-facing-thirdparty”目录下所有jar文件。
