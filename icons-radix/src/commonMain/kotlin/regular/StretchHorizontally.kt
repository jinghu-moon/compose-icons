package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.StretchHorizontally: ImageVector
    get() {
        if (_stretchHorizontally != null) return _stretchHorizontally!!
        _stretchHorizontally = radixIcon(
            name = "StretchHorizontally",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 1.000 9.000 L 1.000 13.500 C 1.000 13.776 0.776 14.000 0.500 14.000 C 0.224 14.000 -0.000 13.776 -0.000 13.500 L -0.000 1.500 C 0.000 1.224 0.224 1.000 0.500 1.000 C 0.776 1.000 1.000 1.224 1.000 1.500 L 1.000 6.000 L 14.000 6.000 L 14.000 1.500 C 14.000 1.224 14.224 1.000 14.500 1.000 C 14.776 1.000 15.000 1.224 15.000 1.500 L 15.000 13.500 C 15.000 13.776 14.776 14.000 14.500 14.000 C 14.224 14.000 14.000 13.776 14.000 13.500 L 14.000 9.000 L 1.000 9.000 Z"),
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
        return _stretchHorizontally!!
    }

private var _stretchHorizontally: ImageVector? = null
