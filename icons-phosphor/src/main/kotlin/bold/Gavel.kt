package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Gavel: ImageVector
    get() {
        if (_gavel != null) return _gavel!!
        _gavel = phosphorBoldIcon(
            name = "Gavel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 246.140 113.860 L 230.140 97.860 C 224.058 91.784 214.774 90.274 207.080 94.110 L 161.880 48.910 C 165.719 41.218 164.213 31.934 158.140 25.850 L 142.140 9.850 C 134.330 2.042 121.670 2.042 113.860 9.850 L 49.860 73.850 C 42.052 81.660 42.052 94.320 49.860 102.130 L 65.860 118.130 C 71.922 124.192 81.173 125.717 88.860 121.920 L 29.360 181.380 C 16.862 193.878 16.862 214.142 29.360 226.640 C 41.858 239.138 62.122 239.138 74.620 226.640 L 134.000 167.210 C 130.237 174.885 131.768 184.103 137.810 190.150 L 153.810 206.150 C 157.561 209.902 162.649 212.011 167.955 212.011 C 173.261 212.011 178.349 209.902 182.100 206.150 L 246.100 142.150 C 249.852 138.399 251.961 133.311 251.961 128.005 C 251.961 122.699 249.852 117.611 246.100 113.860 ZM 80.000 98.340 L 69.640 88.000 L 128.000 29.650 L 138.340 40.000 ZM 57.640 209.670 C 54.514 212.793 49.448 212.791 46.325 209.665 C 43.202 206.539 43.204 201.473 46.330 198.350 L 105.850 138.830 L 117.160 150.150 ZM 150.340 149.380 L 106.620 105.660 L 145.620 66.660 L 189.340 110.380 ZM 167.990 186.380 L 157.650 176.000 L 216.000 117.660 L 226.340 128.000 Z"),
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
        return _gavel!!
    }

private var _gavel: ImageVector? = null
