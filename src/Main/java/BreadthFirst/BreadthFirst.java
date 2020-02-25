package BreadthFirst;

import Tree.Node;

public class BreadthFirst {
        Node root;
        public BreadthFirst()
        {
            root = null;
        }
        int height(Node root) {
            if (root == null)
                return 0;
            else {
                int lheight = height(root.left);
                int rheight = height(root.right);
                if (lheight > rheight)
                    return(lheight+1);
                else return(rheight+1);
            }
        }
        void printGivenLevel (Node root ,int level)
        {
            if (root == null)
                return;
            if (level == 1);
            else if (level > 1)
            {
            }
        }


}
