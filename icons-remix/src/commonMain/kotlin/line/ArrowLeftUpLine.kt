package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowLeftUpLine: ImageVector
    get() {
        if (_arrowLeftUpLine != null) return _arrowLeftUpLine!!
        _arrowLeftUpLine = remixIcon(
            name = "ArrowLeftUpLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.414 8.000 L 18.021 16.607 L 16.607 18.021 L 8.000 9.414 L 8.000 17.000 L 6.000 17.000 L 6.000 6.000 L 17.000 6.000 L 17.000 8.000 L 9.414 8.000 Z"),
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
        return _arrowLeftUpLine!!
    }

private var _arrowLeftUpLine: ImageVector? = null
