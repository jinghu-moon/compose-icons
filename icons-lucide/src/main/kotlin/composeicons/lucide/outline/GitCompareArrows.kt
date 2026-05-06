package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GitCompareArrows: ImageVector
    get() {
        if (_gitCompareArrows != null) return _gitCompareArrows!!
        _gitCompareArrows = lucideOutlineIcon(
            name = "GitCompareArrows",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 6C8 7.657 6.657 9 5 9 3.343 9 2 7.657 2 6 2 4.343 3.343 3 5 3 6.657 3 8 4.343 8 6Z")
            addPathData("M12 6h5c1.105 0 2 .895 2 2v7")
            addPathData("M15 9 12 6 15 3")
            addPathData("M22 18c0 1.657-1.343 3-3 3-1.657 0-3-1.343-3-3 0-1.657 1.343-3 3-3 1.657 0 3 1.343 3 3Z")
            addPathData("M12 18h-5C5.895 18 5 17.105 5 16v-7")
            addPathData("M9 15l3 3L9 21")
        }
        return _gitCompareArrows!!
    }

private var _gitCompareArrows: ImageVector? = null
