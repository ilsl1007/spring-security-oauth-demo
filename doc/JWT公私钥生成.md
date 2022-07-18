## 生成秘钥证书文件
```shell
keytool -genkey -alias jwt -keyalg RSA -keysize 1024 -keystore jwt.jks -validity 365000 -keypass P@ssw0rd -storepass P@ssw0rd
```
> validity：有效时间
> keypass、storepass：密码

## 查看公钥
```shell
keytool -list -rfc --keystore jwt.jks | openssl x509 -inform pem -pubkey
```