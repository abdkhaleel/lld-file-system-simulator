## Q3 - File System Simulator

**Scenario:**
Simulate a file system where directories can contain both files and sub-directories (a tree structure). The system must support traversing entries, performing operations across the entire tree uniformly, and scanning/searching entries using custom conditions.

**Requirements:**
- Define a `FileSystemEntry` interface with methods: `getName()`, `getSize()`, `display(int indent)`.
- Create a `File` class implementing `FileSystemEntry`. It holds a name and size.
- Create a `Directory` class implementing `FileSystemEntry`. It holds a list of `FileSystemEntry` children. Its `getSize()` recursively sums the size of all children. Its `display()` prints itself and all children with proper indentation.
- Define a `FileSystemIterator` that implements Java's `Iterator<FileSystemEntry>` interface. It must support flat (breadth-first) traversal of the entire tree so callers can use a standard `while(iterator.hasNext())` loop without knowing the tree structure.
- Define a `FileSystemVisitor` interface with `visitFile(File f)` and `visitDirectory(Directory d)`. Implement `SizeCalculatorVisitor` that totals up sizes across the tree, and `SearchVisitor` that collects all entries matching a given name pattern. Each `FileSystemEntry` must implement `accept(FileSystemVisitor visitor)`.
- Implement a `FileFilter` interface with a single method `matches(FileSystemEntry entry): boolean`. Create `SizeFilter`, `ExtensionFilter`, and `HiddenFileFilter`. Create a `FileFilterChain` class that holds a list of filters and returns entries that pass all filters when `applyFilters(List<FileSystemEntry> entries)` is called.

**Patterns Used:**
`Composite` · `Iterator` · `Visitor` · `Filter`