package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.NotificationFill: ImageVector
    get() {
        if (_notificationFill != null) return _notificationFill!!
        _notificationFill = remixIcon(
            name = "NotificationFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 16.971 2.000 21.000 6.043 21.000 11.031 L 21.000 20.000 L 3.000 20.000 L 3.000 11.031 C 3.000 6.043 7.029 2.000 12.000 2.000 ZM 9.500 21.000 L 14.500 21.000 C 14.500 22.381 13.381 23.500 12.000 23.500 C 10.619 23.500 9.500 22.381 9.500 21.000 Z"),
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
        return _notificationFill!!
    }

private var _notificationFill: ImageVector? = null
