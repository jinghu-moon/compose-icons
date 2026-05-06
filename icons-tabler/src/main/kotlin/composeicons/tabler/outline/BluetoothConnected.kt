package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BluetoothConnected: ImageVector
    get() {
        if (_bluetoothConnected != null) return _bluetoothConnected!!
        _bluetoothConnected = tablerOutlineIcon(
            name = "BluetoothConnected",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 8l10 8-5 4v-16l5 4L7 16")
            addPathData("M4 12h1")
            addPathData("M18 12h1")
        }
        return _bluetoothConnected!!
    }

private var _bluetoothConnected: ImageVector? = null
