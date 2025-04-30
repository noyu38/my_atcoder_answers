//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Scanner;
//import java.util.Map;
//
//class ShortestDuplicateSubarray {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        ArrayList<Integer> list = new ArrayList<>();
//        for (int i = 0; i < N; i++) {
//            int A = sc.nextInt();
//            list.add(A);
//        }
//        sc.close();
//        List<Integer> duplicates = findDuplicates(list);
//        int firstIndex;
//        int secondIndex;
//        List<Integer> lengths = new ArrayList<>();
//        if (duplicates.isEmpty()) {
//            System.out.println(-1);
//        } else {
//            for (int num : duplicates) {
//                //System.out.println(num);
//                firstIndex = list.indexOf(num);
//                //System.out.println(firstIndex);
//                secondIndex = list.lastIndexOf(num);
//                //System.out.println(secondIndex);
//                int length = secondIndex - firstIndex + 1;
//                lengths.add(length);
//            }
//            Collections.sort(lengths);
//            System.out.println(lengths.get(0));
//        }
//    }
//    
//    public static List<Integer> findDuplicates(ArrayList<Integer> list) {
//        Map<Integer, Integer> countMap = new HashMap<>();
//        List<Integer> duplicates = new ArrayList<>();
//
//        for (int num : list) {
//            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//        }
//        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
//            if (entry.getValue() > 1) {
//                duplicates.add(entry.getKey());
//            }
//        }
//        return duplicates;
//    }
//}

import java.util.*;

public class ShortestDuplicateSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        int ans = N + 1;
        Map<Integer, List<Integer>> pos = new HashMap<>();
        
        for (int i = 0; i < N; i++) {
            pos.putIfAbsent(A[i], new ArrayList<>());
            pos.get(A[i]).add(i);
        }
        
        for (List<Integer> indices : pos.values()) {
            if (indices.size() < 2) {
                continue;
            }
            for (int j = 0; j < indices.size() - 1; j++) {
                ans = Math.min(ans, indices.get(j + 1) - indices.get(j) + 1);
            }
        }
        
        System.out.println(ans == N + 1 ? -1 : ans);
        
        sc.close();
    }
}
