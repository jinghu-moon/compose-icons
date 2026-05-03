package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WechatLine: ImageVector
    get() {
        if (_wechatLine != null) return _wechatLine!!
        _wechatLine = remixIcon(
            name = "WechatLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.001 14.676 C 10.001 14.655 10.001 14.634 10.001 14.614 C 10.001 12.106 12.017 9.996 14.754 9.381 C 14.390 7.079 11.960 5.200 8.901 5.200 C 5.580 5.200 3.001 7.413 3.001 9.979 C 3.001 10.949 3.361 11.880 4.041 12.678 C 4.073 12.716 4.124 12.772 4.193 12.843 C 4.785 13.452 5.137 14.246 5.195 15.080 C 5.909 14.668 6.743 14.512 7.558 14.639 C 7.724 14.665 7.860 14.685 7.963 14.698 C 8.271 14.738 8.584 14.759 8.901 14.759 C 9.278 14.759 9.646 14.730 10.001 14.676 ZM 10.458 16.627 C 9.955 16.713 9.434 16.759 8.901 16.759 C 8.494 16.759 8.095 16.732 7.705 16.681 C 7.583 16.666 7.432 16.644 7.251 16.615 C 6.877 16.557 6.494 16.632 6.171 16.827 L 4.267 17.975 C 4.121 18.065 3.949 18.106 3.777 18.092 C 3.338 18.055 3.012 17.674 3.048 17.240 L 3.199 15.460 C 3.237 15.009 3.077 14.563 2.759 14.237 C 2.662 14.136 2.581 14.049 2.518 13.975 C 1.564 12.854 1.001 11.473 1.001 9.979 C 1.001 6.235 4.538 3.200 8.901 3.200 C 12.960 3.200 16.304 5.827 16.750 9.208 C 20.122 9.361 22.801 11.723 22.801 14.614 C 22.801 15.807 22.345 16.910 21.572 17.804 C 21.521 17.864 21.455 17.934 21.376 18.014 C 21.119 18.274 20.990 18.630 21.021 18.990 L 21.142 20.413 C 21.172 20.759 20.908 21.063 20.552 21.092 C 20.413 21.103 20.274 21.071 20.156 20.999 L 18.612 20.082 C 18.351 19.927 18.041 19.867 17.738 19.913 C 17.591 19.936 17.469 19.953 17.370 19.966 C 17.054 20.007 16.730 20.028 16.401 20.028 C 13.707 20.028 11.403 18.620 10.458 16.627 ZM 17.435 17.936 C 18.002 17.849 18.579 17.911 19.111 18.111 C 19.249 17.550 19.537 17.030 19.952 16.609 C 20.003 16.559 20.039 16.520 20.058 16.497 C 20.547 15.932 20.801 15.284 20.801 14.614 C 20.801 12.809 18.898 11.200 16.401 11.200 C 13.904 11.200 12.001 12.809 12.001 14.614 C 12.001 16.418 13.904 18.028 16.401 18.028 C 16.642 18.028 16.881 18.012 17.115 17.982 C 17.196 17.972 17.303 17.957 17.435 17.936 Z"),
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
        return _wechatLine!!
    }

private var _wechatLine: ImageVector? = null
