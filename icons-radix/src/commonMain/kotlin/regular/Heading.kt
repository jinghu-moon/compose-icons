package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.Heading: ImageVector
    get() {
        if (_heading != null) return _heading!!
        _heading = radixIcon(
            name = "Heading",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15.0f, height = 15.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 6.345 2.060 C 6.550 2.102 6.705 2.283 6.705 2.500 C 6.705 2.718 6.550 2.899 6.345 2.941 L 6.255 2.951 L 5.049 2.951 L 5.049 7.050 L 9.950 7.050 L 9.950 2.951 L 8.755 2.951 C 8.506 2.951 8.304 2.749 8.304 2.500 C 8.304 2.252 8.506 2.050 8.755 2.050 L 12.255 2.050 L 12.345 2.060 C 12.550 2.102 12.705 2.283 12.705 2.500 C 12.705 2.718 12.550 2.899 12.345 2.941 L 12.255 2.951 L 11.049 2.951 L 11.049 12.050 L 12.255 12.050 L 12.345 12.060 C 12.550 12.102 12.705 12.283 12.705 12.500 C 12.705 12.718 12.550 12.899 12.345 12.941 L 12.255 12.951 L 8.755 12.951 C 8.506 12.951 8.304 12.749 8.304 12.500 C 8.304 12.252 8.506 12.050 8.755 12.050 L 9.950 12.050 L 9.950 7.951 L 5.049 7.951 L 5.049 12.050 L 6.255 12.050 L 6.345 12.060 C 6.550 12.102 6.705 12.283 6.705 12.500 C 6.705 12.718 6.550 12.899 6.345 12.941 L 6.255 12.951 L 2.755 12.951 C 2.506 12.951 2.304 12.749 2.304 12.500 C 2.304 12.252 2.506 12.050 2.755 12.050 L 3.950 12.050 L 3.950 2.951 L 2.755 2.951 C 2.506 2.951 2.304 2.749 2.304 2.500 C 2.304 2.252 2.506 2.050 2.755 2.050 L 6.255 2.050 L 6.345 2.060 Z"),
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
        return _heading!!
    }

private var _heading: ImageVector? = null
