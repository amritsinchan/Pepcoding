// ng : next greater
// ns: next smaller
on right/ on left

public static int[] ngor(int[] arr){
  int n = arr.length;
        LinkedList<Integer> st = new LinkedList<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for (int i = 0; i < n; i++) {
            while (st.size() != 0 && arr[st.getFirst()] < arr[i]) {
                ans[st.removeFirst()] = arr[i];
            }

            st.addFirst(i);
        }
        return ans;
 }


public static int[] ngol(int[] arr){
  int n = arr.length;
        LinkedList<Integer> st = new LinkedList<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for (int i = n-1; i >=0; i++) {
            while (st.size() != 0 && arr[st.getFirst()] < arr[i]) {
                ans[st.removeFirst()] = arr[i];
            }

            st.addFirst(i);
        }
        return ans;
 }
public static int[] nsor(int[] arr){
  int n = arr.length;
        LinkedList<Integer> st = new LinkedList<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for (int i = 0; i < n; i++) {
            while (st.size() != 0 && arr[st.getFirst()] > arr[i]) {
                ans[st.removeFirst()] = arr[i];
            }

            st.addFirst(i);
        }
        return ans;
 }
public static int[] nsol(int[] arr){
  int n = arr.length;
        LinkedList<Integer> st = new LinkedList<>();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        for (int i = n-1; i >=0; i++) {
            while (st.size() != 0 && arr[st.getFirst()] > arr[i]) {
                ans[st.removeFirst()] = arr[i];
            }

            st.addFirst(i);
        }
        return ans;
 }
