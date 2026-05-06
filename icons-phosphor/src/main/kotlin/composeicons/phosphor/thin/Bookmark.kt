package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bookmark: ImageVector
    get() {
        if (_bookmark != null) return _bookmark!!
        _bookmark = phosphorThinIcon(
            name = "Bookmark",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 36h-112C65.373 36 60 41.373 60 48v176c.001 1.454 .79 2.793 2.062 3.497 1.272 .704 2.825 .663 4.058-.107L128 188.72l61.89 38.67c.633 .396 1.364 .608 2.11 .61 .678-.002 1.345-.174 1.94-.5 1.272-.705 2.061-2.046 2.06-3.5v-176c0-6.627-5.373-12-12-12ZM72 44h112c2.209 0 4 1.791 4 4v120.78L130.11 132.61c-1.297-.811-2.943-.811-4.24 0L68 168.78v-120.78c0-2.209 1.791-4 4-4ZM130.11 180.61c-1.297-.811-2.943-.811-4.24 0L68 216.78v-38.56l60-37.5 60 37.5v38.56Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null
