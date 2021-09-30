public class MyLinkedList implements NodeList{
    private ListItem root = null;
    
    public MyLinkedList(ListItem root){
        this.root = root;
    }
    
    public ListItem getRoot(){
        return this.root;
    }
    
    @Override
    public boolean addItem(ListItem item){
        if(this.root == null){
            //if root is null, add the item as the root
            this.root = item;
            return true;
        }
        
        //make the root node the currentItem
        ListItem currentItem = this.root;
        //while there is data at the root
        while(currentItem != null){
            //comparing root to passed item
            int comparison = currentItem.compareTo(item);
            
            //if comparison < 0 we move forward
            if(comparison < 0){
                if(currentItem.next() != null){
                    //while root is not null, go to the next item
                    currentItem = currentItem.next();
                }else{
                    //else make next, the item and make previous currentItem
                    //once the next item is inserted, the previous item is CurrentItem
                    currentItem.setNext(item).setPrevious(currentItem);
                    return true;
                }
                //if comparison > 0 we move backwards
            }else if(comparison > 0){
                if(currentItem.previous() != null){
                    currentItem.previous().setNext(item).setPrevious(currentItem.previous());
                    item.setNext(currentItem).setPrevious(item);
                }else{
                    item.setNext(this.root).setPrevious(item);
                    this.root = item;
                }
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
    
    @Override
    public boolean removeItem(ListItem item){
        if(item != null){
            System.out.println("Deleting item " + item.getValue());
        }
        
        //make the root node the currentItem
        ListItem currentItem = this.root;
        //while there is data as the root
        while(currentItem != null){
            int comparison = currentItem.compareTo(item);
            
            if(comparison == 0){
                //if the currentItem is the root
                if(currentItem == this.root){
                    //root is now the next item in the list
                    this.root = currentItem.next();
                }else{
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            }else if(comparison < 0){
                currentItem = currentItem.next();
            }else{
                return false;
            }
        }
        return false;
    }
    
    @Override
    public void traverse(ListItem root){
        if(root == null){
            System.out.println("The list is empty");
        }else{
            while(root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}