package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.CardStack: ImageVector
    get() {
        if (_cardStack != null) return _cardStack!!
        _cardStack = radixIcon(
            name = "CardStack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.500 2.000 C 13.328 2.000 14.000 2.672 14.000 3.500 L 14.000 9.500 C 14.000 10.153 13.582 10.706 13.000 10.912 L 13.000 11.500 C 13.000 12.328 12.328 13.000 11.500 13.000 L 3.500 13.000 C 2.672 13.000 2.000 12.328 2.000 11.500 L 2.000 10.912 C 1.418 10.706 1.000 10.153 1.000 9.500 L 1.000 3.500 C 1.000 2.672 1.672 2.000 2.500 2.000 L 12.500 2.000 ZM 3.000 11.000 L 3.000 11.500 C 3.000 11.776 3.224 12.000 3.500 12.000 L 11.500 12.000 C 11.776 12.000 12.000 11.776 12.000 11.500 L 12.000 11.000 L 3.000 11.000 ZM 2.500 3.000 C 2.224 3.000 2.000 3.224 2.000 3.500 L 2.000 9.500 C 2.000 9.776 2.224 10.000 2.500 10.000 L 12.500 10.000 C 12.776 10.000 13.000 9.776 13.000 9.500 L 13.000 3.500 C 13.000 3.224 12.776 3.000 12.500 3.000 L 2.500 3.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _cardStack!!
    }

private var _cardStack: ImageVector? = null
