package iterator;
import filesystem.FileSystemEntry;
public interface Iterator<FileSystemEntry> {
	boolean hasNext();
	FileSystemEntry next();
}
