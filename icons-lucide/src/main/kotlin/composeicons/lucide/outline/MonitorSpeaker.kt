package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MonitorSpeaker: ImageVector
    get() {
        if (_monitorSpeaker != null) return _monitorSpeaker!!
        _monitorSpeaker = lucideOutlineIcon(
            name = "MonitorSpeaker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.5 20h2.5")
            addPathData("M17 9h.01")
            addPathData("M14 4h6c1.105 0 2 .895 2 2v12c0 1.105-.895 2-2 2h-6c-1.105 0-2-.895-2-2v-12c0-1.105 .895-2 2-2Z")
            addPathData("M8 6h-4C2.895 6 2 6.895 2 8v6c0 1.105 .895 2 2 2h4")
            addPathData("M18 15c0 .552-.448 1-1 1-.552 0-1-.448-1-1 0-.552 .448-1 1-1 .552 0 1 .448 1 1Z")
        }
        return _monitorSpeaker!!
    }

private var _monitorSpeaker: ImageVector? = null
