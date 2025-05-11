public class StoreItemTester {

    public static void printTable(StoreItem[] items) {
        System.out.println();
        System.out.printf(" Name\t   Item Number\t\tPrice\t     Quantity\n");
        for(StoreItem item : items) {
            System.out.println(item.toString());
        }
        System.out.println();
    }

    public static void nameInsertionSort(StoreItem[] items, int direction) {
        if(direction == 1) {
            for(int i = 1; i < items.length; i++) {
                StoreItem currentValue = items[i];
                int j = i - 1;
                while(j >= 0 && items[j].getName().compareTo(currentValue.getName()) >= 0) {
                    //check what j actually does
                    items[j + 1] = items[j];
                    j--;
                }
                items[j + 1] = currentValue;
            }
        }
        else if(direction == 2) {
            for(int i = 1; i < items.length; i++) {
                StoreItem currentValue = items[i];
                int j = i - 1;
                while(j >= 0 && items[j].getName().compareTo(currentValue.getName()) <= 0) {
                    //check what j actually does
                    items[j + 1] = items[j];
                    j--;
                }
                items[j + 1] = currentValue;
            }
        }
    }

    public static void numberSelectionSort(StoreItem[] items, int direction) {
        int i;
        int k;
        int posMax;
        StoreItem temp;

        for(i = items.length - 1; i >= 0; i--) {
            posMax = 0;
            for(k = 0; k<= i; k++) {
                if(direction == 1 && items[k].getProductNum() > items[posMax].getProductNum()) {
                    posMax = k;
                }
                else if(direction == 2 && items[k].getProductNum() < items[posMax].getProductNum()) {
                    posMax = k;
                }
            }
            temp = items[i];
            items[i] = items[posMax];
            items[posMax] = temp;
        }
    }

    public static void priceMergeSort(StoreItem[] items, int low, int high) {
        if(low == high) return;

        int mid = (low + high) / 2;
        
        priceMergeSort(items, low, mid);
        priceMergeSort(items, mid + 1, high);
        
        merge(items, low, mid, high, 1);
    }

    public static void quantityMergeSort(StoreItem[] items, int low, int high) {
        if(low == high) return;

        int mid = (low + high) / 2;
        
        quantityMergeSort(items, low, mid);
        quantityMergeSort(items, mid + 1, high);
        
        merge(items, low, mid, high, 0);
    }

    public static void merge(StoreItem[] a, int low, int mid, int high, int type) {
        StoreItem[] temp = new StoreItem[high - low + 1];

        int i = low, j = mid + 1, n = 0;
                
        while(i <= mid || j <= high) {
            
            if(type == 0) {
                if(i > mid) {
                    temp[n] = a[j];
                    j++;
                }
                else if(j > high) {
                    temp[n] = a[i];
                    i++;
                }
                else if(a[i].getQuantity() < (a[j].getQuantity())) {
                    temp[n] = a[i];
                    i++;
                }
                else {
                    temp[n] = a[j];
                    j++;
                }
            }
            else {
                if(i > mid) {
                    temp[n] = a[j];
                    j++;
                }
                else if(j > high) {
                    temp[n] = a[i];
                    i++;
                }
                else if(a[i].getPrice() < (a[j].getPrice())) {
                    temp[n] = a[i];
                    i++;
                }
                else {
                    temp[n] = a[j];
                    j++;
                }              
            }

            n++;
        }
        for(int k = low; k <= high; k++ )
            a[k] = temp[k - low];
    }

    public static void main(String[] args) {
        StoreItem[] items = {
            new StoreItem("Item 0", 1, 0.99, 12),
            new StoreItem("Item 1", 2, 1.99, 23),
            new StoreItem("Item 2", 3, 2.99, 34),
            new StoreItem("Item 3", 4, 3.99,45),
            new StoreItem("Item 4", 5, 4.99,56),
            new StoreItem("Item 5", 6, 5.99, 67),
            new StoreItem("Item 6", 7, 6.99,78),
            new StoreItem("Item 7", 8, 7.99, 89),
            new StoreItem("Item 8", 9, 8.99, 91),
            new StoreItem("Item 9", 10, 9.99, 10),
        };

        System.out.println("Original:");
        printTable(items);

        System.out.println("Quantity Merge Sort:");
        quantityMergeSort(items, 0, items.length - 1);
        printTable(items);

        System.out.println("Price Merge Sort");
        priceMergeSort(items, 0, items.length - 1);
        printTable(items);

        System.out.println("Name Insertion Sort");
        nameInsertionSort(items, 1);
        printTable(items);

        System.out.println("Stock Selection Sort");
        numberSelectionSort(items, 1);
        printTable(items);

    }
}
