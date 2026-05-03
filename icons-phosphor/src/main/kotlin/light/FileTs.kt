package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileTs: ImageVector
    get() {
        if (_fileTs != null) return _fileTs!!
        _fileTs = phosphorLightIcon(
            name = "FileTs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 212.240 83.760 L 156.240 27.760 C 155.116 26.634 153.591 26.001 152.000 26.000 L 56.000 26.000 C 48.268 26.000 42.000 32.268 42.000 40.000 L 42.000 112.000 C 42.000 115.314 44.686 118.000 48.000 118.000 C 51.314 118.000 54.000 115.314 54.000 112.000 L 54.000 40.000 C 54.000 38.895 54.895 38.000 56.000 38.000 L 146.000 38.000 L 146.000 88.000 C 146.000 91.314 148.686 94.000 152.000 94.000 L 202.000 94.000 L 202.000 216.000 C 202.000 217.105 201.105 218.000 200.000 218.000 L 176.000 218.000 C 172.686 218.000 170.000 220.686 170.000 224.000 C 170.000 227.314 172.686 230.000 176.000 230.000 L 200.000 230.000 C 207.732 230.000 214.000 223.732 214.000 216.000 L 214.000 88.000 C 213.999 86.409 213.366 84.884 212.240 83.760 ZM 158.000 46.480 L 193.520 82.000 L 158.000 82.000 ZM 145.830 196.060 C 145.261 201.673 142.213 206.739 137.520 209.870 C 132.700 213.060 126.650 214.010 121.160 214.010 C 116.202 213.964 111.270 213.292 106.480 212.010 C 103.288 211.118 101.423 207.807 102.315 204.615 C 103.207 201.423 106.518 199.558 109.710 200.450 C 113.420 201.450 125.290 203.560 130.900 199.830 C 132.684 198.621 133.796 196.643 133.900 194.490 C 134.480 190.060 131.820 188.230 119.700 184.730 C 110.390 182.040 96.330 177.980 98.130 163.790 C 98.684 158.302 101.643 153.343 106.210 150.250 C 117.320 142.760 135.390 147.250 137.420 147.770 C 140.552 148.674 142.389 151.913 141.558 155.065 C 140.726 158.217 137.530 160.129 134.360 159.370 C 130.580 158.370 118.510 156.370 112.910 160.210 C 111.211 161.362 110.146 163.241 110.030 165.290 C 109.620 168.510 112.170 170.070 123.030 173.200 C 132.920 176.090 147.840 180.400 145.830 196.060 ZM 86.000 152.000 C 86.000 155.314 83.314 158.000 80.000 158.000 L 66.000 158.000 L 66.000 208.000 C 66.000 211.314 63.314 214.000 60.000 214.000 C 56.686 214.000 54.000 211.314 54.000 208.000 L 54.000 158.000 L 40.000 158.000 C 36.686 158.000 34.000 155.314 34.000 152.000 C 34.000 148.686 36.686 146.000 40.000 146.000 L 80.000 146.000 C 83.314 146.000 86.000 148.686 86.000 152.000 Z"),
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
        return _fileTs!!
    }

private var _fileTs: ImageVector? = null
