package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowUUpLeft: ImageVector
    get() {
        if (_arrowUUpLeft != null) return _arrowUUpLeft!!
        _arrowUUpLeft = phosphorLightIcon(
            name = "ArrowUUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.000 144.000 C 229.961 178.226 202.226 205.961 168.000 206.000 L 80.000 206.000 C 76.686 206.000 74.000 203.314 74.000 200.000 C 74.000 196.686 76.686 194.000 80.000 194.000 L 168.000 194.000 C 195.614 194.000 218.000 171.614 218.000 144.000 C 218.000 116.386 195.614 94.000 168.000 94.000 L 46.490 94.000 L 84.240 131.760 C 85.845 133.256 86.506 135.508 85.963 137.634 C 85.420 139.760 83.760 141.420 81.634 141.963 C 79.508 142.506 77.256 141.845 75.760 140.240 L 27.760 92.240 C 25.420 89.897 25.420 86.103 27.760 83.760 L 75.760 35.760 C 78.124 33.557 81.808 33.622 84.093 35.907 C 86.378 38.192 86.443 41.876 84.240 44.240 L 46.490 82.000 L 168.000 82.000 C 202.226 82.039 229.961 109.774 230.000 144.000 Z"),
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
        return _arrowUUpLeft!!
    }

private var _arrowUUpLeft: ImageVector? = null
