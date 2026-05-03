package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Alien: ImageVector
    get() {
        if (_alien != null) return _alien!!
        _alien = phosphorRegularIcon(
            name = "Alien",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 16.000 C 75.006 16.061 32.061 59.006 32.000 112.000 C 32.000 136.000 44.560 167.060 65.610 195.000 C 86.790 223.150 110.110 240.000 128.000 240.000 C 145.890 240.000 169.210 223.190 190.390 195.000 C 211.440 167.000 224.000 136.000 224.000 112.000 C 223.939 59.006 180.994 16.061 128.000 16.000 ZM 177.610 185.420 C 160.240 208.490 140.310 224.000 128.000 224.000 C 115.690 224.000 95.760 208.490 78.390 185.420 C 59.650 160.500 48.000 132.370 48.000 112.000 C 48.000 67.817 83.817 32.000 128.000 32.000 C 172.183 32.000 208.000 67.817 208.000 112.000 C 208.000 132.370 196.350 160.500 177.610 185.420 ZM 120.000 136.000 C 120.000 113.909 102.091 96.000 80.000 96.000 C 71.163 96.000 64.000 103.163 64.000 112.000 C 64.000 134.091 81.909 152.000 104.000 152.000 C 112.837 152.000 120.000 144.837 120.000 136.000 ZM 80.000 112.000 C 93.255 112.000 104.000 122.745 104.000 136.000 L 104.000 136.000 C 90.745 136.000 80.000 125.255 80.000 112.000 ZM 176.000 96.000 C 153.909 96.000 136.000 113.909 136.000 136.000 C 136.000 144.837 143.163 152.000 152.000 152.000 C 174.091 152.000 192.000 134.091 192.000 112.000 C 192.000 103.163 184.837 96.000 176.000 96.000 ZM 152.000 136.000 C 152.000 122.745 162.745 112.000 176.000 112.000 C 176.000 125.255 165.255 136.000 152.000 136.000 ZM 152.000 184.000 C 152.000 188.418 148.418 192.000 144.000 192.000 L 112.000 192.000 C 107.582 192.000 104.000 188.418 104.000 184.000 C 104.000 179.582 107.582 176.000 112.000 176.000 L 144.000 176.000 C 148.418 176.000 152.000 179.582 152.000 184.000 Z"),
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
        return _alien!!
    }

private var _alien: ImageVector? = null
