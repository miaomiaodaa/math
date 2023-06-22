**内容V2**  
设 $\Phi\in\mathbb{L}(V_\mathbb{C}^n)$ ，初等因子组为 $(\lambda-\lambda_1)^{r_1},\ (\lambda-\lambda_2)^{r_2},\ \cdots,\ (\lambda-\lambda_k)^{r_k}$  
则存在基 $(e_{11},e_{12},\cdots,e_{1r_1};\ e_{21},e_{22},\cdots,e_{2r_2};\ \cdots;\ e_{k1},e_{k2},\cdots,e_{kr_k})\ (\bigstar)$  
使得 $\Phi$ 在该基下的表示矩阵为 $\rm{J}=\rm{diag}\{J_{r_1}(\lambda_1),J_{r_2}(\lambda_2),\cdots,J_{r_k}(\lambda_k)\}$  
  
**说明**  
$\lambda_1$ 可以等于 $\lambda_2$ ，但此时 $r_1$ 不能等于 $r_2$  
所以 $(\lambda-\lambda_1)^{r_1},\ (\lambda-\lambda_2)^{r_2}$ 仍是不同的初等因子  
  
$  
\begin{bmatrix}  
\Phi(e_{11})\\\  
\vdots\\\  
\Phi(e_{1r_1})\\\  
\\\  
\Phi(e_{21})\\\  
\vdots\\\  
\Phi(e_{2r_2})\\\  
\\\  
\vdots\\\  
\\\  
\Phi(e_{k1})\\\  
\vdots\\\  
\Phi(e_{kr_k})  
\end{bmatrix}  
=\left[\begin{array}{ccc:cccc:c:ccc}  
\lambda_1&1\\\  
&\ddots&1\\\  
&&\lambda_1\\\hdashline  
&&&\lambda_2&1\\\  
&&&&&\ddots&1\\\  
&&&&&&\lambda_2\\\hdashline  
&&&&&&&\ddots\\\hdashline  
&&&&&&&&\lambda_k&1\\\  
&&&&&&&&&\ddots&1\\\  
&&&&&&&&&&\lambda_k  
\end{array}\right]  
\cdot\begin{bmatrix}  
e_{11}\\\  
\vdots\\\  
e_{1r_1}\\\  
\\\  
e_{21}\\\  
\vdots\\\  
e_{2r_2}\\\  
\\\  
\vdots\\\  
\\\  
e_{k1}\\\  
\vdots\\\  
e_{kr_k}  
\end{bmatrix}  
$  
  
取其中任意块  
$(\Phi(e_{i1}),\ \Phi(e_{i1}),\ \cdots, \Phi(e_{ir_i}))=(e_{i1},\ e_{i2},\ \cdots,\ e_{ir_i})  
\cdot\begin{bmatrix}  
\lambda_i&1\\\  
&\ddots&1\\\  
&&\lambda_i  
\end{bmatrix}$  
  
$\Leftrightarrow\begin{cases}  
\Phi(e_{i1})=\lambda_i\cdot e_{i1}&\\\  
\Phi(e_{i2})=e_{i1}+\lambda_i\cdot e_{i2}&\\\  
\cdots&\\\  
\Phi(e_{ir_i})=e_{ir_{i-1}}+\lambda_i\cdot e_{ir_i}  
\end{cases}\ (1)\quad, \forall\ 1\le i\le k$  
  
<font color=brown>Part1</font>  
令 $V_i=L(e_{i1},e_{i2},\cdots,e_{ir_i})$  
由 $(1)$ 得  
$\Rightarrow\Phi(V_i)\subseteq V_i$ ，即 $V_i$ 是 $\Phi$ 不变子空间，<font color=red> $V_i$ 不是特征子空间</font>  
$\Rightarrow \rm{J}_{r_i}(\lambda_i)$ 是 $\Phi$ 限制在 $V_i$ 下的表示矩阵  
  
$\lambda_i$ 是 $V_i$ 的特征值 $\xrightarrow{对应的特征子空间}V_{i_\lambda}\subseteq V_i$  
$\lambda_i$ 也是 $V$ 的特征值 $\xrightarrow{对应的特征子空间}V_{\lambda_i}\subseteq V$  
  
<font color=brown>Part2</font>  
令 $V_i=L(e_{i1},e_{i2},\cdots,e_{ir_i})$  
$\Rightarrow V_i$ 的基可以拼成全空间 $V$ 的基  
$\Rightarrow V=V_1\oplus V_2\oplus\cdots\oplus V_k\quad(2)$  
  
