package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Pen: ImageVector
    get() {
        if (_pen != null) return _pen!!
        _pen = phosphorBoldIcon(
            name = "Pen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.150 70.540 L 185.460 25.860 C 177.650 18.052 164.990 18.052 157.180 25.860 L 33.860 149.170 C 30.096 152.911 27.986 158.003 28.000 163.310 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 92.690 228.000 C 97.997 228.015 103.090 225.905 106.830 222.140 L 186.290 142.690 L 190.450 156.580 L 155.520 191.510 C 150.826 196.204 150.826 203.816 155.520 208.510 C 160.214 213.204 167.826 213.204 172.520 208.510 L 212.520 168.510 C 215.641 165.385 216.793 160.799 215.520 156.570 L 205.580 123.440 L 230.170 98.850 C 233.926 95.096 236.035 90.001 236.031 84.691 C 236.027 79.380 233.911 74.289 230.150 70.540 ZM 65.000 152.000 L 136.000 81.000 L 175.000 120.000 L 104.000 191.000 ZM 52.000 173.000 L 83.000 204.000 L 52.000 204.000 ZM 192.000 103.000 L 153.000 64.000 L 171.340 45.660 L 210.340 84.660 Z"),
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
        return _pen!!
    }

private var _pen: ImageVector? = null
