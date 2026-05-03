package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Megaphone: ImageVector
    get() {
        if (_megaphone != null) return _megaphone!!
        _megaphone = phosphorThinIcon(
            name = "Megaphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 76.000 L 160.100 76.000 C 157.910 75.890 105.550 72.620 55.720 30.830 C 52.151 27.831 47.168 27.170 42.940 29.136 C 38.713 31.102 36.007 35.338 36.000 40.000 L 36.000 200.000 C 35.971 204.668 38.678 208.921 42.920 210.870 C 44.512 211.608 46.245 211.994 48.000 212.000 C 50.817 211.994 53.541 210.992 55.690 209.170 C 98.150 173.550 142.450 165.920 155.970 164.370 L 155.970 200.660 C 155.964 204.677 157.968 208.431 161.310 210.660 L 172.310 217.990 C 175.546 220.147 179.626 220.603 183.258 219.212 C 186.890 217.821 189.623 214.757 190.590 210.990 L 203.080 163.900 C 226.773 162.301 244.922 142.191 244.091 118.459 C 243.259 94.727 223.746 75.937 200.000 76.000 ZM 156.000 156.300 C 142.470 157.650 96.000 164.920 50.580 203.050 C 49.391 204.053 47.729 204.276 46.318 203.622 C 44.907 202.968 44.003 201.555 44.000 200.000 L 44.000 40.000 C 44.000 38.450 44.897 37.039 46.300 36.380 C 46.850 36.132 47.447 36.003 48.050 36.000 C 48.986 36.017 49.885 36.372 50.580 37.000 C 96.000 75.090 142.470 82.360 156.000 83.710 ZM 182.870 209.000 C 182.555 210.262 181.646 211.293 180.432 211.762 C 179.219 212.232 177.853 212.082 176.770 211.360 L 165.770 204.030 C 164.657 203.288 163.989 202.038 163.990 200.700 L 163.990 164.000 L 194.790 164.000 ZM 200.000 156.000 L 164.000 156.000 L 164.000 84.000 L 200.000 84.000 C 219.882 84.000 236.000 100.118 236.000 120.000 C 236.000 139.882 219.882 156.000 200.000 156.000 Z"),
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
        return _megaphone!!
    }

private var _megaphone: ImageVector? = null
