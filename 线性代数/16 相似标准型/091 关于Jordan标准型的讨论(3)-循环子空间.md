**二级结论2: 空间分解--循环子空间，不变子空间，根子空间的直和**    
全空间可以分解成若干循环子空间的直和    
全空间分解成若干不变子空间的直和    
全空间分解成若干根子空间的直和    
    
难道说，矩阵分块的几何意义是空间分解??!!，    
对角/分块对角矩阵分块意味着空间直和分解，每一个分解空间又是子空间    
    
<font color=brown>定义</font>    
设 $\Phi\in\mathbb{L}(V_K^n)$ ， $V_0\subseteq V_K$ 是 $r$ 维 $\Phi$ 不变子空间    
若存在 $\mathbf{0}\neq\alpha\in V_0$ ，使得 $(\alpha, \Phi(\alpha), \Phi^2(\alpha), \cdots, \Phi^{r-1}(\alpha))$     
是 $V_0$ 的一个基，则称 $V_0$ 是关于 $\Phi$ 的循环子空间， $\alpha$ 称为循环子空间的循环向量    
    
一般的循环子空间定义不依赖于不变子空间    
由一般循环子空间的定义，立刻得循环子空间是 $\Phi$ 不变子空间    
    
<font color=brown>举例</font>    
举例1: $\Phi(\alpha_i)=\lambda_i\lambda_i$ ，则 $C(\Phi,\alpha)=V$     
举例2:若线性变换 $\Phi$ 在某个基下的表示矩阵为友阵，则 $\Phi$ 可构成一个循环子空间    
举例3:若线性变换 $\Phi$ 在某个基下的表示矩阵为 $\rm{Jordan}$ 块，则 $\Phi$ 可构成一个循环子空间    
    
<font color=brown>命题1</font>    
 $C(\Phi,\alpha)$ 是包含 $\alpha$ 的最小不变子空间    
    
<font color=brown>命题2</font>    
 $V_i$ 是关于线性变换 $\Psi=\Phi-\lambda_iI_V$ 的循环子空间    
    
注: $\enspace$ 特征值 $\lambda_i$ 不同循环子空间的线性变换 $\Psi$ 不同    
    
证明:    
令 $\Psi=\Phi-\lambda_i I_V$     
作用于 $\begin{cases}    
\Phi(e_{i1})=\lambda_i\cdot e_{i1}&\\\ \Phi(e_{i2})=e_{i1}+\lambda_i\cdot e_{i2}&\\\ \cdots&\\\ \Phi(e_{ir_i})=e_{ir_{i-1}}+\lambda_i\cdot e_{ir_i}  \end{cases}\ (1)\quad, \forall\ 1\le i\le k$ 得    
    
 $\Rightarrow\begin{cases}    
\Psi(e_{i,1})=\mathbf{0}&\\\ \Psi(e_{i,2})=e_{i1}&\\\ \cdots&\\\ \Psi(e_{i,r_i})=e_{i,r_i-1}    
\end{cases}\quad, \forall\ 1\le i\le k$     
    
 $\Rightarrow e_{i,r_i}\xrightarrow[第1次]{\Psi}    
e_{i,r_{i}-1}\xrightarrow[第2次]{\Psi}    
e_{i,r_{i}-2}\xrightarrow[第3次]{\Psi}    
\cdots\xrightarrow[第r_i-2次]{\Psi}    
e_{i,2}\xrightarrow[第r_i-1次]{\Psi}    
e_{i,1}\xrightarrow[第r_i次]{\Psi}\mathbf0$     
    
 $\Rightarrow(e_{i,r_i},\ \Psi(e_{i,r_i}),\ \Psi^2(e_{i,r_i}),\ \cdots,\ \Psi^{r_i-1}(e_{i,r_i}))$ 构成 $V_i$ 的一个基    
    
 $\Rightarrow V_i$ 是 $\Psi$ 循环子空间    
    
<font color=brown>命题3</font>    
 $V$ 可以分解成不变子空间的直和    
    
证明:    
令 $V_i=L(e_{i1},e_{i2},\cdots,e_{ir_i})$     
由 $(1)$ 得    
 $\Rightarrow\Phi(V_i)\subseteq V_i$ ，即 $V_i$ 是 $\Phi$ 不变子空间，<font color=red> $V_i$ 不是特征子空间</font>    
 $\Rightarrow \rm{J}_{r_i}(\lambda_i)$ 是 $\Phi$ 限制在 $V_i$ 下的表示矩阵    
    
 $\lambda_i$ 是 $V_i$ 的特征值 $\xrightarrow{对应的特征子空间}V_{i_\lambda}\subseteq V_i$     
 $\lambda_i$ 也是 $V$ 的特征值 $\xrightarrow{对应的特征子空间}V_{\lambda_i}\subseteq V$     
    
