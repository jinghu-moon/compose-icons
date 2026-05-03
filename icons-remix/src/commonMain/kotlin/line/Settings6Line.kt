package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Settings6Line: ImageVector
    get() {
        if (_settings6Line != null) return _settings6Line!!
        _settings6Line = remixIcon(
            name = "Settings6Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.500 2.474 L 23.000 12.000 L 17.500 21.526 L 6.500 21.526 L 1.000 12.000 L 6.500 2.474 L 17.500 2.474 ZM 16.345 4.474 L 7.655 4.474 L 3.309 12.000 L 7.655 19.526 L 16.345 19.526 L 20.691 12.000 L 16.345 4.474 ZM 8.634 8.170 L 10.366 7.170 L 15.366 15.830 L 13.634 16.830 L 8.634 8.170 Z"),
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
        return _settings6Line!!
    }

private var _settings6Line: ImageVector? = null
