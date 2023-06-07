**内容**    
设 $\rm{J}=\rm{diag}\{J_{r_1}(\lambda_1),J_{r_2}(\lambda_2),\cdots,J_{r_k}(\lambda_k)\}$     
则 $\rm{J}$ 的初等因子组为 $(\lambda-\lambda_1)^{r_1}, (\lambda-\lambda_2)^{r_2}, \cdots, (\lambda-\lambda_k)^{r_k}$     
其中 $\forall\ 1\le i\le k,\ J_{r_i}(\lambda_i)$ 是 $\rm{Jordan}$ 块    
    
**证明**    
 $\rm{J}=\rm{diag}\{J_{r_1}(\lambda_1),J_{r_2}(\lambda_2),\cdots,J_{r_k}(\lambda_k)\}$     
    
 $\Rightarrow\lambda I-\rm{J}=\begin{bmatrix}    
\lambda I_{r_1}-J_{r_1}(\lambda_1)\\\     
&\lambda I_{r_2}-J_{r_2}(\lambda_2)\\\    
&&\ddots\\\     
&&&\lambda I_{r_k}-J_{r_k}(\lambda_k)    
\end{bmatrix}$     
    
由【 $\rm{Jordan}$ 块的初等因子】得    
 $\Rightarrow\forall\ 1\le i\le k,\ \lambda I_{r_i}-J_{r_i}(\lambda_i)\sim\rm{diag}\{1,\cdots,1,(\lambda-\lambda_i)^{r_i}\}$     
    
观察 $\lambda I-\rm{J}$ 得结构得，    
对 $\lambda I-\rm{J}$ 每个分块单独实施初等变换，不会影响到其他分块    
    
 $\Rightarrow\lambda I-\rm{J}    
\sim\rm{diag}\{\underbrace{1,\cdots,1,(\lambda-\lambda_1)^{r_1}}_{r_1},\underbrace{1,\cdots,1,(\lambda-\lambda_2)^{r_2}}_{r_2},\cdots,\underbrace{1,\cdots,1,(\lambda-\lambda_k)^{r_k}}_{r_k}\}$     
    
由【引理-未命名001】得    
 $\Rightarrow\lambda I-\rm{J}$ 的法式为 $\rm{diag}\{\underbrace{1,\cdots,1}_{r_1+r_2+\cdots+r_k-k},(\lambda-\lambda_1)^{r_1},(\lambda-\lambda_2)^{r_2},\cdots,(\lambda-\lambda_k)^{r_k}\}$     
    
 $\Rightarrow (\lambda-\lambda_1)^{r_1},(\lambda-\lambda_2)^{r_2},\cdots,(\lambda-\lambda_k)^{r_k}$ 是 $A$ 的初等因子    
    
或者由【引理2-初等因子的简便求法】得    
 $\Rightarrow (\lambda-\lambda_1)^{r_1},(\lambda-\lambda_2)^{r_2},\cdots,(\lambda-\lambda_k)^{r_k}$ 是 $A$ 的初等因子    
    
**辅助**    
 $A=\left[\begin{array}{cc:ccc:cccc}    
\lambda_1&1\\\    
&\lambda_1\\\hdashline    
&&\lambda_2&1\\\    
&&&\lambda_2&1\\\    
&&&&\lambda_2\\\hdashline    
&&&&&\lambda_3&1\\\    
&&&&&&\lambda_3&1\\\    
&&&&&&&\lambda_3&1\\\    
&&&&&&&&\lambda_3    
\end{array}\right]$     
    
 $\Rightarrow\lambda I-A=\left[\begin{array}{cc:ccc:cccc}    
\lambda-\lambda_1&-1\\\    
&\lambda-\lambda_1\\\hdashline    
&&\lambda-\lambda_2&-1\\\    
&&&\lambda-\lambda_2&-1\\\    
&&&&\lambda-\lambda_2\\\hdashline    
&&&&&\lambda-\lambda_3&-1\\\    
&&&&&&\lambda-\lambda_3&-1\\\    
&&&&&&&\lambda-\lambda_3&-1\\\    
&&&&&&&&\lambda-\lambda_3    
\end{array}\right]$     
