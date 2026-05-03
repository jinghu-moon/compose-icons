package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CaretCircleLeft: ImageVector
    get() {
        if (_caretCircleLeft != null) return _caretCircleLeft!!
        _caretCircleLeft = phosphorLightIcon(
            name = "CaretCircleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 148.240 92.240 L 112.490 128.000 L 148.240 163.760 C 149.845 165.256 150.506 167.508 149.963 169.634 C 149.420 171.760 147.760 173.420 145.634 173.963 C 143.508 174.506 141.256 173.845 139.760 172.240 L 99.760 132.240 C 97.420 129.897 97.420 126.103 99.760 123.760 L 139.760 83.760 C 142.124 81.557 145.808 81.622 148.093 83.907 C 150.378 86.192 150.443 89.876 148.240 92.240 Z"),
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
        return _caretCircleLeft!!
    }

private var _caretCircleLeft: ImageVector? = null
