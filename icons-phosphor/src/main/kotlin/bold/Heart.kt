package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = phosphorBoldIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 178.000 36.000 C 157.910 36.000 140.080 43.930 128.000 57.560 C 115.920 43.930 98.090 36.000 78.000 36.000 C 41.567 36.044 12.044 65.567 12.000 102.000 C 12.000 174.340 117.810 232.140 122.310 234.570 C 125.862 236.483 130.138 236.483 133.690 234.570 C 138.190 232.140 244.000 174.340 244.000 102.000 C 243.956 65.567 214.433 36.044 178.000 36.000 ZM 172.510 178.360 C 158.583 190.178 143.694 200.815 128.000 210.160 C 112.306 200.815 97.417 190.178 83.490 178.360 C 61.820 159.770 36.000 131.420 36.000 102.000 C 36.000 78.804 54.804 60.000 78.000 60.000 C 95.800 60.000 110.700 69.400 116.890 84.540 C 118.733 89.054 123.124 92.005 128.000 92.005 C 132.876 92.005 137.267 89.054 139.110 84.540 C 145.300 69.400 160.200 60.000 178.000 60.000 C 201.196 60.000 220.000 78.804 220.000 102.000 C 220.000 131.420 194.180 159.770 172.510 178.360 Z"),
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
        return _heart!!
    }

private var _heart: ImageVector? = null
