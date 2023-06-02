**内容**
交换$\rm{Jordan}$标准型中，$\rm{Jordan}$块的次序，相似关系仍然成立

**证明**
调整$\rm{Jordan}$块的次序
$\Rightarrow$不改变初等因子组
$\Rightarrow A\sim\rm{J}\sim\rm{J^\prime}$

**说明**
1 在允许调整$\rm{Jordan}$块的次序下，$\rm{Jordan}$标准型是唯一的
$\begin{array}{l}
&\to约当标准型1\\\
&\to约当标准型2\\\
A&\cdots\\\
&\to约当标准型A_K^1
\end{array}$
这个约当标准型背后指向同一个初等因子组
$A$的约当标准型有$k$的全排列种$A_K^1$

**2 😡哪里错了😡**
交换$\rm{Jordan}$块的顺序不改变相似关系，但是若重新划分$\rm{Jordan}$块呢？
把具有相同特征值的$\rm{Jordan}$块连接在一起，按特征值重新划分，继而初等因子改变，不变因子改变，
但相似关系依旧保持，所以新旧$\rm{Jordan}$标准型相似，但他们的不等因子不相同

从开始就错了，重新划分$\rm{Jordan}$块的操作就无法实现
连不起来，因为缺“1”，用execl多画几个$\rm{Jordan}$标准型就看出来了

$\rm{Jordan}$标准型只受初等因子组影响
只受初等因子组只受不变因子组影响
不变因子组等价于法式
$A$的法式只与$A$本身有关，与其他变量无关
$\Rightarrow A$的$\rm{Jordan}$标准型是唯一的

**疑问**
$\rm{Frobenius}$标准型也有该性质吧
