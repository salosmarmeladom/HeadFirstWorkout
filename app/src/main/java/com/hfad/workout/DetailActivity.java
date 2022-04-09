package com.hfad.workout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_WORKOUT_ID = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        WorkoutDetailFragment frag = (WorkoutDetailFragment) getSupportFragmentManager().findFragmentById(R.id.detail_frag);
        int workoutId = (int) getIntent().getExtras().get(EXTRA_WORKOUT_ID);
        frag.setWorkout(workoutId);
    }

    class Solution {

        public int[] twoSum(int[] nums, int target) {
            List<Integer> numsList = null;
            for (int x = 0; x < nums.length; x++){
                numsList.add(nums[x]);
            }
            int[] twoSum = new int[2];
            for (int x = 0; x < nums.length; x++){
                if (numsList.contains(target-nums[x])&&(nums[x]!=target-nums[x])){
                    twoSum[0]=x;
                    twoSum[1]=numsList.indexOf(target-nums[x]);
                }
            }
            return twoSum;
        }
    }
}