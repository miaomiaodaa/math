**证明**  
构造一个 $m+n$ 的方阵  
$\begin{bmatrix}  
A_{m\times n}&O_{m\times m}\\\  
-E_{n\times n}&B_{n\times m}  
\end{bmatrix}$  
  
第二行左乘矩阵 $A$ ，加到第一行 (第三类分块初等行变换)  
$\to\begin{bmatrix}  
O_{m\times n}&\lgroup AB\rgroup_m\\\  
-E_{n\times n}&B_{n\times m}  
\end{bmatrix}$  
  
$\Rightarrow  
\begin{vmatrix}  
A_{m\times n}&O_{m\times m}\\\  
-E_{n\times n}&B_{n\times m}  
\end{vmatrix}  
=\begin{vmatrix}  
O_{m\times n}&\lgroup AB\rgroup_m\\\  
-E_{n\times n}&B_{n\times m}  
\end{vmatrix}$  
  
<mark> $1^\circ$  右边的行列式，按前 $m$ 行进行拉普拉斯展开</mark>  
右边行列式 $=|AB|\cdot(-1)^{1+2+\cdots+m+(n+1)+\cdots+(n+m)}|-E_{n\times n}|$  
$=|AB|\cdot(-1)^{nm}\cdot(-1)^n  
=(-1)^{n(m+1)}|AB|$  
  
<mark> $2^\circ$  左边的行列式，按前 $m$ 行进行拉普拉斯展开</mark>  
Case1：  $m>n$  
$\Rightarrow$ 包含前 $m$ 行的任意 $m$ 阶子式至少包含一个全零列  
$\Rightarrow$ 行列式值为零  
$\Rightarrow0=(-1)^{n(m+1)}|AB|$  
$\Rightarrow|AB|=0$  
  
Case2：  $m\leq n$  
$\Rightarrow$ 任意包含前 $m$ 行的可能不为零的 $m$ 阶子式，  
$\quad$ 必然是在前 $n$ 列中选取  
  
<font color=blue>2-1 用拉普拉斯定理展开：</font>  
  
选取的列： $1\le j_1<\cdots<j_m\le n$  
  
剩余的列： $1\le i_1<i_2<\cdots<i_{n-m}\le n$  
  
$m$ 阶子式： $A\begin{bmatrix}1,2,\cdots,m\\\ j_1,j_2,\cdots,j_m\end{bmatrix}$  
  
$m$ 阶代数余子式： $C\begin{bmatrix}1,2,\cdots,m\\\ j_1,j_2,\cdots,j_m\end{bmatrix}$  
  
$\Rightarrow$ 等式左边 $=$  
$\sum\limits_{1\le j_1<j_2<\cdots<j_m\le n}  
A\begin{bmatrix}1,2,\cdots,m\\\ j_1,j_2,\cdots,j_m\end{bmatrix}  
\cdot C\begin{bmatrix}1,2,\cdots,m\\\ j_1,j_2,\cdots,j_m\end{bmatrix}$  
  
<font color=blue>2-2 接下来分析 $C$ 的结构：</font>  
  
$C$ 的符号为 $(-1)^{1+2+\cdots+m+j_1+j_2  
+\cdots+j_m}$  
  
$C$ 的结构为 $[-e_{i_1}\enspace -e_{i_2}\enspace  
\cdots\enspace -e_{i_{n-m}}\enspace B]$  
其中 $e_i$ 表示第 $i$ 个标准单位列向量  
  
$C$ 的阶数为 $n\times n$  
  
$C$ 是一个 $n\times n$ 阶的方阵  
把列分成前 $n-m$ 列和后 $m$ 列  
按前 $n-m$ 列进行拉普拉斯展开，那么对应的余子式就是 $m$ 阶的  
  
<font color=blue>2-3 继续对 $|C|$ 进行拉普拉斯展开</font>  
  
设 $|N|=|-e_{i_1}\enspace -e_{i_2}\enspace  
\cdots\enspace -e_{i_{n-m}}\enspace B|$ ，(剥离前面的符号)  
选前 $n-m$ 列进行拉普拉斯展开  
那么，所有包含前 $n-m$ 列的 $n-m$ 阶子式中，只有一个可能不为零  
  
