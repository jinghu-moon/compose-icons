package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Clipboard: ImageVector
    get() {
        if (_clipboard != null) return _clipboard!!
        _clipboard = radixIcon(
            name = "Clipboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.250 0.000 C 10.664 0.000 11.000 0.336 11.000 0.750 L 11.000 1.000 L 11.500 1.000 C 12.328 1.000 13.000 1.672 13.000 2.500 L 13.000 12.500 C 13.000 13.328 12.328 14.000 11.500 14.000 L 3.500 14.000 C 2.672 14.000 2.000 13.328 2.000 12.500 L 2.000 2.500 C 2.000 1.672 2.672 1.000 3.500 1.000 L 4.000 1.000 L 4.000 0.750 C 4.000 0.336 4.336 0.000 4.750 0.000 L 10.250 0.000 ZM 3.500 2.000 C 3.224 2.000 3.000 2.224 3.000 2.500 L 3.000 12.500 C 3.000 12.776 3.224 13.000 3.500 13.000 L 11.500 13.000 C 11.776 13.000 12.000 12.776 12.000 12.500 L 12.000 2.500 C 12.000 2.224 11.776 2.000 11.500 2.000 L 11.000 2.000 L 11.000 2.250 C 11.000 2.664 10.664 3.000 10.250 3.000 L 4.750 3.000 C 4.336 3.000 4.000 2.664 4.000 2.250 L 4.000 2.000 L 3.500 2.000 ZM 5.000 2.000 L 10.000 2.000 L 10.000 1.000 L 5.000 1.000 L 5.000 2.000 Z"),
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
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
