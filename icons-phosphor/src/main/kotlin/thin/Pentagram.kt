package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pentagram: ImageVector
    get() {
        if (_pentagram != null) return _pentagram!!
        _pentagram = phosphorThinIcon(
            name = "Pentagram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 235.390 92.290 C 233.835 87.319 229.209 83.952 224.000 84.000 L 160.000 84.000 L 139.420 20.470 C 137.893 15.444 133.258 12.007 128.005 12.007 C 122.752 12.007 118.117 15.444 116.590 20.470 L 96.000 84.000 L 32.000 84.000 C 26.804 84.016 22.209 87.374 20.616 92.319 C 19.022 97.264 20.792 102.673 25.000 105.720 L 76.820 143.000 L 57.000 204.250 C 55.339 209.192 57.110 214.639 61.360 217.660 C 65.541 220.772 71.269 220.772 75.450 217.660 L 128.000 179.830 L 180.580 217.660 C 184.785 220.717 190.479 220.718 194.686 217.664 C 198.893 214.610 200.654 209.195 199.050 204.250 L 179.180 143.000 L 231.000 105.700 C 235.261 102.687 237.044 97.239 235.390 92.290 ZM 124.210 22.880 C 124.672 21.164 126.228 19.971 128.005 19.971 C 129.782 19.971 131.338 21.164 131.800 22.880 L 151.620 84.000 L 104.380 84.000 ZM 29.670 99.230 C 28.277 98.212 27.693 96.415 28.222 94.773 C 28.751 93.131 30.274 92.013 32.000 92.000 L 93.370 92.000 L 79.370 135.000 ZM 70.670 211.230 C 69.268 212.243 67.374 212.241 65.975 211.224 C 64.576 210.207 63.989 208.406 64.520 206.760 L 64.520 206.760 L 83.600 147.960 L 121.110 174.960 ZM 86.190 139.970 L 101.780 92.000 L 154.220 92.000 L 169.770 139.930 L 128.000 170.000 ZM 191.400 206.760 C 191.936 208.411 191.345 210.219 189.938 211.236 C 188.532 212.253 186.630 212.246 185.230 211.220 L 134.850 174.900 L 172.360 147.900 ZM 226.300 99.260 L 176.590 135.000 L 162.590 92.000 L 224.000 92.000 C 225.725 92.006 227.253 93.117 227.789 94.757 C 228.325 96.397 227.749 98.196 226.360 99.220 Z"),
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
        return _pentagram!!
    }

private var _pentagram: ImageVector? = null