令 $V_i=L(e_{i1},e_{i2},\cdots,e_{ir_i})$     
 $\Rightarrow V_i$ 的基可以拼成全空间 $V$ 的基    
 $\Rightarrow V=V_1\oplus V_2\oplus\cdots\oplus V_k\quad(2)$     
    
<font color=brown>命题4</font>    
 $V$ 可以分解成循环子空间的直和    
    
证明:    
令 $V_i=L(e_{i1},e_{i2},\cdots,e_{ir_i})$     
 $\Rightarrow V_i$ 的基可以拼成全空间 $V$ 的基    
 $\Rightarrow V=V_1\oplus V_2\oplus\cdots\oplus V_k$     
再由【命题2】的结论得    
 $\Rightarrow V$ 可以分解成循环子空间的直和    
    
<font color=brown>引理1: 相同特征值的循环子空间的直和空间</font>    
设 $\rm{R}(\lambda_1)=V_1\oplus V_2\oplus\cdots\oplus V_s$ ， $V_i$ 是循环不变子空间    
则 $\rm{R}(\lambda_1)=\rm{Ker}[(\Phi-\lambda_1 I_V)^n]$ （所有符号的含义都是一脉相承的）    
    
说明:    
1  $\rm{R}(\lambda_1)=V_1\oplus V_2\oplus\cdots\oplus V_s$ 称为特征值 $\lambda_1$ 的根子空间    
2 特征子空间 $\subseteq$ 根子空间:  $V_{\lambda_1}\subseteq\rm{R}(\lambda_1)$     
3 属于特征值 $\lambda_i$ 的 $\rm{Jordan}$ 块 $J_{r_i}(\lambda_i)$     
4 相同特征值的循环子空间和在一起的空间    
 $\quad\rm{R}(\lambda_1)=V_1\oplus V_2\oplus\cdots \oplus V_s$     
5  $\rm{Ker}(\Phi-\lambda_1I_V)^n$ 这东西用人话怎么说    
  把整个 $V$ 中的向量用 $(\Phi-\lambda_1I_V)$ 连续“筛” $n$ 次，    
  不是筛一次，留下一部分，淘汰一部分，留下来的进入第2轮    
  是有 $n$ 次机会，不是只有一次机会，这样筛选，越来越多    
6 分块的线性方程组 $(\rm{J}-\lambda_1I_n)^nx=0$     
7  $\Phi-\lambda_1I_V$ 代数版本是 $\rm{J}-\lambda_1I_n$     
8 核空间=齐次线性方程组的解空间，像空间的维数=表示矩阵的秩    
9 其实n可严格取 $\max\{r_1,r_2,\cdots,r_s\}$ ，或者放宽点取 $r_1+r_2+\cdots+r_s$     
A  $V_i$ 是 $\lambda_i$ 对应的 $\Phi$ 不变子空间，<font color=red> $V_i$ 不是特征子空间</font>    
B  $V_{\lambda_1}=\rm{Ker}[(\Phi-\lambda_1I_V)]$ 是 $\lambda_1$ 的特征子空间    
    
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
    
<font color=brown>命题5</font>    
 $V$ 可以分解成根子空间的直和    
    
证明    
由【引理1】直接得:  $V=R(\lambda_1)\oplus R(\lambda_2)\oplus \cdots \oplus R(\lambda_s)$     
全空间 $=$ 全体特征值的根子空间的直和    
    
    
<font color=brown>定理1</font>    
设 $\Phi\in\mathbf{L}(V_K^n)$ 可对角化，当且仅当任意特征值 $\lambda_0$ 的 $\rm{R}(\lambda_0)=V_{\lambda_0}$ ，即根子空间 $=$ 特征子空间    
    
证明:    
 $\rm{R}(\lambda_0)=V_{\lambda_0}$     
 $\Leftrightarrow\rm{dim}[\rm{R}(\lambda_0)]=\rm{dim}[V_{\lambda_0}]$     
 $\rm{dim}[V_{\lambda_0}]=\lambda_0$ 几何重数 $=\lambda_0$ 对应的 $\rm{Jordan}$ 块的块数    
 $\rm{dim}[\rm{R}(\lambda_0)]=$ 属于特征值 $\lambda_0$ 的 $\rm{Jordan}$ 块的阶数之和 $=\lambda_0$ 的特征方阵的    
（这个弯转不过来了）    
    
