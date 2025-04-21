package com.example.badminton_record.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.badminton_record.viewmodel.HomeViewModel

@Composable
fun HomeScreen(viewModel: HomeViewModel) {
    val query by viewModel.query.collectAsState()

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "배드민턴 급수 조회", style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = query,
            onValueChange = viewModel::onQueryChange,
            label = { Text("선수 이름 검색") },
            modifier = Modifier.fillMaxWidth()
        )
    }
}