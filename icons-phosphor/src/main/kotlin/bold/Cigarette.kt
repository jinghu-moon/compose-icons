package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Cigarette: ImageVector
    get() {
        if (_cigarette != null) return _cigarette!!
        _cigarette = phosphorBoldIcon(
            name = "Cigarette",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 224.000 124.000 L 32.000 124.000 C 20.954 124.000 12.000 132.954 12.000 144.000 L 12.000 176.000 C 12.000 187.046 20.954 196.000 32.000 196.000 L 224.000 196.000 C 235.046 196.000 244.000 187.046 244.000 176.000 L 244.000 144.000 C 244.000 132.954 235.046 124.000 224.000 124.000 ZM 36.000 148.000 L 76.000 148.000 L 76.000 172.000 L 36.000 172.000 ZM 220.000 172.000 L 100.000 172.000 L 100.000 148.000 L 220.000 148.000 ZM 201.670 55.890 C 209.200 43.180 208.790 36.260 206.740 34.790 C 201.182 31.792 198.899 24.999 201.518 19.253 C 204.137 13.506 210.761 10.773 216.670 13.000 C 223.290 16.082 228.302 21.817 230.470 28.790 C 234.070 39.710 231.330 52.960 222.330 68.170 C 214.800 80.870 215.210 87.800 217.260 89.270 C 223.106 92.118 225.619 99.105 222.928 105.024 C 220.236 110.944 213.319 113.643 207.330 111.110 C 200.717 108.017 195.709 102.287 193.530 95.320 C 189.930 84.340 192.670 71.090 201.670 55.890 ZM 153.670 55.890 C 161.200 43.180 160.790 36.260 158.740 34.790 C 153.182 31.792 150.899 24.999 153.518 19.253 C 156.137 13.506 162.761 10.773 168.670 13.000 C 175.290 16.082 180.302 21.817 182.470 28.790 C 186.070 39.710 183.330 52.960 174.330 68.170 C 166.800 80.870 167.210 87.800 169.260 89.270 C 175.106 92.118 177.619 99.105 174.928 105.024 C 172.236 110.944 165.319 113.643 159.330 111.110 C 152.717 108.017 147.709 102.287 145.530 95.320 C 141.930 84.340 144.670 71.090 153.670 55.890 Z"),
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
        return _cigarette!!
    }

private var _cigarette: ImageVector? = null
