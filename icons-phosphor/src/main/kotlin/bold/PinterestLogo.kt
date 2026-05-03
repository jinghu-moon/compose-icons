package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) return _pinterestLogo!!
        _pinterestLogo = phosphorBoldIcon(
            name = "PinterestLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 228.000 112.000 C 228.000 135.600 219.710 157.230 204.650 172.880 C 190.520 187.570 171.330 196.000 152.000 196.000 C 136.550 196.000 125.220 191.820 117.110 186.690 L 107.680 226.750 C 106.734 230.961 103.599 234.340 99.470 235.599 C 95.341 236.857 90.854 235.800 87.720 232.832 C 84.586 229.864 83.288 225.441 84.320 221.250 L 116.320 85.250 C 117.266 81.039 120.401 77.660 124.530 76.401 C 128.659 75.143 133.146 76.200 136.280 79.168 C 139.414 82.136 140.712 86.559 139.680 90.750 L 123.230 160.680 C 126.720 164.860 135.160 172.000 152.000 172.000 C 177.560 172.000 204.000 149.550 204.000 112.000 C 203.985 83.422 186.104 57.903 159.248 48.133 C 132.392 38.362 102.293 46.426 83.919 68.314 C 65.544 90.202 62.816 121.242 77.090 146.000 C 80.146 151.709 78.120 158.814 72.513 162.053 C 66.906 165.293 59.740 163.499 56.320 158.000 C 36.987 124.505 40.666 82.495 65.527 52.870 C 90.387 23.245 131.121 12.331 167.463 25.557 C 203.805 38.783 227.996 73.326 228.000 112.000 Z"),
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
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
