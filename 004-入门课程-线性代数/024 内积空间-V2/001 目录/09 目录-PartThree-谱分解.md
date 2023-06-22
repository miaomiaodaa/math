**谱分解**  
<font color=green>定义1: 谱</font>  
全体特征值组成的集合称为谱  
  
<font color=green>定理1: 复正规算子的谱分解</font>  
设 $V$ 是酉空间， $\Phi$ 是复正规算子， $\lambda_1,\lambda_2,\cdots,\lambda_k$ 是 $\Phi$ 的全体不同特征值，  
对应的特征子空间为 $V_1,V_2,\cdots,V_k$ ， $V=V_1\perp V_2\perp\cdots\perp V_k$ ，  
$E_i$ 为 $V$ 到 $V_i$ 的正交投影算子，则 $  
  
<font color=green>定理2: 对称算子的谱分解</font>  
设 $ V $ 是欧几里得空间， $ \Phi $ 是自伴随算子， $ \lambda_1,\lambda_2,\cdots,\lambda_k $ 是 $ \Phi $ 的全体不同特征值，  
对应的特征子空间为 $ V_1,V_2,\cdots,V_k $ ， $ V=V_1\perp V_2\perp\cdots\perp V_k $ ，  
$ E_i $ 为 $ V $ 到 $ V_i $ 的正交投影算子，则 $  
  
**谱分解应用1-复正规算子判定定理3**  
<font color=green>引理1:</font>  
设 $V$ 是酉空间， $\Phi$ 是复正规算子， $\lambda_1,\lambda_2,\cdots,\lambda_k$ 是 $\Phi$ 的全体不同特征值，  
对应的特征子空间为 $V_1,V_2,\cdots,V_k$ ， $E_i$ 为 $V$ 到 $V_i$ 的正交投影算子 ，  
令 $f_j(x)=\prod\limits_{i\neq j}\dfrac{x-\lambda_i}{\lambda_j-\lambda_i}$ ，  
则 $E_j=f_j(\Phi)$  
  
<font color=green>推论1:</font>  
设 $V$ 是酉空间， $\Phi$ 是复正规算子， $\lambda_1,\lambda_2,\cdots,\lambda_k$ 是 $\Phi$ 的全体不同特征值，  
对应的特征子空间为 $V_1,V_2,\cdots,V_k$ ， $E_i$ 为 $V$ 到 $V_i$ 的正交投影算子 ，  
任取 $f(x)\in\mathbb{C}[x]$ ，则 $f(\Phi)=\sum\limits_{i=1}^k f(\lambda_i)\cdot E_i$  
  
<font color=green>定理1: 复正规算子判定定理3</font>  
设 $V$ 是酉空间， $\lambda_1,\lambda_2,\cdots,\lambda_k$ 是 $\Phi$ 的全体不同特征值，  
对应的特征子空间为 $V_1,V_2,\cdots,V_k$ ， $E_i$ 为 $V$ 到 $V_i$ 的正交投影算子，  
则 $\Phi$ 是复正规算子，当且仅当存在复系数多项式 $f(x)\in\mathbb{C}[x]$ ，使得 $\Phi^\star=f(\Phi)$  
  
<font color=green>推论2:</font>  
设 $V$ 是酉空间， $\Phi$ 是复正规算子， $\lambda_1,\lambda_2,\cdots,\lambda_k$ 是 $\Phi$ 的全体不同特征值，  
对应的特征子空间为 $V_1,V_2,\cdots,V_k$ ， $E_i$ 为 $V$ 到 $V_i$ 的正交投影算子，  
则 $\Phi^\star=\bar\lambda_1\cdot E_1+\bar\lambda_2\cdot E_2+\cdots+\bar\lambda_k\cdot E_k$  
  
**谱分解应用2-正规算子、自伴随算子、酉算子转换条件**  
<font color=green>定义1: 自伴随算子的分类</font>  
设 $V$ 是有限维内积空间， $\Phi$ 是自伴随算子，  
若任取 $\mathbf0\neq\alpha\in V$ ， $(\Phi(\alpha),\alpha)>0$ ，则称 $\Phi$ 正定  
若任取 $\mathbf0\neq\alpha\in V$ ， $(\Phi(\alpha),\alpha)\geq0$ ，则称 $\Phi$ 半正定  
若任取 $\mathbf0\neq\alpha\in V$ ， $(\Phi(\alpha),\alpha)<0$ ，则称 $\Phi$ 负定  
若任取 $\mathbf0\neq\alpha\in V$ ， $(\Phi(\alpha),\alpha)\leq0$ ，则称 $\Phi$ 半负定  
  
<font color=green>命题1: 自伴随算子的定性与二次型定性的等价性</font>  
对称算子 $\Phi$ 正定 $\iff$ 二次型正定 $\iff$ 实对称阵正定  
Hermite算子 $\Phi$ 正定 $\iff$ Hermite型正定 $\iff$ Hermite阵正定  
  
<font color=green>定理1: 正规算子、自伴随算子、酉算子转换条件</font>  
设 $\Phi$ 是酉空间 $V$ 上的正规算子，则以下结论成立  
$1^\circ\ $ 若 $\Phi$ 的特征值都是实数，则 $\Phi$ 是自伴随算子（退化成自伴随算子）  
$2^\circ\ $ 若 $\Phi$ 的特征值都大于等于0，则 $\Phi$ 是半正定自伴随算子（退化成半正定自伴随算子）  
$3^\circ\ $ 若 $\Phi$ 的特征值都大于0，则 $\Phi$ 是正定自伴随算子（退化成正定自伴随算子）  
$4^\circ\ $ 若 $\Phi$ 的特征值模都等于1，则 $\Phi$ 是酉算子（退化成酉算子）  
  
**谱分解应用3-半正定自伴随算子的算数平方根**  
<font color=green>定义1: 半正定自伴随算子的算数平方根</font>  
设 $\Phi$ 是半正定自伴随算子，若存在半正定自伴随算子 $\Psi$ ，使得 $\Phi=\Psi^2$  
则称 $\Psi$ 是 $\Phi$ 的算数平方根，记作 $\Psi=\Phi^{\tfrac12}$  
  
<font color=green>定理1: 半正定自伴随算子的算数平方根(几何版本)</font>  
设 $V$ 是有限维内积空间， $\Phi$ 是半正定自伴随算子，  
则存在唯一的半正定自伴随算子 $\Psi$ ，使得 $\Phi=\Psi^2$ ，  
称 $\Psi$ 是 $\Phi$ 的算数平方根，记作 $\Psi=\Phi^{\tfrac12}$  
  
<font color=green>定理2: 半正定自伴随算子的算数平方根(代数版本)</font>  
设 $A$ 为 $n$ 阶半正定实对称阵( $\rm{Hermite}$ 阵)，则存在唯一的半正定实对称阵( $\rm{Hermite}$ 阵) $B$ ，  
使得 $A=B^2$ ，称 $B$ 为 $A$ 的算数平方根，记作 $B=A^{\tfrac12}$  
