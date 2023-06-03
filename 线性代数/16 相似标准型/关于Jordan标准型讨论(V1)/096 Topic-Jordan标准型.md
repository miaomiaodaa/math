**Topic1 如何选取特征向量求出广义特征向量**  
 $\begin{bmatrix}  
2&6&-15\\\  
1&1&-5\\\  
1&2&-6  
\end{bmatrix}$ ，求约当标准型，以及过渡矩阵 $P$   
经计算可得， $A$ 的初等因子为 $(\lambda+1),(\lambda+1)^2$   
  
**Topic2 含参矩阵的约当标准型**  
1 选取特殊子式，求行列式因子  
2 特征值几何重数，确定约当块的个数  
3 计算极小多项式，确定最大约当块的阶数  
  
**Topic3 循环子空间应用**  
<font color=blue>定义</font>: 设 $\Phi\in\mathbf{L}(V_K^n)$ ， $0\neq\alpha$ ，由 $(\alpha,\Phi(\alpha),\Phi^2(\alpha),\cdots)$ 张成的空间，称为 $\Phi$ 的关于循环向量 $\alpha$ 的循环子空间，记作 $C(\Phi,\alpha)$   
  
<font color=blue>引理</font>: 设 $\rm{dim}(C(\Phi,\alpha))=m$ ，则 $(\alpha,\Phi(\alpha),\Phi^2(\alpha),\cdots,\Phi^{m-1}(\alpha))$ 是 $C(\Phi,\alpha)$ 的一个基  
  
<font color=blue>证明</font>: 设 $k=\max\{i\in\mathbb{Z}^+\mid \alpha,\Phi(\alpha),\cdots,\Phi^{i-1}(\alpha)\}$ 线性无关  
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
  
<font color=blue>引理</font>:  $C(\Phi,\alpha)$ 是包含 $\alpha$ 的最小 $\Phi$ 不变子空间  
  
<font color=blue>推论</font>: 设 $\Phi^m(\alpha)=-a_0\alpha-a_1\Phi(\alpha)-\cdots-a_{m-1}\Phi^{m-1}(\alpha)$   
令 $g(x)=x^m+a_{m-1}x^{m-1}+\cdots+a_1x+a_0\in K[x]$   
 $\Phi\mid_{C(\Phi,\alpha)}$ 在基 $(\alpha,\Phi(\alpha),\Phi^2(\alpha),\cdots,\Phi^{m-1}(\alpha))$ 下的表示矩阵为 $g(x)$ 的友阵  
