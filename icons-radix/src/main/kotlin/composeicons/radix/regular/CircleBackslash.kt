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
                pathData = parseSvgPathData("M7.499 .877c3.657 0 6.623 2.965 6.623 6.622 0 3.658-2.965 6.623-6.623 6.623C3.842 14.122 .877 11.157 .877 7.499 .877 3.842 3.842 .877 7.499 .877ZM3.151 3.858C2.324 4.843 1.826 6.113 1.826 7.499c0 3.133 2.54 5.672 5.673 5.673 1.386 0 2.656-.498 3.642-1.324L3.151 3.858ZM7.499 1.826C6.113 1.826 4.843 2.324 3.858 3.151l7.99 7.99c.826-.985 1.324-2.255 1.324-3.642C13.172 4.366 10.632 1.826 7.499 1.826Z"),
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
