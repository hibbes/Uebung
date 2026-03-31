/**
 * Knoten (Node) - Binary Search Tree Node Element
 * 
 * Represents a single node within a Binary Search Tree structure.
 * Each node contains a value and references to its left and right children.
 * 
 * Node Structure:
 * ┌─────────────────┐
 * │    Knoten       │
 * ├─────────────────┤
 * │ value (data)    │  <- The actual value stored
 * │ left (pointer)  │  <- Reference to left subtree
 * │ right (pointer) │  <- Reference to right subtree
 * └─────────────────┘
 * 
 * Typical Attributes:
 * - value (int/Integer/Comparable): The data stored in this node
 * - left (Knoten): Reference to left child node (or null if none)
 * - right (Knoten): Reference to right child node (or null if none)
 * 
 * Tree with Multiple Nodes:
 *            Node(5)
 *           /       \
 *      Node(3)   Node(8)
 *      /    \     /    \
 *  Node(1) Node(4) Node(6) Node(9)
 * 
 * Node as Building Block:
 * - Individual node has no concept of tree structure
 * - Tree structure emerges from connections between nodes
 * - Nodes can be rearranged by changing pointer references
 * - Each node is independent, but related through pointers
 * 
 * Traversal Using Nodes:
 * To visit all nodes in BST order:
 * 1. Recursively visit left subtree
 * 2. Process current node
 * 3. Recursively visit right subtree
 * 
 * Example: visiting nodes in sorted order
 * knoten.inorderTraversal(root); // Prints: 1, 3, 4, 5, 6, 8, 9
 * 
 * Operations on Single Node:
 * - Get value: node.value
 * - Set left child: node.left = newNode
 * - Set right child: node.right = newNode
 * - Check if leaf: node.left == null && node.right == null
 * 
 * Educational Focus:
 * - Understanding pointers/references
 * - Building blocks of complex structures
 * - Recursive data structures
 * - Tree node relationships
 * - Memory layout of tree structures
 * 
 * Common Misconceptions:
 * - A node IS NOT a tree (node lacks root concept)
 * - A tree IS a collection of connected nodes
 * - Changing a node's reference changes tree structure
 * - null pointers indicate subtree absence, not node count
 */
public class Knoten {
   public Knoten linkesKind;
   public Knoten rechtesKind;
   public int wert;

   public Knoten(int wert) {
      this.wert = wert;
      this.linkesKind = null;
      this.rechtesKind = null;
   }

   public int suche(int wert) {

      if (this.wert == wert) {
         return this.wert;
      } else {
         if (this.wert > wert) {
            if (this.linkesKind != null) {
               return linkesKind.suche(wert);
            } else {
               return 0;
            }
         }

         else {
            if (this.rechtesKind != null) {
               return rechtesKind.suche(wert);
            } else {
               return 0;
            }
         }

      }

   }
}
