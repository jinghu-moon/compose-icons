package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ClosedCaption: ImageVector
    get() {
        if (_closedCaption != null) return _closedCaption!!
        _closedCaption = lucideOutlineIcon(
            name = "ClosedCaption",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M10 9.17C8.757 8.733 7.375 9.158 6.592 10.217c-.783 1.06-.783 2.506 0 3.566 .783 1.06 2.166 1.484 3.408 1.047")
            addPathData("M17 9.17c-1.243-.437-2.625-.012-3.408 1.047-.783 1.06-.783 2.506 0 3.566 .783 1.06 2.166 1.484 3.408 1.047")
            addPathData("M4 5h16c1.105 0 2 .895 2 2v10c0 1.105-.895 2-2 2h-16C2.895 19 2 18.105 2 17v-10C2 5.895 2.895 5 4 5Z")
        }
        return _closedCaption!!
    }

private var _closedCaption: ImageVector? = null
