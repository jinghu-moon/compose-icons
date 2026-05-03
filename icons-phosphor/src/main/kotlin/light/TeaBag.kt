package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TeaBag: ImageVector
    get() {
        if (_teaBag != null) return _teaBag!!
        _teaBag = phosphorLightIcon(
            name = "TeaBag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 224.000 162.000 C 214.059 162.000 206.000 153.941 206.000 144.000 L 206.000 64.000 C 206.000 34.177 181.823 10.000 152.000 10.000 C 122.177 10.000 98.000 34.177 98.000 64.000 L 98.000 74.000 L 76.530 74.000 C 71.617 74.016 67.068 76.594 64.530 80.800 L 44.000 115.000 C 42.692 117.177 42.000 119.670 42.000 122.210 L 42.000 216.000 C 42.000 223.732 48.268 230.000 56.000 230.000 L 152.000 230.000 C 159.732 230.000 166.000 223.732 166.000 216.000 L 166.000 122.220 C 166.000 119.680 165.308 117.187 164.000 115.010 L 143.480 80.800 C 140.942 76.594 136.393 74.016 131.480 74.000 L 110.000 74.000 L 110.000 64.000 C 110.000 40.804 128.804 22.000 152.000 22.000 C 175.196 22.000 194.000 40.804 194.000 64.000 L 194.000 144.000 C 194.000 160.569 207.431 174.000 224.000 174.000 C 227.314 174.000 230.000 171.314 230.000 168.000 C 230.000 164.686 227.314 162.000 224.000 162.000 ZM 131.470 86.000 C 132.180 86.004 132.835 86.385 133.190 87.000 L 153.720 121.220 C 153.900 121.523 153.996 121.868 154.000 122.220 L 154.000 216.000 C 154.000 217.105 153.105 218.000 152.000 218.000 L 56.000 218.000 C 54.895 218.000 54.000 217.105 54.000 216.000 L 54.000 122.220 C 54.007 121.867 54.107 121.522 54.290 121.220 L 74.810 87.000 C 75.165 86.385 75.820 86.004 76.530 86.000 L 98.000 86.000 L 98.000 136.000 C 98.000 139.314 100.686 142.000 104.000 142.000 C 107.314 142.000 110.000 139.314 110.000 136.000 L 110.000 86.000 Z"),
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
        return _teaBag!!
    }

private var _teaBag: ImageVector? = null
