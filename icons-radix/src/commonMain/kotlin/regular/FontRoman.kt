package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FontRoman: ImageVector
    get() {
        if (_fontRoman != null) return _fontRoman!!
        _fontRoman = radixIcon(
            name = "FontRoman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 9.750 3.050 C 9.999 3.050 10.200 3.252 10.200 3.500 C 10.200 3.749 9.999 3.950 9.750 3.951 L 8.100 3.951 L 8.100 11.050 L 9.750 11.050 C 9.999 11.050 10.200 11.252 10.200 11.500 C 10.200 11.749 9.999 11.950 9.750 11.950 L 5.250 11.950 C 5.002 11.950 4.800 11.749 4.800 11.500 C 4.800 11.252 5.002 11.050 5.250 11.050 L 6.900 11.050 L 6.900 3.951 L 5.250 3.951 C 5.002 3.951 4.800 3.749 4.800 3.500 C 4.800 3.252 5.002 3.050 5.250 3.050 L 9.750 3.050 Z"),
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
        return _fontRoman!!
    }

private var _fontRoman: ImageVector? = null
