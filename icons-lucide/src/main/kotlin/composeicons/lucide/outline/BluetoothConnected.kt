package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) return _bluetoothConnected!!
        _bluetoothConnected = lucideOutlineIcon(
            name = "BluetoothConnected",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 7 17 17l-5 5v-20l5 5L7 17")
            addPathData("M18 12h3")
            addPathData("M3 12h3")
        }
        return _bluetoothConnected!!
    }

private var _bluetoothConnected: ImageVector? = null
