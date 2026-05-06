package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bold: ImageVector
    get() {
        if (_bold != null) return _bold!!
        _bold = lucideOutlineIcon(
            name = "Bold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6 12h9c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-8C6.448 20 6 19.552 6 19v-14C6 4.448 6.448 4 7 4h7c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _bold!!
    }

private var _bold: ImageVector? = null
