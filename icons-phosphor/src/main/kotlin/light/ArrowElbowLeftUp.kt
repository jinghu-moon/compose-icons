package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowLeftUp: ImageVector
    get() {
        if (_arrowElbowLeftUp != null) return _arrowElbowLeftUp!!
        _arrowElbowLeftUp = phosphorLightIcon(
            name = "ArrowElbowLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.000 192.000 C 238.000 195.314 235.314 198.000 232.000 198.000 L 88.000 198.000 C 84.686 198.000 82.000 195.314 82.000 192.000 L 82.000 62.490 L 44.240 100.240 C 41.876 102.443 38.192 102.378 35.907 100.093 C 33.622 97.808 33.557 94.124 35.760 91.760 L 83.760 43.760 C 86.103 41.420 89.897 41.420 92.240 43.760 L 140.240 91.760 C 141.845 93.256 142.506 95.508 141.963 97.634 C 141.420 99.760 139.760 101.420 137.634 101.963 C 135.508 102.506 133.256 101.845 131.760 100.240 L 94.000 62.490 L 94.000 186.000 L 232.000 186.000 C 235.314 186.000 238.000 188.686 238.000 192.000 Z"),
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
        return _arrowElbowLeftUp!!
    }

private var _arrowElbowLeftUp: ImageVector? = null
