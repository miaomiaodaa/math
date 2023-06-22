**内容**  
设 $A\in M_n(\mathbb{C})$ ，则 $A$ 可分解为 $A=B+C$ ，且该分解是唯一的  
$1^\circ\ B$ 是可对角化阵，存在可逆阵，使得 $\Lambda=P^{-1}\cdot B\cdot P$  
$2^\circ\ C$ 是幂零阵，存在 $k\in\mathbb{Z}^+$ ，使得 $C^k=$ 零矩阵  
$3^\circ\ BC=CB$ ，  
$\begin{array}{l}  
4^\circ\ B,C均可表示为A的多项式，&存在f(x),g(x)\in M_n(K)，使得B=f(A)，C=g(A)\\\  
&B可由A经过加，减，数乘，乘(幂)得到，B=f(A)\\\  
&C可由A经过加，减，数乘，乘(幂)得到，C=g(A)  
\end{array}$  
  
**说明**  
$\rm{JC}$ 定理包含两个方面  
存在性:任意复矩阵都能分解  
唯一性:当 $A$ 确定时，这种分解方式是唯一的  
  
一个是幂零阵，另一个可对角化  
且他们可交换，可写成A的多项式  
  
还有一个乘法版本的  
  
**证明(存在性)**  
设 $P$ 为非异阵，使得 $P^{-1}\cdot A\cdot P=J=  
\rm{diag}\{J_1,J_2,\cdots,J_s\}$ ， $\lambda_1,  
\lambda_2,\cdots,\lambda_s$ 是 $A$ 的全体不同特征值， $J_1,J_2,\cdots,J_s$ 是 $\lambda_1,  
\lambda_2,\cdots,\lambda_s$ 对应的根子空间块  
$J_i=\begin{bmatrix}  
J_1(\lambda_i)\\\  
&\ddots\\\  
&&J_k(\lambda_i)  
\end{bmatrix}_{m_i}=\lambda_i I+N_i$  
其中 $N_i$ 是主对角线全零，上次对线分块内部全1，分割点处是0方阵，易验证 $N$ 是幂零阵  
令 $\lambda_i I=M_i$  
  
则 $M_i=\lambda I$ 可对角化，  
$N_i$ 是幂零阵( $(N_i)^{m_i}=\mathbf0$ )，  
$M_i\cdot N_i=N_i\cdot M_i$ 可交换  
  
令 $M=\rm{diag}\{M_1,M_2,\cdots,M_s\}$ ，是对角阵  
$N=\rm{diag}\{N_1,N_2,\cdots,N_s\}$ ，是幂零阵  
易证 $M\cdot N=N\cdot M$ ，分块矩阵乘法  
且 $J=M+N$  
  
(上面这些结论可以用excel画个 $\rm{Jordan}$ 标准型，验证下)  
  
$J_i$ 的特征多项式 $=(\lambda-\lambda_i)^{m_i}$  
由凯莱-哈密顿定理得  
$\Rightarrow(J_i-\lambda_i I)^{m_i}=\mathbf O$  
$\Rightarrow(J_i-M_i)^{m_i}=(N_i)^{m_i}$  
  
$\lambda_1,\lambda_2,\cdots,\lambda_s$ 互不相同  
$\Rightarrow(\lambda-\lambda_1)^{m_1},  
(\lambda-\lambda_2)^{m_2},\cdots,  
(\lambda-\lambda_s)^{m_s}$ 两两互素  
  
由线性同余定理得  
$\Rightarrow\exists g(\lambda)$ ，使得 $g(\lambda)  
=(\lambda-\lambda_i)^{m_i}\cdot q_i(\lambda)  
+\lambda_i,\ \forall 1\le i\le s$  
  
$\Rightarrow g(J_i)  
=(J_i-\lambda_i I)^{m_i}\cdot q_i(J_i)  
+\lambda_i I,\ \forall 1\le i\le s$  
  
$\Rightarrow g(J_i)=\lambda_i I=M_i$  
  
$\Rightarrow g(J)=\rm{diag}\{g(J_1),g(J_2),\cdots,g(J_s)\}$  
$=\rm{diag}\{M_1,M_2,\cdots,M_s\}$  
$=M$  
  
$N=J-M=J-g(J)$  
  
$A=P\cdot J\cdot P^{-1}$  
$=P\cdot (M+N)\cdot P^{-1}$  
$=P\cdot M\cdot P^{-1}+P\cdot N\cdot P^{-1}$  
  
