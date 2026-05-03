package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Plug: ImageVector
    get() {
        if (_plug != null) return _plug!!
        _plug = phosphorThinIcon(
            name = "Plug",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 234.830 69.170 C 234.080 68.419 233.062 67.997 232.000 67.997 C 230.938 67.997 229.920 68.419 229.170 69.170 L 192.000 106.340 L 149.660 64.000 L 186.830 26.830 C 188.393 25.267 188.393 22.733 186.830 21.170 C 185.267 19.607 182.733 19.607 181.170 21.170 L 144.000 58.340 L 114.830 29.170 C 113.267 27.607 110.733 27.607 109.170 29.170 C 107.607 30.733 107.607 33.267 109.170 34.830 L 118.340 44.000 L 62.540 99.800 C 48.510 113.870 48.510 136.640 62.540 150.710 L 81.090 169.250 L 29.170 221.170 C 27.607 222.733 27.607 225.267 29.170 226.830 C 30.733 228.393 33.267 228.393 34.830 226.830 L 86.750 174.910 L 105.290 193.460 C 119.362 207.485 142.128 207.485 156.200 193.460 L 212.000 137.660 L 221.170 146.830 C 222.733 148.393 225.267 148.393 226.830 146.830 C 228.393 145.267 228.393 142.733 226.830 141.170 L 197.660 112.000 L 234.830 74.830 C 235.581 74.080 236.003 73.062 236.003 72.000 C 236.003 70.938 235.581 69.920 234.830 69.170 ZM 150.540 187.800 C 139.606 198.729 121.884 198.729 110.950 187.800 L 68.200 145.050 C 57.271 134.116 57.271 116.394 68.200 105.460 L 124.000 49.660 L 206.340 132.000 Z"),
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
        return _plug!!
    }

private var _plug: ImageVector? = null
