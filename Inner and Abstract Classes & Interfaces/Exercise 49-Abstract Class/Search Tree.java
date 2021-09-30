public class SearchTree implements NodeList{
    private ListItem root = null;
    
    public SearchTree(ListItem root){
        this.root = root;
    }
    
    public ListItem getRoot(){
        return this.root;
    }
    
    @Override
    public boolean addItem(ListItem newItem){
        if (this.root == null) {
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                System.out.println(newItem.getValue() + " is already present");
                return false;
            }
        }
        return false;
    }
    
    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                // equal: we've found the item so remove it
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }
    
    private void performRemoval(ListItem removeItem, ListItem parentItem){
        if(removeItem.next() == null){
            if(parentItem.next() == removeItem){
                parentItem.setNext(removeItem.previous());
            }else if(parentItem.previous() == removeItem){
                parentItem.setPrevious(removeItem.previous());
            }else{
                this.root = removeItem.previous();
            }
        }else if(removeItem.previous() == null){
            if(parentItem.next() == removeItem){
                parentItem.setNext(removeItem.next());
            }else if(parentItem.previous() == removeItem){
                parentItem.setPrevious(removeItem.next());
            }else{
                this.root = removeItem.next();
            }
        }else{
            ListItem current = removeItem.next();
            ListItem leftmostParent = removeItem;
            
            while(current.previous() != null){
                leftmostParent = current;
                current = current.previous();
            }
            
            removeItem.setValue(current.getValue());
            
            if(leftmostParent == removeItem){
                removeItem.setNext(current.next());
            }else{
                leftmostParent.setPrevious(current.next());
            }
        }
    }
    
    @Override
    public void traverse(ListItem root){
        if(root != null){
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}