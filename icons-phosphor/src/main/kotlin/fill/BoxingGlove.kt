package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) return _boxingGlove!!
        _boxingGlove = phosphorFillIcon(
            name = "BoxingGlove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 168.000 16.000 L 120.000 16.000 C 89.072 16.000 64.000 41.072 64.000 72.000 L 64.000 103.730 C 64.068 108.021 60.805 111.633 56.530 112.000 C 54.318 112.147 52.144 111.369 50.527 109.853 C 48.910 108.336 47.995 106.217 48.000 104.000 L 48.000 78.700 C 47.999 77.345 47.313 76.083 46.176 75.346 C 45.039 74.610 43.607 74.498 42.370 75.050 C 31.157 80.329 24.001 91.607 24.000 104.000 L 24.000 133.190 C 24.008 136.822 25.241 140.345 27.500 143.190 Q 27.800 143.550 28.130 143.880 L 64.000 179.340 L 64.000 216.000 C 64.000 224.837 71.163 232.000 80.000 232.000 L 192.000 232.000 C 200.837 232.000 208.000 224.837 208.000 216.000 L 208.000 177.120 L 223.380 123.280 C 223.790 121.849 223.999 120.368 224.000 118.880 L 224.000 72.000 C 224.000 41.072 198.928 16.000 168.000 16.000 ZM 171.580 184.840 C 175.534 186.817 177.137 191.626 175.160 195.580 C 173.183 199.534 168.374 201.137 164.420 199.160 L 136.000 184.940 L 107.580 199.160 C 103.626 201.137 98.817 199.534 96.840 195.580 C 94.863 191.626 96.466 186.817 100.420 184.840 L 118.110 176.000 L 100.420 167.160 C 96.466 165.183 94.863 160.374 96.840 156.420 C 98.817 152.466 103.626 150.863 107.580 152.840 L 136.000 167.060 L 164.420 152.840 C 168.374 150.863 173.183 152.466 175.160 156.420 C 177.137 160.374 175.534 165.183 171.580 167.160 L 153.890 176.000 Z"),
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
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
