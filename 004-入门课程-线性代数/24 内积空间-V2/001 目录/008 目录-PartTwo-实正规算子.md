**实正规算子-引子**  
从几何上看，实正规算子在怎样一个基下表示矩阵形式比较简单  
从代数上看，实正规阵，可以正交相似于一个怎样的标准型  
即解决实正规阵的正交相似标准型  
  
根据代数学基本定理，复数域上总存在特征值，但是缩小到实数域上就不一定存在特征值，  
这就是实正规阵正交相似标准型的难度所在  
  
Step1  $\Phi$ 的极小多项式的不可约分解  
诱导出全空间 $V$ 的正交直和分解 $V=W_1\perp W_2\perp \cdot\perp W_k$  
使得 $\Phi\left|\right._{W_i}$ 仍是实正规算子，且极小多项式次数 $\leq2$  
(这次这里理解了，因为看过丘版了，全空间分解成不变子空间的直和)  
  
Step2 极小多项式为2次不可约多项式的实正规算子具有怎样的几何结构  
极小多项式为1次不可约多项式就变成了纯量变换，比较简单  
  
**全空间分解成基于实正规算子的不变子空间的正交直和(Step1)**  
<font color=green>引理1: 实正规算子的有限次加减、数乘、复合仍是实正规算子</font>  
设 $V$ 是欧几里得空间， $\Phi$ 是 $V$ 上的实正规算子， $f(x)\in\mathbb{R}[x]$ ，  
则 $f(\Phi)$ 仍是实正规算子  
  
<font color=green>引理2</font>: 设 $V$ 是Euclid空间， $\Phi$ 是 $V$ 上的实正规算子， $f(x),g(x)\in\mathbb{R}[x]$ ，  
 $\rm{gcd}(f(x),g(x))=1$ ，任取 $\alpha\in\rm{Ker}(f(\Phi))$ ， $\beta\in\rm{Ker}(g(\Phi))$  
则 $(\alpha,\beta)=0$  
  
<font color=green>定理1: 全空间分解成基于实正规算子的不变子空间的正交直和</font>  
设 $V$ 是Euclid空间， $\Phi$ 是 $V$ 上的实正规算子， $g(x)$ 是 $\Phi$ 的极小多项式，  
 $g_1(x),g_2(x),\cdots,g_k(x)$ 是 $g(x)$ 在 $\mathbb R$ 上所有各项互异的首一不可约因式，  
 $W_i=\rm{Ker}[g_i(\Phi)]$ ，则以下结论成立  
 $1^\circ\ g(x)=g_1(x)\cdot g_2(x)\cdots g_k(x)$ ，且 $\rm{deg}[g_i(x)]\leq2$ ，即极小多项式在 $\mathbb R$ 上无重因式  
 $2^\circ\ V=W_1\perp W_2\perp \cdots \perp W_k$  
 $3^\circ\ \Phi\left|\right._{W_i}$ 是实正规算子，且它的极小多项式为 $g_i(x),\ 1\le i\le k$  
注: 此处完成了全空间分解成不变子空间正交直和，即完成了Step1的工作  
  
**分解成二维不变子空间正交直和(Step2-1)**  
(分解成以二次不可约多项式为极小多项式的实正规算子的不变子空间的正交直和)  
命题1: 二次不可约多项式恒等变形  
设 $f(x)=ax^2+bx+c\in\mathbb{R}[x]$ ，若 $f(x)$ 的判别式小于零，则 $f(x)$ 可变形成 $f(x)=(x-a)^2+b,\ b\neq0$  
  
<font color=green>引理1: 极小多项式是 $g(x)=x^2+1$ 的实正规算子具有怎样的性质</font>  
设 $V$ 是欧几里得空间， $\Phi$ 是 $V$ 上的实正规算子， $\Phi$ 的极小多项式为 $g(x)=x^2+1$  
引理1-1: 范数相等 $\Vert \alpha\Vert=\Vert \beta\Vert$  
引理1-2: 相正交 $(\beta,\alpha)=0,\ \beta\perp \alpha$  
引理1-3: 表示矩阵 $(\Phi(\beta),\Phi(\alpha))=(\beta,\alpha)\cdot\begin{bmatrix}0&1\\\ -1&0\end{bmatrix}$  
引理1-4: 伴随算子表示矩阵 $(\Phi^\star(\beta),\Phi^\star(\alpha))=(\beta,\alpha)\cdot\begin{bmatrix}0&-1\\\ 1&0\end{bmatrix}$  
  
