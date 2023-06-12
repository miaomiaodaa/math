**内容**  
设 $\Phi$ 是酉空间 $V$ 上的 $\rm{Hermite}$ 算子，则 $\Phi$ 的所有特征值都是实数，且属于不同特征值的特征向量互相正交  
  
**说明**  
一般的结论是属于不同特征值的特征向量线性无关，自伴随算子的不仅线性无关，且相互正交  
  
**证明**  
任取 $\Phi$ 的特征值 $\lambda$ ，特征向量 $\alpha$ ，则根据特征值定义有 $\Phi(\alpha)=\lambda\cdot\alpha$  
  
计算 $\lambda\cdot(\alpha,\alpha)$  
  
 $=(\lambda\cdot\alpha,\alpha)$  
  
 $=(\Phi(\alpha),\alpha)$  
  
 $=(\alpha,\Phi^\star(\alpha))$  
  
 $=(\alpha,\Phi(\alpha))$  
  
 $=(\alpha,\lambda\cdot\alpha)$  
  
 $=\overline{\lambda}\cdot(\alpha,\alpha)$  
  
又因为内积的正定性，且特征值 $\alpha\neq\mathbf0$  
  
 $\Rightarrow(\alpha,\alpha)>0$  
  
 $\Rightarrow\lambda=\overline{\lambda}$  
  
 $\Rightarrow\lambda\in\mathbb{R}$  
  
疑问: 上述证明哪一步对欧几里得空间不成立？  
