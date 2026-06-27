package iterator;

import filesystem.FileSystemEntry;

public interface IterableCollection<FileSystemEntry> {
	Iterator<FileSystemEntry> careateIterator();
	void add(FileSystemEntry fileSystemEntry);
}
