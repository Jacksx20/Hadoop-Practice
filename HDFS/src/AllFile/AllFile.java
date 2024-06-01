package HDFS.src.AllFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Scanner;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

//定义一个公共的类，包含了Configuration conf = new Configuration();  conf.set("fs.defaultFS", "hdfs://172.16.222.20:9000");conf.set("fs.hdfs.impl", "org.apache.hadoop.hdfs.DistributedFileSystem");

//定义一个公共的类，包含了判断文件是否存在、写入文件、读取文件的方法
public class AllFile {

    // 判断文件是否存在
    public static void JudgingFile() throws IOException {
        String filename = "file1.txt";

        Configuration conf = new Configuration();
        conf.set("fs.defaultFS", "hdfs://172.16.222.20:9000");
        conf.set("fs.hdfs.impl", "org.apache.hadoop.hdfs.DistributedFileSystem");
        FileSystem fs = FileSystem.get(conf);
        if (fs.exists(new Path(filename))) {
            System.out.println("文件存在");
        } else {
            System.out.println("文件不存在");
        }
        fs.close();
    }

    // 写入文件
    public static void WriteFile() throws IOException {
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS", "hdfs://172.16.222.20:9000");
        conf.set("fs.hdfs.impl", "org.apache.hadoop.hdfs.DistributedFileSystem");
        FileSystem fs = FileSystem.get(conf);
        byte[] buff = "Hello world".getBytes(); // 要写入的内容
        String filename = "file1.txt"; // 要写入的文件名
        FSDataOutputStream os = fs.create(new Path(filename));
        os.write(buff, 0, buff.length);
        System.out.println("Create:" + filename);
        os.close();
        fs.close();
    }

    // 读取文件
    public static void ReadFile() throws IOException {
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS", "hdfs://172.16.222.20:9000");
        conf.set("fs.hdfs.impl", "org.apache.hadoop.hdfs.DistributedFileSystem");
        FileSystem fs = FileSystem.get(conf);
        Path file = new Path("file1.txt");
        FSDataInputStream getIt = fs.open(file);
        BufferedReader d = new BufferedReader(new InputStreamReader(getIt));
        String content = d.readLine(); // 读取文件一行
        System.out.println(content);
        d.close(); // 关闭文件
        fs.close(); // 关闭hdfs
    }

    public static void main(String[] args) throws IOException {
        // 设置程序使用的用户对象
        Properties properties = System.getProperties();
        properties.setProperty("HADOOP_USER_NAME", "jack");
        // 添加一个选择菜单，可以选择JudgingFile()、WriteFile()、ReadFile()并运行对应选项
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Please select an option:");
            System.out.println("1. JudgingFile");
            System.out.println("2. WriteFile");
            System.out.println("3. ReadFile");
            System.out.println("0. Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    JudgingFile();
                    break;
                case 2:
                    WriteFile();
                    break;
                case 3:
                    ReadFile();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}