package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.GameController: ImageVector
    get() {
        if (_gameController != null) return _gameController!!
        _gameController = phosphorLightIcon(
            name = "GameController",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 176.000 110.000 L 152.000 110.000 C 148.686 110.000 146.000 107.314 146.000 104.000 C 146.000 100.686 148.686 98.000 152.000 98.000 L 176.000 98.000 C 179.314 98.000 182.000 100.686 182.000 104.000 C 182.000 107.314 179.314 110.000 176.000 110.000 ZM 104.000 98.000 L 94.000 98.000 L 94.000 88.000 C 94.000 84.686 91.314 82.000 88.000 82.000 C 84.686 82.000 82.000 84.686 82.000 88.000 L 82.000 98.000 L 72.000 98.000 C 68.686 98.000 66.000 100.686 66.000 104.000 C 66.000 107.314 68.686 110.000 72.000 110.000 L 82.000 110.000 L 82.000 120.000 C 82.000 123.314 84.686 126.000 88.000 126.000 C 91.314 126.000 94.000 123.314 94.000 120.000 L 94.000 110.000 L 104.000 110.000 C 107.314 110.000 110.000 107.314 110.000 104.000 C 110.000 100.686 107.314 98.000 104.000 98.000 ZM 239.840 199.500 C 233.480 208.584 223.089 213.996 212.000 214.000 C 203.001 213.979 194.374 210.403 188.000 204.050 L 187.740 203.770 L 147.380 158.000 L 108.620 158.000 L 68.310 203.760 L 68.000 204.000 C 61.641 210.381 53.009 213.978 44.000 214.000 C 33.953 213.993 24.423 209.543 17.968 201.844 C 11.513 194.145 8.794 183.984 10.540 174.090 C 10.540 174.090 10.540 174.030 10.540 173.990 L 26.900 89.880 C 31.759 62.204 55.791 42.014 83.890 42.000 L 172.000 42.000 C 200.017 42.036 224.013 62.070 229.050 89.630 C 229.050 89.700 229.050 89.750 229.050 89.820 L 245.460 174.000 C 245.460 174.000 245.460 174.070 245.460 174.110 C 247.053 182.984 245.030 192.127 239.840 199.500 ZM 172.000 146.000 C 197.405 146.000 218.000 125.405 218.000 100.000 C 218.000 74.595 197.405 54.000 172.000 54.000 L 83.890 54.000 C 61.601 54.017 42.546 70.044 38.710 92.000 C 38.705 92.033 38.705 92.067 38.710 92.100 L 22.330 176.230 C 20.690 185.650 25.322 195.051 33.791 199.490 C 42.260 203.929 52.627 202.389 59.440 195.680 L 101.440 148.030 C 102.585 146.750 104.223 146.022 105.940 146.030 ZM 233.670 176.230 L 223.880 125.880 C 214.060 145.543 193.979 157.976 172.000 158.000 L 163.370 158.000 L 196.560 195.680 C 203.373 202.389 213.740 203.929 222.209 199.490 C 230.678 195.051 235.311 185.650 233.670 176.230 Z"),
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
