package com.infybuzz.listener;

import java.io.File;
import java.io.FileWriter;

import org.springframework.batch.core.SkipListener;
import org.springframework.batch.item.file.FlatFileParseException;
import org.springframework.stereotype.Component;

import com.infybuzz.model.StudentCsv;
import com.infybuzz.model.StudentJson;

@Component
public class SkipListenerImpl implements SkipListener<StudentCsv, StudentJson> {

	@Override
	public void onSkipInRead(Throwable t) {
		if(t instanceof FlatFileParseException) {
			createFile("C:\\Users\\Pichau\\git\\spring-batch\\spring-batch\\Chunk Job\\first chunk Step\\reader\\skipInRead.txt",
					((FlatFileParseException) t).getInput());
		}
	}

	@Override
	public void onSkipInWrite(StudentJson item, Throwable t) {
		createFile("C:\\Users\\Pichau\\git\\spring-batch\\spring-batch\\Chunk Job\\first chunk Step\\writer\\skipInWrite.txt",
				item.toString());		
	}

	@Override
	public void onSkipInProcess(StudentCsv item, Throwable t) {
		createFile("C:\\Users\\Pichau\\git\\spring-batch\\spring-batch\\Chunk Job\\first chunk Step\\processor\\skipInProcessor.txt",
				item.toString());
		
	}
	public void createFile(String filePath, String data) {
		try(FileWriter fileWriter = new FileWriter(new File(filePath),true)) {
			fileWriter.write(data + "\n");
		}catch(Exception e) {
			
		}
	}
}
