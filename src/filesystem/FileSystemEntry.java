package filesystem;

import visitor.FileSystemVisitor;

public interface FileSystemEntry {
	String getName();
	int getSize();
	void display(int indent);
	void accept(FileSystemVisitor visitor);
}
