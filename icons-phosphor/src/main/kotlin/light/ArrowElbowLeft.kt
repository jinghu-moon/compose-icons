package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowLeft: ImageVector
    get() {
        if (_arrowElbowLeft != null) return _arrowElbowLeft!!
        _arrowElbowLeft = phosphorLightIcon(
            name = "ArrowElbowLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 236.240 100.240 L 140.240 196.240 C 137.897 198.580 134.103 198.580 131.760 196.240 L 30.000 94.480 L 30.000 152.000 C 30.000 155.314 27.314 158.000 24.000 158.000 C 20.686 158.000 18.000 155.314 18.000 152.000 L 18.000 80.000 C 18.000 76.686 20.686 74.000 24.000 74.000 L 96.000 74.000 C 99.314 74.000 102.000 76.686 102.000 80.000 C 102.000 83.314 99.314 86.000 96.000 86.000 L 38.480 86.000 L 136.000 183.510 L 227.760 91.760 C 230.124 89.557 233.808 89.622 236.093 91.907 C 238.378 94.192 238.443 97.876 236.240 100.240 Z"),
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
        return _arrowElbowLeft!!
    }

private var _arrowElbowLeft: ImageVector? = null
