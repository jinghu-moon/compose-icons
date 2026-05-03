package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HighHeel: ImageVector
    get() {
        if (_highHeel != null) return _highHeel!!
        _highHeel = phosphorLightIcon(
            name = "HighHeel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.530 158.140 L 179.000 146.530 L 68.240 35.760 C 67.082 34.602 65.502 33.967 63.864 34.003 C 62.227 34.038 60.676 34.742 59.570 35.950 C 37.920 59.620 26.000 89.470 26.000 120.000 L 26.000 192.000 C 26.000 199.732 32.268 206.000 40.000 206.000 L 72.000 206.000 C 79.732 206.000 86.000 199.732 86.000 192.000 L 86.000 139.650 C 109.401 152.315 127.687 172.703 137.740 197.340 C 139.893 202.615 145.043 206.046 150.740 206.000 L 240.000 206.000 C 247.732 206.000 254.000 199.732 254.000 192.000 L 254.000 187.270 C 254.031 173.238 244.247 161.095 230.530 158.140 ZM 74.000 192.000 C 74.000 193.105 73.105 194.000 72.000 194.000 L 40.000 194.000 C 38.895 194.000 38.000 193.105 38.000 192.000 L 38.000 126.180 C 50.348 126.795 62.510 129.437 74.000 134.000 ZM 242.000 192.000 C 242.000 193.105 241.105 194.000 240.000 194.000 L 150.720 194.000 C 149.920 194.014 149.188 193.550 148.860 192.820 C 139.536 169.884 123.689 150.187 103.280 136.170 C 84.053 122.902 61.495 115.281 38.160 114.170 C 39.470 90.660 48.600 67.830 64.310 48.790 L 171.760 156.240 C 172.562 157.042 173.574 157.600 174.680 157.850 L 227.910 169.850 C 236.143 171.608 242.020 178.891 242.000 187.310 Z"),
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
        return _highHeel!!
    }

private var _highHeel: ImageVector? = null
