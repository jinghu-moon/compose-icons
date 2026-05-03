package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.UpworkFill: ImageVector
    get() {
        if (_upworkFill != null) return _upworkFill!!
        _upworkFill = remixIcon(
            name = "UpworkFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 15.883 8.283 C 15.238 8.314 14.615 8.541 14.100 8.938 C 13.511 9.391 13.099 10.037 12.939 10.763 C 12.589 10.031 12.325 9.261 12.151 8.470 L 9.553 8.470 L 9.553 11.692 C 9.553 12.863 9.022 13.731 7.982 13.731 C 6.942 13.731 6.351 12.867 6.351 11.692 L 6.351 8.470 L 4.857 8.470 L 4.857 11.692 C 4.824 12.585 5.132 13.458 5.719 14.132 C 6.005 14.443 6.355 14.690 6.744 14.856 C 7.134 15.021 7.555 15.101 7.979 15.090 C 9.777 15.090 11.037 13.707 11.037 11.729 L 11.037 9.551 C 11.343 10.723 11.848 11.834 12.530 12.835 L 11.731 17.395 L 13.248 17.395 L 13.774 14.164 C 13.949 14.314 14.134 14.451 14.329 14.572 C 14.836 14.892 15.418 15.072 16.018 15.094 L 16.156 15.094 C 16.602 15.098 17.044 15.013 17.456 14.843 C 17.868 14.672 18.241 14.420 18.553 14.102 C 18.864 13.783 19.108 13.405 19.270 12.989 C 19.431 12.574 19.507 12.130 19.493 11.685 C 19.504 11.241 19.424 10.799 19.261 10.387 C 19.097 9.974 18.853 9.597 18.541 9.281 C 18.229 8.965 17.857 8.715 17.447 8.546 C 17.037 8.376 16.596 8.291 16.152 8.295 L 15.883 8.283 ZM 16.160 9.645 C 17.212 9.645 18.013 10.461 18.013 11.685 C 18.013 12.908 17.196 13.724 16.160 13.724 L 15.993 13.734 C 15.623 13.691 15.266 13.572 14.944 13.382 C 14.577 13.165 14.266 12.862 14.039 12.500 C 14.312 10.322 15.108 9.645 16.160 9.645 Z"),
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
        return _upworkFill!!
    }

private var _upworkFill: ImageVector? = null
