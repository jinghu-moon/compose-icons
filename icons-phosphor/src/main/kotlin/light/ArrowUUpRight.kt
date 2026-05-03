package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowUUpRight: ImageVector
    get() {
        if (_arrowUUpRight != null) return _arrowUUpRight!!
        _arrowUUpRight = phosphorLightIcon(
            name = "ArrowUUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 171.760 131.760 L 209.510 94.000 L 88.000 94.000 C 60.386 94.000 38.000 116.386 38.000 144.000 C 38.000 171.614 60.386 194.000 88.000 194.000 L 176.000 194.000 C 179.314 194.000 182.000 196.686 182.000 200.000 C 182.000 203.314 179.314 206.000 176.000 206.000 L 88.000 206.000 C 53.758 206.000 26.000 178.242 26.000 144.000 C 26.000 109.758 53.758 82.000 88.000 82.000 L 209.510 82.000 L 171.760 44.240 C 169.557 41.876 169.622 38.192 171.907 35.907 C 174.192 33.622 177.876 33.557 180.240 35.760 L 228.240 83.760 C 230.580 86.103 230.580 89.897 228.240 92.240 L 180.240 140.240 C 177.876 142.443 174.192 142.378 171.907 140.093 C 169.622 137.808 169.557 134.124 171.760 131.760 Z"),
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
        return _arrowUUpRight!!
    }

private var _arrowUUpRight: ImageVector? = null
