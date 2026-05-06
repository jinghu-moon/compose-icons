package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SprayCan: ImageVector
    get() {
        if (_sprayCan != null) return _sprayCan!!
        _sprayCan = lucideOutlineIcon(
            name = "SprayCan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 3h.01")
            addPathData("M7 5h.01")
            addPathData("M11 7h.01")
            addPathData("M3 7h.01")
            addPathData("M7 9h.01")
            addPathData("M3 11h.01")
            addPathData("M15 5h4v4h-4Z")
            addPathData("M19 9l2 2v10c0 .6-.4 1-1 1h-6c-.6 0-1-.4-1-1v-10L15 9")
            addPathData("M13 14l8-2")
            addPathData("M13 19l8-2")
        }
        return _sprayCan!!
    }

private var _sprayCan: ImageVector? = null
