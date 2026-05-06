package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BluetoothOff: ImageVector
    get() {
        if (_bluetoothOff != null) return _bluetoothOff!!
        _bluetoothOff = tablerOutlineIcon(
            name = "BluetoothOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3 21 21")
            addPathData("M16.438 16.45 12 20v-8M12 8v-4l5 4-2.776 2.22M12.002 11.999l-5 4")
        }
        return _bluetoothOff!!
    }

private var _bluetoothOff: ImageVector? = null
