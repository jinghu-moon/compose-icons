package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TShirt: ImageVector
    get() {
        if (_tShirt != null) return _tShirt!!
        _tShirt = phosphorLightIcon(
            name = "TShirt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 246.640 63.000 L 194.870 34.740 C 193.991 34.254 193.004 34.000 192.000 34.000 L 160.000 34.000 C 156.686 34.000 154.000 36.686 154.000 40.000 C 154.000 54.359 142.359 66.000 128.000 66.000 C 113.641 66.000 102.000 54.359 102.000 40.000 C 102.000 36.686 99.314 34.000 96.000 34.000 L 64.000 34.000 C 62.993 33.998 62.002 34.253 61.120 34.740 L 9.360 63.000 C 2.656 66.538 0.072 74.830 3.580 81.550 L 22.860 118.360 C 25.372 123.095 30.310 126.040 35.670 126.000 L 58.000 126.000 L 58.000 208.000 C 58.000 215.732 64.268 222.000 72.000 222.000 L 184.000 222.000 C 191.732 222.000 198.000 215.732 198.000 208.000 L 198.000 126.000 L 220.340 126.000 C 225.700 126.040 230.638 123.095 233.150 118.360 L 252.430 81.550 C 255.936 74.827 253.348 66.535 246.640 63.000 ZM 35.640 114.000 C 34.745 114.031 33.907 113.565 33.460 112.790 L 14.210 76.000 C 13.991 75.555 13.963 75.039 14.133 74.573 C 14.303 74.107 14.656 73.730 15.110 73.530 L 58.000 50.110 L 58.000 114.000 ZM 186.000 208.000 C 186.000 209.105 185.105 210.000 184.000 210.000 L 72.000 210.000 C 70.895 210.000 70.000 209.105 70.000 208.000 L 70.000 46.000 L 90.480 46.000 C 93.490 64.370 109.365 77.856 127.980 77.856 C 146.595 77.856 162.470 64.370 165.480 46.000 L 186.000 46.000 ZM 241.800 76.000 L 222.520 112.800 C 222.073 113.575 221.235 114.041 220.340 114.010 L 198.000 114.010 L 198.000 50.110 L 240.900 73.510 C 241.356 73.714 241.709 74.095 241.877 74.565 C 242.045 75.035 242.014 75.554 241.790 76.000 Z"),
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
        return _tShirt!!
    }

private var _tShirt: ImageVector? = null
