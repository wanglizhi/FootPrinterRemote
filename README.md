![](https://raw.githubusercontent.com/wanglizhi/FootPrinterRemote/master/logo.png)

## Footprinter Remote包

Footprinter项目简介见[Footprinter Client](https://github.com/wanglizhi/FootPrinterClient)

#### 定义的公共接口、和PO

在点评这边项目中，也有很多如rs-base-remote、rs-backend-remote的包，最终以jar包的形式发布出去，暴露出服务的接口，而实际的服务则通过pigeon进行RPC调用。

回想起来当时还挺像样子的，remote包是开会讨论定义的，以单独项目的方式来保持一致，防止了重复定义接口和PO的情况

**说明** 为减小体积，代码中的lib包和一些资源文件有删除