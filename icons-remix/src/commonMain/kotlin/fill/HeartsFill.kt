package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.HeartsFill: ImageVector
    get() {
        if (_heartsFill != null) return _heartsFill!!
        _heartsFill = remixIcon(
            name = "HeartsFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.363 11.045 C 18.767 9.652 21.043 9.652 22.447 11.045 C 23.851 12.439 23.851 14.699 22.447 16.092 L 17.000 21.500 L 11.553 16.092 C 10.149 14.699 10.149 12.439 11.553 11.045 C 12.957 9.652 15.233 9.652 16.637 11.045 L 17.000 11.405 L 17.363 11.045 ZM 19.243 4.757 C 20.183 5.700 20.746 6.875 20.932 8.095 C 19.599 7.847 18.193 8.085 17.000 8.808 C 14.849 7.505 12.006 7.778 10.144 9.626 C 8.013 11.741 7.954 15.141 9.966 17.327 L 10.144 17.512 L 12.565 19.916 L 11.000 21.485 L 2.521 12.993 C 0.417 10.637 0.496 7.019 2.757 4.757 C 5.022 2.493 8.645 2.417 11.001 4.529 C 13.350 2.420 16.980 2.490 19.243 4.757 Z"),
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
        return _heartsFill!!
    }

private var _heartsFill: ImageVector? = null