$\overset{举例：n=5，m=2}{\begin{bmatrix}  
1&0&0&0&0\\\  
0&1&0&0&0\\\  
0&0&1&0&0\\\  
0&0&0&1&0\\\  
0&0&0&0&1  
\end{bmatrix}  
\xrightarrow{划去第2，4列}  
\begin{bmatrix}  
1&0&0\\\  
0&0&0\\\  
0&1&0\\\  
0&0&0\\\  
0&0&1  
\end{bmatrix}}$  
  
$\Rightarrow|N|=|-I_{n-m}|\cdot (-1)^{(i_1+i_2+\cdots+i_{n-m})+(1+2+\cdots+(n-m))}$  
$\cdot B\begin{bmatrix}j_1,j_2,\cdots,j_m\\\ 1,2,\cdots,m\end{bmatrix}$  
  
$\Rightarrow$ 等式左边 $=\sum\limits_{1\le j_1<j_2<\cdots<j_m\le n}$  
$(-1)^l\cdot  
A\begin{bmatrix}1,2,\cdots,m\\\ j_1,j_2,\cdots,j_m\end{bmatrix}  
\cdot B\begin{bmatrix}j_1,j_2,\cdots,j_m\\\ 1,2,\cdots,m\end{bmatrix}$  
  
$(-1)^l=$  
$(-1)^{1+2+\cdots+m+j_1+j_2+\cdots+j_m}$  
$+(-1)^{(i_1+i_2+\cdots+i_{n-m})+(1+2+\cdots  
+(n-m))}$  
$+(-1)^{n-m}$  
  
<mark> $3^\circ$ 处理系数</mark>：  
证明目标：  
要证等式成立  
$\Leftrightarrow$ 只要证明等式两边系数的指数有相同奇偶性即可  
$\Leftrightarrow$ 只要证明 $l+n(m+1)$ 是偶数即可  
  
等式右边的系数： $(-1)^{n(m+1)}$  
  
等式右边的系数  
$(-1)^{n-m}\cdot  
(-1)^{(i_1+i_2+\cdots+i_{n-m})+(1+2+\cdots+(n-m))}$  
$\cdot(-1)^{1+2+\cdots+m+j_1+j_2+\cdots+j_m}$  
  
$\Rightarrow l=(1+2+\cdots+m+j_1+j_2+\cdots+j_m)$  
$+(i_1+i_2+\cdots+i_{n-m})+(1+2+\cdots+(n-m))$  
$+(n-m)$  
  
$=1+2+\cdots+m$  
$+(j_1+j_2+\cdots+j_m)+(i_1+i_2+\cdots+i_{n-m})$  
$+(1+2+\cdots+(n-m))+(n-m)$  
  
$(j_1+j_2+\cdots+j_m)+(i_1+i_2+\cdots+i_{n-m})$  
$=1+2+\cdots+n$  
  
$=1+2+\cdots+m$  
$+(1+2+\cdots+n)$  
$+(1+2+\cdots+(n-m))+(n-m)$  
  
$=1+2+\cdots+m$  
$+(1+2+\cdots+m+(m+1)+\cdots+n)$  
$+(1+2+\cdots+(n-m))+(n-m)$  
  
把偶数全部去掉  
$\Rightarrow l^\prime=$  
$(m+1)+\cdots+n  
+(1+2+\cdots+\underline{(n-m)})+\underline{(n-m)}$  
$\Rightarrow l^{\prime\prime}=(m+1)+\cdots+n  
+(1+2+\cdots+(n-m-1))$  
  
反转其中一组，然后首尾配对  
项数 $=$ (末项 $-$ 首项)/公差 $+1$  
$(m+1)+\cdots+n$ ，共 $n-m$ 项  
$0+1+2+\cdots+(n-m-1)$ ，共 $n-m$ 项  
  
$(m+1)+(m+2)+(m+3)+\cdots+n$  
$(n-m-1)+(n-m-2)+(n-m-3)+\cdots+0$  
  
$\Rightarrow l^{\prime\prime}=n(n-m)$  
  
$\Rightarrow l=l^{\prime\prime}+$ 一个偶数 $  
=n(n-m)+$ 一个偶数  
  
$\Rightarrow l+n(m+1)$  
$=n(n-m)+$ 一个偶数 $+n(m+1)$  
$=n^2+n+$ 一个偶数  
$=n(n+1)+$ 一个偶数  
$=$ 一个偶数  
