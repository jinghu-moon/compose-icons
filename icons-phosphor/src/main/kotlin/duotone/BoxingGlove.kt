package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) return _boxingGlove!!
        _boxingGlove = phosphorDuotoneIcon(
            name = "BoxingGlove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 216.000 72.000 L 216.000 118.880 C 216.001 119.624 215.897 120.365 215.690 121.080 L 200.000 176.000 L 200.000 216.000 C 200.000 220.418 196.418 224.000 192.000 224.000 L 80.000 224.000 C 75.582 224.000 72.000 220.418 72.000 216.000 L 72.000 176.000 L 33.750 138.190 C 32.616 136.770 31.999 135.007 32.000 133.190 L 32.000 104.000 C 32.000 90.745 42.745 80.000 56.000 80.000 L 72.000 80.000 L 72.000 72.000 C 72.000 45.490 93.490 24.000 120.000 24.000 L 168.000 24.000 C 194.510 24.000 216.000 45.490 216.000 72.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 168.000 16.000 L 120.000 16.000 C 89.086 16.033 64.033 41.086 64.000 72.000 L 56.000 72.000 C 38.327 72.000 24.000 86.327 24.000 104.000 L 24.000 133.190 C 24.008 136.822 25.241 140.345 27.500 143.190 Q 27.800 143.550 28.130 143.880 L 64.000 179.340 L 64.000 216.000 C 64.000 224.837 71.163 232.000 80.000 232.000 L 192.000 232.000 C 200.837 232.000 208.000 224.837 208.000 216.000 L 208.000 177.120 L 223.380 123.280 C 223.790 121.849 223.999 120.368 224.000 118.880 L 224.000 72.000 C 223.967 41.086 198.914 16.033 168.000 16.000 ZM 208.000 118.880 L 192.310 173.800 C 192.103 174.515 191.999 175.256 192.000 176.000 L 192.000 216.000 L 80.000 216.000 L 80.000 176.000 C 79.999 173.861 79.142 171.812 77.620 170.310 L 40.000 133.120 L 40.000 104.000 C 40.000 95.163 47.163 88.000 56.000 88.000 L 64.000 88.000 L 64.000 104.000 C 64.000 108.418 67.582 112.000 72.000 112.000 C 76.418 112.000 80.000 108.418 80.000 104.000 L 80.000 72.000 C 80.000 49.909 97.909 32.000 120.000 32.000 L 168.000 32.000 C 190.091 32.000 208.000 49.909 208.000 72.000 ZM 171.580 167.160 L 153.890 176.000 L 171.580 184.840 C 175.534 186.817 177.137 191.626 175.160 195.580 C 173.183 199.534 168.374 201.137 164.420 199.160 L 136.000 184.940 L 107.580 199.160 C 103.626 201.137 98.817 199.534 96.840 195.580 C 94.863 191.626 96.466 186.817 100.420 184.840 L 118.110 176.000 L 100.420 167.160 C 96.466 165.183 94.863 160.374 96.840 156.420 C 98.817 152.466 103.626 150.863 107.580 152.840 L 136.000 167.060 L 164.420 152.840 C 168.374 150.863 173.183 152.466 175.160 156.420 C 177.137 160.374 175.534 165.183 171.580 167.160 Z"),
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
