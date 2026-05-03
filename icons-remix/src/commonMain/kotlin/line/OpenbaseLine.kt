package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.OpenbaseLine: ImageVector
    get() {
        if (_openbaseLine != null) return _openbaseLine!!
        _openbaseLine = remixIcon(
            name = "OpenbaseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 3.000 L 2.000 5.996 L 3.000 15.460 L 12.000 22.500 L 21.000 15.460 L 22.000 5.996 L 12.000 3.000 ZM 19.837 7.436 L 12.000 19.961 L 4.163 7.436 L 12.000 5.088 L 19.837 7.436 Z"),
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
        return _openbaseLine!!
    }

private var _openbaseLine: ImageVector? = null
