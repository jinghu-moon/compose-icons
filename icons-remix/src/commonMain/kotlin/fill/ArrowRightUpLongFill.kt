package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ArrowRightUpLongFill: ImageVector
    get() {
        if (_arrowRightUpLongFill != null) return _arrowRightUpLongFill!!
        _arrowRightUpLongFill = remixIcon(
            name = "ArrowRightUpLongFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.222 18.364 L 5.636 19.778 L 15.243 10.172 L 19.071 14.000 L 19.071 4.929 L 10.000 4.929 L 13.828 8.757 L 4.222 18.364 Z"),
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
        return _arrowRightUpLongFill!!
    }

private var _arrowRightUpLongFill: ImageVector? = null
