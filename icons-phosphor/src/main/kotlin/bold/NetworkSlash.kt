package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NetworkSlash: ImageVector
    get() {
        if (_networkSlash != null) return _networkSlash!!
        _networkSlash = phosphorBoldIcon(
            name = "NetworkSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 56.880 31.930 C 54.012 28.697 49.628 27.256 45.401 28.157 C 41.175 29.058 37.759 32.162 36.459 36.284 C 35.159 40.405 36.175 44.907 39.120 48.070 L 93.600 108.000 L 24.000 108.000 C 17.373 108.000 12.000 113.373 12.000 120.000 C 12.000 126.627 17.373 132.000 24.000 132.000 L 52.000 132.000 L 52.000 156.000 L 48.000 156.000 C 36.954 156.000 28.000 164.954 28.000 176.000 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 80.000 228.000 C 91.046 228.000 100.000 219.046 100.000 208.000 L 100.000 176.000 C 100.000 164.954 91.046 156.000 80.000 156.000 L 76.000 156.000 L 76.000 132.000 L 115.420 132.000 L 199.120 224.070 C 203.598 228.880 211.111 229.194 215.974 224.774 C 220.837 220.355 221.241 212.846 216.880 207.930 ZM 76.000 204.000 L 52.000 204.000 L 52.000 180.000 L 76.000 180.000 ZM 92.000 42.140 L 92.000 40.000 C 92.000 28.954 100.954 20.000 112.000 20.000 L 144.000 20.000 C 155.046 20.000 164.000 28.954 164.000 40.000 L 164.000 72.000 C 164.000 83.046 155.046 92.000 144.000 92.000 L 138.420 92.000 C 131.793 92.000 126.420 86.627 126.420 80.000 C 126.420 73.373 131.793 68.000 138.420 68.000 L 140.000 68.000 L 140.000 44.000 L 115.860 44.000 C 114.904 50.205 109.327 54.624 103.067 54.136 C 96.808 53.648 91.983 48.418 92.000 42.140 ZM 244.000 120.000 C 244.000 126.627 238.627 132.000 232.000 132.000 L 204.000 132.000 L 204.000 138.940 C 204.000 145.567 198.627 150.940 192.000 150.940 C 185.373 150.940 180.000 145.567 180.000 138.940 L 180.000 132.000 L 174.790 132.000 C 168.163 132.000 162.790 126.627 162.790 120.000 C 162.790 113.373 168.163 108.000 174.790 108.000 L 232.000 108.000 C 238.627 108.000 244.000 113.373 244.000 120.000 Z"),
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
        return _networkSlash!!
    }

private var _networkSlash: ImageVector? = null
