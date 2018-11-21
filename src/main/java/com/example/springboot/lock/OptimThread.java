package com.example.springboot.lock;

import org.apache.commons.io.filefilter.FileFileFilter;

import java.io.*;

/**
 * @author Administrator
 */
public class OptimThread extends Thread
{

    public int version;

    public String file;

    public OptimThread(String name,int version,String file){
        this.setName(name);
        this.version = version;
        this.file = file;
    }

    @Override
    public void run()
    {
        String text=read(OptimLockMain.getFile());
        System.out.println("线程"+ getName() + "，文件版本号为：" + OptimLockMain.getVersion());
        System.out.println("线程"+ getName() + "，版本号为：" + getVersion());
        if (OptimLockMain.getVersion()==getVersion())
        {
            System.out.println("线程" + getName() + "，版本号为：" + version + "，正在执行");
            // 文件操作，这里用synchronized就相当于文件锁
            // 如果是数据库，相当于表锁或者行锁
            synchronized (OptimThread.class)
            {
                if (OptimLockMain.getVersion() == this.version)
                {
                    // 写入操作
                    write(file, text);
                    // 更新文件版本号
                    OptimLockMain.updateVersion();
                    return;
                }
            }
        }
        // 3. 版本号不正确的线程，需要重新读取，重新执行
        System.out.println("线程"+ getName() + "，文件版本号为：" + OptimLockMain.getVersion());
        System.out.println("线程"+ getName() + "，版本号为：" + getVersion());
        System.err.println("线程"+ getName() + "，需要重新执行。");
    }

    public void write(String file, String text)
    {

        try
        {
            FileWriter filter=new FileWriter(file,false);
            filter.write(text+"/r/n");
            filter.flush();
            filter.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public String read(String file)
    {
        StringBuilder sb = new StringBuilder();
       try
       {
           File f=new File(file);
           if (!f.exists()){
               f.createNewFile();
           }
           FileReader fileReader=new FileReader(f);
           BufferedReader bf=new BufferedReader(fileReader);
           String line=null;
           if ((line=bf.readLine())!=null){
               sb.append(line).append("\r\n");
           }
           fileReader.close();
           bf.close();

       }catch (IOException e){
           e.printStackTrace();
       }
      return sb.toString();
    }

    private int getVersion(){
        return this.version;
    }

}
