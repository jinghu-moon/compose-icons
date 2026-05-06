package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.NotificationOffLine: ImageVector
    get() {
        if (_notificationOffLine != null) return _notificationOffLine!!
        _notificationOffLine = remixIcon(
            name = "NotificationOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M18.586 20h-14.586c-.276 0-.5-.224-.5-.5 0-.108 .035-.213 .1-.3l.4-.533v-8.667c0-1.33 .324-2.584 .899-3.687L1.394 2.808 2.808 1.393 22.607 21.192l-1.414 1.414L18.586 20ZM6.408 7.822C6.145 8.497 6 9.232 6 10v8h10.586L6.408 7.822ZM20 15.786l-2-2v-3.786c0-3.314-2.686-6-6-6-1.089 0-2.109 .29-2.989 .797L7.559 3.345C8.83 2.495 10.357 2 12 2c4.418 0 8 3.582 8 8v5.786ZM9.5 21h5c0 1.381-1.119 2.5-2.5 2.5C10.619 23.5 9.5 22.381 9.5 21Z"),
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
        return _notificationOffLine!!
    }

private var _notificationOffLine: ImageVector? = null
