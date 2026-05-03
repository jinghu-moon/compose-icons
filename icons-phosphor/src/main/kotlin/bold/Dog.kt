package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Dog: ImageVector
    get() {
        if (_dog != null) return _dog!!
        _dog = phosphorBoldIcon(
            name = "Dog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 108.000 136.000 C 108.000 144.837 100.837 152.000 92.000 152.000 C 83.163 152.000 76.000 144.837 76.000 136.000 C 76.000 127.163 83.163 120.000 92.000 120.000 C 100.837 120.000 108.000 127.163 108.000 136.000 ZM 164.000 120.000 C 155.163 120.000 148.000 127.163 148.000 136.000 C 148.000 144.837 155.163 152.000 164.000 152.000 C 172.837 152.000 180.000 144.837 180.000 136.000 C 180.000 127.163 172.837 120.000 164.000 120.000 ZM 232.240 146.180 C 229.600 147.387 226.733 148.018 223.830 148.030 C 222.544 148.026 221.261 147.895 220.000 147.640 L 220.000 184.000 C 219.972 208.289 200.289 227.972 176.000 228.000 L 80.000 228.000 C 55.711 227.972 36.028 208.289 36.000 184.000 L 36.000 147.630 C 34.733 147.891 33.443 148.021 32.150 148.020 C 29.254 148.012 26.394 147.384 23.760 146.180 C 15.292 142.459 10.551 133.351 12.360 124.280 L 28.780 36.280 C 29.802 30.868 33.011 26.116 37.650 23.147 C 42.289 20.177 47.947 19.252 53.290 20.590 L 53.760 20.720 L 105.760 35.990 L 150.300 35.990 L 202.300 20.720 L 202.770 20.590 C 208.117 19.253 213.780 20.182 218.419 23.158 C 223.059 26.133 226.265 30.892 227.280 36.310 L 243.700 124.310 C 245.485 133.386 240.719 142.482 232.240 146.180 ZM 172.240 54.550 L 217.000 112.420 L 204.440 45.090 ZM 39.000 112.420 L 83.760 54.550 L 51.560 45.090 ZM 196.000 184.000 L 196.000 124.480 L 146.110 60.000 L 109.890 60.000 L 60.000 124.480 L 60.000 184.000 C 60.000 195.046 68.954 204.000 80.000 204.000 L 116.000 204.000 L 116.000 197.000 L 103.520 184.510 C 98.826 179.816 98.826 172.204 103.520 167.510 C 108.214 162.816 115.826 162.816 120.520 167.510 L 128.000 175.000 L 135.510 167.480 C 140.204 162.786 147.816 162.786 152.510 167.480 C 157.204 172.174 157.204 179.786 152.510 184.480 L 140.000 197.000 L 140.000 204.000 L 176.000 204.000 C 187.046 204.000 196.000 195.046 196.000 184.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _dog!!
    }

private var _dog: ImageVector? = null
