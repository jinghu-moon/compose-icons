package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MediumFill: ImageVector
    get() {
        if (_mediumFill != null) return _mediumFill!!
        _mediumFill = remixIcon(
            name = "MediumFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.158 3.000 L 17.842 3.000 C 19.586 3.000 21.000 4.414 21.000 6.158 L 21.000 9.524 C 20.919 9.518 20.837 9.516 20.755 9.516 C 20.353 9.516 19.859 9.614 19.508 9.791 C 19.108 9.976 18.755 10.253 18.461 10.616 C 17.989 11.202 17.702 11.993 17.633 12.882 C 17.618 13.059 17.613 13.237 17.616 13.414 C 17.663 15.428 18.751 17.038 20.684 17.038 C 20.792 17.038 20.897 17.032 21.000 17.023 L 21.000 17.842 C 21.000 19.586 19.586 21.000 17.842 21.000 L 6.158 21.000 C 4.414 21.000 3.000 19.586 3.000 17.842 L 3.000 6.158 C 3.000 4.414 4.414 3.000 6.158 3.000 ZM 21.000 15.388 L 21.000 12.662 L 19.347 12.662 C 19.273 13.978 19.993 15.091 21.000 15.388 ZM 21.000 12.281 L 21.000 9.973 C 20.920 9.952 20.834 9.940 20.743 9.938 C 19.929 9.955 19.444 10.930 19.384 12.281 L 21.000 12.281 ZM 17.697 7.300 L 17.712 7.297 L 17.712 7.187 L 14.813 7.187 L 12.121 13.513 L 9.430 7.187 L 6.306 7.187 L 6.306 7.297 L 6.320 7.300 C 6.849 7.419 7.117 7.598 7.117 8.240 L 7.117 15.759 C 7.117 16.402 6.848 16.580 6.319 16.699 L 6.305 16.702 L 6.305 16.813 L 8.424 16.813 L 8.424 16.703 L 8.410 16.700 C 7.881 16.580 7.612 16.402 7.612 15.760 L 7.612 8.676 L 11.070 16.813 L 11.266 16.813 L 14.825 8.449 L 14.825 15.946 C 14.779 16.453 14.513 16.610 14.034 16.718 L 14.020 16.721 L 14.020 16.830 L 17.712 16.830 L 17.712 16.721 L 17.697 16.718 C 17.218 16.610 16.945 16.453 16.900 15.946 L 16.897 8.240 L 16.900 8.240 C 16.900 7.598 17.168 7.419 17.697 7.300 Z"),
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
        return _mediumFill!!
    }

private var _mediumFill: ImageVector? = null
