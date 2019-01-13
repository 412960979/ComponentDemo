# 组件化demo  
里面用到的组件化插件源码可以参考[ComponentMaster](https://github.com/412960979/ComponentMaster)  
## 项目结构  
app负责打包，不写具体的业务代码  
library文件夹下面的所有library项目都可以供其它的组件化模块依赖  
modules文件夹下面的所有模块是具体的业务组件模块  
resource模块存放所有业务组件模块需要用到的的资源文件  
## 使用方法  
1.顶级项目build  
```  
repositories {
        google()
        jcenter()
        maven{
            url mavenLocal
        }
    }
    dependencies {
        classpath 'com.wn.component:ComponentGradlePlugin:1.0.0'
    }
```  
2.app和modules的build  
apply plugin: 'Component'  

下面的代码只在app的build里面添加
```  
component{
    dependencies {
        implementation project(':modules:index')
    }
}  
```  
3.在模块化项目index的根目录添加gradle.properties文件  
添加isRunAlone=false，可配置是否独立运行  

4.在setting.gradle里面include组件化模块  
include ':app', ':modules:index'  

5.在组件化模块里面的main目录下面添加runAlone文件夹，当项目独立运行的时候会运行此文件夹下面的代码  

6.组件化模块之间的activity和fragment跳转使用ARoute  

7.基础组件的依赖  
可以创建一个library项目，让模块化项目共同依赖  

8.关于组件化插件一些细节的使用，以后想到再说。  按照以上步骤可以正常搭建起来一个组件化项目
