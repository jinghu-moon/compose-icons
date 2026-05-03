package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Avatar: ImageVector
    get() {
        if (_avatar != null) return _avatar!!
        _avatar = radixIcon(
            name = "Avatar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.499 0.877 C 11.156 0.877 14.122 3.842 14.122 7.499 C 14.122 11.157 11.157 14.122 7.499 14.122 C 3.842 14.122 0.877 11.156 0.877 7.499 C 0.877 3.842 3.842 0.877 7.499 0.877 ZM 7.500 9.975 C 6.015 9.975 4.719 10.780 4.021 11.979 C 4.981 12.726 6.188 13.172 7.499 13.172 C 8.811 13.172 10.018 12.725 10.979 11.978 C 10.280 10.780 8.985 9.975 7.500 9.975 ZM 7.499 1.826 C 4.367 1.827 1.827 4.367 1.826 7.499 C 1.826 8.971 2.388 10.312 3.308 11.320 C 4.191 9.941 5.738 9.026 7.500 9.026 C 9.261 9.026 10.808 9.941 11.691 11.319 C 12.611 10.311 13.172 8.971 13.172 7.499 C 13.172 4.366 10.632 1.826 7.499 1.826 ZM 7.500 4.155 C 8.798 4.155 9.850 5.207 9.850 6.505 C 9.850 7.803 8.798 8.855 7.500 8.855 C 6.202 8.855 5.151 7.803 5.150 6.505 C 5.150 5.207 6.202 4.155 7.500 4.155 ZM 7.500 5.105 C 6.727 5.105 6.100 5.732 6.100 6.505 C 6.100 7.278 6.727 7.905 7.500 7.905 C 8.273 7.905 8.900 7.278 8.900 6.505 C 8.900 5.732 8.273 5.105 7.500 5.105 Z"),
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
        return _avatar!!
    }

private var _avatar: ImageVector? = null
