package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowLeftUpFill: ImageVector
    get() {
        if (_arrowLeftUpFill != null) return _arrowLeftUpFill!!
        _arrowLeftUpFill = remixIcon(
            name = "ArrowLeftUpFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.361 10.947 L 18.018 16.604 L 16.603 18.018 L 10.947 12.361 L 5.997 17.311 L 5.997 5.997 L 17.310 5.997 L 12.361 10.947 Z"),
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
        return _arrowLeftUpFill!!
    }

private var _arrowLeftUpFill: ImageVector? = null
