package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Flame: ImageVector
    get() {
        if (_flame != null) return _flame!!
        _flame = phosphorThinIcon(
            name = "Flame",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 170.900 54.240 C 158.713 41.391 144.997 30.083 130.060 20.570 C 128.792 19.808 127.208 19.808 125.940 20.570 C 111.003 30.083 97.287 41.391 85.100 54.240 C 58.210 82.480 44.000 113.510 44.000 144.000 C 44.000 190.392 81.608 228.000 128.000 228.000 C 174.392 228.000 212.000 190.392 212.000 144.000 C 212.000 113.510 197.790 82.480 170.900 54.240 ZM 92.000 184.000 C 92.000 151.890 120.070 130.250 128.000 124.790 C 135.930 130.260 164.000 151.890 164.000 184.000 C 164.000 203.882 147.882 220.000 128.000 220.000 C 108.118 220.000 92.000 203.882 92.000 184.000 ZM 161.940 212.000 C 168.456 204.126 172.015 194.221 172.000 184.000 C 172.000 142.220 131.770 117.600 130.060 116.570 C 128.792 115.808 127.208 115.808 125.940 116.570 C 124.230 117.600 84.000 142.220 84.000 184.000 C 83.985 194.221 87.544 204.126 94.060 212.000 C 68.298 199.123 52.017 172.801 52.000 144.000 C 52.000 81.520 115.640 36.830 128.000 28.740 C 140.360 36.830 204.000 81.520 204.000 144.000 C 203.983 172.801 187.702 199.123 161.940 212.000 Z"),
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
        return _flame!!
    }

private var _flame: ImageVector? = null
