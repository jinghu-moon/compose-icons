package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Check: ImageVector
    get() {
        if (_check != null) return _check!!
        _check = phosphorLightIcon(
            name = "Check",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.240 76.240 L 100.240 204.240 C 97.897 206.580 94.103 206.580 91.760 204.240 L 35.760 148.240 C 33.557 145.876 33.622 142.192 35.907 139.907 C 38.192 137.622 41.876 137.557 44.240 139.760 L 96.000 191.510 L 219.760 67.760 C 222.124 65.557 225.808 65.622 228.093 67.907 C 230.378 70.192 230.443 73.876 228.240 76.240 Z"),
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
        return _check!!
    }

private var _check: ImageVector? = null
