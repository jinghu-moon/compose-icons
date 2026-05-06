package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CurrencyInr: ImageVector
    get() {
        if (_currencyInr != null) return _currencyInr!!
        _currencyInr = phosphorThinIcon(
            name = "CurrencyInr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M204 80c0 2.209-1.791 4-4 4h-36.58c.381 2.65 .575 5.323 .58 8-.033 30.914-25.086 55.967-56 56h-25.65l80.34 73c1.078 .956 1.558 2.417 1.258 3.826-.3 1.409-1.335 2.547-2.709 2.981-1.374 .433-2.874 .095-3.929-.887l-88-80c-1.193-1.117-1.587-2.847-.995-4.37 .592-1.523 2.051-2.533 3.685-2.55h36c14.127-.003 27.536-6.229 36.655-17.019C153.773 112.19 157.675 97.93 155.32 84h-83.32c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h81.25C146.448 56.84 128.331 44.029 108 44h-36c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h128c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-63.19c11.971 7.209 20.83 18.616 24.85 32h38.34c2.209 0 4 1.791 4 4Z"),
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
        return _currencyInr!!
    }

private var _currencyInr: ImageVector? = null
