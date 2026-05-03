package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GameController: ImageVector
    get() {
        if (_gameController != null) return _gameController!!
        _gameController = phosphorBoldIcon(
            name = "GameController",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 116.000 L 152.000 116.000 C 145.373 116.000 140.000 110.627 140.000 104.000 C 140.000 97.373 145.373 92.000 152.000 92.000 L 176.000 92.000 C 182.627 92.000 188.000 97.373 188.000 104.000 C 188.000 110.627 182.627 116.000 176.000 116.000 ZM 104.000 92.000 L 100.000 92.000 L 100.000 88.000 C 100.000 81.373 94.627 76.000 88.000 76.000 C 81.373 76.000 76.000 81.373 76.000 88.000 L 76.000 92.000 L 72.000 92.000 C 65.373 92.000 60.000 97.373 60.000 104.000 C 60.000 110.627 65.373 116.000 72.000 116.000 L 76.000 116.000 L 76.000 120.000 C 76.000 126.627 81.373 132.000 88.000 132.000 C 94.627 132.000 100.000 126.627 100.000 120.000 L 100.000 116.000 L 104.000 116.000 C 110.627 116.000 116.000 110.627 116.000 104.000 C 116.000 97.373 110.627 92.000 104.000 92.000 ZM 244.760 202.940 C 237.979 212.609 227.271 218.788 215.506 219.820 C 203.741 220.851 192.121 216.631 183.760 208.290 C 183.573 208.113 183.396 207.926 183.230 207.730 L 144.670 164.000 L 111.330 164.000 L 72.810 207.730 C 72.640 207.920 72.460 208.110 72.280 208.290 C 59.932 220.622 41.014 223.526 25.536 215.464 C 10.058 207.403 1.593 190.237 4.620 173.050 C 4.614 172.983 4.614 172.917 4.620 172.850 L 21.000 88.790 C 26.380 58.270 52.890 36.015 83.880 36.000 L 172.000 36.000 C 202.882 36.044 229.340 58.108 234.930 88.480 C 234.933 88.543 234.933 88.607 234.930 88.670 L 251.290 172.840 C 251.294 172.907 251.294 172.973 251.290 173.040 C 253.192 183.479 250.841 194.245 244.760 202.940 ZM 172.000 140.000 C 194.091 140.000 212.000 122.091 212.000 100.000 C 212.000 77.909 194.091 60.000 172.000 60.000 L 83.890 60.000 C 64.508 60.019 47.943 73.965 44.620 93.060 C 44.615 93.130 44.615 93.200 44.620 93.270 L 28.280 177.270 C 26.805 185.946 32.613 194.184 41.280 195.710 C 46.306 196.587 51.450 195.024 55.140 191.500 L 96.900 144.070 C 99.177 141.484 102.455 140.002 105.900 140.000 ZM 227.760 177.310 L 220.760 141.360 C 209.638 154.512 193.672 162.612 176.490 163.820 L 200.900 191.540 C 205.882 196.320 213.369 197.365 219.469 194.131 C 225.570 190.898 228.908 184.117 227.750 177.310 Z"),
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
        return _gameController!!
    }

private var _gameController: ImageVector? = null
