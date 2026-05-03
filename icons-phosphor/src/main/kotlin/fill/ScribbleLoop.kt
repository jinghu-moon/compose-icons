package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) return _scribbleLoop!!
        _scribbleLoop = phosphorFillIcon(
            name = "ScribbleLoop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 128.000 C 136.738 128.039 145.412 129.484 153.690 132.280 C 151.560 154.870 137.330 176.000 112.000 176.000 C 96.200 176.000 87.940 165.150 87.940 154.420 C 87.940 147.830 90.940 141.670 96.500 137.070 C 103.620 131.140 114.520 128.000 128.000 128.000 ZM 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 205.890 146.590 C 195.517 136.038 183.286 127.491 169.810 121.380 C 168.910 107.030 164.060 93.840 155.920 83.830 C 145.380 70.860 130.190 64.000 112.000 64.000 C 76.440 64.000 50.680 97.760 49.600 99.200 C 46.944 102.732 47.653 107.749 51.185 110.405 C 54.717 113.061 59.734 112.352 62.390 108.820 C 62.610 108.530 84.510 80.000 112.000 80.000 C 125.400 80.000 136.000 84.680 143.500 93.920 C 148.394 100.152 151.653 107.508 152.980 115.320 C 144.834 113.129 136.436 112.013 128.000 112.000 C 110.730 112.000 96.290 116.420 86.260 124.780 C 77.000 132.470 71.940 143.000 71.940 154.420 C 71.940 172.640 86.000 192.000 112.000 192.000 C 129.048 192.192 145.185 184.322 155.530 170.770 C 162.618 161.438 167.249 150.477 169.000 138.890 C 178.243 143.792 186.711 150.033 194.130 157.410 C 196.042 159.598 198.989 160.578 201.831 159.969 C 204.672 159.361 206.960 157.259 207.807 154.480 C 208.655 151.701 207.928 148.680 205.910 146.590 Z"),
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
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
