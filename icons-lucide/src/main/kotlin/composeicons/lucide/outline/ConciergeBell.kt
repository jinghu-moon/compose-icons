package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ConciergeBell: ImageVector
    get() {
        if (_conciergeBell != null) return _conciergeBell!!
        _conciergeBell = lucideOutlineIcon(
            name = "ConciergeBell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M3 20C2.448 20 2 19.552 2 19v-1c0-1.105 .895-2 2-2h16c1.105 0 2 .895 2 2v1c0 .552-.448 1-1 1Z")
            addPathData("M20 16C20 11.582 16.418 8 12 8 7.582 8 4 11.582 4 16")
            addPathData("M12 4v4")
            addPathData("M10 4h4")
        }
        return _conciergeBell!!
    }

private var _conciergeBell: ImageVector? = null
