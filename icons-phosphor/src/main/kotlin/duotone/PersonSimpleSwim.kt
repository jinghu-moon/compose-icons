package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PersonSimpleSwim: ImageVector
    get() {
        if (_personSimpleSwim != null) return _personSimpleSwim!!
        _personSimpleSwim = phosphorDuotoneIcon(
            name = "PersonSimpleSwim",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 132.140 108.120 L 189.590 165.580 C 147.850 178.630 119.120 134.490 80.000 136.000 L 118.940 97.050 C 123.663 100.337 128.081 104.042 132.140 108.120 ZM 176.000 48.000 C 162.745 48.000 152.000 58.745 152.000 72.000 C 152.000 85.255 162.745 96.000 176.000 96.000 C 189.255 96.000 200.000 85.255 200.000 72.000 C 200.000 58.745 189.255 48.000 176.000 48.000 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 176.000 104.000 C 193.673 104.000 208.000 89.673 208.000 72.000 C 208.000 54.327 193.673 40.000 176.000 40.000 C 158.327 40.000 144.000 54.327 144.000 72.000 C 144.000 89.673 158.327 104.000 176.000 104.000 ZM 176.000 56.000 C 184.837 56.000 192.000 63.163 192.000 72.000 C 192.000 80.837 184.837 88.000 176.000 88.000 C 167.163 88.000 160.000 80.837 160.000 72.000 C 160.000 63.163 167.163 56.000 176.000 56.000 ZM 222.160 185.240 C 224.989 188.627 224.542 193.665 221.160 196.500 C 203.800 210.890 188.300 216.000 174.160 216.000 C 155.580 216.000 139.340 207.180 124.230 199.000 C 98.880 185.240 76.990 173.350 45.160 199.740 C 42.964 201.592 39.943 202.125 37.246 201.135 C 34.549 200.145 32.590 197.785 32.113 194.952 C 31.636 192.119 32.715 189.248 34.940 187.430 C 75.110 154.140 105.260 170.500 131.870 184.940 C 157.220 198.710 179.110 210.590 210.940 184.200 C 214.331 181.407 219.340 181.871 222.160 185.240 ZM 34.890 147.420 C 32.665 149.238 31.586 152.109 32.063 154.942 C 32.540 157.775 34.499 160.135 37.196 161.125 C 39.893 162.115 42.914 161.582 45.110 159.730 C 76.940 133.350 98.830 145.230 124.180 158.990 C 139.290 167.190 155.530 175.990 174.110 175.990 C 188.250 175.990 203.750 170.880 221.110 156.490 C 223.335 154.672 224.414 151.801 223.937 148.968 C 223.460 146.135 221.501 143.775 218.804 142.785 C 216.107 141.795 213.086 142.328 210.890 144.180 C 205.106 149.147 198.607 153.213 191.610 156.240 L 137.770 102.420 C 118.303 82.872 91.828 71.919 64.240 72.000 L 40.000 72.000 C 35.582 72.000 32.000 75.582 32.000 80.000 C 32.000 84.418 35.582 88.000 40.000 88.000 L 64.240 88.000 C 78.862 87.972 93.259 91.602 106.120 98.560 L 76.490 128.170 C 63.820 129.350 50.070 134.840 34.890 147.420 ZM 126.460 113.750 L 172.590 159.870 C 158.590 159.440 145.710 152.480 131.820 144.940 C 121.070 139.100 109.730 132.940 97.400 129.890 L 119.660 107.630 C 122.032 109.550 124.302 111.592 126.460 113.750 Z"),
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
