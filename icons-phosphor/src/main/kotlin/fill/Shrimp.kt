package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Shrimp: ImageVector
    get() {
        if (_shrimp != null) return _shrimp!!
        _shrimp = phosphorFillIcon(
            name = "Shrimp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 116.000 C 136.000 109.373 141.373 104.000 148.000 104.000 C 154.627 104.000 160.000 109.373 160.000 116.000 C 160.000 122.627 154.627 128.000 148.000 128.000 C 141.373 128.000 136.000 122.627 136.000 116.000 ZM 240.000 60.000 C 239.995 70.891 233.676 80.790 223.800 85.380 C 220.927 127.352 186.070 159.946 144.000 160.000 L 112.000 160.000 C 105.373 160.000 100.000 165.373 100.000 172.000 C 100.000 178.627 105.373 184.000 112.000 184.000 L 168.000 184.000 C 172.418 184.000 176.000 187.582 176.000 192.000 C 176.000 196.418 172.418 200.000 168.000 200.000 L 120.000 200.000 L 120.000 216.000 L 152.000 216.000 C 156.418 216.000 160.000 219.582 160.000 224.000 C 160.000 228.418 156.418 232.000 152.000 232.000 L 96.000 232.000 C 51.817 232.000 16.000 196.183 16.000 152.000 C 16.000 107.817 51.817 72.000 96.000 72.000 L 212.000 72.000 C 218.627 72.000 224.000 66.627 224.000 60.000 C 224.000 53.373 218.627 48.000 212.000 48.000 L 128.000 48.000 C 114.745 48.000 104.000 37.255 104.000 24.000 C 104.000 19.582 107.582 16.000 112.000 16.000 C 116.418 16.000 120.000 19.582 120.000 24.000 C 120.000 28.418 123.582 32.000 128.000 32.000 L 212.000 32.000 C 227.464 32.000 240.000 44.536 240.000 60.000 ZM 85.720 182.200 C 84.487 180.473 82.618 179.307 80.525 178.959 C 78.432 178.610 76.287 179.107 74.560 180.340 L 59.200 191.340 C 55.834 193.983 55.144 198.806 57.634 202.287 C 60.124 205.767 64.912 206.672 68.500 204.340 L 83.860 193.340 C 87.443 190.773 88.275 185.792 85.720 182.200 ZM 84.220 146.580 L 45.550 129.000 C 42.935 127.726 39.834 127.972 37.453 129.642 C 35.071 131.312 33.783 134.143 34.091 137.036 C 34.398 139.929 36.251 142.427 38.930 143.560 L 77.600 161.150 C 79.535 162.025 81.738 162.095 83.724 161.345 C 85.710 160.595 87.317 159.086 88.190 157.150 C 90.003 153.135 88.228 148.409 84.220 146.580 ZM 207.500 88.000 L 120.000 88.000 L 120.000 144.000 L 144.000 144.000 C 176.239 143.961 203.431 119.981 207.500 88.000 Z"),
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
        return _shrimp!!
    }

private var _shrimp: ImageVector? = null
