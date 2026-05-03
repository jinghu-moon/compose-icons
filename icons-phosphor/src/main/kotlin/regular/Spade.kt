package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Spade: ImageVector
    get() {
        if (_spade != null) return _spade!!
        _spade = phosphorRegularIcon(
            name = "Spade",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 131.580 16.850 C 129.327 15.722 126.673 15.722 124.420 16.850 C 120.320 18.900 24.000 67.840 24.000 136.000 C 23.993 154.087 32.721 171.064 47.436 181.582 C 62.151 192.099 81.039 194.862 98.150 189.000 L 88.340 221.700 C 87.613 224.122 88.074 226.745 89.583 228.774 C 91.092 230.803 93.471 231.999 96.000 232.000 L 160.000 232.000 C 162.529 231.999 164.908 230.803 166.417 228.774 C 167.926 226.745 168.387 224.122 167.660 221.700 L 157.850 189.000 C 174.961 194.862 193.849 192.099 208.564 181.582 C 223.279 171.064 232.007 154.087 232.000 136.000 C 232.000 67.840 135.680 18.900 131.580 16.850 ZM 176.000 176.000 C 166.334 176.001 156.995 172.502 149.710 166.150 C 147.024 163.808 143.112 163.525 140.117 165.456 C 137.122 167.387 135.765 171.067 136.790 174.480 L 149.250 216.000 L 106.750 216.000 L 119.210 174.480 C 120.235 171.067 118.878 167.387 115.883 165.456 C 112.888 163.525 108.976 163.808 106.290 166.150 C 94.470 176.458 77.716 178.907 63.440 172.414 C 49.163 165.921 39.999 151.684 40.000 136.000 C 40.000 106.120 64.410 79.450 84.890 62.340 C 98.315 51.257 112.748 41.454 128.000 33.060 C 143.252 41.454 157.685 51.257 171.110 62.340 C 208.210 93.340 216.000 119.510 216.000 136.000 C 216.000 158.091 198.091 176.000 176.000 176.000 Z"),
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
        return _spade!!
    }

private var _spade: ImageVector? = null
