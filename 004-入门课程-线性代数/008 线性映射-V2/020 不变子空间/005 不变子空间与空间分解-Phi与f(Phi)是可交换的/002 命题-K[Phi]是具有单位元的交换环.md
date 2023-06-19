**内容**  
 $F[\Phi]$ 是具有单位元的交换环  
  
**简单证明**  
 $F[\Phi]\subset\rm{Hom}(V)$  
  
 $\rm{Hom}(V)$ 是环  
  
 $F[\Phi]$ 对减法与乘法封闭  
  
所以 $F[\Phi]$ 是 $\rm{Hom}(V)$ 的子环  
  
**证明**  
定义加法，并且证明加法是封闭的  
  
 $f(\Phi)+g(\Phi)\in F[\Phi]$  
  
---  
  
定义乘法，并且证明乘法是封闭的  
  
 $f(\Phi)\cdot g(\Phi)\in F[\Phi]$  
  
---  
  
证明加法满足以下运算性质 (感觉是一元多项式环的通用性)  
  
加法结合律: $[f(\Phi)+g(\Phi)]+h(\Phi)=f(\Phi)+[g(\Phi)+h(\Phi)]$  
  
加法交换律: $f(\Phi)+g(\Phi)=g(\Phi)+f(\Phi)$  
  
加法零元: $f(\Phi)+0(\Phi)=0(\Phi)=f(\Phi)$  
  
加法负元: $f(\Phi)-f(\Phi)=0(\Phi)$  
  
---  
  
证明乘法满足以下运算性质 (感觉是一元多项式环的通用性)  
  
乘法结合律: $[f(\Phi)\cdot g(\Phi)]\cdot h(\Phi)=f(\Phi)\cdot [g(\Phi)\cdot h(\Phi)]$  
  
乘法左分配律: $[f(\Phi)+g(\Phi)]\cdot h(\Phi)=f(\Phi)\cdot h(\Phi)+g(\Phi)\cdot h(\Phi)$  
  
乘法右分配律: $h(\Phi)\cdot [f(\Phi)+g(\Phi)]=h(\Phi)\cdot f(\Phi)+h(\Phi)\cdot g(\Phi)$  
  
乘法交换律: $f(\Phi)\cdot g(\Phi)=g(\Phi)\cdot f(\Phi)$  
  
---  
  
所以 $F[\Phi]$ 是域 $F$ 上的环，也是 $\rm{Hom}(V)$ 的子环  
  
注意到 $I_V$ 是环的单位元，且乘法满足交换律  
  
即 $f(\Phi)\cdot I_V=I_V\cdot f(\Phi)=f(\Phi)$  
  
所以 $F[\Phi]$ 是域 $F$ 上具有单位元的交换环  
