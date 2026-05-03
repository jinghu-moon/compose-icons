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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 11.389 10.389 L 7.500 14.278 L 3.611 10.389 C 1.463 8.241 1.463 4.759 3.611 2.611 C 5.759 0.463 9.241 0.463 11.389 2.611 C 13.537 4.759 13.537 8.241 11.389 10.389 ZM 7.500 8.500 C 8.605 8.500 9.500 7.605 9.500 6.500 C 9.500 5.395 8.605 4.500 7.500 4.500 C 6.395 4.500 5.500 5.395 5.500 6.500 C 5.500 7.605 6.395 8.500 7.500 8.500 ZM 20.389 19.389 L 16.500 23.278 L 12.611 19.389 C 10.463 17.241 10.463 13.759 12.611 11.611 C 14.759 9.463 18.241 9.463 20.389 11.611 C 22.537 13.759 22.537 17.241 20.389 19.389 ZM 16.500 17.500 C 17.605 17.500 18.500 16.605 18.500 15.500 C 18.500 14.395 17.605 13.500 16.500 13.500 C 15.395 13.500 14.500 14.395 14.500 15.500 C 14.500 16.605 15.395 17.500 16.500 17.500 Z"),
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
        return _pinDistanceFill!!
    }

private var _pinDistanceFill: ImageVector? = null
