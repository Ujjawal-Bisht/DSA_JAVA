1) Use inorder traversal.
2) Create dummy node and return dummy.right ;
3) Keep current pointer to traverse the dummy tree.

``` traverse the root Node -> create new Nodes for each node of tree -> attach each node to dummy tree. ```

inorder_traversal()
```
Solve(root) ;
// attach each new Node at the ans tree ;
Solve(root) ;
```

Always check: 
- whether the root is null or not.
- if root.left or root.right are null or not.
- Avoid nullPointerException
