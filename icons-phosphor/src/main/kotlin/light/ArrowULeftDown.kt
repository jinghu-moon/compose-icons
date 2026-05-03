package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowULeftDown: ImageVector
    get() {
        if (_arrowULeftDown != null) return _arrowULeftDown!!
        _arrowULeftDown = phosphorLightIcon(
            name = "ArrowULeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 206.000 88.000 L 206.000 176.000 C 206.000 179.314 203.314 182.000 200.000 182.000 C 196.686 182.000 194.000 179.314 194.000 176.000 L 194.000 88.000 C 194.000 60.386 171.614 38.000 144.000 38.000 C 116.386 38.000 94.000 60.386 94.000 88.000 L 94.000 209.510 L 131.760 171.760 C 134.124 169.557 137.808 169.622 140.093 171.907 C 142.378 174.192 142.443 177.876 140.240 180.240 L 92.240 228.240 C 89.897 230.580 86.103 230.580 83.760 228.240 L 35.760 180.240 C 33.557 177.876 33.622 174.192 35.907 171.907 C 38.192 169.622 41.876 169.557 44.240 171.760 L 82.000 209.510 L 82.000 88.000 C 82.000 53.758 109.758 26.000 144.000 26.000 C 178.242 26.000 206.000 53.758 206.000 88.000 Z"),
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
        return _arrowULeftDown!!
    }

private var _arrowULeftDown: ImageVector? = null
