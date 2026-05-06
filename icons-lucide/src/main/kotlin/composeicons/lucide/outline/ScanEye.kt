package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ScanEye: ImageVector
    get() {
        if (_scanEye != null) return _scanEye!!
        _scanEye = lucideOutlineIcon(
            name = "ScanEye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 7v-2C3 3.895 3.895 3 5 3h2")
            addPathData("M17 3h2c1.105 0 2 .895 2 2v2")
            addPathData("M21 17v2c0 1.105-.895 2-2 2h-2")
            addPathData("M7 21h-2C3.895 21 3 20.105 3 19v-2")
            addPathData("M13 12c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
            addPathData("M18.944 12.33c.075-.214 .075-.446 0-.66C17.792 8.848 15.048 7.004 12 7.004c-3.048 0-5.792 1.844-6.944 4.666-.075 .214-.075 .446 0 .66 1.152 2.822 3.896 4.666 6.944 4.666 3.048 0 5.792-1.844 6.944-4.666")
        }
        return _scanEye!!
    }

private var _scanEye: ImageVector? = null
