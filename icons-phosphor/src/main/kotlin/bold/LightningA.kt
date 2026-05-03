package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LightningA: ImageVector
    get() {
        if (_lightningA != null) return _lightningA!!
        _lightningA = phosphorBoldIcon(
            name = "LightningA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 179.760 110.750 C 178.990 106.959 176.439 103.773 172.910 102.190 L 126.000 81.120 L 138.900 26.770 C 140.156 21.466 137.679 15.981 132.869 13.417 C 128.059 10.852 122.125 11.851 118.420 15.850 L 23.190 118.700 C 20.565 121.535 19.465 125.461 20.237 129.248 C 21.008 133.034 23.555 136.217 27.080 137.800 L 74.080 158.880 L 61.120 213.220 C 59.849 218.531 62.324 224.030 67.143 226.600 C 71.961 229.171 77.907 228.164 81.610 224.150 L 176.800 121.290 C 179.425 118.458 180.527 114.535 179.760 110.750 ZM 95.000 174.310 L 99.640 154.770 C 100.971 149.167 98.134 143.409 92.880 141.050 L 52.120 122.750 L 105.000 65.690 L 100.360 85.230 C 98.997 90.839 101.820 96.624 107.080 99.000 L 147.850 117.300 ZM 242.700 210.630 L 206.700 138.630 C 204.668 134.563 200.512 131.993 195.965 131.993 C 191.418 131.993 187.262 134.563 185.230 138.630 L 149.230 210.630 C 147.188 214.478 147.393 219.131 149.763 222.785 C 152.134 226.440 156.300 228.522 160.646 228.226 C 164.992 227.930 168.836 225.302 170.690 221.360 L 175.370 212.000 L 216.540 212.000 L 221.220 221.360 C 224.183 227.289 231.391 229.693 237.320 226.730 C 243.249 223.767 245.653 216.559 242.690 210.630 ZM 187.410 188.000 L 196.000 170.830 L 204.580 188.000 Z"),
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
        return _lightningA!!
    }

private var _lightningA: ImageVector? = null
