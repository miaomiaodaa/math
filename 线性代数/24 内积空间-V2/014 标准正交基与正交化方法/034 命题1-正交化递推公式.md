**举例**  
<font color=red> $b_{k+1}=a_{k+1}-\sum\limits_{i=1}^k\dfrac{(a_{k+1},b_i)}{\Vert b_i\Vert^2}\cdot b_i$ </font>  
  
 $\begin{array}{l}  
&a_1=b_1\\\  
k=1&b_2=a_2-\dfrac{(a_2,b_1)}{\Vert b_1\Vert^2}\cdot b_1=a_2-\dfrac{(a_2,a_1)}{\Vert a_1\Vert^2}\cdot a_1\\\  
&\\\  
k=2&b_3=a_3-\sum\limits_{i=1}^2\dfrac{(a_3,b_i)}{\Vert b_i\Vert^2}\cdot b_i\\\  
&\\\  
&\quad=a_3-\dfrac{(a_3,b_1)}{\Vert b_1\Vert^2}\cdot b_1-\dfrac{(a_3,b_2)}{\Vert b_2\Vert^2}\cdot b_2\\\  
&\\\  
k=3&b_4=a_4-\sum\limits_{i=1}^3\dfrac{(a_4,b_i)}{\Vert b_i\Vert^2}\cdot b_i\\\  
&\\\  
&\quad=a_4-\dfrac{(a_4,b_1)}{\Vert b_1\Vert^2}\cdot b_1-\dfrac{(a_4,b_2)}{\Vert b_2\Vert^2}\cdot b_2-\dfrac{(a_4,b_3)}{\Vert b_3\Vert^2}\cdot b_3  
\end{array}$  
  
这是个递推公式  
