package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Tokens: ImageVector
    get() {
        if (_tokens != null) return _tokens!!
        _tokens = radixIcon(
            name = "Tokens",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.500 8.000 C 5.881 8.000 7.000 9.119 7.000 10.500 C 7.000 11.881 5.881 13.000 4.500 13.000 C 3.119 13.000 2.000 11.881 2.000 10.500 C 2.000 9.119 3.119 8.000 4.500 8.000 ZM 10.500 8.000 C 11.881 8.000 13.000 9.119 13.000 10.500 C 13.000 11.881 11.881 13.000 10.500 13.000 C 9.119 13.000 8.000 11.881 8.000 10.500 C 8.000 9.119 9.119 8.000 10.500 8.000 ZM 4.500 9.000 C 3.672 9.000 3.000 9.672 3.000 10.500 C 3.000 11.328 3.672 12.000 4.500 12.000 C 5.328 12.000 6.000 11.328 6.000 10.500 C 6.000 9.672 5.328 9.000 4.500 9.000 ZM 10.500 9.000 C 9.672 9.000 9.000 9.672 9.000 10.500 C 9.000 11.328 9.672 12.000 10.500 12.000 C 11.328 12.000 12.000 11.328 12.000 10.500 C 12.000 9.672 11.328 9.000 10.500 9.000 ZM 4.500 2.000 C 5.881 2.000 7.000 3.119 7.000 4.500 C 7.000 5.881 5.881 7.000 4.500 7.000 C 3.119 7.000 2.000 5.881 2.000 4.500 C 2.000 3.119 3.119 2.000 4.500 2.000 ZM 10.500 2.000 C 11.881 2.000 13.000 3.119 13.000 4.500 C 13.000 5.881 11.881 7.000 10.500 7.000 C 9.119 7.000 8.000 5.881 8.000 4.500 C 8.000 3.119 9.119 2.000 10.500 2.000 ZM 4.500 3.000 C 3.672 3.000 3.000 3.672 3.000 4.500 C 3.000 5.328 3.672 6.000 4.500 6.000 C 5.328 6.000 6.000 5.328 6.000 4.500 C 6.000 3.672 5.328 3.000 4.500 3.000 ZM 10.500 3.000 C 9.672 3.000 9.000 3.672 9.000 4.500 C 9.000 5.328 9.672 6.000 10.500 6.000 C 11.328 6.000 12.000 5.328 12.000 4.500 C 12.000 3.672 11.328 3.000 10.500 3.000 Z"),
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
        return _tokens!!
    }

private var _tokens: ImageVector? = null
