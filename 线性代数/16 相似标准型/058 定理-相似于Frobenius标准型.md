**内容V1**  
设 $A\in M_n(K)$ 的不变因子为 $1,1,\cdots,1,d_1(\lambda),d_2(\lambda),\cdots,d_k(\lambda)$ ，  
则 $A$ 相似于 $F=\rm{diag}\{\ F(d_1(\lambda)),F(d_2(\lambda)),\cdots,F(d_k(\lambda))\ \}$   
  
**内容V2**  
设 $A\in M_n(K)$ 的法式为 $\rm{diag}\{1,1,\cdots,1,d_1(\lambda),d_2(\lambda),\cdots,d_k(\lambda)\}$ ，  
则 $A$ 相似于 $F=\rm{diag}\{\ F(d_1(\lambda)),F(d_2(\lambda)),\cdots,F(d_k(\lambda))\ \}$   
  
**内容(几何)**  
设 $\Phi\in\mathbf{L}(V_K^n)$ ，则存在一个基，使得 $\Phi$ 在该基下的表示矩阵为 $\rm{Frobenius}$ 标准型  
  
**说明**  
 $A$ 相似于 $F=\rm{diag}\{\ F(d_1(\lambda)),F(d_2(\lambda)),\cdots,F(d_k(\lambda))\ \}$   
 $\Rightarrow A$ 与 $F$ 有相同的不变因子组  
 $\Rightarrow F$ 的不变因子组也是 $1,1,\cdots,1,d_1(\lambda),d_2(\lambda),\cdots,d_k(\lambda)$   
又因为 $F$ 是双射（一一映射）  
 $\Rightarrow$ 可以快速“读出” $F$ 的不变因子  
  
**证明V1**  
引理1: 任意多项式 $f(\lambda)$ 都存在一个数值型矩阵 $F(f(\lambda))$ ，使得该矩阵的特征多项式为 $f(\lambda)$   
  
引理2: 相抵矩阵具有相同的行列式  
  
要证 $A$ 相似于 $F=\rm{diag}\{F(d_1(\lambda)),F(d_2(\lambda)),\cdots,F(d_k(\lambda))\}$ ，  
只要证 $A$ 的特征矩阵相抵于 $\rm{diag}\{F(d_1(\lambda)),F(d_2(\lambda)),\cdots,F(d_k(\lambda))\}$ 的特征矩阵，  
只要证 $\lambda I-A$ 相抵于 $\lambda I-F$ （证明它们相抵，要用到前面的未命名引理）  
  
 $A$ 的不变因子为 $1,1,\cdots,1,d_1(\lambda),d_2(\lambda),\cdots,d_k(\lambda)$ ，  
 $\Rightarrow A$ 的法式为 $\rm{diag}\{1,1,\cdots,1,d_1(\lambda),d_2(\lambda),\cdots,d_k(\lambda)\}$   
  
又因为 $|\lambda I-A|=d_1(\lambda)\cdot d_2(\lambda)\cdots d_k(\lambda)$   
 $\Rightarrow\rm{deg}[|\lambda I-A|]=\rm{deg}[d_1(\lambda)\cdot d_2(\lambda)\cdots d_k(\lambda)]$   
 $=\rm{deg}[d_1(\lambda)]+\rm{deg}d_2(\lambda)]+\cdots+\rm{deg}[d_k(\lambda)]$   
设 $\rm{deg}[d_1(\lambda)]=n_1,\rm{deg}[d_2(\lambda)]=n_2,\cdots,\rm{deg}[d_k(\lambda)]=n_k$   
 $\Rightarrow n=n_1+n_2+\cdots+n_k$   
  
 $F=\rm{diag}\{F(d_1(\lambda)),F(d_2(\lambda)),\cdots,F(d_k(\lambda)\}$   
  
 $\Rightarrow \lambda I-F=\rm{diag}\{\lambda I_{n_1}-F(d_1(\lambda)),\ \lambda I_{n_2}-F(d_2(\lambda)),\ \cdots,\ \lambda I_{n_k}-F(d_k(\lambda)\}$   
  
 $\Rightarrow\lambda I-F$ 相抵于 $\rm{diag}\{\underbrace{1,\cdots,1}_{n_1-1},d_1(\lambda),\ \cdots,\ \underbrace{1,\cdots,1}_{n_k-1},d_k(\lambda)\}$   
  
（总共 $n_1+n_2+\cdots+n_k-k=n-k$ 个1）  
  
由前述【引理-未命名001】得  
 $\Rightarrow\rm{diag}\{1,\cdots,1,d_1(\lambda),\cdots,1,\cdots,1,d_k(\lambda)\}$ 与 $\rm{diag}\{1,1,\cdots,1,d_1(\lambda),d_2(\lambda),\cdots,d_k(\lambda)\}$ 相抵  
 $\Rightarrow \lambda I-A$ 相抵于 $\lambda I-F$   
 $\Rightarrow A$ 相似于 $F=\rm{diag}\{\ F(d_1(\lambda)),F(d_2(\lambda)),\cdots,F(d_k(\lambda))\ \}$   
  
**证明V2**  
 $A\xrightarrow{特征矩阵}\lambda I-A\sim\Lambda_A=\rm{diag}\{1,1,\cdots,1,d_1(\lambda),d_2(\lambda),\cdots,d_k(\lambda)\}$   
  
 $F\xrightarrow{特征矩阵}\lambda I-F\sim\Lambda_F=\rm{diag}\{1,\cdots,d_1(\lambda);\cdots;1,\cdots,1,d_k(\lambda)\}$   
  
 $\Lambda_A\sim\Lambda_F$   
 $\Rightarrow\lambda I-A\sim\lambda I-B$   
 $\Rightarrow A\approx F$   
  
补充证明1: $\enspace$  $\Lambda_A$ 与 $\Lambda_F$ 同阶(为了证明1的个数相同，这样就能用未命名引理001了)  
 $A$ 与 $\lambda I-A$ 同阶， $B$ 与 $\lambda I-B$ 同阶(矩阵加减法不改变矩阵的阶数)  
 $|\lambda I-A|=d_1(\lambda)\cdot d_2(\lambda)\cdots d_k(\lambda)$   
 $|\lambda I-B|=d_1(\lambda)\cdot d_2(\lambda)\cdots d_k(\lambda)$ (相似矩阵具有相同行列式)  
 $\Rightarrow|\lambda I-A|=|\lambda I-B|$   
 $\Rightarrow\rm{deg}|\lambda I-A|=\rm{deg}|\lambda I-B|$ (特征矩阵的阶数=特征多项式的次数)  
 $\Rightarrow A$ 与 $F$ 同阶  
 $\Rightarrow\Lambda_A$ 与 $\Lambda_F$ 同阶  
  
补充证明2: $\enspace$  未命名引理001  
  
补充证明3: $\enspace$   $A\approx B\iff \lambda I-A\sim\lambda I-B$   
