package com.example.JpaLibrary.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class SearchBookRequest {

    @NotBlank
    private String searchKey;
    @NotBlank
    private String searchValue;
    @NotBlank
    private String operator;
    private boolean available;

    private static Set<String> allowedKeys = new HashSet<>();
    private static Map<String , List<String>> allowedOperatorMap = new HashMap<>();

    SearchBookRequest(){
        Set<String> allowedKeys = new HashSet<>();
        allowedKeys.addAll(Arrays.asList("name","author_name","genre","pages","id"));

        Map<String, List<String>> allowedOperatorMap = new HashMap<>();
        allowedOperatorMap.put("name", Arrays.asList("=","like"));
        allowedOperatorMap.put("author_name", Arrays.asList("="));
        allowedOperatorMap.put("pages",Arrays.asList("<",">","<=",">=","="));
        allowedOperatorMap.put("genre",Arrays.asList("="));
        allowedOperatorMap.put("id",Arrays.asList("="));
    }
    public boolean validate(){
        if (!allowedKeys.contains(searchKey)){
            return false;
        }
        List<String> validOperator = allowedOperatorMap.get(this.searchKey);
        if (!validOperator.contains(this.operator)){
            return false;
        }
        return true;
    }
}
