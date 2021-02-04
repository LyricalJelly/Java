package DailyPracitice.DFS;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DFS {
    class Employee {
        public int id;
        public int importance;
        public List<Integer> subordinates;
    };

    /**
     * https://leetcode-cn.com/problems/employee-importance/ // Definition for
     * Employee. class Employee { public int id; public int importance; public
     * List<Integer> subordinates; };
     */

    private Map<Integer, Employee> map;

    public int getImportance(List<Employee> employees, int queryid) {
        map = new HashMap<>();
        for (Employee e : employees)
            map.put(e.id, e);
        return dfs(queryid);
    }

    private int dfs(int eid) {
        Employee employee = map.get(eid);
        int importance = employee.importance;
        for (Integer subid : employee.subordinates)
            importance += dfs(subid);
        return importance;
    }
}
