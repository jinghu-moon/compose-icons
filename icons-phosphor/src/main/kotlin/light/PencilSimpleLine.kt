package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PencilSimpleLine: ImageVector
    get() {
        if (_pencilSimpleLine != null) return _pencilSimpleLine!!
        _pencilSimpleLine = phosphorLightIcon(
            name = "PencilSimpleLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 225.910 74.790 L 181.220 30.100 C 178.594 27.474 175.033 25.999 171.320 25.999 C 167.607 25.999 164.046 27.474 161.420 30.100 L 38.100 153.410 C 35.469 156.032 33.993 159.596 34.000 163.310 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 216.000 222.000 C 219.314 222.000 222.000 219.314 222.000 216.000 C 222.000 212.686 219.314 210.000 216.000 210.000 L 110.490 210.000 L 225.910 94.590 C 228.536 91.964 230.011 88.403 230.011 84.690 C 230.011 80.977 228.536 77.416 225.910 74.790 ZM 93.520 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 163.310 C 46.002 162.780 46.214 162.273 46.590 161.900 L 136.000 72.490 L 183.520 120.000 ZM 217.420 86.100 L 192.000 111.520 L 144.490 64.000 L 169.900 38.590 C 170.275 38.214 170.784 38.003 171.315 38.003 C 171.846 38.003 172.355 38.214 172.730 38.590 L 217.420 83.270 C 217.796 83.645 218.007 84.154 218.007 84.685 C 218.007 85.216 217.796 85.725 217.420 86.100 Z"),
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
        return _pencilSimpleLine!!
    }

private var _pencilSimpleLine: ImageVector? = null
