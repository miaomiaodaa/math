$\epsilon-N$  
  
  
<font color=blue>Step1: 点态收敛</font>  
$\,f_n(x)=x^n|x|<1\,f_n(x)=x^n,\;f(x)=\lim\limits_{n\to\infty}f_n(x)=\begin{cases}0,&|x|<1\\\ 1,&x=1\end{cases}$  
  
$\forall\;|x|<1,\;\forall\;\epsilon>0(<1),\;\exists\;N\left(=\dfrac{\ln\epsilon}{\ln|x|}\right),\;n>N,\;|\,f_n(x)-f(x)<\epsilon$  
  
$\iff n>N=\dfrac{\ln\epsilon}{\ln|x|},\;|x|\to1,\;N\nearrow$  
  
$\iff n\ln|x|<\ln\epsilon$  
  
$\iff|x|^n<\epsilon$  
  
$\iff|x^n-0|<\epsilon$  
  
$\iff|\,f_n(x)-f(x)|<\epsilon          x=0,1             \,f_n(x)\equiv0,1$  
  
$\forall\;\epsilon>0,\;\exists\;N>0,\;n>N,\;|1-1|<\epsilon$  
  
$\forall\;\epsilon>0,\;\exists\;N>0,\;n>N,\;|0-0|<\epsilon$  
  
$x=-1$  
  
  
奇数列≠偶数列，所以发散 \,f_n(x)=\pm1  
$|x|>1             \forall\;|x|>1,\;\forall\;M>0,\;\exists\;N\left(=\dfrac{\ln M}{\ln|x|}\right),\;n>N,\;|x^n|>M$  
  
$\iff\forall\;|x|>1,\;\forall\;M>0,\;\exists\;N\left(=\dfrac{\ln M}{\ln|x|}\right),\;n>N,\;|x|^n>M$  
  
$|x|^n>M\;(M>1)$  
  
$\iff n\ln|x|>ln M$  
  
$\iff n>\dfrac{\ln M}{\ln|x|}$  
  
  
<font color=blue>Step2: 一致收敛</font>  
$\,f_n(x)=\dfrac{x}{1+n^2x^2},\;x\in R          \,f(x)=\lim\limits_{n\to\infty}f_n(x)=\lim\limits_{n\to\infty}\dfrac{x}{1+n^2x^2}=0$  
  
$\Rightarrow f(x)=0,\;x\in R          |\,f_n(x)-0|=\dfrac{|x|}{1+n^2x^2}=\dfrac1{2n}\cdot\dfrac{2n|x|}{1+n^2x^2}\leq\dfrac1{2n}<\epsilon$  
  
$\Rightarrow n>\dfrac1{2\epsilon}\quad\left[(1-nx)^2=1-2nx+n^2x^2\geq0\right]$  
  
$\Rightarrow\forall\;\epsilon>0,\;\exists\;N\left(=\left[\dfrac1{2\epsilon}\right]\right)>0,\;n>N,\;|\,f_n(x)-0|<\epsilon$  
  
  
<font color=blue>Step3: 内闭一致收敛</font>  
$\,f_n(x)=x^n,\;x\in[0,\rho],\;\rho<1          \lim\limits_{n\to\infty}f_n(x)=\lim\limits_{n\to\infty}x^n=0$  
  
$\Rightarrow f(x)=0          x\in[0,\rho],\;0<\rho<1$  
  
$\Rightarrow x<\rho<1$  
  
$\Rightarrow \ln x<\ln\rho$  
  
$\Rightarrow \dfrac1{\ln x}>\dfrac1{\ln\rho}$  
  
$\Rightarrow \dfrac{\ln\epsilon}{\ln x}<\dfrac{\ln\epsilon}{\ln\rho}=N$  
  
$\Rightarrow\forall\;\epsilon>0,\;\exists\;N>0,\;n>N,\;|x^n-0|<\epsilon$  
  
  
