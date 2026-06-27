package iterator;

import filesystem.FileSystemEntry;
import java.util.*;

public class FileSystemIterator implements Iterator<FileSystemEntry> {
	
	private List<FileSystemEntry> fileSystemEntryList;
	private int position = 0;
	
	public FileSystemIterator(List<FileSystemEntry> fileSystemEntryList) {
		this.fileSystemEntryList = fileSystemEntryList;
	}

	@Override
	public boolean hasNext() {
		return position < fileSystemEntryList.size();
	}

	@Override
	public FileSystemEntry next() {
		return (FileSystemEntry)fileSystemEntryList.get(position++);
	}
	
}
