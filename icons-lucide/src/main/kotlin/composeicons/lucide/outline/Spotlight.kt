package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Spotlight: ImageVector
    get() {
        if (_spotlight != null) return _spotlight!!
        _spotlight = lucideOutlineIcon(
            name = "Spotlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15.295 19.562 16 22")
            addPathData("M17 16l3.758 2.098")
            addPathData("M19 12.5l3.026-.598")
            addPathData("M7.61 6.3C6.166 5.622 4.443 6.193 3.69 7.6L2.31 10.39c-.672 1.442-.101 3.157 1.3 3.91l6.89 3.597c.237 .119 .512 .138 .764 .055 .252-.084 .46-.264 .578-.502l3.106-6.211c.247-.494 .047-1.094-.447-1.341Z")
            addPathData("M8 9v-7")
        }
        return _spotlight!!
    }

private var _spotlight: ImageVector? = null
