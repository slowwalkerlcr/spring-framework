## 关键代码点
- 解析→注册

``DefaultBeanDefinitionDocumentReader#processBeanDefinition``解析完成后调用
``BeanDefinitionReaderUtils#registerBeanDefinition`` 将``BeandefinitionHold``注册容器中