**回顾**
全空间分解成若干不变子空间的直和，(极小多项式)
每个不变子空间中又产生循环子空间，($\Psi_i=\Phi\mid_{W_i}-\lambda_iI$)
每个不变子空间分解成若干**强**循环子空间的直和

**定理**
主对角元为$\lambda_j$的Jordan块总数为$N_j=n-\rm{rank}(\Phi-\lambda_j I)$
其中$t$阶Jordan块的个数为$\rm{N_j}(t)=\rm{rank}((\Phi-\lambda_j I)^{t+1})+\rm{rank}((\Phi-\lambda_j I)^{t-1})-\rm{rank}((\Phi-\lambda_j I)^t)$

**证明**
$N_j$
$=\rm{dim}(\rm{Ker}(\Psi_j))$
$=\rm{dim}(\rm{Ker}(\Phi\mid_{W_j}-\lambda_jI\mid_{W_j}))$
$=\rm{dim}(\rm{Ker}(\Phi-\lambda_jI))$
$=\rm{dim}(V)-\rm{dim}(\rm{Im}(\Phi-\lambda_jI))$
$=n-\rm{rank}(\Phi-\lambda_j I)$

$\forall\alpha\in\rm{Ker}(\Phi\mid_{W_j}-\lambda_jI\mid_{W_j})^m$
$\Leftrightarrow\alpha\in W_j$且$(\Phi\mid_{W_j}-\lambda_jI\mid_{W_j})^m(\alpha)=\mathbf0_V$
$\Leftrightarrow\alpha\in W_j$且$(\Phi-\lambda_jI)^m(\alpha)=\mathbf0_V$
$\Rightarrow\alpha\in\rm{Ker}(\Phi-\lambda_jI)^m$

情形1：$m\le r_j$，$r_j$是幂零指数
$\forall\alpha\in V,\ \alpha\in\rm{Ker}(\Phi-\lambda_jI)^m$
$\Leftrightarrow(\Phi-\lambda_jI)^m(\alpha)=\mathbf0_V$
$\Rightarrow(\Phi-\lambda_jI)^{r_j}(\alpha)=\mathbf0_V$
$\Rightarrow\alpha\in\rm{Ker}(\Phi-\lambda_jI)^{r_j}=W_j$
$\Rightarrow\alpha\in W_j$且$(\Phi\mid_{W_j}-\lambda_jI\mid_{W_j})^m(\alpha)=\mathbf0_V$
$\Rightarrow\alpha\in\rm{Ker}(\Phi\mid_{W_j}-\lambda_jI\mid_{W_j})^m$

情形2：$m>r_j$
设$g(\lambda)=(\lambda-\lambda_1)^{r_1}\cdots(\lambda-\lambda_j)^m\cdots(\lambda-\lambda_1)^{r_s}$
$\Rightarrow m(\lambda)\mid g(\lambda)$
$\Rightarrow g(\lambda)$是$\Phi$的一个零化多项式
$\Rightarrow V=\rm{Ker}(\Phi-\lambda_1I)^{r_1}\oplus\cdots\oplus\rm{Ker}(\Phi-\lambda_jI)^m\oplus\cdots\oplus\rm{Ker}(\Phi-\lambda_sI)^{r_s}$
$=W_1\oplus\cdots\oplus\rm{Ker}(\Phi-\lambda_jI)^m\oplus\cdots\oplus W_s$

又因为$W_j=\rm{Ker}(\Phi-\lambda_jI)^{r_j}\subseteq\rm{Ker}(\Phi-\lambda_jI)^{m}$
取$W_j$的一个基$(e_{i1},e_{i2},\cdots,e_{ir_i})$扩张成$\rm{Ker}(\Phi-\lambda_jI)^{m}$的一个基$(e_{i1},e_{i2},\cdots,e_{ir_i},\eta_1,\cdots,\eta_q)$

