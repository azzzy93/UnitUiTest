package kg.geektech.unituitest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import kg.geektech.unituitest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private Math math;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        math = new Math();

        setupListeners();
    }

    private void setupListeners() {

        binding.btnAdd.setOnClickListener(v -> {
            String num1 = binding.etFirstNum.getText().toString();
            String num2 = binding.etSecondNum.getText().toString();

            binding.tvResult.setText(math.add(num1, num2));
        });

        binding.btnSub.setOnClickListener(v -> {
            String num1 = binding.etFirstNum.getText().toString();
            String num2 = binding.etSecondNum.getText().toString();

            binding.tvResult.setText(math.sub(num1, num2));
        });

        binding.btnMult.setOnClickListener(v -> {
            String num1 = binding.etFirstNum.getText().toString();
            String num2 = binding.etSecondNum.getText().toString();

            binding.tvResult.setText(math.mult(num1, num2));
        });

        binding.btnDiv.setOnClickListener(v -> {
            String num1 = binding.etFirstNum.getText().toString();
            String num2 = binding.etSecondNum.getText().toString();

            binding.tvResult.setText(math.div(num1, num2));
        });
    }
}