<font color=brown>Part3: 特征值的代数重数</font>  
虽然用 $\lambda_1,\lambda_2,\cdots,\lambda_k$ 表示特征值，但是没说它们互不相同  
因此任意一个特征值 $\lambda_i$ 的代数重数介于 $r_i$ 与 $r_1+r_2+\cdots+r_k$ 之间  
而巧合等于所有 $\lambda_i$ 对应的 $\rm{Jordan}$ 块阶数之和  
特征值的代数重数 $=$ 包含 $\lambda_i$ 的初等因子的所有幂次之和 $=$  $\lambda_i$ 对应的所有 $\rm{Jordan}$ 块的阶数之和  
  
<font color=brown>Part4: 特征值的几何重数(有点绕)</font>  
特征值的几何重数  
$=\lambda_i$ 对应的特征空间的维数，即 $\rm{dim}(V_{\lambda_i})$  
特征空间 $=$ 特征值对应的齐次线性方程组的解空间 $=K^n$ 的核空间  
$\Rightarrow \rm{dim}(V_{\lambda_i})=\rm{dim}(\lambda_i I-J)=n-\rm{rank}(\lambda_i I-J)$  
分块对角阵阵的秩 $=$ 每个分块秩的和  
$\rm{rank}(\lambda_i I-J)=\sum\limits_{j=1}^{k}\rm{rank}(\lambda_i I_{r_j}-J_{r_j}(\lambda_j))$  
  
$(1)$ 设 $\lambda_i$ 重复了 $s$ 次， $1\le s\le k$  
$(2)\rm{rank}(\lambda_i I_{r_j}-J_{r_j}(\lambda_j))=\begin{cases}  
r_j-1&i=j\\\  
r_j&i\neq j  
\end{cases}$  
$(3)n=$ 方阵的维数 $=$ 全体 $\rm{Jordan}$ 块阶数的和  
  
结合 $(1),(2),(3)$  
$\Rightarrow\rm{dim}(V_{\lambda_i})=s=$  $\lambda_i$ 对应的 $\rm{Jordan}$ 块的块数  
$\Rightarrow$ 特征值的几何重数 $=$  $\lambda_i$ 对应的 $\rm{Jordan}$ 块的块数  
  
复习: $\enspace$  像空间的维数 $=$ 表示矩阵的秩  
  
Part3+Part4= $\rm{Jordan}$ 标准型的特征值的几何重数与代数重数  
  
<font color=brown>Part5:  $V_i$ 是 $\Psi$ 循环子空间</font>  
令 $\Psi=\Phi-\lambda_i I_V$  
作用于 $(1)$ 得  
$\Rightarrow\begin{cases}  
\Psi(e_{i,1})=\mathbf{0}&\\\  
\Psi(e_{i,2})=e_{i1}&\\\  
\cdots&\\\  
\Psi(e_{i,r_i})=e_{i,r_i-1}  
\end{cases}\ (1)\quad, \forall\ 1\le i\le k$  
  
$\Rightarrow e_{i,r_i}\xrightarrow[第1次]{\Psi}  
e_{i,r_{i}-1}\xrightarrow[第2次]{\Psi}  
e_{i,r_{i}-2}\xrightarrow[第3次]{\Psi}  
\cdots\xrightarrow[第r_i-2次]{\Psi}  
e_{i,2}\xrightarrow[第r_i-1次]{\Psi}  
e_{i,1}\xrightarrow[第r_i次]{\Psi}\mathbf0$  
  
$\Rightarrow(e_{i,r_i},\ \Psi(e_{i,r_i}),\ \Psi^2(e_{i,r_i}),\ \cdots,\ \Psi^{r_i-1}(e_{i,r_i}))$ 构成 $V_i$ 的一个基  
  
$\Rightarrow V_i$ 是 $\Psi$ 循环子空间  
  
再结合Part2的结论  
<font color=green> $\Rightarrow V$ 可以分解成循环子空间的直和</font>  
  
注: $\enspace$ 特征值 $\lambda_i$ 不同循环子空间的线性变换 $\Psi$ 不同  
  
