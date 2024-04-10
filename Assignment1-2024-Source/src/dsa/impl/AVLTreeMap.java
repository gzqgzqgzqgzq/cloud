package dsa.impl;

import dsa.iface.IEntry;
import dsa.iface.IPosition;
import dsa.iface.ISortedMap;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AVLTreeMap<K extends Comparable<K>,V> extends BinarySearchTreeMap<K,V> implements ISortedMap<K,V> {

   public AVLTreeMap() {
      super();
   }

   @Override
   public V get(K k) {
      return null; // <-- REMOVE: this is here just so that the class will compile.
   }

   @Override
   public V put(K k, V v) {
      return null; // <-- REMOVE: this is here just so that the class will compile.
   }

   @Override
   public V remove(K k) {
      return null; // <-- REMOVE: this is here just so that the class will compile.
   }


   // YOU SHOULD NEED TO ENTER ANYTHING BELOW THIS

   /**
    * Define a subclass of BTPosition so that we can also store the height
    *    of each position in its object.
    *
    * This will be more efficient than calculating the height every time
    *    we need it, but we will need to update heights whenever we change
    *    the structure of the tree.
    */
   class AVLPosition extends AbstractBinaryTree<IEntry<K,V>>.BTPosition {
      // store the height of this position, so that we can test for balance
      public int height = 0;

      /**
       * Constructor - create a new AVL node
       * @param element The element to store in the node.
       * @param parent The parent node of this node (or {@code null} if this is the root)
       */
      AVLPosition( IEntry<K,V> element, AbstractBinaryTree.BTPosition parent ) {
         super( element, parent );
      }
   }

   @Override
   protected AbstractBinaryTree<IEntry<K,V>>.BTPosition newPosition(IEntry<K,V> element, AbstractBinaryTree<IEntry<K,V>>.BTPosition parent) {
      return new AVLPosition(element, parent);
   }
}
