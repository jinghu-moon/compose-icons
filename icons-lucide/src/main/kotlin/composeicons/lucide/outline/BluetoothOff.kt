package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BluetoothOff: ImageVector
    get() {
        if (_bluetoothOff != null) return _bluetoothOff!!
        _bluetoothOff = lucideOutlineIcon(
            name = "BluetoothOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M17 17l-5 5v-10L7 17")
            addPathData("M2 2 22 22")
            addPathData("M14.5 9.5 17 7 12 2v4.5")
        }
        return _bluetoothOff!!
    }

private var _bluetoothOff: ImageVector? = null
