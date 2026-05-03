package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Coin: ImageVector
    get() {
        if (_coin != null) return _coin!!
        _coin = phosphorLightIcon(
            name = "Coin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 206.680 65.630 C 186.230 55.410 159.000 50.000 128.000 50.000 C 97.000 50.000 69.770 55.410 49.320 65.630 C 29.410 75.580 18.000 89.570 18.000 104.000 L 18.000 152.000 C 18.000 166.430 29.410 180.420 49.320 190.370 C 69.770 200.590 97.000 206.000 128.000 206.000 C 159.000 206.000 186.230 200.590 206.680 190.370 C 226.590 180.420 238.000 166.430 238.000 152.000 L 238.000 104.000 C 238.000 89.570 226.590 75.580 206.680 65.630 ZM 54.680 76.370 C 73.210 67.100 99.250 62.000 128.000 62.000 C 156.750 62.000 182.790 67.100 201.320 76.370 C 217.000 84.210 226.000 94.280 226.000 104.000 C 226.000 113.720 217.000 123.790 201.320 131.630 C 182.790 140.900 156.750 146.000 128.000 146.000 C 99.250 146.000 73.210 140.900 54.680 131.630 C 39.000 123.790 30.000 113.720 30.000 104.000 C 30.000 94.280 39.000 84.210 54.680 76.370 ZM 122.000 157.930 L 122.000 193.930 C 102.760 193.450 84.930 190.650 70.000 185.820 L 70.000 150.420 C 85.270 154.930 102.850 157.490 122.000 157.930 ZM 134.000 157.930 C 153.150 157.490 170.730 154.930 186.000 150.410 L 186.000 185.810 C 171.070 190.640 153.240 193.440 134.000 193.920 ZM 30.000 152.000 L 30.000 129.000 C 35.709 134.428 42.227 138.935 49.320 142.360 Q 53.480 144.430 58.000 146.240 L 58.000 181.240 C 56.870 180.720 55.760 180.240 54.680 179.660 C 39.000 171.790 30.000 161.720 30.000 152.000 ZM 201.320 179.630 C 200.240 180.170 199.130 180.690 198.000 181.210 L 198.000 146.210 Q 202.510 144.400 206.680 142.330 C 213.771 138.914 220.289 134.417 226.000 129.000 L 226.000 152.000 C 226.000 161.720 217.000 171.790 201.320 179.630 Z"),
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
        return _coin!!
    }

private var _coin: ImageVector? = null
