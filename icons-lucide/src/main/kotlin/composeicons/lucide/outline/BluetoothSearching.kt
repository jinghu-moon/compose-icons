package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BluetoothSearching: ImageVector
    get() {
        if (_bluetoothSearching != null) return _bluetoothSearching!!
        _bluetoothSearching = lucideOutlineIcon(
            name = "BluetoothSearching",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 7 17 17l-5 5v-20l5 5L7 17")
            addPathData("M20.83 14.83c.751-.75 1.173-1.768 1.173-2.83 0-1.062-.422-2.08-1.173-2.83")
            addPathData("M18 12h.01")
        }
        return _bluetoothSearching!!
    }

private var _bluetoothSearching: ImageVector? = null
