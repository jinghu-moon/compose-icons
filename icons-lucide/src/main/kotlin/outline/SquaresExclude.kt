package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquaresExclude: ImageVector
    get() {
        if (_squaresExclude != null) return _squaresExclude!!
        _squaresExclude = lucideOutlineIcon(
            name = "SquaresExclude",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 12.000 L 16.000 14.000 C 16.000 15.105 15.105 16.000 14.000 16.000 L 9.000 16.000 C 8.448 16.000 8.000 16.448 8.000 17.000 L 8.000 20.000 C 8.000 21.105 8.895 22.000 10.000 22.000 L 20.000 22.000 C 21.105 22.000 22.000 21.105 22.000 20.000 L 22.000 10.000 C 22.000 8.895 21.105 8.000 20.000 8.000 L 20.000 8.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 4.000 16.000 C 2.895 16.000 2.000 15.105 2.000 14.000 L 2.000 4.000 C 2.000 2.895 2.895 2.000 4.000 2.000 L 14.000 2.000 C 15.105 2.000 16.000 2.895 16.000 4.000 L 16.000 7.000 C 16.000 7.552 15.552 8.000 15.000 8.000 L 10.000 8.000 C 8.895 8.000 8.000 8.895 8.000 10.000 L 8.000 12.000"),
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
        return _squaresExclude!!
    }

private var _squaresExclude: ImageVector? = null
