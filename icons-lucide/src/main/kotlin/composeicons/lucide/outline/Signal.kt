package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Signal: ImageVector
    get() {
        if (_signal != null) return _signal!!
        _signal = lucideOutlineIcon(
            name = "Signal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M2 20h.01")
            addPathData("M7 20v-4")
            addPathData("M12 20v-8")
            addPathData("M17 20v-12")
            addPathData("M22 4v16")
        }
        return _signal!!
    }

private var _signal: ImageVector? = null