<font color=brown>命题6</font>    
设全空间 $V$ 是循环子空间，即 $V=\rm{C}(\Phi,\alpha)$ ， $\Psi\in\mathbb{L}(V)$ ， $\Phi\circ\Psi    
=\Psi\circ\Phi$ ，则    
1  $\Psi$ 由 $\Psi(\alpha)$ 唯一决定    
2  $\exists\ g(\lambda)\in K[\lambda]$ ，使得 $\Psi=g(\Phi)$     
    
证明:    
 $(1)$     
 $V=\rm{C}(\Phi,\alpha)$ 的基为 $(\alpha,\Phi(\alpha),\Phi^2(\alpha),\cdots,\Phi^{n-1}(\alpha))$     
 $\Psi$ 由 $\Psi$ 在基上的作用唯一决定    
    
 $\Phi\circ\Psi=\Psi\circ\Phi$     
 $\Rightarrow\Psi(\Phi^i(\alpha))    
=\Phi^i(\Psi(\alpha))$     
 $\Rightarrow\Psi$ 由 $\Psi(\alpha)$ 唯一决定    
    
 $(2)$     
 $\Psi(\alpha)=a_0\cdot\alpha+a_1\cdot\Phi(\alpha)+a_2\cdot\Phi^2(\alpha)+\cdots+    
a_{n-1}\cdot\Phi^{n-1}(\alpha)$     
令 $g(x)=a_0+a_1\cdot x+a_2\cdot x^2+\cdots+    
a_{n-1}\cdot x^{n-1}$     
 $\Rightarrow\Psi(\alpha)=g(\Phi)(\alpha)$     
由结论 $(1)$ 得    
 $\Rightarrow\Psi=g(\Phi)$     
    
推论:    
若 $A=F(f(\lambda))$ ， $AB=BA$ ，则 $B=g(A)$     
若 $A=J_n(\lambda_0)$ ， $AB=BA$ ，则 $B=g(A)$     
    
<font color=blue>命题7</font>:     
设 $\rm{dim}(C(\Phi,\alpha))=m$ ，则 $(\alpha,\Phi(\alpha),\Phi^2(\alpha),\cdots,\Phi^{m-1}(\alpha))$ 是 $C(\Phi,\alpha)$ 的一个基    
    
说明:    
1 不会出现 $(\Phi^i(\alpha),\mathbf0,\Phi^{i+2}(\alpha))$ 这种情况，    
  因为线性映射将零向量映射成零向量，任意包含零向量的向量组都线性相关    
2  $(\Phi(\alpha),\Phi^2(\alpha),\cdots,\Phi^{m-1}(\alpha),\Phi^{m}(\alpha))$     
  会不会也能构成一个基呢    
    
证明:    
设 $k=\max\{i\in\mathbb{Z}^+\mid \alpha,\Phi(\alpha),\cdots,\Phi^{i-1}(\alpha)\}$ 线性无关    
首项这个集合非空，至少有一个向量 $\alpha$ 保底，其次这个集合由上界，上界是这个循环子空间的维数，所以必然存在最大值    
 $\Rightarrow\alpha,\Phi(\alpha),\cdots,\Phi^{k-1}(\alpha)$ 线性无关    
 $\Rightarrow\alpha,\Phi(\alpha),\cdots,\Phi^{k-1}(\alpha),\Phi^k(\alpha)$ 线性相关    
 $\Rightarrow\Phi^k(\alpha)$ 可由 $\alpha,\Phi(\alpha),\cdots,\Phi^{k-1}(\alpha)$ 线性表出    
    
由归纳法    
 $\Rightarrow\forall i>k$ ， $\Phi^i(\alpha)$ 可由 $\alpha,\Phi(\alpha),\cdots,\Phi^{k-1}(\alpha)$ 线性表出    
 $\Rightarrow C(\Phi,\alpha)$ 中任意向量可由 $\alpha,\Phi(\alpha),\cdots,\Phi^{k-1}(\alpha)$ 线性表出    
由因为 $\alpha,\Phi(\alpha),\cdots,\Phi^{k-1}(\alpha)$ 线性无关    
 $\Rightarrow\alpha,\Phi(\alpha),\cdots,\Phi^{k-1}(\alpha)$ 是 $C(\Phi,\alpha)$     
    
 $\Rightarrow\rm{dim}(C(\Phi,\alpha))=k=m$     
    
推论:     
设 $\Phi^m(\alpha)=-a_0\alpha-a_1\Phi(\alpha)-\cdots-a_{m-1}\Phi^{m-1}(\alpha)$     
令 $g(x)=x^m+a_{m-1}x^{m-1}+\cdots+a_1x+a_0\in K[x]$     
 $\Phi\mid_{C(\Phi,\alpha)}$ 在基 $(\alpha,\Phi(\alpha),\Phi^2(\alpha),\cdots,\Phi^{m-1}(\alpha))$ 下的表示矩阵为 $g(x)$ 的友阵    
