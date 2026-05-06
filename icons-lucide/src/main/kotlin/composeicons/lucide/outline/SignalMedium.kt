package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SignalMedium: ImageVector
    get() {
        if (_signalMedium != null) return _signalMedium!!
        _signalMedium = lucideOutlineIcon(
            name = "SignalMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 20h.01")
            addPathData("M7 20v-4")
            addPathData("M12 20v-8")
        }
        return _signalMedium!!
    }

private var _signalMedium: ImageVector? = null
