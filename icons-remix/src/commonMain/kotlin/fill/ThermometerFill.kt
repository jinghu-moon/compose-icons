package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.ThermometerFill: ImageVector
    get() {
        if (_thermometerFill != null) return _thermometerFill!!
        _thermometerFill = remixIcon(
            name = "ThermometerFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 20.556 3.444 C 22.119 5.006 22.119 7.538 20.556 9.101 L 12.356 17.301 C 11.714 17.943 10.872 18.348 9.970 18.448 L 6.591 18.822 L 4.293 21.121 C 3.903 21.512 3.269 21.512 2.879 21.121 C 2.488 20.731 2.488 20.098 2.879 19.707 L 5.177 17.408 L 5.552 14.031 C 5.653 13.128 6.057 12.286 6.699 11.644 L 14.900 3.444 C 16.462 1.882 18.994 1.882 20.556 3.444 ZM 11.364 12.636 L 9.950 14.050 L 12.071 16.172 L 13.485 14.757 L 11.364 12.636 ZM 14.193 9.808 L 12.778 11.222 L 14.900 13.343 L 16.314 11.929 L 14.193 9.808 ZM 17.021 6.979 L 15.607 8.393 L 17.728 10.515 L 19.142 9.101 L 17.021 6.979 Z"),
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
        return _thermometerFill!!
    }

private var _thermometerFill: ImageVector? = null
