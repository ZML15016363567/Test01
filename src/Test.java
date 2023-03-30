import java.io.File;
public class Test {
    public static void main(String[] args) {
//       创建文件对象
        File file = new File("b/testb.txt");
//       获取文件名
        System.out.println("文件名:"+file.getName());
//        获取绝对路径
        System.out.println("绝对路径:"+file.getAbsolutePath());
//        获取父目录名
        System.out.println("父目录名:"+file.getParent());
//         获取相对路径
        System.out.println("相对路径:"+file.getPath());

    }
}

