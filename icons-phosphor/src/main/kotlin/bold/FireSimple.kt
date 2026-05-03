package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) return _fireSimple!!
        _fireSimple = phosphorBoldIcon(
            name = "FireSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 145.930 14.770 C 142.928 12.281 138.903 11.406 135.138 12.424 C 131.373 13.443 128.338 16.227 127.000 19.890 L 107.070 74.500 L 87.380 55.390 C 84.919 53.000 81.552 51.778 78.131 52.032 C 74.710 52.286 71.561 53.993 69.480 56.720 C 47.270 85.820 36.000 115.190 36.000 144.000 C 36.000 194.810 77.190 236.000 128.000 236.000 C 178.810 236.000 220.000 194.810 220.000 144.000 C 220.000 82.850 168.200 33.250 145.930 14.770 ZM 128.000 212.000 C 90.461 211.961 60.039 181.539 60.000 144.000 C 60.000 124.060 67.000 103.380 80.710 82.360 L 103.640 104.610 C 106.559 107.442 110.714 108.603 114.678 107.695 C 118.642 106.786 121.876 103.931 123.270 100.110 L 143.480 44.710 C 165.390 65.610 196.000 102.290 196.000 144.000 C 195.961 181.539 165.539 211.961 128.000 212.000 Z"),
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
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
