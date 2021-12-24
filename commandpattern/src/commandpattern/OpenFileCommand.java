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

    


public class OpenFileCommand implements Command{
	FileSystemReciever reciever;
	

	public OpenFileCommand(FileSystemReciever reciever) {
		this.reciever = reciever;
	}

	
	public void execute() {
		reciever.openFile();
	}

	
	public void undo() {
		reciever.closeFile();
	}

}

