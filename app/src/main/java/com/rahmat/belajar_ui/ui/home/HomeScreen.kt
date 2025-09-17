
package com.rahmat.belajar_ui.ui.home

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.rahmat.belajar_ui.data.model.Transaction
import com.rahmat.belajar_ui.presentation.viewmodel.HomeViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel(),
    onLogout: () -> Unit
) {
    TODO("Add implementation")
}

@Composable
fun BalanceCard(balance: Double) {
    TODO("Add implementation")
}

@Composable
fun QuickActions(onTopUp: () -> Unit, onTransfer: () -> Unit) {
    TODO("Add implementation")
}

@Composable
fun QuickActionItem(icon: androidx.compose.ui.graphics.vector.ImageVector, text: String, onClick: () -> Unit) {
    TODO("Add implementation")
}

@Composable
fun TransactionItem(transaction: Transaction) {
    TODO("Add implementation")
}

@Composable
fun TopUpDialog(
    onDismiss: () -> Unit,
    onConfirm: (Double) -> Unit
) {
    TODO("Add implementation")
}

@Composable
fun TransferDialog(
    onDismiss: () -> Unit,
    onConfirm: (String, Double) -> Unit
) {
    TODO("Add implementation")
}
