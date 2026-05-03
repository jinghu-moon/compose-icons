package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.NotionLogo: ImageVector
    get() {
        if (_notionLogo != null) return _notionLogo!!
        _notionLogo = radixIcon(
            name = "NotionLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.325 0.781 C 10.245 0.702 10.482 0.755 11.060 1.175 L 13.450 2.855 C 13.843 3.143 13.975 3.222 13.975 3.536 L 13.975 12.749 C 13.975 13.326 13.765 13.668 13.030 13.721 L 4.335 14.245 C 3.783 14.271 3.520 14.193 3.231 13.825 L 1.471 11.542 C 1.156 11.122 1.025 10.807 1.025 10.439 L 1.025 2.250 C 1.025 1.778 1.236 1.384 1.839 1.332 L 9.325 0.781 ZM 4.124 4.324 C 3.809 4.351 3.704 4.508 3.704 4.850 L 3.704 12.670 C 3.704 13.090 3.914 13.248 4.387 13.222 L 12.556 12.749 C 13.029 12.723 13.082 12.434 13.082 12.093 L 13.082 4.324 C 13.082 3.983 12.951 3.799 12.661 3.825 L 4.124 4.324 ZM 11.769 5.269 C 11.821 5.505 11.768 5.741 11.531 5.768 L 11.138 5.847 L 11.138 11.620 C 10.796 11.804 10.481 11.909 10.219 11.909 C 9.799 11.909 9.693 11.778 9.378 11.385 L 6.803 7.343 L 6.803 11.253 L 7.618 11.438 C 7.618 11.454 7.606 11.909 6.961 11.909 L 5.149 12.015 C 5.096 11.910 5.149 11.648 5.332 11.595 L 5.806 11.463 L 5.806 6.293 L 5.149 6.240 C 5.096 6.004 5.227 5.663 5.595 5.637 L 7.539 5.505 L 10.219 9.600 L 10.219 5.978 L 9.535 5.899 C 9.483 5.611 9.693 5.400 9.955 5.374 L 11.769 5.269 ZM 9.641 1.516 L 2.443 2.041 C 2.181 2.067 2.128 2.199 2.233 2.304 L 3.258 3.117 C 3.678 3.458 3.835 3.431 4.623 3.379 L 12.057 2.933 C 12.214 2.933 12.084 2.777 12.031 2.750 L 10.796 1.857 C 10.560 1.674 10.245 1.463 9.641 1.516 Z"),
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
        return _notionLogo!!
    }

private var _notionLogo: ImageVector? = null
