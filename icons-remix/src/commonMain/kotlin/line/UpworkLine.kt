package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.UpworkLine: ImageVector
    get() {
        if (_upworkLine != null) return _upworkLine!!
        _upworkLine = remixIcon(
            name = "UpworkLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 4.000 C 7.582 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.582 20.000 12.000 20.000 C 16.418 20.000 20.000 16.418 20.000 12.000 C 20.000 7.582 16.418 4.000 12.000 4.000 ZM 16.152 8.295 C 16.596 8.291 17.037 8.376 17.447 8.546 C 17.857 8.715 18.229 8.965 18.541 9.281 C 18.853 9.597 19.097 9.974 19.261 10.387 C 19.424 10.799 19.504 11.241 19.493 11.685 C 19.507 12.130 19.431 12.574 19.270 12.989 C 19.108 13.405 18.864 13.783 18.553 14.102 C 18.241 14.420 17.868 14.672 17.456 14.843 C 17.044 15.013 16.602 15.098 16.156 15.094 L 16.018 15.094 C 15.418 15.072 14.836 14.892 14.329 14.572 C 14.134 14.451 13.949 14.314 13.774 14.164 L 13.248 17.395 L 11.731 17.395 L 12.530 12.835 C 11.848 11.834 11.343 10.723 11.037 9.551 L 11.037 11.729 C 11.037 13.707 9.777 15.090 7.979 15.090 C 7.555 15.101 7.134 15.021 6.744 14.856 C 6.355 14.690 6.005 14.443 5.719 14.132 C 5.132 13.458 4.824 12.585 4.857 11.692 L 4.857 8.470 L 6.351 8.470 L 6.351 11.692 C 6.351 12.867 6.942 13.731 7.982 13.731 C 9.022 13.731 9.553 12.863 9.553 11.692 L 9.553 8.470 L 12.151 8.470 C 12.325 9.261 12.589 10.031 12.939 10.763 C 13.099 10.037 13.511 9.391 14.100 8.938 C 14.615 8.541 15.238 8.314 15.883 8.283 L 16.152 8.295 ZM 16.160 9.645 C 15.108 9.645 14.312 10.322 14.039 12.500 C 14.266 12.862 14.577 13.165 14.944 13.382 C 15.266 13.572 15.623 13.691 15.993 13.734 L 16.160 13.724 C 17.196 13.724 18.013 12.908 18.013 11.685 C 18.013 10.461 17.212 9.645 16.160 9.645 Z"),
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
        return _upworkLine!!
    }

private var _upworkLine: ImageVector? = null
