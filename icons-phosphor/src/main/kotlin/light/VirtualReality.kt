package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.VirtualReality: ImageVector
    get() {
        if (_virtualReality != null) return _virtualReality!!
        _virtualReality = phosphorLightIcon(
            name = "VirtualReality",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 121.620 98.110 L 97.620 162.110 C 96.743 164.455 94.503 166.009 92.000 166.009 C 89.497 166.009 87.257 164.455 86.380 162.110 L 62.380 98.110 C 61.215 95.006 62.786 91.545 65.890 90.380 C 68.994 89.215 72.455 90.786 73.620 93.890 L 92.000 142.890 L 110.380 93.890 C 111.545 90.786 115.006 89.215 118.110 90.380 C 121.214 91.545 122.785 95.006 121.620 98.110 ZM 254.000 128.000 C 253.950 171.058 219.058 205.950 176.000 206.000 L 80.000 206.000 C 36.922 206.000 2.000 171.078 2.000 128.000 C 2.000 84.922 36.922 50.000 80.000 50.000 L 176.000 50.000 C 219.058 50.050 253.950 84.942 254.000 128.000 ZM 242.000 128.000 C 241.956 91.567 212.433 62.044 176.000 62.000 L 80.000 62.000 C 43.549 62.000 14.000 91.549 14.000 128.000 C 14.000 164.451 43.549 194.000 80.000 194.000 L 176.000 194.000 C 212.433 193.956 241.956 164.433 242.000 128.000 ZM 178.200 137.760 L 189.200 157.020 C 190.857 159.897 189.867 163.573 186.990 165.230 C 184.113 166.887 180.437 165.897 178.780 163.020 L 166.710 141.900 C 165.809 141.979 164.904 142.012 164.000 142.000 L 150.000 142.000 L 150.000 160.000 C 150.000 163.314 147.314 166.000 144.000 166.000 C 140.686 166.000 138.000 163.314 138.000 160.000 L 138.000 96.000 C 138.000 92.686 140.686 90.000 144.000 90.000 L 164.000 90.000 C 175.494 90.013 185.616 97.573 188.891 108.590 C 192.167 119.608 187.820 131.469 178.200 137.760 ZM 164.000 130.000 C 171.732 130.000 178.000 123.732 178.000 116.000 C 178.000 108.268 171.732 102.000 164.000 102.000 L 150.000 102.000 L 150.000 130.000 Z"),
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
        return _virtualReality!!
    }

private var _virtualReality: ImageVector? = null
