package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Container: ImageVector
    get() {
        if (_container != null) return _container!!
        _container = lucideOutlineIcon(
            name = "Container",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M22 7.7c0-.6-.4-1.2-.8-1.5L14.9 2.3c-.527-.3-1.173-.3-1.7 0L2.9 8.3C2.4 8.5 2 9.1 2 9.7v6.6c0 .5 .4 1.2 .8 1.5l6.3 3.9c.527 .3 1.173 .3 1.7 0L21.1 15.7c.5-.3 .9-1 .9-1.5Z")
            addPathData("M10 21.9v-7.9L2.1 9.1")
            addPathData("M10 14 21.9 7.1")
            addPathData("M14 19.8v-8.1")
            addPathData("M18 17.5v-8.1")
        }
        return _container!!
    }

private var _container: ImageVector? = null
