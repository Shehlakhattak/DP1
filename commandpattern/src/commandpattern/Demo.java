/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commandpattern;

/**
 *
 * @author shah
 */

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



public class Demo {
	public static void main(String[] args) {

        
		FileSystemReciever reciever;
		String osName = System.getProperty("os.name").toLowerCase();
		System.out.println(osName);
		if(osName.contains("windows")){
			reciever = new WindowsFileSystemReciever();
		}
		else {
			reciever = new UnixFileSystemReciever();
		}
		Command cmd = new OpenFileCommand(reciever);
            do{
		FileInvoker invoker = new FileInvoker(cmd);
		invoker.execute();
		
		invoker.undo();
		
		cmd = new CloseFileCommand(reciever);
		invoker = new FileInvoker(cmd);
		invoker.execute();
		
		invoker.undo();

                cmd = new WriteFileCommand(receiver);
                invoker = new FileInvoker(cmd);
                invoker.execute();

                invoker.undo();

                }
            while(invoker.isExecuted);
  
	}
}
