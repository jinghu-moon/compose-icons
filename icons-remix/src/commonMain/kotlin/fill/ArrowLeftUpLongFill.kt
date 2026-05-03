package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowLeftUpLongFill: ImageVector
    get() {
        if (_arrowLeftUpLongFill != null) return _arrowLeftUpLongFill!!
        _arrowLeftUpLongFill = remixIcon(
            name = "ArrowLeftUpLongFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.364 19.778 L 19.778 18.364 L 10.172 8.757 L 14.000 4.929 L 4.929 4.929 L 4.929 14.000 L 8.757 10.172 L 18.364 19.778 Z"),
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
        return _arrowLeftUpLongFill!!
    }

private var _arrowLeftUpLongFill: ImageVector? = null
