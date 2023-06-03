**内容: 格列姆-施密特正交化方法**  
设 $V$ 是内积空间， $a_1,a_2,\cdots,a_m\in V$ 线性无关，  
则存在非零 $b_1,b_2,\cdots,b_m\in V$ 两两正交，  
使得 $U=\rm{L}(a_1,a_2,\cdots,a_m)=\rm{L}(b_1,b_2,\cdots,b_m)$   
  
**说明**  
1  $U$ 是 $V$ 的子空间  
2  $a_1,a_2,\cdots,a_m\in V$ 是 $U$ 的一个基  
3  $b_1,b_2,\cdots,b_m\in V$ 也是 $U$ 的一个基  
4  $U$ 存在一个正交基  
5 <font color=red> $b_{k+1}=a_{k+1}-\sum\limits_{i=1}^k\dfrac{(a_{k+1},b_i)}{\Vert b_i\Vert^2}\cdot b_i$ </font>  
  这是个递推公式  
  
**证明**  
数学归纳法，对向量个数 $m$ 进行归纳  
  
 $m=1$ ，取 $a_1=b_1$ ，结论得证  
  
假设 $m=k$ 时结论成立，  
 $a_1,a_2,\cdots,a_k$ 线性无关  
 $b_1,b_2,\cdots,b_k$ 非零两两正交  
 $\rm{L}(a_1,a_2,\cdots,a_k)=\rm{L}(b_1,b_2,\cdots,b_k)$   
  
现证 $m=k+1$ 的情形  
  
---  
  
先考虑三维欧几里得空间  
 $(a_1,a_2)\longrightarrow(b_1,b_2)$   
 $a_3\xrightarrow{?}b_3$   
 $a_3=u\cdot b_1+v\cdot b_2+b_3$   
  
计算 $u$   
 $(a_3,b_1)=(u\cdot b_1+v\cdot b_2+b_3,b_1)$   
 $\Rightarrow(a_3,b_1)=u\cdot(b_1,b_1)+v\cdot(b_2,b_1)+(b_3,b_1)$   
 $\Rightarrow(a_3,b_1)=u\cdot(b_1,b_1)+0+0$   
 $\Rightarrow(a_3,b_1)=u\cdot\Vert b_1\Vert^2$   
 $\Rightarrow u=\dfrac{(a_3,b_1)}{\Vert b_1\Vert^2}$   
  
同理可得  $v=\dfrac{(a_3,b_2)}{\Vert b_2\Vert^2}$   
  
 $\Rightarrow b_3=a_3-u\cdot b_1-v\cdot b_2$   
  
 $\Rightarrow b_3=a_3-\dfrac{(a_3,b_1)}{\Vert b_1\Vert^2}\cdot b_1-\dfrac{(a_3,b_2)}{\Vert b_2\Vert^2}\cdot b_2$   
  
猜想一般的线性空间具有的形式  
  
<font color=red> $b_{k+1}=a_{k+1}-\sum\limits_{i=1}^k\dfrac{(a_{k+1},b_i)}{\Vert b_i\Vert^2}\cdot b_i$ </font>  
  
这个式子的几何意义是，减去其余分量的投影，剩下的就是要求的投影  
  
---  
  
下面的目标是  
1 证明  $b_{k+1}=a_{k+1}-\sum\limits_{i=1}^k\dfrac{(a_{k+1},b_i)}{\Vert b_i\Vert^2}\cdot b_i$ 非零  
  
2 证明  $b_{k+1}$ 与前面 $k$ 个向量正交 $b_1,b_2,\cdots,b_k$   
  
3 证明  $\rm{L}(a_1,a_2,\cdots,a_k,a_{k+1})=\rm{L}(b_1,b_2,\cdots,b_k,b_{k+1})$   
  
<font color=blue>1 证明非零</font>  
  
反证法: 若 $b_{k+1}=\mathbf0$   
  
 $\Rightarrow a_{k+1}=\sum\limits_{i=1}^k\dfrac{(a_{k+1},b_i)}{\Vert b_i\Vert^2}\cdot b_i$   
  
 $\Rightarrow a_{k+1}\in\rm{L}(b_1,b_2,\cdots,b_k)=\rm{L}(a_1,a_2,\cdots,a_k)$   
  
 $\Rightarrow$ 与 $a_1,a_2,\cdots,a_k,a_{k+1}$ 线性无关矛盾  
  
 $\Rightarrow b_{k+1}\neq\mathbf0$   
  
