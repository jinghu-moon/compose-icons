package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PencilSimple: ImageVector
    get() {
        if (_pencilSimple != null) return _pencilSimple!!
        _pencilSimple = phosphorBoldIcon(
            name = "PencilSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.140 70.540 L 185.460 25.850 C 181.709 22.098 176.621 19.989 171.315 19.989 C 166.009 19.989 160.921 22.098 157.170 25.850 L 33.860 149.170 C 30.095 152.910 27.985 158.003 28.000 163.310 L 28.000 208.000 C 28.000 219.046 36.954 228.000 48.000 228.000 L 92.690 228.000 C 97.997 228.014 103.089 225.904 106.830 222.140 L 230.140 98.820 C 237.948 91.010 237.948 78.350 230.140 70.540 ZM 91.000 204.000 L 52.000 204.000 L 52.000 165.000 L 136.000 81.000 L 175.000 120.000 ZM 192.000 103.000 L 153.000 64.000 L 171.340 45.660 L 210.340 84.660 Z"),
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
        return _pencilSimple!!
    }

private var _pencilSimple: ImageVector? = null