<font color=green>引理2: 极小多项式是 $g(x)=(x-a)^2+b^2$ 的实正规算子具有怎样的性质</font>  
设 $V$ 是欧几里得空间， $\Phi$ 是 $V$ 上的实正规算子， $\Phi$ 的极小多项式为 $g(x)=(x-a)^2+b^2$ ， $a,b\in\mathbf R,b\neq0$  
则任取 $\mathbf0\neq \alpha\in V$ ， $\beta=b^{-1}(\Phi-aI_V)(\alpha)$  
引理2-1: 范数相等 $\Vert \alpha\Vert=\Vert \beta\Vert$  
引理2-2: 相正交 $(\beta,\alpha)=0,\ \beta\perp \alpha$  
引理2-3: 表示矩阵 $(\Phi(\beta),\Phi(\alpha))=(\beta,\alpha)\cdot\begin{bmatrix}a&b\\\ -b&a\end{bmatrix}$  
引理2-4: 伴随算子表示矩阵 $(\Phi^\star(\beta),\Phi^\star(\alpha))=(\beta,\alpha)\cdot\begin{bmatrix}a&-b\\\ b&a\end{bmatrix}$  
  
<font color=green>定理: 极小多项式是 $g(x)=(x-a)^2+b^2$ 的实正规算子具有怎样的性质</font>  
  
**极小多项式是一次的实正规算子在标准正交基下的表示矩阵(Step2-2)**  
极小多项式是一次的情况，即 $g_i(x)=x-c_i$  
  
 $\Rightarrow\Phi\left|\right._{W_i}$ 是纯量变换 $c_i\cdot I_{w_i}$  
  
取 $W_i$ 的一个标准正交基，则表示阵为对角阵  
  
**实正规算子正交相似标准型**  
(<font color=brown>感觉应该还缺一步，子空间的次数是怎么确定的呢，有问题</font>)  
<font color=green>定理1: 实正规算子正交相似标准型(几何版)</font>  
设 $V$ 是欧几里得空间， $\Phi$ 是 $V$ 上的实正规算子，则存在 $V$ 的标准正交基，使得 $\Phi$ 表示阵为  
 $\rm{diag}\left\{\begin{bmatrix}a_1&b_1\\\ -b_1&a_1\end{bmatrix},\begin{bmatrix}a_2&b_2\\\ -b_2&a_2\end{bmatrix},\cdots,\begin{bmatrix}a_r&b_r\\\ -b_r&a_r\end{bmatrix}, c_{2r+1},\cdots,c_n\right\}$  
其中 $a_i,b_i,c_j\in\mathbb R,\ b_i\neq0,\ 1\le i\le r,\ 2r+1\le j\le n$  
  
<font color=green>定理2: 实正规阵正交相似标准型(代数版)</font>  
设 $n$ 阶实正规阵 $A$ 的实特征值为 $\lambda_1,\lambda_2,\cdots,\lambda_r$ ，复特征值为 $a_i\pm b_i,\ a_i,b_i\in\mathbb{R},\ b_i\neq0$  
 $i=1,2,\cdots,s,\ r+2s=n$ ，则存在正交阵 $Q$ ，使得 $Q^TAQ=\rm{diag}\\{\lambda_1,\lambda_2,\cdots,\lambda_r,A_1,A_2,\cdots,A_s\\}$  
其中 $A_i=\begin{bmatrix}a_i&b_i-b_i&a_i\end{bmatrix},\ i=1,2,\cdots,s$  
  
**实正规算子正交相似关系的全系不变量**  
定理: 设 $A$ ， $B$ 是同阶实正规阵， $A$ 与 $B$ 正交相似 $\Leftrightarrow A$ 与 $B$ 有相同的特征值  
  
**实正规算子正交相似标准型应用1-正交阵的正交相似标准型**  
设 $A$ 是正交阵，则存在另外一个正交阵 $P$ ，使得 $P^T\cdot A\cdot P$ 是以下形式的分块对角阵  
 $\rm{diag}\left\{\begin{bmatrix}\cos\theta_1&\sin\theta_1\\\ -\sin\theta_1&\cos\theta_1\end{bmatrix},  
\begin{bmatrix}\cos\theta_2&\sin\theta_2\\\ -\sin\theta_2&\cos\theta_2\end{bmatrix},\cdots,  
\begin{bmatrix}\cos\theta_r&\sin\theta_r\\\ -\sin\theta_r&\cos\theta_r\end{bmatrix}, 1,\cdots,1-1,\cdots,-1\right\}$  
  
**实正规算子正交相似标准型应用2-实反对称阵的正交相似标准型**  
设 $A$ 是实反对称阵( $A^T=-A$ )，则存在另外一个正交阵 $P$ ，使得 $P^T\cdot A\cdot P$ 是以下形式的分块对角阵  
 $\rm{diag}\left\{\begin{bmatrix}0&b_1\\\ -b_1&0\end{bmatrix},\begin{bmatrix}0&b_2\\\ -b_2&0\end{bmatrix},\cdots,\begin{bmatrix}0&b_r\\\ -b_r&0\end{bmatrix}, 0,\cdots,0\right\}$  