<font color=blue>2 证明正交</font>  
即证明  $1\le j\le k,\ (b_{k+1},b_j)=0$   
  
 $(b_{k+1},b_j)$   
  
 $=\left(a_{k+1}-\sum\limits_{i=1}^k\dfrac{(a_{k+1},b_i)}{\Vert b_i\Vert^2}\cdot b_i,b_j\right)$   
  
 $=(a_{k+1},b_j)-\left(\sum\limits_{i=1}^k\dfrac{(a_{k+1},b_i)}{\Vert b_i\Vert^2}\cdot b_i,b_j\right)$   
  
 $=(a_{k+1},b_j)-\sum\limits_{i=1}^k\dfrac{(a_{k+1},b_i)}{\Vert b_i\Vert^2}\cdot(b_i,b_j)$   
  
 $=(a_{k+1},b_j)-\dfrac{(a_{k+1},b_j)}{\Vert b_j\Vert^2}\cdot(b_j,b_j)$   
  
 $=(a_{k+1},b_j)-\dfrac{(a_{k+1},b_j)}{\Vert b_j\Vert^2}\cdot\Vert b_j\Vert^2$   
  
 $=(a_{k+1},b_j)-(a_{k+1},b_j)$   
  
 $=0$   
  
<font color=blue>3 证明相等</font>  
<font color=red> $b_{k+1}=a_{k+1}-\sum\limits_{i=1}^k\dfrac{(a_{k+1},b_i)}{\Vert b_i\Vert^2}\cdot b_i$ </font>  
  
由和空间的定义+生成子空间的定义得  
  
 $\Rightarrow\rm{L}(a_1,a_2,\cdots,a_k,a_{k+1})=\rm{L}(a_1,a_2,\cdots,a_k)+\rm{L}(a_{k+1})$   
  
 $=\rm{L}(b_1,b_2,\cdots,b_k)+\rm{L}(a_{k+1})$   
  
 $\left(\begin{array}{l}  
&\rm{L}(a_{k+1})表示a_{k+1}所有可能的线性组合&\\\  
&a_{k+1}=b_{k+1}+\sum\limits_{i=1}^k\dfrac{(a_{k+1},b_i)}{\Vert b_i\Vert^2}\cdot b_i&\\\   
&这个式子用文字描述是: a_{k+1}可由b_1,b_2,\cdots,b_k,b_{k+1}线性表出&\\\   
&\Rightarrow\rm{L}(a_{k+1})=\rm{L}(b_1,b_2,\cdots,b_k,b_{k+1})  
\end{array}\right)$   
  
 $\Rightarrow\rm{L}(a_1,a_2,\cdots,a_k,a_{k+1})\subseteq\rm{L}(b_1,b_2,\cdots,b_k,b_{k+1})$   
  
反之  
 $\Rightarrow\rm{L}(b_1,b_2,\cdots,b_k,b_{k+1})=\rm{L}(b_1,b_2,\cdots,b_k)+\rm{L}(b_{k+1})$   
  
 $=\rm{L}(a_1,a_2,\cdots,a_k)+\rm{L}(b_{k+1})$   
  
 $\left(\begin{array}{l}  
&由归纳假设得&\\\   
&\Rightarrow b_i可由a_1,a_2,\cdots,a_k线性表出&\\\   
&b_{k+1}=a_{k+1}-\sum\limits_{i=1}^k\dfrac{(a_{k+1},b_i)}{\Vert b_i\Vert^2}\cdot b_i&\\\   
&\Rightarrow b_{k+1}可由a_1,a_2,\cdots,a_k,a_{k+1}线性表出&\\\   
&\Rightarrow\rm{L}(b_{k+1})=\rm{L}(a_1,a_2,\cdots,a_k,a_{k+1})&  
\end{array}\right)$   
  
 $\Rightarrow\rm{L}(b_1,b_2,\cdots,b_k,b_{k+1})\subseteq\rm{L}(a_1,a_2,\cdots,a_k,a_{k+1})$   
