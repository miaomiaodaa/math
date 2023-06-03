package org.math.editor;

import java.util.HashMap;
import java.util.Map;

public class SQLBuilder {
    private final String zeta = "[";
    private final String eta = "]";

    public static void main(String[] args) {
        String sql = "select * from table where date = $column$ [and data_key = $dataKey$] <isEqual property='region' compareValue='537'> and md_status = $status$</isEqual>";
        Map<String, String> paramMap = new HashMap<>();
        paramMap.put("column", "2023-06-27");
        paramMap.put("dataKey", "JXY");
        paramMap.put("status", "A1");
        paramMap.put("region", "546");
        SQLBuilder sqlBuilder = new SQLBuilder();
        String runSql = sqlBuilder.runSql(paramMap, sql, new String[]{"$"}, true);
        System.out.println(runSql);
    }

    public String runSql(Map<String, String> paramMap, String sql, String[] Theta, boolean quotation) {
        StringBuilder omega = new StringBuilder(sql);
        for (int i = 0; i < Theta.length; i++) {
            String theta = Theta[i];
            while (omega.indexOf(theta) != -1) {
                int alpha = omega.indexOf(theta);
                int beta = omega.indexOf(theta, alpha + 1);
                String key = omega.substring(alpha + 1, beta);
                String value;
                // 这部分与isNotEmpty冲突，只能二选一
                if (paramMap.containsKey(key) && !isEmpty(value = paramMap.get(key))) {
                    omega.replace(alpha, beta + 1, quotation ? "'" + value + "'" : value);
                    int gamma = omega.lastIndexOf(zeta, alpha);
                    int delta = omega.indexOf(eta, alpha);
                    if (gamma == -1 || omega.substring(gamma, alpha).contains(eta))
                        continue;
                    omega.replace(gamma, gamma + 1, " ");
                    omega.replace(delta, delta + 1, " ");
                } else if (!paramMap.containsKey(key) || isEmpty(value = paramMap.get(key))) {
                    int gamma = omega.lastIndexOf(zeta, alpha);
                    int delta = omega.indexOf(eta, beta);
                    if (gamma == -1 || omega.substring(gamma, alpha).contains(eta))
                        throw new IllegalArgumentException("bed sql grammar, " + key + " is required");
                    omega.delete(gamma, delta + 1);
                }
            }
        }

        // isEqual
        int lambda;
        while ((lambda = omega.indexOf("<isEqual")) != -1) {
            int xi_1 = omega.indexOf(">", lambda);
            String substring = omega.substring(lambda + "<isEqual".length() + 1, xi_1);

            String substring1;
            String substring2;
            int i1 = substring.indexOf("property");
            int i2 = substring.indexOf("compareValue");
            if (i1 > i2) {
                int tmp = i2;
                i2 = i1;
                i1 = tmp;
            }
            substring1 = substring.substring(i1, i2);
            int phi = substring1.indexOf("'");
            int psi = substring1.lastIndexOf("'");
            substring1 = substring1.substring(phi + 1, psi);

            phi = substring.indexOf("'", i2);
            psi = substring.indexOf("'", phi + 1);
            substring2 = substring.substring(phi + 1, psi);

            int rho = omega.indexOf("</isEqual>", lambda);
            if (paramMap.get(substring1).equals(substring2)) {
                omega.delete(rho, rho + "</isEqual>".length() + 1);
                omega.delete(lambda, xi_1 + 1);
            } else
                omega.delete(lambda, rho + "</isEqual>".length() + 1);
        }

        // isNotEmpty
        while ((lambda = omega.indexOf("<isNotEmpty")) != -1) {
            int xi_1 = omega.indexOf(">", lambda);
            String substring = omega.substring(lambda + "<isNotEmpty".length() + 1, xi_1);

            String substring1;
            String substring2;
            int i1 = substring.indexOf("property");
            int i2 = substring.indexOf("prepend"); // and or
            if (i1 > i2) {
                int tmp = i2;
                i2 = i1;
                i1 = tmp;
            }
            substring1 = substring.substring(i1, i2);
            int phi = substring1.indexOf("'");
            int psi = substring1.lastIndexOf("'");
            substring1 = substring1.substring(phi + 1, psi);

            phi = substring.indexOf("'", i2);
            psi = substring.indexOf("'", phi + 1);
            substring2 = substring.substring(phi + 1, psi);

            int rho = omega.indexOf("</isNotEmpty>", lambda);
            if (!isEmpty(paramMap.get(substring1))) {
                omega.insert(xi_1 + 1, substring2);
                rho = omega.indexOf("</isNotEmpty>", lambda);
                omega.delete(rho, rho + "</isNotEmpty>".length() + 1);
                omega.delete(lambda, xi_1 + 1);
            } else
                omega.delete(lambda, rho + "</isNotEmpty>".length() + 1);
        }

        // 删除注释
        int sigma;
        while ((sigma = omega.indexOf("-- ")) != -1) {
            int i = omega.indexOf("\r\n", sigma);
            omega.delete(sigma, i + 1);
        }

        sql = omega.toString();
        return sql;
    }

    private boolean isEmpty(String var) {
        return null == var || var.length() == 0 || var.trim().equalsIgnoreCase("null");
    }
}
