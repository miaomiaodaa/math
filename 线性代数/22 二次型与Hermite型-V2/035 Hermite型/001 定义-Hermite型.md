**引子**  
直接把变元与系数推广到复数域并不是一个很好的模型，比如这个样的模型里没法定义正定，半正定，负定，半负定  
  
调整方式:  
(1) 将主对角线元素 $d_1,d_2,\cdots,d_r$ 限制到实数域，  
(2) 将未定元的平方 $x_i^2$ 调整成未定元模的平方 $|x_i|^2=\overline{x_i}\cdot x_i$  
 $f(x_1,x_2,\cdots,x_n)=d_1\cdot\overline{x_1}\cdot x_1+d_2\cdot\overline{x_2}\cdot x_2+\cdots+d_r\cdot\overline{x_r}\cdot x_r$  
  
 $(a+bi)(a-bi)=a^2+b^2$  
  
**内容**  
下列 $n$ 个复变元的二次齐次函数称为 $\rm{Hermite}$ 型，  
 $f(x_1,x_2,\cdots,x_n)=\sum\limits_{j=1}^n\sum\limits_{i=1}^na_{ij}\cdot\overline{x_i}\cdot x_j$ ，其中 $\overline{a_{ij}}=a_{ji}$ ， $\forall 1\le i,j\le n$  
  
**说明**  
1 4个变量 $x_1,x_2,x_3,x_4$ 两两相乘(包括自己乘自己)，一共有 $4^2$ 种可能  
 $n$ 个变量 $x_1,x_2,\cdots,x_n$ 两两相乘(包括自己乘自己)，一共有 $n^2$ 种可能，  
恰好能构成一个“正方形”，恰好能构成一个方阵  
  
2 定理或定义的名字，增加了学习难度，比如 $\rm{Hermite}$ 型是一个差的命名，而拉格朗日中值定理就是一个良的命名  
  
3 基础不牢，地动山摇， $\rm{Hermite}$ 型的定义记忆不牢  
“拔”加在第一个变元上，系数是共轭对称这个两点都没记住，  
实二次型，分组之后得到 $a_{ij}+a_{ji}$ ，然后规定 $a_{ij}=a_{ji}$  
  
4  $\overline{a_{ij}}=a_{ji}$ 对应了调整中的主对角线元素为实数， $\overline{x_i}x_j$ 保证 $\rm{Hermite}$ 型化简之后对应调整中的第二项  
  
5  $\rm{Hermite}$ 型是复变元实值函数  
 $\overline{f(x_1,x_2,\cdots,x_n)}$  
  
 $=\overline{\sum\limits_{j=1}^n\sum\limits_{i=1}^na_{ij}\cdot \overline{x_i}\cdot x_j}$  
  
 $=\sum\limits_{j=1}^n\sum\limits_{i=1}^n\overline{a_{ij}\cdot \overline{x_i}\cdot x_j}$  
  
 $=\sum\limits_{j=1}^n\sum\limits_{i=1}^n\overline{a_{ij}}\cdot {x_i}\cdot \overline{x_j}$  
  
 $=\sum\limits_{i=1}^n\sum\limits_{j=1}^na_{ji}\cdot {x_i}\cdot \overline{x_j}\ $ （等效替代）  
  
 $=\sum\limits_{i=1}^n\sum\limits_{j=1}^na_{ji}\cdot \overline{x_j}\cdot {x_i}\ $ （乘法交换律）  
  
 $=f(x_1,x_2,\cdots,x_n)\ $ （实数的共轭等于它本身）  
  
这就具备了定义正定，半正定，负定，半负定必要条件  
