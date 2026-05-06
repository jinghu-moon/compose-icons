package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CheckCircled: ImageVector
    get() {
        if (_checkCircled != null) return _checkCircled!!
        _checkCircled = radixIcon(
            name = "CheckCircled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.499 .877c3.657 0 6.623 2.965 6.623 6.622 0 3.658-2.965 6.623-6.623 6.623C3.842 14.122 .877 11.156 .877 7.499 .877 3.842 3.842 .877 7.499 .877ZM7.499 1.826C4.367 1.827 1.827 4.367 1.826 7.499c0 3.133 2.54 5.672 5.673 5.673 3.133 0 5.673-2.54 5.673-5.673C13.172 4.366 10.632 1.826 7.499 1.826ZM9.341 4.962c.159-.226 .471-.28 .697-.121 .226 .159 .28 .472 .121 .697L6.992 10.038c-.085 .121-.22 .198-.368 .21-.148 .012-.294-.042-.397-.147L4.644 8.487l.356-.35 .356-.351L6.52 8.971 9.341 4.962ZM4.65 7.78c.197-.193 .514-.19 .707 .007l-.713 .7c-.193-.197-.191-.514 .006-.707Z"),
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
        return _checkCircled!!
    }

private var _checkCircled: ImageVector? = null
