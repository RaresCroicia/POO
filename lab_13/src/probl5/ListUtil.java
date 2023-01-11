package probl5;

import java.util.*;

/**
 * Created by mihai
 */

public class ListUtil {
    public static <A, B> A foldl(Function<A, Function<B, A>> function, A acc, List<B> xs) {
        return null;
    }

    public static <A> void reverse(List<A> xs) {
        //Hint: Folositi iteratori
    }

    public static <A, B> A foldr(Function<A, Function<B, A>> function, A acc, List<B> xs) {
        //Hint: reverse + foldl
        return null;
    }

    public static <A, B> List<B> map(Function<A, B> function, List<A> xs) {
        List<B> ans = new ArrayList<>();
        ListIterator<A> iterator = xs.listIterator();
        while(iterator.hasNext()) {
            ans.add(function.execute(iterator.next()));
        }
        return ans;
    }

    public static <A> List<A> filter(Function<A, Boolean> function, List<A> xs) {
        List<A> list = new ArrayList<>();
        ListIterator<A> iterator = xs.listIterator();
        while(iterator.hasNext()) {
            A next = iterator.next();
            if(function.execute(next)) {
                list.add(next);
            }
        }
        return list;
    }

    public static <A> A reduce(Function<A, Function<A, A>> function, List<A> xs) {
        return null;
    }

    public static <A> boolean all(Function<A, Boolean> function, List<A> xs) {
        ListIterator<A> iterator = xs.listIterator();
        while(iterator.hasNext())
            if(function.execute(iterator.next()) == false)
                return false;
        return true;
    }

    public static <A> boolean any(Function<A, Boolean> function, List<A> xs) {
        ListIterator<A> iterator = xs.listIterator();
        while(iterator.hasNext())
            if(function.execute(iterator.next()) == true)
                return true;
        return false;
    }

    public static <A extends Number> A sum(List<A> xs, Addition<A> operation) {
        A ans = null;
        ListIterator<A> iterator = xs.listIterator();
        while(iterator.hasNext()) {
            if(ans == null)
                ans = iterator.next();
            else
                ans = operation.add(ans, iterator.next());
        }
        return ans;
    }
}
