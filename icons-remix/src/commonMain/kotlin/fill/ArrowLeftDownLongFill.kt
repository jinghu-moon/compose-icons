package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowLeftDownLongFill: ImageVector
    get() {
        if (_arrowLeftDownLongFill != null) return _arrowLeftDownLongFill!!
        _arrowLeftDownLongFill = remixIcon(
            name = "ArrowLeftDownLongFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.778 5.636 L 18.364 4.222 L 8.757 13.828 L 4.929 10.000 L 4.929 19.071 L 14.000 19.071 L 10.172 15.243 L 19.778 5.636 Z"),
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
        return _arrowLeftDownLongFill!!
    }

private var _arrowLeftDownLongFill: ImageVector? = null
