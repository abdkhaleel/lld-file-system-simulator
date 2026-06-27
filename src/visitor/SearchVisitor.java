package visitor;

import filesystem.*;
import java.util.*;

public class SearchVisitor implements FileSystemVisitor {
	private String pattern;
	private List<FileSystemEntry> matches;
	
	public SearchVisitor(String pattern) {
		this.pattern = pattern;
		matches = new ArrayList<>();
	}
	
	public List<FileSystemEntry> getMatches(){
		return this.matches;
	}

	@Override
	public void visitFile(File file) {
		// TODO Auto-generated method stub
		String fileName = file.getName();
		if(fileName.contains(pattern)) {
			matches.add(file);
		}
		
	}

	@Override
	public void visitDirectory(Directory directory) {
		// TODO Auto-generated method stub
		String directoryName = directory.getName();
		if(directoryName.contains(pattern)) {
			matches.add(directory);
		}
		
	}

}
