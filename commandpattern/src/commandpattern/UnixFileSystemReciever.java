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

    



public class UnixFileSystemReciever implements FileSystemReciever{

	
	public void openFile() {
		System.out.println("File is opened by Unix OS");
		
	}

	
	public void closeFile() {
		System.out.println("File is closed by Unix OS");
		
	}


	public void writeFile() {
		System.out.println("File is written by Unix OS");
		
	}


}
