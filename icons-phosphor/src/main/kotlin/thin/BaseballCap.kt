package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BaseballCap: ImageVector
    get() {
        if (_baseballCap != null) return _baseballCap!!
        _baseballCap = phosphorThinIcon(
            name = "BaseballCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.799 28.066 28.066 72.799 28.000 128.000 L 28.000 184.000 C 28.000 191.540 32.239 198.439 38.966 201.845 C 45.693 205.250 53.763 204.584 59.840 200.120 C 72.460 191.000 94.530 180.000 128.000 180.000 C 161.470 180.000 183.540 190.940 196.160 200.120 C 202.276 204.617 210.410 205.264 217.160 201.790 C 223.841 198.381 228.034 191.501 228.000 184.000 L 228.000 128.000 C 227.934 72.799 183.201 28.066 128.000 28.000 ZM 220.000 128.000 L 220.000 144.230 C 205.134 134.094 188.687 126.501 171.330 121.760 C 168.388 90.631 156.531 61.011 137.180 36.450 C 184.176 41.219 219.949 80.763 220.000 128.000 ZM 163.100 119.740 C 139.966 114.753 116.034 114.753 92.900 119.740 C 97.640 76.930 120.000 47.310 128.000 38.000 C 136.000 47.320 158.360 76.930 163.100 119.750 ZM 118.820 36.460 C 99.469 61.021 87.612 90.641 84.670 121.770 C 67.313 126.511 50.866 134.104 36.000 144.240 L 36.000 128.000 C 36.056 80.767 71.828 41.228 118.820 36.460 ZM 213.480 194.670 C 209.434 196.788 204.532 196.399 200.870 193.670 C 187.290 183.780 163.620 172.000 128.000 172.000 C 92.380 172.000 68.710 183.770 55.130 193.650 C 51.468 196.379 46.566 196.768 42.520 194.650 C 38.484 192.644 35.951 188.507 36.000 184.000 L 36.000 154.000 C 90.805 113.979 165.195 113.979 220.000 154.000 L 220.000 184.000 C 220.057 188.514 217.523 192.661 213.480 194.670 Z"),
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
        return _baseballCap!!
    }

private var _baseballCap: ImageVector? = null
