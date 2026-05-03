package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Bell: ImageVector
    get() {
        if (_bell != null) return _bell!!
        _bell = phosphorBoldIcon(
            name = "Bell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 225.290 165.930 C 216.610 151.000 212.000 129.570 212.000 104.000 C 212.000 57.608 174.392 20.000 128.000 20.000 C 81.608 20.000 44.000 57.608 44.000 104.000 C 44.000 129.580 39.410 151.000 30.730 165.930 C 27.125 172.128 27.099 179.777 30.660 186.000 C 34.201 192.229 40.835 196.055 48.000 196.000 L 84.180 196.000 C 86.237 218.667 105.240 236.024 128.000 236.024 C 150.760 236.024 169.763 218.667 171.820 196.000 L 208.000 196.000 C 215.154 196.044 221.774 192.220 225.310 186.000 C 228.887 179.786 228.879 172.137 225.290 165.930 ZM 128.000 212.000 C 118.495 212.002 110.301 205.313 108.400 196.000 L 147.600 196.000 C 145.699 205.313 137.505 212.002 128.000 212.000 ZM 54.660 172.000 C 63.510 154.000 68.000 131.140 68.000 104.000 C 68.000 70.863 94.863 44.000 128.000 44.000 C 161.137 44.000 188.000 70.863 188.000 104.000 C 188.000 131.130 192.480 154.000 201.330 172.000 Z"),
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
        return _bell!!
    }

private var _bell: ImageVector? = null
