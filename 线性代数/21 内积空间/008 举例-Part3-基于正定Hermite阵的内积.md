**例7**    
设 $V=\mathbb{C}^n$ ， $H$ 是 $n$ 阶正定 $\rm{Hermite}$ 阵， $\alpha,\beta\in\mathbb{C}^n$     
定义 $(\alpha,\beta)=\alpha^T\cdot H\cdot\overline{\beta}$     
    
**说明**    
<font color=brown>不要与 $\rm{Hermite}$ 型混淆了</font>    
其实是一回事，做个变量替换就出来了    
    
    
*证明*    
证明共轭对称性    
 $\overline{(\alpha,\beta)}$     
 $=\overline{\alpha^T\cdot H\cdot\overline{\beta}}$ （乘积的共轭 $=$ 共轭的乘积）    
 $=(\overline{\alpha})^T\cdot\overline{H}\cdot\beta$ （数的转置=数本身）    
 $=((\overline{\alpha})^T\cdot\overline{H}\cdot\beta)^T$     
 $=\beta^T\cdot(\overline{H})^T\cdot\overline{\alpha}$ （共轭对称阵的转置）    
 $=\beta^T\cdot H\cdot\overline{\alpha}$     
 $=(\beta,\alpha)$     
    
证明第一变元线性    
 $(c\cdot\alpha+k\cdot\beta,\gamma)$     
 $=(c\cdot\alpha+k\cdot\beta)^T\cdot H\cdot\overline{\gamma}$     
 $=(c\cdot\alpha^T+k\cdot\beta^T)\cdot H\cdot\overline{\gamma}$     
 $=c\cdot\alpha^T\cdot H\cdot\overline{\gamma}+k\cdot\beta^T\cdot H\cdot\overline{\gamma}$     
 $=c\cdot(\alpha^T\cdot H\cdot\overline{\gamma})+k\cdot(\beta^T\cdot H\cdot\overline{\gamma})$     
 $=c\cdot(\alpha,\gamma)+k\cdot(\beta,\gamma)$     
    
证明正定性    
 $(\alpha,\alpha)$     
 $=\alpha^T\cdot H\cdot\overline{\alpha}\geq0$ ，等号成立，当且仅当 $\alpha=0$ ( $\rm{Hermite}$ 阵正定型定义)    
变量代换，令 $\overline{\alpha}=\beta$     
 $\Rightarrow(\overline{\beta})^T\cdot H\cdot\beta$     
    
**说明**    
对称的可定义行向量的情况    
 $(\alpha,\beta)=\alpha\cdot G\cdot(\overline{\beta})^T$     
