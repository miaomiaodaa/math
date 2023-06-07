**内容V1**  
设 $A,B\in M_n(K)$ ，若 $A$ 与 $B$ 相似，当且仅当 $(\lambda I_n-A_n)$ 与 $(\lambda I_n-B_n)$ 相抵  
  
**内容V2**  
设 $A,B\in M_n(K)$ ，则 $\exists$ 可逆阵 $P$ ，使得 $B=P^{-1}AP$ ，当且仅当 $(\lambda I_n-A_n)\sim(\lambda I_n-B_n)$  
  
**内容V3**  
两个矩阵相似的充要条件是它们的特征矩阵相抵  
  
**说明**  
相抵:  $A$ 经过若干次初等变换可变成 $B\Leftrightarrow\exists P,Q$ 可逆，使得 $B=P\cdot A\cdot Q$  
进一步若 $P=Q^{-1}$ 或 $Q=P^{-1}$ ，则 $A$ 与 $B$ 就变成了相似关系  
 $\Rightarrow$ 相似关系是一种特殊的相抵关系  
  
**证明**  
<font color=blue>必要性</font>:  $B=P^{-1}AP\Rightarrow(\lambda I_n-A_n)\sim(\lambda I_n-B_n)$  
  
Part1  
 $A$ 与 $B$ 相似  
 $\Rightarrow\exists$ 可逆阵 $P$ ，使得 $B=P^{-1}AP$  
 $\Rightarrow\lambda I_n-B_n=\lambda I_n-P^{-1}AP$  
 $=\lambda P^{-1}I_nP-P^{-1}AP$  
 $=P^{-1}\cdot(\lambda I_n-A)\cdot P$  
  
Part2  
 $P$ 是可逆阵  
 $\Rightarrow P,P^{-1}$ 可以写成若干初等多项式矩阵的乘积  
  
Part3  
 $\Rightarrow \lambda I_n-A$ 经过若干次初等变换可变成 $\lambda I_n-B_n$  
 $\Rightarrow(\lambda I_n-A_n)\sim(\lambda I_n-B_n)$  
  
---  
  
<font color=blue>充分性</font>:  $(\lambda I_n-A_n)\sim(\lambda I_n-B_n)\Rightarrow B=P^{-1}AP$  
  
<font color=green>Part1</font>  
设 $M(\lambda)(\lambda I_n-A_n)N(\lambda)=\lambda I_n-B_n$  
<font color=brown>其中 $M(\lambda)$ 与 $N(\lambda)$ 是可逆多项式矩阵</font>  
 $\Rightarrow M(\lambda)(\lambda I_n-A_n)=(\lambda I_n-B_n)\cdot N(\lambda)^{-1}\quad(1)$  
  
<font color=green>Part2</font>  
做左带余除法  
 $\Rightarrow\exist\ Q(\lambda), R$ ，使得 $M(\lambda)=(\lambda I_n-B_n)\cdot Q(\lambda)+R\quad(2)$  
  
<font color=green>Part3</font>  
将 $(2)$ 式带入 $(1)$ 式得  
 $[(\lambda I_n-B_n)\cdot Q(\lambda)+R]\cdot(\lambda I_n-A_n)=(\lambda I_n-B_n)\cdot N(\lambda)^{-1}$  
整理得  
 $\Rightarrow(\lambda I_n-B_n)\cdot[N(\lambda)^{-1}-Q(\lambda)\cdot(\lambda I_n-A_n)]=R\cdot(\lambda I_n-A_n)$  
  
<font color=green>Part4</font>  
断言:  $\rm{deg}[N(\lambda)^{-1}-Q(\lambda)\cdot(\lambda I_n-A_n)]\leq0$ （ $\rm{i.e.}$ 是数值型矩阵）  
反证法:  
设 $\rm{deg}[N(\lambda)^{-1}-Q(\lambda)\cdot(\lambda I_n-A_n)]\geq1$  
已知 $\rm{deg}(\lambda I_n-B_n)=1$ ，又因为 $I_n$ 可逆  
 $\Rightarrow$ 两者乘积的最高次的系数不可能是零矩阵  
 $\Rightarrow$ 乘积次数只会增加，不能减少  
 $\Rightarrow\rm{deg}\left((\lambda I_n-B_n)\cdot[N(\lambda)^{-1}-Q(\lambda)\cdot(\lambda I_n-A_n)]\right)\geq2$  
