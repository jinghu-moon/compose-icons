package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.AmazonLogo: ImageVector
    get() {
        if (_amazonLogo != null) return _amazonLogo!!
        _amazonLogo = phosphorThinIcon(
            name = "AmazonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 244.000 168.000 L 244.000 200.000 C 244.000 202.209 242.209 204.000 240.000 204.000 C 237.791 204.000 236.000 202.209 236.000 200.000 L 236.000 177.660 L 226.900 186.760 C 224.520 189.370 188.300 228.000 128.000 228.000 C 66.920 228.000 30.550 188.360 29.000 186.680 C 27.520 185.023 27.663 182.480 29.320 181.000 C 30.977 179.520 33.520 179.663 35.000 181.320 C 35.350 181.710 70.630 220.000 128.000 220.000 C 185.370 220.000 220.680 181.710 221.000 181.320 L 221.140 181.170 L 230.310 172.000 L 208.000 172.000 C 205.791 172.000 204.000 170.209 204.000 168.000 C 204.000 165.791 205.791 164.000 208.000 164.000 L 240.000 164.000 C 242.209 164.000 244.000 165.791 244.000 168.000 ZM 164.000 105.510 L 164.000 84.000 C 164.009 65.502 151.334 49.411 133.348 45.088 C 115.362 40.765 96.758 49.338 88.360 65.820 C 87.735 67.137 86.444 68.009 84.989 68.098 C 83.535 68.187 82.147 67.477 81.367 66.246 C 80.587 65.015 80.539 63.457 81.240 62.180 C 91.323 42.411 113.643 32.130 135.220 37.318 C 156.797 42.505 172.006 61.808 172.000 84.000 L 172.000 176.000 C 172.000 178.209 170.209 180.000 168.000 180.000 C 165.791 180.000 164.000 178.209 164.000 176.000 L 164.000 158.490 C 152.307 176.150 130.421 184.058 110.141 177.952 C 89.860 171.846 75.978 153.170 75.978 131.990 C 75.978 110.810 89.860 92.134 110.141 86.028 C 130.421 79.922 152.307 87.830 164.000 105.490 ZM 164.000 132.000 C 164.000 109.909 146.091 92.000 124.000 92.000 C 101.909 92.000 84.000 109.909 84.000 132.000 C 84.000 154.091 101.909 172.000 124.000 172.000 C 146.091 172.000 164.000 154.091 164.000 132.000 Z"),
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
        return _amazonLogo!!
    }

private var _amazonLogo: ImageVector? = null
