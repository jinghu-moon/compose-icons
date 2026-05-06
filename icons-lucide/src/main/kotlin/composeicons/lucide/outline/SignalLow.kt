package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SignalLow: ImageVector
    get() {
        if (_signalLow != null) return _signalLow!!
        _signalLow = lucideOutlineIcon(
            name = "SignalLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 20h.01")
            addPathData("M7 20v-4")
        }
        return _signalLow!!
    }

private var _signalLow: ImageVector? = null
