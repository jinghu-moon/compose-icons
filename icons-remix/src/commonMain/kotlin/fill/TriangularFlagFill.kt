package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.TriangularFlagFill: ImageVector
    get() {
        if (_triangularFlagFill != null) return _triangularFlagFill!!
        _triangularFlagFill = remixIcon(
            name = "TriangularFlagFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 5.661 2.181 C 5.015 1.613 4.000 2.072 4.000 2.932 L 4.000 22.000 L 6.000 22.000 L 6.000 18.000 L 20.990 18.000 C 21.912 18.000 22.342 16.858 21.650 16.249 L 5.661 2.181 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _triangularFlagFill!!
    }

private var _triangularFlagFill: ImageVector? = null
