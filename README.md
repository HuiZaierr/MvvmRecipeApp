# MvvmRecipeApp

### 注解：
@Preview：它用于预览函数<br>
注意：该注解必须用于不接受参数的可组合函数<br>

### 布局：
Colum：可让您垂直排列元素，相当于LinearLayout设置了android:orientation="vertical",但是不能滚动<br>
Row：可让您水平排列元素，相当于LinearLayout设置了android:orientation="horizontal",但是不能滚动<br>
Spacer：间隔符


### 修饰符：
size：设置组件的实际大小<br>
align：设置其对齐方式<br>
requiredSize：设置组件所需的最小尺寸<br>
padding：设置组件周围留出空间（padding 修饰符应用在 clickable后面否则无效）<br>
paddingFromBaseline：可在基线的上下添加padding<br>
offset：设置组件相对于其容易左上角偏移。可设置X和Y<br>
fillMaxSize：组件的大小设置为其容器的最大尺寸（最大宽度和最大高度）<br>
fillMaxWidth：设置最简最大宽度<br>
fillMaxWidth：设置最简最大高度<br>
matchParentSize：只能用于Spacer中，使某个子项与父项 Box 同样大<br>
height：设置高度<br>
width：设置宽度<br>
weight：设置权重，单位为float，只能用于Row中<br>
clip(CircleShape)：将图像剪辑成圆形<br>
clickable：设置点击<br>
