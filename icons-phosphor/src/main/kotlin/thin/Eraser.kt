package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Eraser: ImageVector
    get() {
        if (_eraser != null) return _eraser!!
        _eraser = phosphorThinIcon(
            name = "Eraser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 222.150 83.220 L 180.770 41.850 C 172.960 34.042 160.300 34.042 152.490 41.850 L 33.850 160.480 C 30.098 164.231 27.989 169.319 27.989 174.625 C 27.989 179.931 30.098 185.019 33.850 188.770 L 63.910 218.830 C 64.661 219.580 65.679 220.001 66.740 220.000 L 216.000 220.000 C 218.209 220.000 220.000 218.209 220.000 216.000 C 220.000 213.791 218.209 212.000 216.000 212.000 L 121.660 212.000 L 222.150 111.510 C 225.902 107.759 228.011 102.671 228.011 97.365 C 228.011 92.059 225.902 86.971 222.150 83.220 ZM 110.340 212.000 L 68.400 212.000 L 39.510 183.110 C 37.251 180.858 35.981 177.800 35.981 174.610 C 35.981 171.420 37.251 168.362 39.510 166.110 L 96.000 109.650 L 154.350 168.000 ZM 216.490 105.850 L 160.000 162.340 L 101.650 104.000 L 158.140 47.520 C 160.392 45.261 163.450 43.991 166.640 43.991 C 169.830 43.991 172.888 45.261 175.140 47.520 L 216.510 88.890 C 221.184 93.581 221.175 101.170 216.490 105.850 Z"),
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
        return _eraser!!
    }

private var _eraser: ImageVector? = null
