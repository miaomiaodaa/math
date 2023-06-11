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
  
Step2 极小多项式为2次不可约多项式的实正规算子的结构  
极小多项式为1次不可约多项式就变成了纯量变换，比较简单  
  
**全空间分解成不变子空间的正交直和**  
<font color=green>引理1: 实正规算子的有限次加减、数乘、复合仍是实正规算子</font>  
设 $V$ 是欧几里得空间， $\Phi$ 是 $V$ 上的实正规算子， $f(x)\in\mathbb{R}[x]$ ，  
则 $f(\Phi)$ 仍是实正规算子  
  
<font color=green>引理2</font>: 设 $V$ 是Euclid空间， $\Phi$ 是 $V$ 上的实正规算子， $f(x),g(x)\in\mathbb{R}[x]$ ，  
 $\rm{gcd}(f(x),g(x))=1$ ，任取 $\alpha\in\rm{Ker}(f(\Phi))$ ， $\beta\in\rm{Ker}(g(\Phi))$  
则 $(\alpha,\beta)=0$  
  
<font color=green>定理1: 全空间分解成不变子空间的正交直和</font>  
设 $V$ 是Euclid空间， $\Phi$ 是 $V$ 上的实正规算子， $g(x)$ 是 $\Phi$ 的极小多项式，  
 $g_1(x),g_2(x),\cdots,g_k(x)$ 是 $g(x)$ 在 $\mathbb R$ 上所有各项互异的首一不可约因式，  
 $W_i=\rm{Ker}[g_i(\Phi)]$ ，则以下结论成立  
 $1^\circ\ g(x)=g_1(x)\cdot g_2(x)\cdots g_k(x)$ ，且 $\rm{deg}[g_i(x)]\leq2$ ，即极小多项式在 $\mathbb R$ 上无重因式  
 $2^\circ\ V=W_1\perp W_2\perp \cdots \perp W_k$  
 $3^\circ\ \Phi\left|\right._{W_i}$ 是实正规算子，且它的极小多项式为 $g_i(x),\ 1\le i\le k$  
注: 此处完成了全空间分解成不变子空间正交直和，即完成了Step1的工作  
