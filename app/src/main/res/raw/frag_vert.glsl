uniform mat4 u_MVPMatrix;    //变换矩阵
uniform float u_MoveDistance;  //位移距离
uniform float u_MoveMaxDistance; //最大位移距离
attribute vec4 a_Position;   //顶点坐标
attribute vec2 a_TexCoordinate; //纹理坐标

varying vec2 v_TexCoordinate;


void main() 
{
   //传递纹理坐标的值到纹理着色器
   v_TexCoordinate = a_TexCoordinate;
    
   vec4 finalPosition = a_Position;
   //碎片随机左移或者右移
   finalPosition.x = finalPosition.x + (finalPosition.z - 0.5) * 0.2 * u_MoveMaxDistance;
   //碎片随机加速
   finalPosition.y = finalPosition.y + u_MoveDistance + finalPosition.z * 0.1 * u_MoveMaxDistance;
   
   gl_Position = u_MVPMatrix * finalPosition;
}