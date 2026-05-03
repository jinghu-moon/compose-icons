package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Leaf: ImageVector
    get() {
        if (_leaf != null) return _leaf!!
        _leaf = phosphorDuotoneIcon(
            name = "Leaf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 63.810 192.190 C 15.920 112.380 79.810 32.570 215.450 40.550 C 223.430 176.230 143.620 240.080 63.810 192.190 Z"),
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
        pathData = parseSvgPathData("M 223.450 40.070 C 223.213 36.019 219.981 32.787 215.930 32.550 C 139.800 28.080 78.820 51.000 52.820 94.000 C 43.808 108.709 39.367 125.763 40.060 143.000 C 40.630 158.920 45.270 175.000 53.850 190.850 L 34.340 210.350 C 31.214 213.476 31.214 218.544 34.340 221.670 C 37.466 224.796 42.534 224.796 45.660 221.670 L 65.160 202.160 C 81.000 210.730 97.090 215.370 113.000 215.940 Q 114.670 216.000 116.330 216.000 C 132.447 216.043 148.259 211.604 162.000 203.180 C 205.000 177.180 227.930 116.210 223.450 40.070 ZM 153.750 189.500 C 131.000 203.280 104.070 203.500 77.040 190.270 L 165.670 101.650 C 168.796 98.524 168.796 93.456 165.670 90.330 C 162.544 87.204 157.476 87.204 154.350 90.330 L 65.730 179.000 C 52.540 152.000 52.730 125.000 66.500 102.290 C 88.590 65.820 141.100 45.850 207.810 48.230 C 210.200 114.890 190.220 167.410 153.750 189.500 Z"),
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
        return _leaf!!
    }

private var _leaf: ImageVector? = null
