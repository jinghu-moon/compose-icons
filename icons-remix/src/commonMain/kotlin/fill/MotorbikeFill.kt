package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MotorbikeFill: ImageVector
    get() {
        if (_motorbikeFill != null) return _motorbikeFill!!
        _motorbikeFill = remixIcon(
            name = "MotorbikeFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 8.365 10.000 L 11.200 8.000 L 14.691 8.000 L 13.600 5.000 L 11.000 5.000 L 11.000 3.000 L 15.000 3.000 L 16.092 6.000 L 20.000 6.000 L 20.000 9.000 L 17.184 9.000 L 18.640 13.002 C 21.061 13.076 23.000 15.062 23.000 17.500 C 23.000 19.985 20.985 22.000 18.500 22.000 C 16.015 22.000 14.000 19.985 14.000 17.500 C 14.000 15.672 15.090 14.099 16.655 13.394 L 15.419 10.000 L 14.472 10.000 L 12.890 15.870 L 9.965 16.939 C 9.988 17.123 10.000 17.310 10.000 17.500 C 10.000 19.985 7.985 22.000 5.500 22.000 C 3.015 22.000 1.000 19.985 1.000 17.500 C 1.000 15.541 2.252 13.874 4.000 13.256 L 4.000 12.000 L 2.000 12.000 L 2.000 10.000 L 8.365 10.000 ZM 5.500 20.000 C 6.881 20.000 8.000 18.881 8.000 17.500 C 8.000 16.119 6.881 15.000 5.500 15.000 C 4.119 15.000 3.000 16.119 3.000 17.500 C 3.000 18.881 4.119 20.000 5.500 20.000 ZM 18.500 20.000 C 19.881 20.000 21.000 18.881 21.000 17.500 C 21.000 16.119 19.881 15.000 18.500 15.000 C 17.119 15.000 16.000 16.119 16.000 17.500 C 16.000 18.881 17.119 20.000 18.500 20.000 Z"),
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
        return _motorbikeFill!!
    }

private var _motorbikeFill: ImageVector? = null
