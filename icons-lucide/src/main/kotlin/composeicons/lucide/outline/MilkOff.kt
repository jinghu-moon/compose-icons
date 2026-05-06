package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.MilkOff: ImageVector
    get() {
        if (_milkOff != null) return _milkOff!!
        _milkOff = lucideOutlineIcon(
            name = "MilkOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 2h8")
            addPathData("M9 2v1.343M15 2v2.789c0 .79 .234 1.562 .672 2.219l.656 .984c.438 .657 .672 1.43 .672 2.22v1.131M7.8 7.8l-.128 .192C7.234 8.649 7 9.422 7 10.212v9.788c0 1.105 .895 2 2 2h6c1.105 0 2-.895 2-2v-3")
            addPathData("M7 15c1.599-.67 3.401-.67 5 0 1.084 .454 2.272 .605 3.435 .435")
            addPathData("M2 2 22 22")
        }
        return _milkOff!!
    }

private var _milkOff: ImageVector? = null
