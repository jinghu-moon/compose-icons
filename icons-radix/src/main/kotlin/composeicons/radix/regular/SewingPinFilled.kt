package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.SewingPinFilled: ImageVector
    get() {
        if (_sewingPinFilled != null) return _sewingPinFilled!!
        _sewingPinFilled = radixIcon(
            name = "SewingPinFilled",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.5 1C8.881 1 10 2.119 10 3.5 10 4.709 9.141 5.718 8 5.949v7.551C8 13.776 7.776 14 7.5 14 7.224 14 7 13.776 7 13.5v-7.551C5.859 5.718 5 4.709 5 3.5 5 2.119 6.119 1 7.5 1Z"),
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
        return _sewingPinFilled!!
    }

private var _sewingPinFilled: ImageVector? = null
