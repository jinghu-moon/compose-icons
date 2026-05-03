package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ShiningLine: ImageVector
    get() {
        if (_shiningLine != null) return _shiningLine!!
        _shiningLine = remixIcon(
            name = "ShiningLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 1.000 11.000 C 6.523 11.000 11.000 6.523 11.000 1.000 L 13.000 1.000 C 13.000 6.523 17.477 11.000 23.000 11.000 L 23.000 13.000 C 17.477 13.000 13.000 17.477 13.000 23.000 L 11.000 23.000 C 11.000 17.477 6.523 13.000 1.000 13.000 L 1.000 11.000 ZM 5.803 12.000 C 8.569 13.209 10.791 15.431 12.000 18.197 C 13.209 15.431 15.431 13.209 18.197 12.000 C 15.431 10.791 13.209 8.569 12.000 5.803 C 10.791 8.569 8.569 10.791 5.803 12.000 Z"),
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
        return _shiningLine!!
    }

private var _shiningLine: ImageVector? = null
