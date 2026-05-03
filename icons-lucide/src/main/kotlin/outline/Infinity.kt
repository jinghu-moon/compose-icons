package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Infinity: ImageVector
    get() {
        if (_infinity != null) return _infinity!!
        _infinity = lucideOutlineIcon(
            name = "Infinity",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.000 16.000 C 11.000 16.000 13.000 8.000 18.000 8.000 C 20.209 8.000 22.000 9.791 22.000 12.000 C 22.000 14.209 20.209 16.000 18.000 16.000 C 13.000 16.000 11.000 8.000 6.000 8.000 C 3.791 8.000 2.000 9.791 2.000 12.000 C 2.000 14.209 3.791 16.000 6.000 16.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _infinity!!
    }

private var _infinity: ImageVector? = null
