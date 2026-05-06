package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Milk: ImageVector
    get() {
        if (_milk != null) return _milk!!
        _milk = lucideOutlineIcon(
            name = "Milk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 2h8")
            addPathData("M9 2v2.789c-0 .79-.234 1.562-.672 2.219l-.656 .984C7.234 8.649 7 9.422 7 10.212v9.788c0 1.105 .895 2 2 2h6c1.105 0 2-.895 2-2v-9.789c-0-.79-.234-1.562-.672-2.219l-.656-.984C15.234 6.351 15 5.578 15 4.788v-2.788")
            addPathData("M7 15c1.599-.67 3.401-.67 5 0 1.599 .67 3.401 .67 5 0")
        }
        return _milk!!
    }

private var _milk: ImageVector? = null
