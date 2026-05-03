package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MediumLine: ImageVector
    get() {
        if (_mediumLine != null) return _mediumLine!!
        _mediumLine = remixIcon(
            name = "MediumLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.158 4.000 L 17.842 4.000 C 19.034 4.000 20.000 4.966 20.000 6.158 L 20.000 9.613 C 19.823 9.658 19.653 9.717 19.508 9.791 C 19.108 9.976 18.755 10.253 18.461 10.616 C 17.989 11.202 17.703 11.993 17.633 12.882 C 17.618 13.059 17.613 13.237 17.616 13.414 C 17.657 15.177 18.496 16.629 20.000 16.965 L 20.000 17.842 C 20.000 19.034 19.034 20.000 17.842 20.000 L 6.158 20.000 C 4.966 20.000 4.000 19.034 4.000 17.842 L 4.000 6.158 C 4.000 4.966 4.966 4.000 6.158 4.000 ZM 21.000 6.158 C 21.000 4.414 19.586 3.000 17.842 3.000 L 6.158 3.000 C 4.414 3.000 3.000 4.414 3.000 6.158 L 3.000 17.842 C 3.000 19.586 4.414 21.000 6.158 21.000 L 17.842 21.000 C 19.586 21.000 21.000 19.586 21.000 17.842 L 21.000 6.158 ZM 20.000 10.298 L 20.000 12.281 L 19.384 12.281 C 19.423 11.414 19.636 10.701 20.000 10.298 ZM 20.000 12.662 L 20.000 14.725 C 19.559 14.212 19.301 13.476 19.347 12.662 L 20.000 12.662 ZM 17.697 7.300 L 17.712 7.297 L 17.712 7.187 L 14.813 7.187 L 12.121 13.513 L 9.430 7.187 L 6.306 7.187 L 6.306 7.297 L 6.320 7.300 C 6.849 7.419 7.118 7.598 7.118 8.240 L 7.118 15.759 C 7.118 16.402 6.848 16.580 6.319 16.699 L 6.305 16.702 L 6.305 16.813 L 8.424 16.813 L 8.424 16.703 L 8.410 16.700 C 7.881 16.580 7.612 16.402 7.612 15.760 L 7.612 8.676 L 11.070 16.813 L 11.266 16.813 L 14.825 8.449 L 14.825 15.946 C 14.779 16.453 14.513 16.610 14.034 16.718 L 14.020 16.721 L 14.020 16.830 L 17.712 16.830 L 17.712 16.721 L 17.697 16.718 C 17.218 16.610 16.945 16.453 16.900 15.946 L 16.897 8.240 L 16.900 8.240 C 16.900 7.598 17.169 7.419 17.697 7.300 Z"),
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
        return _mediumLine!!
    }

private var _mediumLine: ImageVector? = null
