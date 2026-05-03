package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CircleBackslash: ImageVector
    get() {
        if (_circleBackslash != null) return _circleBackslash!!
        _circleBackslash = radixIcon(
            name = "CircleBackslash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.499 0.877 C 11.157 0.877 14.122 3.842 14.122 7.499 C 14.122 11.157 11.157 14.122 7.499 14.122 C 3.842 14.122 0.877 11.157 0.877 7.499 C 0.877 3.842 3.842 0.877 7.499 0.877 ZM 3.151 3.858 C 2.324 4.843 1.826 6.113 1.826 7.499 C 1.826 10.632 4.366 13.172 7.499 13.172 C 8.886 13.172 10.155 12.674 11.141 11.848 L 3.151 3.858 ZM 7.499 1.826 C 6.113 1.826 4.843 2.324 3.858 3.151 L 11.848 11.141 C 12.674 10.155 13.172 8.886 13.172 7.499 C 13.172 4.366 10.632 1.826 7.499 1.826 Z"),
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
        return _circleBackslash!!
    }

private var _circleBackslash: ImageVector? = null
