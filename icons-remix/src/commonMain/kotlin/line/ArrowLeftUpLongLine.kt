package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ArrowLeftUpLongLine: ImageVector
    get() {
        if (_arrowLeftUpLongLine != null) return _arrowLeftUpLongLine!!
        _arrowLeftUpLongLine = remixIcon(
            name = "ArrowLeftUpLongLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.778 18.364 L 18.364 19.778 L 6.929 8.343 L 6.929 13.929 L 4.929 13.929 L 4.929 4.929 L 13.929 4.929 L 13.929 6.929 L 8.343 6.929 L 19.778 18.364 Z"),
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
        return _arrowLeftUpLongLine!!
    }

private var _arrowLeftUpLongLine: ImageVector? = null
