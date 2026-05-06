package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Folders: ImageVector
    get() {
        if (_folders != null) return _folders!!
        _folders = lucideOutlineIcon(
            name = "Folders",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20 5c1.105 0 2 .895 2 2v7c0 1.105-.895 2-2 2h-11C7.895 16 7 15.105 7 14v-9C7 3.895 7.895 3 9 3h2.5c.472 0 .917 .222 1.2 .6l.6 .8c.283 .378 .728 .6 1.2 .6Z")
            addPathData("M3 8.268C2.379 8.626 1.998 9.289 2 10.006v8.994c0 1.105 .895 2 2 2h11c.715-0 1.375-.381 1.732-1")
        }
        return _folders!!
    }

private var _folders: ImageVector? = null
