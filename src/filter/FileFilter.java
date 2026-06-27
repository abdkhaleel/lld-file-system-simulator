package filter;

import filesystem.FileSystemEntry;

public interface FileFilter {
	boolean matches(FileSystemEntry entry);
}