而等式右边的次数是1次，从而产生矛盾，所以断言成立  
令 $P=N(\lambda)^{-1}-Q(\lambda)\cdot(\lambda I_n-A_n)$  
<font color=red> $\Rightarrow P=N(\lambda)^{-1}-Q(\lambda)\cdot(\lambda I_n-A_n)\in M_n(K)$ 是数值型矩阵</font>  
 $\Rightarrow(\lambda I_n-B_n)\cdot P=R\cdot(\lambda I_n-A_n)$  
  
<font color=green>Part5</font>  
 $\Rightarrow\lambda I_n\cdot P-B_n\cdot P=R\cdot\lambda I_n-R\cdot A_n$  
由矩阵多项式相等定义得  
 $\Rightarrow P=R,\ B_n\cdot P=R\cdot A_n$  
 $\Rightarrow B_n\cdot P=P\cdot A_n$  
（距离证明完毕就差一个 $P$ 可逆）  
  
<font color=green>Part6</font>  
 $P=N(\lambda)^{-1}-Q(\lambda)\cdot(\lambda I_n-A_n)\in M_n(K)$  
 $\Rightarrow P+Q(\lambda)\cdot(\lambda I_n-A_n)=N(\lambda)^{-1}$  
 $\Rightarrow [P+Q(\lambda)\cdot(\lambda I_n-A_n)]N(\lambda)=N(\lambda)^{-1}\cdot N(\lambda)$  
 $\Rightarrow P\cdot N(\lambda)+Q(\lambda)\cdot\underline{(\lambda I_n-A_n)\cdot N(\lambda)}=I_n\quad(3)$  
  
由前面的 $(1)$ 式:【 $\ M(\lambda)(\lambda I_n-A_n)=(\lambda I_n-B_n)\cdot N(\lambda)^{-1}\ $ 】  
 $\Rightarrow(\lambda I_n-A_n)\cdot N(\lambda)=\underline{M(\lambda)^{-1}\cdot(\lambda I_n-B_n)}\quad(4)$  
  
将 $(4)$ 式带入 $(3)$ 式得  
 $\Rightarrow P\cdot N(\lambda)+Q(\lambda)\cdot M(\lambda)^{-1}\cdot(\lambda I_n-B_n)=I_n\quad(5)$  
  
做带余除法:  
 $N(\lambda)=S(\lambda)(\lambda I_n-B_n)+T\quad(6)$  
  
将 $(6)$ 式带入 $(5)$ 式得  
 $\Rightarrow P\cdot[S(\lambda)(\lambda I_n-B_n)+T]+Q(\lambda)\cdot M(\lambda)^{-1}\cdot(\lambda I_n-B_n)=I_n$  
整理得  
 $\Rightarrow [Q(\lambda)\cdot M(\lambda)^{-1}+P\cdot S(\lambda)]\cdot(\lambda I_n-B_n)=I_n-P\cdot T$  
  
<font color=green>Part7</font>  
断言 $Q(\lambda)\cdot M(\lambda)^{-1}+P\cdot S(\lambda)$ 是零矩阵  
反证法: 设 $Q(\lambda)\cdot M(\lambda)^{-1}+P\cdot S(\lambda)\neq$ 零矩阵  
 $\Rightarrow\rm{deg}[Q(\lambda)\cdot M(\lambda)^{-1}+P\cdot S(\lambda)]\geq0$  
又因为 $I_n$ 可逆  
 $\Rightarrow\rm{deg}\left([Q(\lambda)\cdot M(\lambda)^{-1}+P\cdot S(\lambda)]\cdot(\lambda I_n-B_n)\right)\geq1$  
但是 $I_n-P\cdot T$ 的次数是零，所以矛盾，因此断言成立  
 $\Rightarrow I_n-P\cdot T=$ 零矩阵  
 $\Rightarrow I_n=P\cdot T$ 可逆  
 $\Rightarrow P\ $ 可逆  
  
<font color=green>Part8-完结撒花</font>  
 $\Rightarrow P^{-1}\cdot B_n\cdot P=A_n$  
