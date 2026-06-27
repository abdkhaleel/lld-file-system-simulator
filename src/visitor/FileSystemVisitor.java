package visitor;

import filesystem.*;

public interface FileSystemVisitor {
	void visitFile(File file);
	void visitDirectory(Directory directory);
}
