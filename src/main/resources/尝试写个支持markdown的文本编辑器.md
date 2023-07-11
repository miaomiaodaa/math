思路
1 安卓原生写一个文本编辑器
2 调用js库生成html
3 页面展示

编辑，浏览，新建功能用java原生实现
js负责转成html
安卓原生调用js markdown解析器，返回html
把html传给webview作展示

vscode，webstorm
Androidstudio

github搜 Markdown，有安卓工程，可以作为基础

**设计思路**
1主界面
左上角：返回按钮

文件列表
单击：
如果是文件夹，进入下一层
如果是文件，进入预览界面
长按：重命名，删除，复制，深复制，移动
所有变更操作后台序号自修改，自动排序
下滑：刷新当前目录

右上角：弹出菜单
新增文件夹，新增文件

2 编辑界面
上方：redo，undo
双击：预览与编辑切换
下方：提供快捷输入栏

**公关**
1. android 动态创建组件https://blog.csdn.net/xiaozenbin/article/details/54657628
2. 真机调试
3. 入门基础： https://zhuanlan.zhihu.com/p/512249262
4. 读取文件权限： https://www.cnpython.com/java/598439
5. 生成apk： https://jingyan.baidu.com/article/ca41422fc53c485faf99ed30.html
