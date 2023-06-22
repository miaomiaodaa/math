1 零子空间，全子空间是平凡子空间  
  
2 子空间判定定理  
$V_K$ 是线性空间，若 $U$ 是 $V$ 的非空子集， $U$ 对 $V_K$ 上的加法和数乘保持封闭性，则 $U$ 是 $V_K$ 的子空间  
  
3 子空间的维数范围:  $0\leq\rm{dim}_K(U)\leq\rm{dim}_K(V)$ ，当且仅当U为非平凡空间时，不等号严格成立  
当且仅当 $U$ 是零子空间时， $\rm{dim}_K(U)=0$  
当且仅当 $U$ 是全空间时， $\rm{dim}_K(U)=\rm{dim}_K(V)$  
$W,U$ 是 $V_K$ 的子空间，若 $W\subseteq U，则\rm{dim_K}(W)\leq\rm{dim_K}(U)$  
  
4  $V_1\cap V_2={\alpha|\alpha\in V_1, \alpha\in V_2}$ 是 $V_K$ 的子空间，称为交空间  
  
5  $V_1+V_2={\alpha|\alpha=\alpha_1+\alpha_2, \alpha_1\in V_1, \alpha_2\in V_2}$ 是 $V_K$ 的子空间，称为和空间  
推广:  $V_1+V_2+\cdots+V_m$ 也是 $V_K$ 的子空间，也称为和空间  
  
6  $V_1\oplus V_2={\alpha|\alpha=\alpha_1+\alpha_2, \alpha_1\in V_1, \alpha_2\in V_2}, V_1\cap V_2=$ 零子空间，是子空间，称为直和空间  
推广:  $V_1\oplus V_2\oplus \cdots \oplus V_m$ 也是 $V_K$ 的子空间，也称为值和空间  
其中 $V_i\cap(V_1+V_2+\cdots+V_{i-1}+V_{i+1}+\cdots+V_m)=$ 零子空间  
  
7 和空间维数公式  
$\rm{dim}(V_1+V_2)=\rm{dim}(V_1)+\rm{dim}(V_2)-\rm{dim}(V_1\cap V_2)$  
特别的:  $V_1\cap V_2=$ 零子空间，有 $\rm{dim}(V_1+V_2)=\rm{dim}(V_1)+\rm{dim}(V_2)$  
  
8 直和判定定理5合1  
$V_1\oplus V_2\oplus \cdots\oplus V_m$ 是 $V_k$ 的直和空间  
$\Leftrightarrow \forall 2\leq i \leq m V_i\cap(V_1+V_2+\cdots+V_{i-1})=$ 零子空间  
$\Leftrightarrow \rm{dim}_K(V_1\oplus V_2\oplus \cdots\oplus V_m)=\rm{dim}_K(V_1)+\rm{dim}_K(V_2)+\cdots+\rm{dim}_K(V_m)$  
$\Leftrightarrow V_1，V_2，\cdots V_m$ 的基可以拼成全空间 $V_K$ 的基  
$\Leftrightarrow \forall v\in V, v=v_1+v_2+\cdots+v_m, v_i\in V_i (1)$  
$v=v_1+v_2+\cdots+v_m=v=v_1^\prime+v_2^\prime+\cdots+v_m^\prime, v_i\in V_i (2)$  
若要使得 $(1)$ 式和 $(2)$ 式同时成立，当且仅当  $v_i=v_i^\prime$  
上述称为分块表示唯一  
  
9  $S$ 是 $V_K$ 的非空子集， $\rm{L}(S)$ 是 $S$ 中所有可能的线性组合构成的集合，则 $\rm{L}(S)$ 是 $V_K$ 的子空间  
$\rm{L}(S)$ 中的元素具有如下形式:  $\alpha=\sum_{i=1}^m\lambda_i\alpha_i, m\geq1$  
  
10 最小生成子空间:  $\rm{L}(S)$ 是所有包含 $S$ 的最小子空间  
  
11 生成子空间的基与维数:  $\rm{L}(S)=\rm{L}(\alpha_{i_1},\alpha_{i_2},\cdots,\alpha_{i_r})，\rm{dim}_K(\rm{L}(S))=r(S)$  
  
12 并集生成子空间:  $\rm{L}(V_1\cup V_2)=V_1+V_2$  
  
13  $\rm{Ker}(\Phi)={\alpha|\Phi(\alpha)=\mathbf{0}_U}$ 是 $V_K$ 的子空间，称为核空间  
  
14  $\rm{Im}(\Phi)={v|v=\Phi(\alpha)\in V_K,\ \forall\alpha\in V_K, }$ 是 $U_K$ 的子空间，称为像空间  
  
15 核空间，像空间的维数公式  
像空间维数:  $\rm{dim}_K(\rm{Im}(\Phi))=\rm{r}(A)=\rm{r}(T(\Phi))$  
核空间维数:  $\rm{dim}_K(\rm{Ker}(\Phi))=\rm{dim}_K(V)-\rm{r}(A)=\rm{dim}_K(V)-\rm{r}(T(\Phi))$  
$\Rightarrow\rm{dim}_K(V)=\rm{dim}_K(\rm{Ker}(\Phi))+\rm{dim}_K(\rm{Im}(\Phi))$  