$M$ 是分块对角阵  
$\Rightarrow P\cdot M\cdot P^{-1}$ 是可以对角化阵  
令 $B=P\cdot M\cdot P^{-1}$  
  
$N$ 是幂零阵  
$\Rightarrow P\cdot N\cdot P^{-1}$ 仍是幂零阵  
令 $C=P\cdot N\cdot P^{-1}$  
第1，2条得证  
  
$B\cdot C$  
$=(P\cdot M\cdot P^{-1})  
\cdot(P\cdot N\cdot P^{-1})$  
$=P\cdot M\cdot (P^{-1}\cdot P)\cdot N\cdot P^{-1}$  
$=P\cdot M\cdot N\cdot P^{-1}$  
$=P\cdot N\cdot M\cdot P^{-1}$  
$=P\cdot N\cdot P^{-1}\cdot P\cdot M\cdot P^{-1}$  
$=(P\cdot N\cdot P^{-1})\cdot (P\cdot M\cdot P^{-1})$  
$=C\cdot B$  
  
$g(A)=g(P\cdot J\cdot P^{-1})=  
P\cdot g(J)\cdot P^{-1}=P\cdot M\cdot P^{-1}$  
$=B$  
  
$C=A-B=A-g(A)$  
证毕  
  
**证明V2(存在性)**  
设 $A$ 的 $\rm{Jordan}$ 标准型为 $J$  
调整 $\rm{Jordan}$ 标准型中 $\rm{Jordan}$ 块的次序  
使得属于相同特征值的 $\rm{Jordan}$ 块连在一起  
记作 $J^\prime=\rm{diag}\{J_1,J_2,\cdots,J_s\}$  
( $A\sim J\sim J^\prime: $ 调整 $\rm{Jordan}$ 块是次序，不改变相似关系)  
  
设 $\lambda_1,\lambda_2,\cdots,\lambda_s是A的全体不同特征值  
  
任取$ J_i\in(J_1,J_2,\cdots,J_s) $, 分析$ J_i $的结构  
1 $ J_i=\lambda_i $ $ I+N_i $,其中$ N_i $是上次对角线不连续为1，其余元素都是零的方阵  
2 $ M_i=\lambda_i $ I本身是对角阵，当然可对角化，$ I\cdot\lambda_i I\cdot I^{-1} $  
3 $ N_i $是幂零阵  
4 $ M_i\cdot N_i=N_i\cdot M_i $  
  
$ \Rightarrow J^\prime=\rm{diag}\{M_1 M_2,\cdots,M_s\}+diag\{N_1,N_2,\cdots,N_s\} $  
1 $ M=\rm{diag}{M_1 M_2,\cdots,M_s} $是对角阵，对角阵拼成的阵也是对角阵  
2 $ N=\rm{diag}{N_1,N_2,\cdots,N_s} $是幂零阵，幂零阵拼成的阵也是幂零阵(缺少证明)  
3 $ M\cdot N=N\cdot M $ 分块对角阵的乘法(不过关，用excel画一个，验证下)  
$ \Rightarrow J^\prime=M+N $  
  
下面证明第4条: 存在$ f(x),g(x)，使得M=f(J^\prime),N=g(J^\prime) $  
  
$ J_i $的特征多项式$ f_i(\lambda)=(\lambda-\lambda_i)^{m_i} $  
由凯莱-哈密顿定理得  
$ \Rightarrow(J_i-\lambda_i I)^{m_i}=\mathbf O=(N_i)^{m_i} $  
  
$ \lambda_1,\lambda_2,\cdots,\lambda_s $互不相同  
$ \Rightarrow(\lambda-\lambda_1)^{m_1},(\lambda-\lambda_2)^{m_2},\cdots,\lambda-\lambda_s)^{m_s} $各项互异，也是两两互素  
  
$ \Rightarrow $存在$ h(\lambda) $，使得  
$ h(\lambda)=(\lambda-\lambda_1)^{m_1}\cdot q_1(\lambda)+\lambda_1 $  
$ h(\lambda)=(\lambda-\lambda_2)^{m_2}\cdot q_2(\lambda)+\lambda_2 $  
$ \cdots $  
$ h(\lambda)=(\lambda-\lambda_s)^{m_s}\cdot q_s(\lambda)+\lambda_s $(一元多项式环上的线性同余定理)  
  
