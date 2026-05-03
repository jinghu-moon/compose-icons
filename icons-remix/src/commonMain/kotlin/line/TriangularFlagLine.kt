package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.TriangularFlagLine: ImageVector
    get() {
        if (_triangularFlagLine != null) return _triangularFlagLine!!
        _triangularFlagLine = remixIcon(
            name = "TriangularFlagLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 5.144 L 6.000 16.000 L 18.339 16.000 L 6.000 5.144 ZM 4.000 2.932 C 4.000 2.072 5.015 1.613 5.661 2.181 L 21.650 16.249 C 22.342 16.858 21.912 18.000 20.990 18.000 L 6.000 18.000 L 6.000 22.000 L 4.000 22.000 L 4.000 2.932 Z"),
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
        return _triangularFlagLine!!
    }

private var _triangularFlagLine: ImageVector? = null
