**举例**  
设 $V=\mathbb{R}^3$ ， $a_1=(3,0,4),\ a_2=(-1,0,7),\ a_3=(2,9,11)$  
求 $(a_1,a_2,a_3)$ 的标准正交基  
  
解  
正交化  
$b_1=a_1=(3,0,4)$  
  
$b_2=a_2-\dfrac{(a_2,b_1)}{\Vert b_1\Vert^2}\cdot b_1=(-1,0,7)-\dfrac{(-1,0,7)\cdot(3,0,4)}{\Vert (3,0,4)\Vert^2}\cdot(3,0,4)$  
  
$\quad=(-4,0,3)$  
  
$b_3=a_3-\dfrac{(a_3,b_2)}{\Vert b_2\Vert^2}\cdot b_2-\dfrac{(a_3,b_1)}{\Vert b_1\Vert^2}\cdot b_1$  
  
$\quad=(2,9,11)-\dfrac{(2,9,11)\cdot(-4,0,3)}{\Vert(-4,0,3)\Vert^2}\cdot(-4,0,3)-\dfrac{(2,9,11)\cdot(3,0,4)}{\Vert(3,0,4)\Vert^2}\cdot(3,0,4)$  
  
$\quad=(0,9,0)$  
  
单位化  
$c_1=\dfrac{b_1}{\Vert b_1\Vert}=\dfrac{(3,0,4)}{\Vert(3,0,4)\Vert}=\dfrac15(3,0,4)$  
  
$c_2=\dfrac{b_2}{\Vert b_2\Vert}=\dfrac{(-4,0,3)}{\Vert(-4,0,3)\Vert}=\dfrac15(-4,0,3)$  
  
$c_3=\dfrac{b_3}{\Vert b_3\Vert}=\dfrac{(0,9,0)}{\Vert(0,9,0)\Vert}=(0,1,0)$  
