package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BoxingGlove: ImageVector
    get() {
        if (_boxingGlove != null) return _boxingGlove!!
        _boxingGlove = phosphorRegularIcon(
            name = "BoxingGlove",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 168.000 16.000 L 120.000 16.000 C 89.086 16.033 64.033 41.086 64.000 72.000 L 56.000 72.000 C 38.327 72.000 24.000 86.327 24.000 104.000 L 24.000 133.190 C 24.007 136.824 25.244 140.349 27.510 143.190 C 27.703 143.432 27.910 143.662 28.130 143.880 L 64.000 179.340 L 64.000 216.000 C 64.000 224.837 71.163 232.000 80.000 232.000 L 192.000 232.000 C 200.837 232.000 208.000 224.837 208.000 216.000 L 208.000 177.120 L 223.380 123.270 C 223.791 121.843 223.999 120.365 224.000 118.880 L 224.000 72.000 C 223.967 41.086 198.914 16.033 168.000 16.000 ZM 208.000 118.880 L 192.310 173.800 C 192.103 174.515 191.999 175.256 192.000 176.000 L 192.000 216.000 L 80.000 216.000 L 80.000 176.000 C 79.999 173.861 79.142 171.812 77.620 170.310 L 40.000 133.120 L 40.000 104.000 C 40.000 95.163 47.163 88.000 56.000 88.000 L 64.000 88.000 L 64.000 104.000 C 64.000 108.418 67.582 112.000 72.000 112.000 C 76.418 112.000 80.000 108.418 80.000 104.000 L 80.000 72.000 C 80.000 49.909 97.909 32.000 120.000 32.000 L 168.000 32.000 C 190.091 32.000 208.000 49.909 208.000 72.000 ZM 171.580 167.160 L 153.890 176.000 L 171.580 184.840 C 175.534 186.817 177.137 191.626 175.160 195.580 C 173.183 199.534 168.374 201.137 164.420 199.160 L 136.000 184.940 L 107.580 199.160 C 103.626 201.137 98.817 199.534 96.840 195.580 C 94.863 191.626 96.466 186.817 100.420 184.840 L 118.110 176.000 L 100.420 167.160 C 96.466 165.183 94.863 160.374 96.840 156.420 C 98.817 152.466 103.626 150.863 107.580 152.840 L 136.000 167.060 L 164.420 152.840 C 168.374 150.863 173.183 152.466 175.160 156.420 C 177.137 160.374 175.534 165.183 171.580 167.160 Z"),
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
        return _boxingGlove!!
    }

private var _boxingGlove: ImageVector? = null
