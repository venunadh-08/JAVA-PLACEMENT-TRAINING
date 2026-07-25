implementation;
public Node insert(Node root,int val){
    if(root == null){
        return new Node(val);

    if(val<root.val){
        root.left = insert(root.left,val);
    }
    else if(val>root.val){
        root.right = insert(root.right,val);
    }
    return root;
    }

    case 1:
        System.out.println("\t-----insert Node  ------");
        n = sc.nextInt();
        for(int i = 0;i<n;i++){
            System.out.print("Enter Value"+(i+1))
        }
}