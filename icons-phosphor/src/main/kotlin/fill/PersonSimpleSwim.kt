package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleSwim: ImageVector
    get() {
        if (_personSimpleSwim != null) return _personSimpleSwim!!
        _personSimpleSwim = phosphorFillIcon(
            name = "PersonSimpleSwim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 144.000 72.000 C 144.000 54.327 158.327 40.000 176.000 40.000 C 193.673 40.000 208.000 54.327 208.000 72.000 C 208.000 89.673 193.673 104.000 176.000 104.000 C 158.327 104.000 144.000 89.673 144.000 72.000 ZM 210.890 184.190 C 179.060 210.580 157.170 198.700 131.820 184.930 C 105.210 170.490 75.060 154.120 34.890 187.420 C 32.665 189.238 31.586 192.109 32.063 194.942 C 32.540 197.775 34.499 200.135 37.196 201.125 C 39.893 202.115 42.914 201.582 45.110 199.730 C 76.940 173.340 98.830 185.230 124.180 198.990 C 139.290 207.190 155.530 215.990 174.110 215.990 C 188.250 215.990 203.750 210.880 221.110 196.490 C 224.512 193.668 224.982 188.622 222.160 185.220 C 219.338 181.818 214.292 181.348 210.890 184.170 ZM 34.890 147.430 C 32.665 149.248 31.586 152.119 32.063 154.952 C 32.540 157.785 34.499 160.145 37.196 161.135 C 39.893 162.125 42.914 161.592 45.110 159.740 C 76.940 133.360 98.830 145.240 124.180 159.000 C 139.290 167.200 155.530 176.000 174.110 176.000 C 188.250 176.000 203.750 170.890 221.110 156.500 C 223.335 154.682 224.414 151.811 223.937 148.978 C 223.460 146.145 221.501 143.785 218.804 142.795 C 216.107 141.805 213.086 142.338 210.890 144.190 C 205.106 149.157 198.607 153.223 191.610 156.250 L 137.770 102.430 C 118.305 82.878 91.829 71.921 64.240 72.000 L 40.000 72.000 C 35.582 72.000 32.000 75.582 32.000 80.000 C 32.000 84.418 35.582 88.000 40.000 88.000 L 64.240 88.000 C 78.862 87.972 93.259 91.602 106.120 98.560 L 76.490 128.170 C 63.820 129.360 50.070 134.840 34.890 147.420 Z"),
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
        return _personSimpleSwim!!
    }

private var _personSimpleSwim: ImageVector? = null