将$ J_1,J_2,\cdots,J_s $分别带入上式  
$ \begin{array}{l}  
\Rightarrow& h(J_1)=(J_1-\lambda_1I_{m_1})^{m_1}\cdot q_1(J_1)+\lambda_1I_{m_1}\\\  
&h(J_2)=(J_2-\lambda_2I_{m_2})^{m_2}\cdot q_1(J_2)+\lambda_2I_{m_2}\\\  
&\cdots\\\  
&h(J_s)=(J_s-\lambda_sI_{m_s})^{m_s}\cdot q_1(J_s)+\lambda_sI_{m_s}  
\end{array} $  
  
$ \Rightarrow M=\rm{diag}\{M_1 M_2,\cdots,M_s\}=\rm{diag}\{h(J_1) h(J_2),\cdots,h(J_s)\}=h(J^\prime) $(分块对角阵乘法不过关)  
  
$ \Rightarrow N=J^\prime-M=J^\prime-h(J^\prime) $  
  
$ \Rightarrow J^\prime=M+N $  
1 $ M $可对角化  
2 $ N $是幂零阵  
3 $ MN $可交换  
4 $ M,N $可表示成$ J^\prime $的多项式  
  
又因为$ A\sim J\sim J^\prime $  
$ \Rightarrow A=P\cdot J\cdot P^{-1} $  
$ =P\cdot (M+N)\cdot P^{-1} $(连续使用2次乘法分配律)  
$ =P\cdot M\cdot P^{-1}+P\cdot N\cdot P^{-1} $  
1 $ M $可对角化，则$ B=P\cdot M\cdot P^{-1} $可对角化  
2 $ N $是幂零阵，则$ C=P\cdot N\cdot P^{-1} $也是幂零阵  
3 $ MN $可交换，则$ (P\cdot M\cdot P^{-1})\cdot(P\cdot N\cdot P^{-1}) $可交换  
4 还差一个可以写成多项式  
  
**证明(唯一性)**  
设$ A=B_1+C_1 $，其中$ B_1,C_1 $满足前三个条件  
$ B_1\cdot C_1=C_1\cdot B_1 $  
$ \Rightarrow A\cdot B_1 $  
$ =(B_1+C_1)\cdot B_1 $  
$ =B_1\cdot B_1+C_1\cdot B_1 $  
$ =B_1^2+C_1\cdot B_1 $  
$ =B_1^2+B_1\cdot C_1 $  
$ =B_1\cdot(B_1+C_1) $  
$ =B_1\cdot A $  
  
$ \Rightarrow g(A)\cdot B_1=B_1\cdot g(A) $(为啥)  
因为，数学归纳法  
$ (A^2+A)B=A^2B+AB=AAB+AB $  
$ =ABA+BA=BAA+BA=B(A^2+A) $  
  
$ \Rightarrow B\cdot B_1=B_1\cdot B $  
  
同理可得$ C\cdot C_1=C_1\cdot C $  
  
$ A=B+C=B_1+C_1 $  
$ \Rightarrow B-B_1=C_1-C $  
  
令$ C^r=0,C_1^s=0 $，  
因为$ C\cdot C_1=C_1\cdot C $，所以有二项式定理  
$ \Rightarrow(C-C_1)^{r+s}=\sum\limits_{i+j=r+s}  
P_{i+j}^i\cdot C^i\cdot C^j_1 $  
注意到，若$ i<r $，则$ j>s $；则每项都是零矩阵  
  
$ \Rightarrow(B-B_1)^{r+s}= $零矩阵  
  
又因为$ B,B_1 $可同时对角化  
$ \Rightarrow P^{-1}\cdot(B-B_1)^{r+s}\cdot P= $零矩阵  
$ \Rightarrow(P^{-1}\cdot(B-B_1)\cdot P)^{r+s}= $零矩阵  
$ \Rightarrow(P^{-1}\cdot B\cdot P-  
P^{-1}\cdot B_1\cdot P)^{r+s}= $零矩阵  
$ \Rightarrow\left(\begin{bmatrix}a_1\\\ &\ddots\\\ &&a_n\end{bmatrix}  
-\begin{bmatrix}b_1\\\ &\ddots\\\ &&b_n\end{bmatrix}\right)^{r+s}= $零矩阵  
$ \Rightarrow\left(\begin{bmatrix}a_1-b_1\\\ &\ddots\\\ &&a_n-b_n\end{bmatrix}\right)^{r+s}= $零矩阵  
$ \Rightarrow\begin{bmatrix}(a_1-b_1)^{r+s}\\\ &\ddots\\\ &&(a_n-b_n)^{r+s}\end{bmatrix}= $零矩阵  
$ \Rightarrow a_1=b_1,\cdots,a_n=b_n $  
$ \Rightarrow B=B_1 $  
$ \Rightarrow C=C_1 $  
