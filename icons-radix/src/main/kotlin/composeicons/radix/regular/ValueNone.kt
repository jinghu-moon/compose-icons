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
                pathData = parseSvgPathData("M7.499 .877c1.649 0 3.156 .604 4.315 1.601l.832-.831c.195-.195 .512-.195 .707 0 .195 .195 .195 .512 0 .707l-.832 .831c.997 1.159 1.6 2.666 1.601 4.314 0 3.658-2.965 6.623-6.623 6.623C5.85 14.122 4.344 13.519 3.185 12.522l-.831 .832c-.195 .195-.512 .195-.707 0-.195-.195-.195-.512 0-.707l.831-.832C1.481 10.655 .877 9.148 .877 7.499 .877 3.842 3.842 .877 7.499 .877ZM3.857 11.849c.985 .826 2.255 1.323 3.642 1.323 3.133 0 5.673-2.54 5.673-5.673C13.172 6.113 12.675 4.843 11.849 3.858L3.857 11.849ZM7.499 1.826C4.367 1.827 1.827 4.367 1.826 7.499c0 1.386 .499 2.656 1.325 3.642L11.141 3.151C10.155 2.325 8.886 1.826 7.499 1.826Z"),
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
