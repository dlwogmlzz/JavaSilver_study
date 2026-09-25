# 컬렉션

⇒ Java 언어에서 제공되고 있는, 배열같이 `복수의 요소를 관리할수 있는 오브젝트`
⇒ `List, Set, Map`의 3개 인터페이스가 준비되어 있다.


■ List인터페이스

⇒ `사이즈가 변경가능한 배열` 같은것
  요소의 중복을 허가하고 순서를 정할때 사용한다.

List인터페이스를 실장하고 있는 클래스
⇒ `ArrayList클래스`


[ArrayList 클래스]

* **Point**
    * 첨자/인덱스를 기준으로 순서를 매겨 관리

* **구조 (배열 형태)**
  +-------+-------+-------+-------+-------+
  |  要素  |  要素  |  要素  |  要素  |  要素 |
  +-------+-------+-------+-------+-------+
  |   0   |   1   |   2   |   3   |   4   |
  +-------+-------+-------+-------+-------+



[List インターフェース (List 인터페이스)]

* **構文 (구문)**
    * List<データ型名> オブジェクト名 = new ArrayList<データ型名>();

* **例 (예제)**
```java
  import java.util.ArrayList;
  import java.util.Arrays;
  import java.util.List;
  public class Main {
      public static void main(String[] args) {
          List<Integer> list = new ArrayList<>();
          list.add(1);
          list.add(2);
          list.add(3);
      }
  }
```
* **Point**
    * ArrayList를 사용할 때는 `java.util을 임포트`한다


[List 인터페이스 주요 메서드]

* add: 리스트에 값 추가
    - 기술 예: list.add(1)
* addAll: 리스트에 리스트를 추가
    - 기술 예: list1.add(list2)
* set: 리스트의 값 변경
    - 기술 예: list.set(0, 3)
* get: 리스트의 값 취득
    - 기술 예: list.get(0)
* size: 리스트의 요소 수 취득
    - 기술 예: list.size()
* indexOf: 리스트에서 값의 요소 번호 취득
    - 기술 예: list.indexOf("a")
* subList: 리스트에서 범위를 지정하여 복사
    - 기술 예: subList(1, 3)
* contains: 리스트에 값이 포함되는지 판정
    - 기술 예: list.contains("a")
* remove: 리스트에서 지정하는 요소 번호의 값을 삭제
    - 기술 예: list.remove(1)
* distinct: 리스트에서 중복되는 값을 삭제
    - 기술 예: list.stream().distinct()
* clone: 리스트의 복사
    - 기술 예: list.clone()


[Set 인터페이스]

* **특징**
    - 요소의 `중복을 허용하지 않을 때` 사용
    - `순서 없이` 값을 유지함

* **Set 인터페이스를 구현하는 클래스**
    - `HashSet 클래스`

* **Point**
    - HashSet 클래스는 값을 순서 없이 관리
    - 값을 정렬하여 관리하고 싶을 때는 `TreeSet 클래스`를 사용



[HashSet 클래스 구문 및 예제]

* **構文 (구문)**
    - Set<データ型名> オブジェクト名 = new HashSet<データ型名>();

* **例 (예제)**
```java
     import java.util.HashSet;
     import java.util.Set;

     public class Main {
         public static void main(String[] args) {
             Set<String> set = new HashSet<String>();
             add("Windows");
             add("Linux");
             add("macOS");
         }
     }
```
* **Point**
    - HashSet을 사용할 때는 `java.util을 임포트`한다



[Set 인터페이스 주요 메서드]

* add: 요소를 삽입
    - 기술 예: add(1)
* clear: 모든 요소를 삭제
    - 기술 예: clear()
* contains: 세트에 요소가 포함되어 있는지 판정
    - 기술 예: contains(1)
* isEmpty: 세트가 비어 있는지 판정
    - 기술 예: isEmpty()
* remove: 요소를 삭제
    - 기술 예: remove(1)
* size: 세트에 포함된 요소의 수를 취득
    - 기술 예: size()


