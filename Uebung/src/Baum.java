/**
 * Baum (Tree) - Binary Search Tree (BST) Data Structure
 * 
 * A Binary Search Tree is a hierarchical data structure that maintains
 * sorted data while allowing efficient searching, insertion, and deletion.
 * 
 * BST Properties:
 * - Every node has at most two children (left and right)
 * - For each node: all values in left subtree < node value
 * - For each node: all values in right subtree > node value
 * - These properties hold recursively for all subtrees
 * 
 * Tree Structure Example:
 *          5
 *        /   \
 *       3     8
 *      / \   / \
 *     1   4 6   9
 *     
 * Properties:
 * - Root: topmost node (5 in example)
 * - Leaf: node with no children (1, 4, 6, 9)
 * - Height: longest path from root to leaf
 * - Balanced: heights of left and right subtrees differ by at most 1
 * 
 * Operations:
 * 
 * 1. SEARCH (Find element):
 *    Time: O(log n) average, O(n) worst case (unbalanced tree)
 *    Process: Compare with current node, go left if smaller, right if larger
 * 
 * 2. INSERT (Add element):
 *    Time: O(log n) average, O(n) worst case
 *    Process: Find insertion point maintaining BST property
 * 
 * 3. DELETE (Remove element):
 *    Time: O(log n) average, O(n) worst case
 *    Cases:
 *    - Leaf node: simply remove
 *    - One child: replace node with child
 *    - Two children: replace with inorder successor/predecessor
 * 
 * 4. TRAVERSALS:
 *    - Inorder: Left, Node, Right -> gives sorted output
 *    - Preorder: Node, Left, Right -> useful for tree copy
 *    - Postorder: Left, Right, Node -> useful for deletion
 *    - Level-order: visit by level
 * 
 * Time Complexity Summary:
 *                 Best/Avg    Worst Case
 * Search:         O(log n)    O(n)
 * Insert:         O(log n)    O(n)
 * Delete:         O(log n)    O(n)
 * 
 * Worst Case Unbalanced Tree (becomes linked list):
 *     1
 *      \
 *       2
 *        \
 *         3
 *          \
 *           4
 * 
 * Self-Balancing Trees:
 * - AVL Trees: Maintain balance, O(log n) guaranteed
 * - Red-Black Trees: More relaxed balancing, faster operations
 * - B-Trees: Multiple keys per node, used in databases
 * 
 * Educational Focus:
 * - Recursive data structures
 * - Tree traversal algorithms
 * - Search and insertion logic
 * - Understanding balance and complexity
 * - Real-world database implementations
 * 
 * Uses:
 * - Database indexing
 * - File systems
 * - Expression parsing
 * - Autocomplete suggestions
 */
public class Baum {
    public Knoten wurzel;

    public Baum() {
        this.wurzel = null;
    }

    public Baum(Knoten knoten) {
        this.wurzel = knoten;
    }

    public int suche(int wert) {
        return wurzel.suche(wert);
    }

    public static void main(String[] args) {
        Baum b1 = new Baum(new Knoten(5));
        b1.wurzel.linkesKind = new Knoten(3);
        b1.wurzel.linkesKind.linkesKind = new Knoten(1);
        b1.wurzel.rechtesKind = new Knoten(7);
        b1.wurzel.rechtesKind.rechtesKind = new Knoten(11);
        System.out.println(b1.suche(99));

    }
}
