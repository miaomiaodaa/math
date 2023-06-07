**内容**    
形如 $f=\overline{y_1}\cdot y_1+\overline{y_2}\cdot y_2+\cdots+\overline{y_p}\cdot y_p    
-\overline{y_{p+1}}\cdot y_{p+1}-\overline{y_{p+2}}\cdot y_{p+2}-\cdots-\overline{y_r}\cdot y_r$ 的 $\rm{Hermite}$ 型称为规范标准型    
    
**化简过程**    
 $f(x_1,x_2,\cdots,x_n)=\sum\limits_{j=1}^n\sum\limits_{i=1}^na_{ij}\cdot\overline{x_i}\cdot x_j$     
 $\xrightarrow{对角化}g(y_1,y_2,\cdots,y_n)=d_1\cdot\overline{y_1}\cdot y_1+d_2\cdot\overline{y_2}\cdot y_2+\cdots+d_p\cdot\overline{y_p}\cdot y_p    
-d_{p+1}\cdot\overline{y_{p+1}}\cdot y_{p+1}-d_{p+2}\cdot\overline{y_{p+2}}\cdot y_{p+2}-\cdots-d_r\cdot\overline{y_r}\cdot y_r$     
    
继续化简    
设 $d_1,d_2,\cdots,d_p>0$ ， $d_{p+1},d_{p+2},\cdots,d_r<0$     
    
令  $\begin{cases}    
z_i=\sqrt{d_i}\cdot y_i,&1\le i\le p\\\    
z_j=\sqrt{-d_j}\cdot y_j,&p+1\le i\le r\\\    
z_k=y_k,&r+1\le k\le n    
\end{cases}$     
    
 $\Rightarrow h=\overline{z_1}\cdot z_1+\overline{z_2}\cdot z_2+\cdots+\overline{z_p}\cdot z_p    
-\overline{z_{p+1}}\cdot z_{p+1}-\overline{z_{p+2}}\cdot z_{p+2}-\cdots-\overline{z_r}\cdot z_r$     
    
 $A\xrightarrow{共轭对称初等变换}\Lambda\xrightarrow{通过如下变换}\rm{diag}\{1,\cdots,1,-1,\cdots,-1,0,\cdots,0\}$     
    
**复相合规范标准型**    
 $\rm{diag}\{I_p,-I_q,O\}$     