将$W_1,\cdots,\rm{Ker}(\Phi-\lambda_jI)^{m},\cdots,W_s$的基拼成全空间$V$的基
又因为$W_1,\cdots,W_j,\cdots,W_s$的基拼成全空间$V$的基
$\Rightarrow\rm{dim}(\rm{Ker}(\Phi-\lambda_jI)^{m})=\rm{dim}(\rm{Ker}(\Phi-\lambda_jI)^{r_j})=\rm{dim}(W_j)$
$\Rightarrow$无须扩充，即不需要添加$\eta_1,\cdots,\eta_q$
$\Rightarrow W_j$的基就是$\rm{Ker}(\Phi-\lambda_jI)^{m}$的基
$\Rightarrow\rm{Ker}(\Phi-\lambda_jI)^{r_j} =W_j=\rm{Ker}(\Phi-\lambda_jI)^{m}$

若$\alpha\in\rm{Ker}(\Phi-\lambda_jI)^{m}$
$\Rightarrow\alpha\in\rm{Ker}(\Phi-\lambda_jI)^{r_j}=W_j$
$\Rightarrow\alpha\in W_j$且$(\Phi\mid_{W_j}-\lambda_jI\mid_{W_j})^m(\alpha)=\mathbf0_V$
$\Rightarrow\alpha\in\rm{Ker}(\Phi\mid_{W_j}-\lambda_jI\mid_{W_j})^m$

综上
$\rm{Ker}(\Phi\mid_{W_j}-\lambda_jI\mid_{W_j})^m\Leftrightarrow\rm{Ker}(\Phi-\lambda_jI)^m$得证

引理1：$\rm{N}(t)=\rm{rank}(B^{t+1})+\rm{rank}(B^{t-1})-2\rm{rank}(B^t)$
引理2：$A_j=\lambda_jI+B_j$
$N_j(t)=A_j$的$t$阶Jordan块的个数
$=B_j$的$t$阶Jordan块的个数
$=\rm{rank}(B_j^{t+1})+\rm{rank}(B_j^{t-1})-2\rm{rank}(B_j^t)$
$=\rm{rank}(\Psi_j^{t+1})+\rm{rank}(\Psi_j^{t-1})-2\rm{rank}(\Psi_j^t)$
$=\rm{dim}(\rm{Im}(\Psi_j^{t+1}))+\rm{dim}(\rm{Im}(\Psi_j^{t-1}))-2\rm{dim}(\rm{Im}(\Psi_j^{t}))$
$=(\rm{dim}(W_j)-\rm{dim}(\rm{Ker}(\Psi_j^{t+1})))+(\rm{dim}(W_j)-\rm{dim}(\rm{Ker}(\Psi_j^{t-1})))-2(\rm{dim}(W_j)-\rm{dim}(\rm{Ker}(\Psi_j^{t})))$
$=2\rm{dim}(\rm{Ker}(\Psi_j^{t}))-\rm{dim}(\rm{Ker}(\Psi_j^{t+1}))-\rm{dim}(\rm{Ker}(\Psi_j^{t-1}))$
$=2\rm{dim}(\rm{Ker}((\Phi\mid_{W_i}-\lambda_iI)^{t}))-\rm{dim}(\rm{Ker}((\Phi\mid_{W_i}-\lambda_iI)^{t+1}))-\rm{dim}(\rm{Ker}((\Phi\mid_{W_i}-\lambda_iI)^{t-1}))$
$=2\rm{dim}(\rm{Ker}((\Phi-\lambda_iI)^{t}))-\rm{dim}(\rm{Ker}((\Phi-\lambda_iI)^{t+1}))-\rm{dim}(\rm{Ker}((\Phi-\lambda_iI)^{t-1}))$
$=2\rm{dim}(\rm{dim}(V)-\rm{Im}((\Phi-\lambda_iI)^{t}))-(\rm{dim}(V)-\rm{dim}(\rm{Im}((\Phi-\lambda_iI)^{t+1})))-(\rm{dim}(V)-\rm{dim}(\rm{Im}((\Phi-\lambda_iI)^{t-1})))$
$=\rm{dim}(\rm{Im}((\Phi-\lambda_iI)^{t+1}))+\rm{dim}(\rm{Im}((\Phi-\lambda_iI)^{t-1}))-2\rm{dim}(\rm{Im}((\Phi-\lambda_iI)^{t}))$
$=\rm{rank}((\Phi-\lambda_iI)^{t+1})+\rm{rank}((\Phi-\lambda_iI)^{t-1})-2\rm{rank}((\Phi-\lambda_iI)^{t})$
