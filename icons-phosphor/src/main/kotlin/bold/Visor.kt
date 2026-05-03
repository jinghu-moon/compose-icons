package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Visor: ImageVector
    get() {
        if (_visor != null) return _visor!!
        _visor = phosphorBoldIcon(
            name = "Visor",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 188.000 104.000 C 188.000 110.627 182.627 116.000 176.000 116.000 L 80.000 116.000 C 73.373 116.000 68.000 110.627 68.000 104.000 C 68.000 97.373 73.373 92.000 80.000 92.000 L 176.000 92.000 C 182.627 92.000 188.000 97.373 188.000 104.000 ZM 255.910 131.630 C 253.901 171.163 221.989 202.593 182.430 204.000 C 181.870 204.000 181.300 204.000 180.740 204.000 C 166.300 204.000 151.370 198.220 135.160 186.360 C 130.901 183.226 125.099 183.226 120.840 186.360 C 104.000 198.680 88.560 204.440 73.570 204.000 C 34.011 202.593 2.099 171.163 0.090 131.630 C -0.903 110.868 6.651 90.605 20.994 75.560 C 35.336 60.515 55.214 52.001 76.000 52.000 L 180.000 52.000 C 200.786 52.001 220.664 60.515 235.006 75.560 C 249.349 90.605 256.903 110.868 255.910 131.630 ZM 217.620 92.100 C 207.838 81.774 194.224 75.948 180.000 76.000 L 76.000 76.000 C 61.773 76.000 48.167 81.829 38.353 92.129 C 28.539 102.428 23.373 116.300 24.060 130.510 C 25.443 157.545 47.267 179.034 74.320 180.000 C 83.740 180.290 94.320 176.000 106.670 167.000 C 119.359 157.667 136.641 157.667 149.330 167.000 C 161.690 176.000 172.240 180.290 181.680 180.000 C 208.729 179.035 230.552 157.551 231.940 130.520 C 232.674 116.286 227.492 102.381 217.620 92.100 Z"),
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
        return _visor!!
    }

private var _visor: ImageVector? = null
