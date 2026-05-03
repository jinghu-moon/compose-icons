package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ValueNone: ImageVector
    get() {
        if (_valueNone != null) return _valueNone!!
        _valueNone = radixIcon(
            name = "ValueNone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.499 0.877 C 9.148 0.877 10.655 1.481 11.814 2.478 L 12.646 1.647 C 12.842 1.451 13.158 1.451 13.354 1.647 C 13.549 1.842 13.549 2.158 13.354 2.354 L 12.521 3.185 C 13.519 4.344 14.122 5.850 14.122 7.499 C 14.122 11.157 11.157 14.122 7.499 14.122 C 5.850 14.122 4.344 13.519 3.185 12.522 L 2.354 13.354 C 2.158 13.549 1.842 13.549 1.647 13.354 C 1.451 13.158 1.451 12.842 1.647 12.647 L 2.478 11.815 C 1.481 10.655 0.877 9.148 0.877 7.499 C 0.877 3.842 3.842 0.877 7.499 0.877 ZM 3.857 11.849 C 4.843 12.675 6.113 13.172 7.499 13.172 C 10.632 13.172 13.172 10.632 13.172 7.499 C 13.172 6.113 12.675 4.843 11.849 3.858 L 3.857 11.849 ZM 7.499 1.826 C 4.367 1.827 1.827 4.367 1.826 7.499 C 1.826 8.886 2.325 10.155 3.151 11.141 L 11.141 3.151 C 10.155 2.325 8.886 1.826 7.499 1.826 Z"),
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
        return _valueNone!!
    }

private var _valueNone: ImageVector? = null
