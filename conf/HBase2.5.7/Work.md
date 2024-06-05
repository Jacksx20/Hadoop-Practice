```shell
cd ~/Downloads/
sudo tar -zxf hbase-*.tar.gz -C /usr/local

cd /usr/local/
sudo mv ./hbase-* ./hbase
sudo chown -R jack:jack ./hbase
hbase version
```

