package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowULeftUp: ImageVector
    get() {
        if (_arrowULeftUp != null) return _arrowULeftUp!!
        _arrowULeftUp = phosphorLightIcon(
            name = "ArrowULeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 206.000 80.000 L 206.000 168.000 C 206.000 202.242 178.242 230.000 144.000 230.000 C 109.758 230.000 82.000 202.242 82.000 168.000 L 82.000 46.490 L 44.240 84.240 C 41.876 86.443 38.192 86.378 35.907 84.093 C 33.622 81.808 33.557 78.124 35.760 75.760 L 83.760 27.760 C 86.103 25.420 89.897 25.420 92.240 27.760 L 140.240 75.760 C 141.845 77.256 142.506 79.508 141.963 81.634 C 141.420 83.760 139.760 85.420 137.634 85.963 C 135.508 86.506 133.256 85.845 131.760 84.240 L 94.000 46.490 L 94.000 168.000 C 94.000 195.614 116.386 218.000 144.000 218.000 C 171.614 218.000 194.000 195.614 194.000 168.000 L 194.000 80.000 C 194.000 76.686 196.686 74.000 200.000 74.000 C 203.314 74.000 206.000 76.686 206.000 80.000 Z"),
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
        return _arrowULeftUp!!
    }

private var _arrowULeftUp: ImageVector? = null
