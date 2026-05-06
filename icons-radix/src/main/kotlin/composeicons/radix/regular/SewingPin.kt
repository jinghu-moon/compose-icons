package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.SewingPin: ImageVector
    get() {
        if (_sewingPin != null) return _sewingPin!!
        _sewingPin = radixIcon(
            name = "SewingPin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 1C8.881 1 10 2.119 10 3.5 10 4.709 9.141 5.718 8 5.949v7.551C8 13.776 7.776 14 7.5 14 7.224 14 7 13.776 7 13.5v-7.551C5.859 5.718 5 4.709 5 3.5 5 2.119 6.119 1 7.5 1ZM7.5 2C6.672 2 6 2.672 6 3.5 6 4.328 6.672 5 7.5 5 8.328 5 9 4.328 9 3.5 9 2.672 8.328 2 7.5 2Z"),
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
        return _sewingPin!!
    }

private var _sewingPin: ImageVector? = null
