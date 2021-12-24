/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commandpattern;
/**
 *
 * @author shah
 */

    


public class CloseFileCommand implements Command{
	FileSystemReciever reciever;
	

	public CloseFileCommand(FileSystemReciever reciever) {
		this.reciever = reciever;
	}


	public void execute() {
		reciever.closeFile();
		
	}

	
	public void undo() {
		reciever.openFile();
		
	}
	

}

