package iterator;

import java.util.*;
import filesystem.FileSystemEntry;

public class FileSystemCollection implements IterableCollection<FileSystemEntry> {
	
	private List<FileSystemEntry> fileSystemEntryList;
	
	public FileSystemCollection() {
		this.fileSystemEntryList = new ArrayList<>();
	}
	
	public void add(FileSystemEntry fileSystemEntry) {
		fileSystemEntryList.add(fileSystemEntry);
	}

	@Override
	public Iterator<FileSystemEntry> careateIterator() {
		return new FileSystemIterator(fileSystemEntryList);
	}

}
