package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Download: ImageVector
    get() {
        if (_download != null) return _download!!
        _download = lucideOutlineIcon(
            name = "Download",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 15v-12")
            addPathData("M21 15v4c0 1.105-.895 2-2 2h-14C3.895 21 3 20.105 3 19v-4")
            addPathData("M7 10l5 5 5-5")
        }
        return _download!!
    }

private var _download: ImageVector? = null
