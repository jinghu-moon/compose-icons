package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FontItalic: ImageVector
    get() {
        if (_fontItalic != null) return _fontItalic!!
        _fontItalic = radixIcon(
            name = "FontItalic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.625 3.050 C 10.874 3.050 11.075 3.252 11.075 3.500 C 11.075 3.749 10.874 3.950 10.625 3.951 L 9.006 3.951 L 7.231 11.050 L 8.875 11.050 C 9.124 11.050 9.325 11.252 9.325 11.500 C 9.325 11.749 9.124 11.950 8.875 11.950 L 4.375 11.950 C 4.127 11.950 3.925 11.749 3.925 11.500 C 3.925 11.252 4.127 11.050 4.375 11.050 L 5.994 11.050 L 7.770 3.951 L 6.125 3.951 C 5.877 3.951 5.675 3.749 5.675 3.500 C 5.675 3.252 5.877 3.050 6.125 3.050 L 10.625 3.050 Z"),
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
        return _fontItalic!!
    }

private var _fontItalic: ImageVector? = null
