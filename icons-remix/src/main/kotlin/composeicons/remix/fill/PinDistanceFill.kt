package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.PinDistanceFill: ImageVector
    get() {
        if (_pinDistanceFill != null) return _pinDistanceFill!!
        _pinDistanceFill = remixIcon(
            name = "PinDistanceFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.389 10.389 7.5 14.278 3.611 10.389C1.463 8.241 1.463 4.759 3.611 2.611 5.759 .463 9.241 .463 11.389 2.611c2.148 2.148 2.148 5.63 0 7.778ZM7.5 8.5c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2ZM20.389 19.389l-3.889 3.889L12.611 19.389c-2.148-2.148-2.148-5.63 0-7.778 2.148-2.148 5.63-2.148 7.778 0 2.148 2.148 2.148 5.63 0 7.778ZM16.5 17.5c1.105 0 2-.895 2-2 0-1.105-.895-2-2-2-1.105 0-2 .895-2 2 0 1.105 .895 2 2 2Z"),
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
        return _pinDistanceFill!!
    }

private var _pinDistanceFill: ImageVector? = null
