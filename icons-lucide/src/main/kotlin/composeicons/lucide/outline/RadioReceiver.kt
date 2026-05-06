package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.RadioReceiver: ImageVector
    get() {
        if (_radioReceiver != null) return _radioReceiver!!
        _radioReceiver = lucideOutlineIcon(
            name = "RadioReceiver",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5 16v2")
            addPathData("M19 16v2")
            addPathData("M4 8h16c1.105 0 2 .895 2 2v4c0 1.105-.895 2-2 2h-16C2.895 16 2 15.105 2 14v-4C2 8.895 2.895 8 4 8Z")
            addPathData("M18 12h.01")
        }
        return _radioReceiver!!
    }

private var _radioReceiver: ImageVector? = null
