package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowLeftDownFill: ImageVector
    get() {
        if (_arrowLeftDownFill != null) return _arrowLeftDownFill!!
        _arrowLeftDownFill = remixIcon(
            name = "ArrowLeftDownFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.361 13.052 L 17.310 18.001 L 5.997 18.001 L 5.997 6.688 L 10.947 11.637 L 16.603 5.980 L 18.018 7.395 L 12.361 13.052 Z"),
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
        return _arrowLeftDownFill!!
    }

private var _arrowLeftDownFill: ImageVector? = null
