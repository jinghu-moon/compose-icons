package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PinDistanceLine: ImageVector
    get() {
        if (_pinDistanceLine != null) return _pinDistanceLine!!
        _pinDistanceLine = remixIcon(
            name = "PinDistanceLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.975 8.975c1.367-1.367 1.367-3.583 0-4.95C8.608 2.658 6.392 2.658 5.025 4.025c-1.367 1.367-1.367 3.583 0 4.95l2.475 2.475L9.975 8.975ZM7.5 14.278 3.611 10.389C1.463 8.241 1.463 4.759 3.611 2.611 5.759 .463 9.241 .463 11.389 2.611c2.148 2.148 2.148 5.63 0 7.778L7.5 14.278ZM7.5 8C6.672 8 6 7.328 6 6.5 6 5.672 6.672 5 7.5 5 8.328 5 9 5.672 9 6.5 9 7.328 8.328 8 7.5 8ZM16.5 20.45l2.475-2.475c1.367-1.367 1.367-3.583 0-4.95-1.367-1.367-3.583-1.367-4.95 0-1.367 1.367-1.367 3.583 0 4.95l2.475 2.475ZM20.389 19.389l-3.889 3.889L12.611 19.389c-2.148-2.148-2.148-5.63 0-7.778 2.148-2.148 5.63-2.148 7.778 0 2.148 2.148 2.148 5.63 0 7.778ZM16.5 17C15.672 17 15 16.328 15 15.5 15 14.672 15.672 14 16.5 14c.828 0 1.5 .672 1.5 1.5C18 16.328 17.328 17 16.5 17Z"),
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
        return _pinDistanceLine!!
    }

private var _pinDistanceLine: ImageVector? = null
