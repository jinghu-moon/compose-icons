package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Shrimp: ImageVector
    get() {
        if (_shrimp != null) return _shrimp!!
        _shrimp = phosphorRegularIcon(
            name = "Shrimp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 136.000 116.000 C 136.000 109.373 141.373 104.000 148.000 104.000 C 154.627 104.000 160.000 109.373 160.000 116.000 C 160.000 122.627 154.627 128.000 148.000 128.000 C 141.373 128.000 136.000 122.627 136.000 116.000 ZM 223.800 85.380 C 220.927 127.352 186.070 159.946 144.000 160.000 L 112.000 160.000 C 105.373 160.000 100.000 165.373 100.000 172.000 C 100.000 178.627 105.373 184.000 112.000 184.000 L 168.000 184.000 C 172.418 184.000 176.000 187.582 176.000 192.000 C 176.000 196.418 172.418 200.000 168.000 200.000 L 120.000 200.000 L 120.000 216.000 L 152.000 216.000 C 156.418 216.000 160.000 219.582 160.000 224.000 C 160.000 228.418 156.418 232.000 152.000 232.000 L 96.000 232.000 C 51.817 232.000 16.000 196.183 16.000 152.000 C 16.000 107.817 51.817 72.000 96.000 72.000 L 212.000 72.000 C 218.627 72.000 224.000 66.627 224.000 60.000 C 224.000 53.373 218.627 48.000 212.000 48.000 L 128.000 48.000 C 114.745 48.000 104.000 37.255 104.000 24.000 C 104.000 19.582 107.582 16.000 112.000 16.000 C 116.418 16.000 120.000 19.582 120.000 24.000 C 120.000 28.418 123.582 32.000 128.000 32.000 L 212.000 32.000 C 225.125 32.012 236.481 41.140 239.314 53.956 C 242.147 66.772 235.697 79.836 223.800 85.380 ZM 50.800 197.290 L 84.020 173.560 C 84.020 173.050 84.020 172.560 84.020 172.000 C 84.014 169.473 84.351 166.957 85.020 164.520 L 33.000 140.870 C 29.328 161.465 35.995 182.550 50.840 197.290 ZM 89.800 189.090 L 64.120 207.460 C 73.810 213.062 84.807 216.008 96.000 216.000 L 104.000 216.000 L 104.000 198.830 C 98.379 197.140 93.428 193.734 89.840 189.090 ZM 104.000 145.170 L 104.000 88.000 L 96.000 88.000 C 70.932 88.028 48.183 102.673 37.780 125.480 L 93.650 150.870 C 96.655 148.255 100.184 146.312 104.000 145.170 ZM 207.500 88.000 L 120.000 88.000 L 120.000 144.000 L 144.000 144.000 C 176.239 143.961 203.431 119.981 207.500 88.000 Z"),
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
