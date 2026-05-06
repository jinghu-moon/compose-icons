package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Castle: ImageVector
    get() {
        if (_castle != null) return _castle!!
        _castle = lucideOutlineIcon(
            name = "Castle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 5v-2")
            addPathData("M14 5v-2")
            addPathData("M15 21v-3c0-1.657-1.343-3-3-3-1.657 0-3 1.343-3 3v3")
            addPathData("M18 3v8")
            addPathData("M18 5h-12")
            addPathData("M22 11h-20")
            addPathData("M22 9v10c0 1.105-.895 2-2 2h-16C2.895 21 2 20.105 2 19v-10")
            addPathData("M6 3v8")
        }
        return _castle!!
    }

private var _castle: ImageVector? = null