소스 코드 예
```java
import java.util.HashSet;
import java.util.Set;

public class Main {
public static void main(String[] args) {
// Set 객체 생성 (HashSet 사용)
Set<Integer> set = new HashSet<>();
        `// 1. add: 요소를 삽입`
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("초기 세트: " + set);
        `// 2. contains: 세트에 요소가 포함되어 있는지 판정`
        boolean hasTwenty = set.contains(20);
        System.out.println("20이 포함되어 있는가? " + hasTwenty);
        `// 3. size: 세트에 포함된 요소의 수를 취득`
        int size = set.size();
        System.out.println("세트의 크기: " + size);
        `// 4. isEmpty: 세트가 비어 있는지 판정`
        boolean empty = set.isEmpty();
        System.out.println("세트가 비어 있는가? " + empty);
        `// 5. remove: 요소를 삭제`
        set.remove(10);
        System.out.println("10 삭제 후 세트: " + set);
        `// 6. clear: 모든 요소를 삭제`
        set.clear();
        System.out.println("clear 후 비어 있는가? " + set.isEmpty());
    }
}
```




[Map 인터페이스 (Map インターフェース)]

* **특징**
    - 데이터를 키와 값의 쌍으로 관리할 경우에 사용
    - 키는 고유한 값이어야 하지만, 값은 중복 가능

* **Map 인터페이스를 구현하는 클래스**
    - HashMap 클래스

* **Point**
    - 키와 값의 쌍으로 관리(key & value)



[HashMap 클래스 구문 및 예제]

* **構文 (구문)**
    - Map<キーの型名, 値の型名> オブジェクト名 = new HashMap<>();

* **例 (예제)**
```java
     import java.util.HashMap;
     public class Main {
         public static void main(String[] args) {
             HashMap<Integer, String> map = new HashMap<>();
             map.Put(1, "foo");
             map.Put(2, "bar");
             map.Put(3, "hoge");
         }
     }
```     

* **Point**
    - HashMap을 사용할 때는 `java.util을 임포트`한다



[Map 인터페이스 주요 메서드]

* clear: 모든 요소를 삭제
    - 기술 예: clear()
* clone: 인스턴스를 복사
    - 기술 예: clone()
* containsKey: 지정된 키를 보유하고 있는 경우는 true를 반환
    - 기술 예: containskey(1)
* containsValue: 1개 이상의 값이 있으면, true를 반환
    - 기술 예: containsValue("foo")
* entrySet: 컨테이너에 포함되는 Set 뷰를 반환
    - 기술 예: entrySet()
* get: 지정된 키의 값을 반환
    - 기술 예: get(1)
* isEmpty: 컨테이너가 비어 있는 경우는 true를 반환
    - 기술 예: isEmpty()
* keySet: 컨테이너에 포함되는 키의 Set 뷰를 반환
    - 기술 예: keySet()
* put: 지정된 키와 밸류를 컨테이너에 격납
    - 기술 예: put(1, "foo")
* putAll: 지정된 컨테이너를 복사
    - 기술 예: putAll(Map<> m)
* remove: 지정된 키를 삭제
    - 기술 예: remove(1)
* size: 컨테이너 내의 키의 수를 반환
    - 기술 예: size()
* values: 컨테이너에 포함되는 값의 Collection 뷰를 반환
    - 기술 예: values()




소스코드 예
```java
import java.util.HashMap;
import java.util.Map;

public class Main {
public static void main(String[] args) {
// Map 객체 생성 (HashMap 사용)
Map<Integer, String> map = new HashMap<>();
        // 1. put: 지정된 키와 밸류를 컨테이너에 격납
        map.put(1, "foo");
        map.put(2, "bar");
        System.out.println("초기 맵: " + map);
        // 2. get: 지정된 키의 값을 반환
        System.out.println("키 1의 값: " + map.get(1));
        // 3. containsKey: 지정된 키를 보유하고 있는 경우는 true를 반환
        System.out.println("키 1이 존재하는가? " + map.containsKey(1));
        // 4. containsValue: 1개 이상의 값이 있으면, true를 반환
        System.out.println("'foo' 값이 존재하는가? " + map.containsValue("foo"));
        // 5. size: 컨테이너 내의 키의 수를 반환
        System.out.println("맵의 크기: " + map.size());
        // 6. isEmpty: 컨테이너가 비어 있는 경우는 true를 반환
        System.out.println("맵이 비어 있는가? " + map.isEmpty());
        // 7. keySet: 컨테이너에 포함되는 키의 Set 뷰를 반환
        System.out.println("키 셋: " + map.keySet());
        // 8. values: 컨테이너에 포함되는 값의 Collection 뷰를 반환
        System.out.println("값 컬렉션: " + map.values());
        // 9. entrySet: 컨테이너에 포함되는 Set 뷰를 반환
        System.out.println("엔트리 셋: " + map.entrySet());
        // 10. putAll: 지정된 컨테이너를 복사
        Map<Integer, String> map2 = new HashMap<>();
        map2.putAll(map);
        System.out.println("복사된 map2: " + map2);
        // 11. remove: 지정된 키를 삭제
        map.remove(1);
        System.out.println("키 1 삭제 후 맵: " + map);
        // 12. clear: 모든 요소를 삭제
        map.clear();
        System.out.println("clear 후 비어 있는가? " + map.isEmpty());
    }
}
```


[제네릭스란 (ジェネリックスとは)]

* **개념**
    - `「<>」 기호로 둘러싸인 데이터 타입 명칭`을 지정함으로써, Integer 타입이나 String 타입 등 다양한 타입에 대응하는 `범용적인 클래스나 메서드를 만드는 기능`

* **주의사항**
    - 제네릭스를 사용하지 않으면, 데이터 타입 불일치로 인해 실행 시점에 ClassCastException 에러가 발생하는 경우가 있음


```java
public class Main {
public static void main(String[] args) {
        // 1. String 타입을 다루는 PairMap 객체 생성
        PairMap<String> stringPair = new PairMap<>("Hello", "World");
        System.out.println("첫 번째 값: " + stringPair.first());
        System.out.println("두 번째 값: " + stringPair.second());

        // 2. Integer 타입을 다루는 PairMap 객체 생성
        PairMap<Integer> intPair = new PairMap<>(100, 200);
        System.out.println("첫 번째 숫자: " + intPair.first());
        System.out.println("두 번째 숫자: " + intPair.second());
    }
}

