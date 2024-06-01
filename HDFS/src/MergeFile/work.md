现在要执行的任务是：假设在目录“hdfs://localhost:9000/user/jack”下面有几个文件，分别是file1.txt、file2.txt、file3.txt、file4.jack和file5.jack，这里需要从该目录中过滤出所有后缀名不为“.jack”的文件，对过滤之后的文件进行读取，并将这些文件的内容合并到文件“hdfs://localhost:9000/user/jack/merge.txt”中

1、先查看HDFS中文件

```bash
hdfs dfs -ls
```

2、按要求开始文件创建并编辑文件中文本内容

```bash
echo "this is file1.txt" > file1.txt
echo "this is file2.txt" > file2.txt
echo "this is file3.txt" > file3.txt
echo "this is file4.jack" > file4.jack
echo "this is file5.jack" > file5.jack
```

3、将本地文件copy到HDFS上

```bash
hadoop fs -put file1.txt /user/jack
hadoop fs -put file2.txt /user/jack
hadoop fs -put file3.txt /user/jack
hadoop fs -put file4.jack /user/jack
hadoop fs -put file5.jack /user/jack

hdfs dfs -ls /user/jack

```
