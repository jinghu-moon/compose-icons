package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Books: ImageVector
    get() {
        if (_books != null) return _books!!
        _books = phosphorThinIcon(
            name = "Books",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 104.000 36.000 L 56.000 36.000 C 49.373 36.000 44.000 41.373 44.000 48.000 L 44.000 208.000 C 44.000 214.627 49.373 220.000 56.000 220.000 L 104.000 220.000 C 110.627 220.000 116.000 214.627 116.000 208.000 L 116.000 48.000 C 116.000 41.373 110.627 36.000 104.000 36.000 ZM 52.000 76.000 L 108.000 76.000 L 108.000 180.000 L 52.000 180.000 ZM 56.000 44.000 L 104.000 44.000 C 106.209 44.000 108.000 45.791 108.000 48.000 L 108.000 68.000 L 52.000 68.000 L 52.000 48.000 C 52.000 45.791 53.791 44.000 56.000 44.000 ZM 104.000 212.000 L 56.000 212.000 C 53.791 212.000 52.000 210.209 52.000 208.000 L 52.000 188.000 L 108.000 188.000 L 108.000 208.000 C 108.000 210.209 106.209 212.000 104.000 212.000 ZM 227.740 195.380 L 194.550 37.570 C 193.901 34.443 192.033 31.703 189.358 29.957 C 186.684 28.212 183.424 27.605 180.300 28.270 L 133.490 38.320 C 127.014 39.752 122.898 46.129 124.260 52.620 L 157.450 210.430 C 158.099 213.557 159.967 216.297 162.642 218.043 C 165.316 219.788 168.576 220.395 171.700 219.730 L 218.510 209.670 L 218.510 209.670 C 224.988 208.248 229.108 201.869 227.740 195.380 ZM 144.530 110.110 L 199.160 98.380 L 214.160 169.450 L 159.530 181.190 ZM 137.890 78.550 L 192.530 66.810 L 197.530 90.550 L 142.890 102.280 ZM 135.180 46.150 L 182.000 36.090 C 182.276 36.030 182.558 36.000 182.840 36.000 C 183.600 36.002 184.343 36.225 184.980 36.640 C 185.892 37.226 186.527 38.157 186.740 39.220 L 190.880 59.000 L 136.240 70.720 L 132.090 51.000 C 131.606 48.808 132.989 46.638 135.180 46.150 ZM 216.830 201.850 L 170.000 211.910 C 168.967 212.130 167.888 211.932 167.000 211.360 C 166.088 210.774 165.453 209.843 165.240 208.780 L 161.120 189.000 L 215.760 177.270 L 219.910 197.000 C 220.394 199.189 219.017 201.358 216.830 201.850 Z"),
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
        return _books!!
    }

private var _books: ImageVector? = null
