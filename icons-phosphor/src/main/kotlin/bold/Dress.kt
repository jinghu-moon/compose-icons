package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Dress: ImageVector
    get() {
        if (_dress != null) return _dress!!
        _dress = phosphorBoldIcon(
            name = "Dress",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 218.380 208.120 C 218.320 208.000 218.270 207.870 218.210 207.750 L 173.670 112.880 L 193.000 82.560 C 193.060 82.470 193.120 82.380 193.170 82.290 C 196.970 75.956 196.970 68.044 193.170 61.710 C 193.030 61.470 192.870 61.230 192.710 61.000 L 172.000 31.440 L 172.000 12.000 C 172.000 5.373 166.627 0.000 160.000 0.000 C 153.373 0.000 148.000 5.373 148.000 12.000 L 148.000 31.000 L 143.620 36.470 C 139.825 41.216 134.077 43.979 128.000 43.979 C 121.923 43.979 116.175 41.216 112.380 36.470 L 108.000 31.000 L 108.000 12.000 C 108.000 5.373 102.627 0.000 96.000 0.000 C 89.373 0.000 84.000 5.373 84.000 12.000 L 84.000 31.440 L 63.310 61.000 C 63.150 61.230 62.990 61.470 62.850 61.710 C 59.050 68.044 59.050 75.956 62.850 82.290 C 62.850 82.380 62.960 82.470 63.020 82.560 L 82.330 112.880 L 37.790 207.750 C 37.730 207.870 37.680 208.000 37.620 208.120 C 34.971 214.299 35.604 221.395 39.304 227.008 C 43.005 232.621 49.277 235.999 56.000 236.000 L 200.000 236.000 C 206.725 236.003 213.000 232.626 216.703 227.012 C 220.406 221.399 221.039 214.301 218.390 208.120 ZM 128.000 68.000 C 139.725 68.024 150.969 63.340 159.210 55.000 L 171.210 72.100 L 153.420 100.000 L 102.580 100.000 L 84.820 72.120 L 96.820 55.020 C 105.057 63.346 116.288 68.021 128.000 68.000 ZM 62.310 212.000 L 103.620 124.000 L 152.380 124.000 L 193.690 212.000 Z"),
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
        return _dress!!
    }

private var _dress: ImageVector? = null
