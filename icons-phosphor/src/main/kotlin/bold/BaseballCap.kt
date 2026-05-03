package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.BaseballCap: ImageVector
    get() {
        if (_baseballCap != null) return _baseballCap!!
        _baseballCap = phosphorBoldIcon(
            name = "BaseballCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.381 20.066 20.066 68.381 20.000 128.000 L 20.000 184.000 C 19.969 194.525 25.872 204.170 35.260 208.930 C 44.679 213.743 56.005 212.838 64.540 206.590 C 76.200 198.110 96.680 188.000 128.000 188.000 C 159.320 188.000 179.800 198.100 191.460 206.580 C 199.969 212.809 211.255 213.730 220.661 208.961 C 230.066 204.193 235.995 194.545 236.000 184.000 L 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 212.000 128.000 L 212.000 129.870 C 201.444 123.931 190.284 119.137 178.710 115.570 C 175.671 91.841 167.682 69.015 155.260 48.570 C 189.168 60.249 211.947 92.137 212.000 128.000 ZM 153.540 109.880 C 136.606 107.373 119.394 107.373 102.460 109.880 C 106.617 88.620 115.330 68.512 128.000 50.940 C 140.668 68.513 149.380 88.620 153.540 109.880 ZM 100.740 48.570 C 88.318 69.015 80.329 91.841 77.290 115.570 C 65.716 119.137 54.556 123.931 44.000 129.870 L 44.000 128.000 C 44.053 92.137 66.832 60.249 100.740 48.570 ZM 209.850 187.570 C 208.474 188.291 206.806 188.151 205.570 187.210 C 191.000 176.610 165.770 164.000 128.000 164.000 C 90.230 164.000 65.000 176.610 50.430 187.180 C 49.194 188.121 47.526 188.261 46.150 187.540 C 44.789 186.897 43.944 185.504 44.000 184.000 L 44.000 158.140 C 94.574 123.276 161.426 123.276 212.000 158.140 L 212.000 184.000 C 212.056 185.504 211.211 186.897 209.850 187.540 Z"),
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
        return _baseballCap!!
    }

private var _baseballCap: ImageVector? = null
