package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Unlink: ImageVector
    get() {
        if (_unlink != null) return _unlink!!
        _unlink = lucideOutlineIcon(
            name = "Unlink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.84 12.25l1.72-1.71h-.02C22.457 8.554 22.403 5.39 20.42 3.47c-1.939-1.87-5.011-1.87-6.95 0L11.75 5.18")
            addPathData("M5.17 11.75 3.46 13.46c-1.917 1.986-1.863 5.15 .12 7.07 1.939 1.87 5.011 1.87 6.95 0l1.71-1.71")
            addPathData("M8 2v3")
            addPathData("M2 8h3")
            addPathData("M16 19v3")
            addPathData("M19 16h3")
        }
        return _unlink!!
    }

private var _unlink: ImageVector? = null
