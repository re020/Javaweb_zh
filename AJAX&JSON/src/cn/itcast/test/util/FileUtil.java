package cn.itcast.test.util;

import java.io.*;


public class FileUtil {
    //public static void main(String[] args) throws Exception {

    /**
     *
     * @param dir
     * @param file
     * @throws Exception
     */
    public static void dirtory(File dir,File file)throws Exception{

       /* File file = new File("");
        File dir = new File("db");*/
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dir));

        int len;
        if (file.exists()) {
            while ((len = bis.read()) != -1) {
                bos.write(len);
            }
            bis.close();
            bos.close();
        } else if (file.isDirectory()){//在目标位置创建目录
            File dest = new File(dir,file.getName());
            dest.mkdir();
        }
    }

    /**
     * 使用字符缓冲流对象读取文件内容并转成字符串返回
     * @param filePath
     * @return
     * @throws IOException
     */
    public static String readByBuffered(String filePath) throws IOException {
        StringBuilder sb = new StringBuilder();
        //使用ClassLoader加载资源，路径从src下开始，db/db_user.txt
               filePath = FileUtil.class.getClassLoader().getResource(filePath).getFile();
        //String FilePath = FileUtil.class.getClassLoader().getResource(filePath).getFile();

        File file = new File(filePath);
        if (file.exists()){
            BufferedReader br = new BufferedReader(new FileReader(file));
            String str = br.readLine();//按行读取
            while (str!=null){
                sb.append(str);
                str = br.readLine();
            }
            br.close();
            return sb.toString();
        }
        return null;
    }

    /**
     * 将字符串数据写入指定的文件，写入时会清空原文件的内容
     * @param data
     * @param destFilePath
     * @throws IOException
     */
    public static void writeByBuffered(String data, String destFilePath) throws IOException{
        File destFile = new File(destFilePath);
        if (destFile.exists()){
            BufferedWriter bw = new BufferedWriter(new FileWriter(destFile));
            bw.write(data);

            bw.close();

        }
    }

}
