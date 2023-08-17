# MvvmRecipeApp

### 注解：
@Preview：它用于预览函数<br>
注意：该注解必须用于不接受参数的可组合函数<br>

### 布局：
Colum：可让您垂直排列元素，相当于LinearLayout设置了android:orientation="vertical",但是不能滚动<br>
Row：可让您水平排列元素，相当于LinearLayout设置了android:orientation="horizontal",但是不能滚动<br>
Surface：用于装饰其他组件的组件，可以用于添加阴影、边框和背景色等效果<br>
Box：它就是一个盒子,通过修饰符设置大小，背景等<br>
Spacer：间隔符，用于设置一个空白的位置<br>


### 修饰符：
**https://developer.android.com/jetpack/compose/modifiers-list?hl=zh-cn</br>**
size：设置组件的实际大小<br>
align：设置其对齐方式<br>
1. 在一个Column列表中，子元素只能水平对齐
2. 在一个Row行表中，子元素只能垂直对齐
border：设置边框<br>
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


### 存储可变状态
remember：用于在组件中存储可变状态。<br>
mutableStateOf：用于创建一个可变状态。它返回一个包含可变状态的对象，可以在组件中使用。当可变状态的值发生变化时，Compose 会自动触发重组过程，重新计算组件的布局和绘制<br>
mutableStateListOf：用于创建一个可变的列表。它返回一个包含可变列表的对象，可以在组件中使用。当列表的内容发生变化时，Compose 会自动触发重组过程，重新计算组件的布局和绘制<br>

