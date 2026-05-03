package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileC: ImageVector
    get() {
        if (_fileC != null) return _fileC!!
        _fileC = phosphorFillIcon(
            name = "FileC",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 48.000 180.000 C 48.000 191.000 55.180 200.000 64.000 200.000 C 67.831 199.930 71.467 198.302 74.070 195.490 C 76.939 192.464 81.623 192.077 84.950 194.590 C 86.720 195.986 87.819 198.063 87.977 200.311 C 88.135 202.560 87.337 204.771 85.780 206.400 C 80.150 212.460 72.272 215.933 64.000 216.000 C 46.350 216.000 32.000 199.850 32.000 180.000 C 32.000 160.150 46.350 144.000 64.000 144.000 C 72.076 144.059 79.788 147.372 85.390 153.190 C 88.456 156.146 88.772 160.948 86.120 164.280 C 84.657 166.018 82.525 167.052 80.255 167.124 C 77.985 167.197 75.791 166.301 74.220 164.660 C 71.596 161.772 67.901 160.087 64.000 160.000 C 55.180 160.000 48.000 169.000 48.000 180.000 ZM 216.000 88.000 L 216.000 216.000 C 216.000 224.837 208.837 232.000 200.000 232.000 L 116.000 232.000 C 113.791 232.000 112.000 230.209 112.000 228.000 L 112.000 124.000 C 112.000 121.791 110.209 120.000 108.000 120.000 L 44.000 120.000 C 41.791 120.000 40.000 118.209 40.000 116.000 L 40.000 40.000 C 40.000 31.163 47.163 24.000 56.000 24.000 L 152.000 24.000 C 154.122 23.998 156.158 24.840 157.660 26.340 L 213.660 82.340 C 215.160 83.842 216.002 85.878 216.000 88.000 ZM 196.000 88.000 L 152.000 44.000 L 152.000 88.000 Z"),
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
        return _fileC!!
    }

private var _fileC: ImageVector? = null
