package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) return _twitterLogo!!
        _twitterLogo = radixIcon(
            name = "TwitterLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.360 1.569 C 11.373 1.569 12.179 2.049 12.722 2.743 C 13.306 2.624 13.855 2.410 14.351 2.115 C 14.156 2.727 13.740 3.240 13.200 3.565 C 13.201 3.566 13.201 3.567 13.201 3.568 C 13.731 3.504 14.236 3.364 14.705 3.155 L 14.704 3.157 C 14.367 3.663 13.941 4.107 13.453 4.470 C 13.479 4.647 13.496 4.824 13.496 5.001 C 13.496 8.687 10.687 12.975 5.521 12.975 C 4.038 12.975 2.650 12.567 1.460 11.861 L 1.226 11.715 L 1.145 11.653 C 0.979 11.490 0.944 11.228 1.074 11.025 C 1.087 11.004 1.103 10.985 1.118 10.967 C 1.192 10.845 1.320 10.762 1.465 10.750 L 1.556 10.752 L 1.796 10.776 C 2.630 10.839 3.455 10.716 4.190 10.395 C 3.464 10.074 2.885 9.480 2.584 8.744 L 2.502 8.520 C 2.454 8.369 2.489 8.203 2.594 8.084 C 2.597 8.080 2.602 8.076 2.605 8.071 C 1.965 7.508 1.560 6.682 1.560 5.761 L 1.560 5.728 C 1.560 5.568 1.644 5.420 1.781 5.339 C 1.827 5.312 1.877 5.297 1.928 5.287 C 1.707 4.863 1.581 4.381 1.581 3.869 C 1.581 3.401 1.584 2.811 1.913 2.280 C 1.986 2.163 2.105 2.092 2.232 2.073 C 2.392 2.022 2.570 2.053 2.702 2.161 L 2.774 2.233 L 3.008 2.505 C 4.085 3.696 5.565 4.510 7.234 4.737 C 7.234 4.723 7.233 4.710 7.233 4.696 C 7.233 2.969 8.634 1.569 10.360 1.569 ZM 10.360 2.569 C 9.186 2.569 8.233 3.521 8.233 4.696 C 8.233 4.863 8.252 5.025 8.288 5.183 C 8.323 5.335 8.284 5.496 8.184 5.615 C 8.108 5.705 8.005 5.765 7.892 5.785 L 7.776 5.793 C 5.709 5.689 3.852 4.798 2.494 3.416 C 2.484 3.552 2.481 3.702 2.481 3.869 C 2.481 4.624 2.866 5.291 3.450 5.682 L 3.508 5.728 C 3.633 5.845 3.682 6.026 3.628 6.194 C 3.566 6.385 3.385 6.513 3.185 6.506 C 2.971 6.499 2.764 6.468 2.563 6.420 C 2.800 7.166 3.427 7.739 4.206 7.896 C 4.411 7.937 4.560 8.114 4.567 8.322 C 4.574 8.531 4.436 8.717 4.234 8.772 C 4.054 8.820 3.868 8.851 3.678 8.866 C 4.067 9.396 4.689 9.744 5.393 9.756 C 5.583 9.759 5.751 9.882 5.812 10.063 C 5.872 10.243 5.812 10.442 5.662 10.560 C 4.954 11.115 4.131 11.453 3.274 11.602 C 3.979 11.843 4.735 11.975 5.521 11.975 C 10.020 11.975 12.496 8.257 12.496 5.001 C 12.496 3.713 11.594 2.569 10.360 2.569 Z"),
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
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null
