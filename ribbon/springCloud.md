## 架构
~~~
    一个服务注册中心，eureka server,端口为8761
    serviceclient工程跑了两个实例，端口分别为8762,8763，分别向服务注册中心注册
    sercvice-ribbon端口为8764,向服务注册中心注册
    当sercvice-ribbon通过restTemplate调用service-client的hello接口时，因为用ribbon进行了负载均衡，会轮流的调用service-hi：8762和8763 两个端口的hi接口；
~~~

