package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Parachute: ImageVector
    get() {
        if (_parachute != null) return _parachute!!
        _parachute = phosphorThinIcon(
            name = "Parachute",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 120.000 C 228.000 64.772 183.228 20.000 128.000 20.000 C 72.772 20.000 28.000 64.772 28.000 120.000 C 28.003 121.119 28.475 122.185 29.300 122.940 C 29.394 123.034 29.494 123.121 29.600 123.200 L 124.000 194.000 L 124.000 220.000 L 112.000 220.000 C 109.791 220.000 108.000 221.791 108.000 224.000 C 108.000 226.209 109.791 228.000 112.000 228.000 L 144.000 228.000 C 146.209 228.000 148.000 226.209 148.000 224.000 C 148.000 221.791 146.209 220.000 144.000 220.000 L 132.000 220.000 L 132.000 194.000 L 226.400 123.200 L 226.400 123.200 C 227.407 122.445 228.000 121.259 228.000 120.000 ZM 219.910 116.000 L 172.000 116.000 C 171.000 67.380 152.130 40.860 140.000 28.790 C 184.243 34.669 217.911 71.413 219.910 116.000 ZM 128.000 28.890 C 134.666 34.155 140.411 40.491 145.000 47.640 C 153.360 60.330 163.270 82.350 164.000 116.000 L 92.050 116.000 C 92.780 82.350 102.690 60.330 111.050 47.640 C 115.621 40.493 121.349 34.157 128.000 28.890 ZM 161.200 124.000 L 128.000 183.760 L 94.800 124.000 ZM 85.650 124.000 L 115.390 177.540 L 44.000 124.000 ZM 170.350 124.000 L 212.000 124.000 L 140.610 177.540 ZM 116.000 28.790 C 103.870 40.860 85.000 67.380 84.000 116.000 L 36.090 116.000 C 38.089 71.413 71.757 34.669 116.000 28.790 Z"),
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
        return _parachute!!
    }

private var _parachute: ImageVector? = null
