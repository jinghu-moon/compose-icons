package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FaceMask: ImageVector
    get() {
        if (_faceMask != null) return _faceMask!!
        _faceMask = phosphorFillIcon(
            name = "FaceMask",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 72.000 L 223.150 72.000 C 221.618 67.364 218.053 63.682 213.470 62.000 L 133.470 33.000 C 129.936 31.720 126.064 31.720 122.530 33.000 L 42.530 62.090 C 37.947 63.772 34.382 67.454 32.850 72.090 L 32.000 72.090 C 14.362 72.090 0.050 86.362 0.000 104.000 L 0.000 128.000 C 0.000 145.673 14.327 160.000 32.000 160.000 L 37.190 160.000 C 44.380 175.800 58.980 189.430 80.420 200.160 C 95.070 207.345 110.579 212.624 126.570 215.870 C 127.515 216.043 128.485 216.043 129.430 215.870 C 145.421 212.624 160.930 207.345 175.580 200.160 C 197.020 189.430 211.580 175.800 218.810 160.000 L 224.000 160.000 C 241.673 160.000 256.000 145.673 256.000 128.000 L 256.000 104.000 C 256.000 86.327 241.673 72.000 224.000 72.000 ZM 32.000 144.000 C 23.163 144.000 16.000 136.837 16.000 128.000 L 16.000 104.000 C 16.000 95.163 23.163 88.000 32.000 88.000 L 32.000 136.000 C 32.001 138.676 32.185 141.349 32.550 144.000 ZM 168.000 144.000 L 88.000 144.000 C 83.582 144.000 80.000 140.418 80.000 136.000 C 80.000 131.582 83.582 128.000 88.000 128.000 L 168.000 128.000 C 172.418 128.000 176.000 131.582 176.000 136.000 C 176.000 140.418 172.418 144.000 168.000 144.000 ZM 168.000 112.000 L 88.000 112.000 C 83.582 112.000 80.000 108.418 80.000 104.000 C 80.000 99.582 83.582 96.000 88.000 96.000 L 168.000 96.000 C 172.418 96.000 176.000 99.582 176.000 104.000 C 176.000 108.418 172.418 112.000 168.000 112.000 ZM 240.000 128.000 C 240.000 136.837 232.837 144.000 224.000 144.000 L 223.450 144.000 C 223.815 141.349 223.999 138.676 224.000 136.000 L 224.000 88.000 C 232.837 88.000 240.000 95.163 240.000 104.000 Z"),
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
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