<font color=brown>Part6: 相同特征值的循环子空间的直和空间</font>  
引理: 设 $\rm{R}(\lambda_1)=V_1\oplus V_2\oplus\cdots\oplus V_s$ ， $V_i$ 是循环不变子空间  
则 $\rm{R}(\lambda_1)=\rm{Ker}[(\Phi-\lambda_1 I_V)^n]$ （所有符号的含义都是一脉相承的）  
证明:  
要证 $\rm{R}(\lambda_1)=\rm{Ker}[(\Phi-\lambda_1 I_V)^n]$  
只要证 $\rm{R}(\lambda_1)\subseteq\rm{Ker}[(\Phi-\lambda_1 I_V)^n]$ 且 $\rm{Ker}[(\Phi-\lambda_1 I_V)^n]\subseteq\rm{R}(\lambda_1)$  
  
要证 $\rm{R}(\lambda_1)\subseteq\rm{Ker}[(\Phi-\lambda_1 I_V)^n]$  
只要证 $\forall v\in\rm{R}(\lambda_1)$ ，都有 $v\in\rm{Ker}[(\Phi-\lambda_1 I_V)^n]$  
  
$\forall v\in\rm{R}(\lambda_1)$  
$\Rightarrow v=v_1+v_2+\cdots+v_s, v_i\in V_i$  
  
  
$V_i$ 的基具有该性质: $\ e_{i,r_i}\xrightarrow[第1次]{\Phi-\lambda_1 I_V}  
e_{i,r_{i}-1}\xrightarrow[第2次]{\Phi-\lambda_1 I_V}  
e_{i,r_{i}-2}\xrightarrow[第3次]{\Phi-\lambda_1 I_V}  
\cdots\xrightarrow[第r_i-2次]{\Phi-\lambda_1 I_V}  
e_{i,2}\xrightarrow[第r_i-1次]{\Phi-\lambda_1 I_V}  
e_{i,1}\xrightarrow[第r_i次]{\Phi-\lambda_1 I_V}\mathbf0$  
$\Rightarrow(\Phi-\lambda_1 I_V)^{r_i}(e_{ij})=\mathbf0$  
$\Rightarrow(\Phi-\lambda_1 I_V)^{r_i}(v_i)=\mathbf0$  
$\Rightarrow(\Phi-\lambda_1 I_V)^n(v_i)=\mathbf0$  
  
$\Rightarrow(\Phi-\lambda_1 I_V)^n(v)=(\Phi-\lambda_1 I_V)^n(v_1)+(\Phi-\lambda_1 I_V)^n(v_2)  
+\cdots+(\Phi-\lambda_1 I_V)^n(v_s)=\mathbf0$  
$\Rightarrow\forall v\in\rm{R}(\lambda_1)$ ，都有 $v\in\rm{Ker}[(\Phi-\lambda_1 I_V)^n]$  
（其实n可严格取 $\max\{r_1,r_2,\cdots,r_s\}$ ，或者放宽点取 $r_1+r_2+\cdots+r_s$ ）  
  
再证 $\rm{Ker}[(\Phi-\lambda_1 I_V)^n]\subseteq\rm{R}(\lambda_1)$  
  
$\rm{Ker}[(\Phi-\lambda_1 I_V)^n]$ 中的向量等价于在基 $(\bigstar)$ 下，使得齐次线性方程组 $(\rm{J}-\lambda_1 I_n)^nx=0$ 成立的全体坐标向量  
下面研究 $(\rm{J}-\lambda_1 I_n)^nx=0(\star)$ 解的情况  
$(J_{r_i}(\lambda_i)-\lambda_1 I_{r_i})^n=  
\begin{bmatrix}  
\lambda_i-\lambda&1\\\  
&\lambda_i-\lambda&1\\\  
&&\ddots&1\\\  
&&&\lambda_i-\lambda  
\end{bmatrix}^n  
=\begin{cases}  
零矩阵&1\le i\le s\\\  
非异阵& s<i\le k  
\end{cases}$  
  
非异阵时，只有零解  
零矩阵时，解是整个 $V_i$ 对应的坐标向量  
所有的解合并起来就是 $(\star)$ 的解  
对应到几何上就是 $V_1+V_2+\cdots+V_s$  
$\Rightarrow\rm{Ker}[(\Phi-\lambda_1 I_V)^n]=V_1+V_2+\cdots+V_s$  
又因为 $V_1+V_2+\cdots+V_s$ 是直和  
$\Rightarrow\rm{Ker}[(\Phi-\lambda_1 I_V)^n]=\rm{R}(\lambda_1)$  
