package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BluetoothX: ImageVector
    get() {
        if (_bluetoothX != null) return _bluetoothX!!
        _bluetoothX = tablerOutlineIcon(
            name = "BluetoothX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M7 8l10 8-5 4v-16l1 .802M13 11.198 7 16")
            addPathData("M16 6l4 4")
            addPathData("M20 6l-4 4")
        }
        return _bluetoothX!!
    }

private var _bluetoothX: ImageVector? = null