// 제네릭스를 이용한 범용 클래스 정의
class PairMap<T> {
private T first;
private T second;

    public T first() {
        return this.first;
    }

    public T second() {
        return this.second;
    }

    public PairMap(T first, T second) {
        this.first = first;
        this.second = second;
    }
}
```

[객체의 비교 (オブジェクトの比較)]

* **Comparable 인터페이스 (Comparable インターフェース)**
    - 構文 (구문): public int compareTo(比較対象のデータ型 比較対象)
    - 설명: ※ 자신 객체와 비교 대상을 비교함
    - 判定結果 (판정 결과):
        - 自オブジェクト == 比較対象 : 0を返却 (자신 객체 == 비교 대상 : 0 반환)
        - 自オブジェクト < 比較対象 : 負数を返却 (자신 객체 < 비교 대상 : 음수 반환)
        - 自オブジェクト > 比較対象 : 正数を返却 (자신 객체 > 비교 대상 : 양수 반환)

* **Comparator 인터페이스 (Comparator インターフェース)**
    - 構文 (구문): public int compare(比較対象1, 比較対象2)
    - 判定結果 (판정 결과):
        - 比較対象1 == 比較対象2 : 0を返却 (비교 대상 1 == 비교 대상 2 : 0 반환)
        - 比較対象1 < 比較対象2 : 負数を返却 (비교 대상 1 < 비교 대상 2 : 음수 반환)
        - 比較対象1 > 比較対象2 : 正数を返却 (비교 대상 1 > 비교 대상 2 : 양수 반환)



[배열과 리스트의 정렬과 검색]

* **Collections 클래스**
  - 컬렉션에 관한 다양한 조작을 모아 둔 클래스
  - 메서드는 static 메서드로 제공됨

* **주요 메서드 (主なメソッド)**
  - ① public static <T extends Comparable<? super T>> void sort(List<T> list)
    - 자연 순서에 따라 지정된 리스트를 오름차순으로 정렬
  - ② public static <T> void sort(List<T> list, Comparator<? super T> c)
    - 지정된 컴퍼레이터가 나타내는 순서에 따라 지정된 리스트를 정렬
  - ③ public static void reverse(List<?> list)
    - 지정된 리스트의 순서를 반대로 함



[배열과 리스트의 정렬과 검색: Arrays 클래스]

* **Arrays クラス (Arrays 클래스)**
    - 배열에 관한 다양한 조작을 모아 둔 클래스

* **主なメソッド (주요 메서드)**
    - ① public static void sort(Object[] a)
        - 지정된 객체 배열을 오름차순으로 정렬함
    - ② public static <T> void sort(T[] a, Comparator<? super T> c)
        - 컴퍼레이터가 나타내는 순서에 따라 지정된 객체 배열을 오름차순으로 정렬함
    - ③ public static <T> List <T> asList(T...a)
        - 인수로 지정된 값을 바탕으로 리스트를 생성함
    - ④ public static int compare(int[] a, int[] b)
        - 2개의 int 배열을 비교함
    - ⑤ public static int mismatch(int[] a, int[] b)
        - 2개의 배열 간 최초의 불일치 인덱스를 찾아 반환함








