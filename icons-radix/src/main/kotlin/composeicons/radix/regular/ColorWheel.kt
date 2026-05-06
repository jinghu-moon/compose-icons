package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.ColorWheel: ImageVector
    get() {
        if (_colorWheel != null) return _colorWheel!!
        _colorWheel = radixIcon(
            name = "ColorWheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.499 .877c3.657 0 6.623 2.965 6.623 6.622 0 3.658-2.965 6.623-6.623 6.623C3.842 14.122 .877 11.156 .877 7.499 .877 3.842 3.842 .877 7.499 .877ZM3.782 11.782c.902 .783 2.052 1.286 3.317 1.374v-4.69L3.782 11.782ZM7.901 13.156c1.265-.088 2.414-.591 3.315-1.374L7.901 8.467v4.689ZM1.842 7.9c.088 1.265 .591 2.414 1.374 3.315L6.533 7.9h-4.691ZM11.782 11.216c.783-.901 1.286-2.05 1.374-3.315h-4.689l3.315 3.315ZM8.467 7.1h4.689C13.068 5.834 12.566 4.684 11.782 3.782L8.467 7.1ZM3.216 3.782C2.433 4.684 1.93 5.834 1.842 7.1h4.691L3.216 3.782ZM7.1 1.842C5.834 1.93 4.684 2.434 3.782 3.217L7.1 6.533v-4.691ZM7.901 6.533 11.216 3.217C10.315 2.434 9.166 1.93 7.901 1.842v4.691Z"),
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
        return _colorWheel!!
    }

private var _colorWheel: ImageVector? = null
