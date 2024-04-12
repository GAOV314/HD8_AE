/**
 * Represents a node in a tree structure.
 *
 * @author moises.alonso
 * @param <P> The type of the priority of the node.
 * @param <V> The type of the value stored in the node.
 */
public class TreeNode<P, V> {

    private P _priority;
    private V _value;
    TreeNode<P, V> _parent;
    TreeNode<P, V> _left;
    TreeNode<P, V> _right;

    /**
     * Constructs a TreeNode with the specified priority and value.
     *
     * @param priority The priority of the node.
     * @param value The value stored in the node.
     */
    public TreeNode(P priority, V value) {
        set_priority(priority);
        set_value(value);
        set_parent(null);
        set_left(null);
        set_right(null);
    }

    /**
     * Retrieves the priority of the node.
     *
     * @return The priority of the node.
     */
    public P get_priority() {
        return _priority;
    }

    /**
     * Sets the priority of the node.
     *
     * @param _priority The priority to be set for the node.
     */
    public void set_priority(P _priority) {
        this._priority = _priority;
    }

    /**
     * Retrieves the value stored in the node.
     *
     * @return The value stored in the node.
     */
    public V get_value() {
        return _value;
    }

    /**
     * Sets the value stored in the node.
     *
     * @param _value The value to be stored in the node.
     */
    public void set_value(V _value) {
        this._value = _value;
    }

    /**
     * Retrieves the parent node of the current node.
     *
     * @return The parent node of the current node.
     */
    public TreeNode<P, V> get_parent() {
        return _parent;
    }

    /**
     * Sets the parent node of the current node.
     *
     * @param _parent The parent node to be set for the current node.
     */
    public void set_parent(TreeNode<P, V> _parent) {
        this._parent = _parent;
    }

    /**
     * Retrieves the left child node of the current node.
     *
     * @return The left child node of the current node.
     */
    public TreeNode<P, V> get_left() {
        return _left;
    }

    /**
     * Sets the left child node of the current node.
     *
     * @param _left The left child node to be set for the current node.
     */
    public void set_left(TreeNode<P, V> _left) {
        this._left = _left;
    }

    /**
     * Retrieves the right child node of the current node.
     *
     * @return The right child node of the current node.
     */
    public TreeNode<P, V> get_right() {
        return _right;
    }

    /**
     * Sets the right child node of the current node.
     *
     * @param _right The right child node to be set for the current node.
     */
    public void set_right(TreeNode<P, V> _right) {
        this._right = _right;
    }
}
