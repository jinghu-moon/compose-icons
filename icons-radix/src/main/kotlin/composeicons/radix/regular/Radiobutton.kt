package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Radiobutton: ImageVector
    get() {
        if (_radiobutton != null) return _radiobutton!!
        _radiobutton = radixIcon(
            name = "Radiobutton",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.499 .877c3.657 0 6.623 2.965 6.623 6.622 0 3.658-2.965 6.623-6.623 6.623C3.842 14.122 .877 11.156 .877 7.499 .877 3.842 3.842 .877 7.499 .877ZM7.499 1.826C4.367 1.827 1.827 4.367 1.826 7.499c0 3.133 2.54 5.672 5.673 5.673 3.133 0 5.673-2.54 5.673-5.673C13.172 4.366 10.632 1.826 7.499 1.826ZM7.5 5.5c1.105 0 2 .895 2 2-0 1.105-.895 2-2 2-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2Z"),
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
        return _radiobutton!!
    }

private var _radiobutton: ImageVector? = null
