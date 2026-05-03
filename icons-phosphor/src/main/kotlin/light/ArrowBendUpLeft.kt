package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendUpLeft: ImageVector
    get() {
        if (_arrowBendUpLeft != null) return _arrowBendUpLeft!!
        _arrowBendUpLeft = phosphorLightIcon(
            name = "ArrowBendUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 230.000 200.000 C 230.000 203.314 227.314 206.000 224.000 206.000 C 220.686 206.000 218.000 203.314 218.000 200.000 C 217.945 150.317 177.683 110.055 128.000 110.000 L 46.490 110.000 L 84.240 147.760 C 85.845 149.256 86.506 151.508 85.963 153.634 C 85.420 155.760 83.760 157.420 81.634 157.963 C 79.508 158.506 77.256 157.845 75.760 156.240 L 27.760 108.240 C 25.420 105.897 25.420 102.103 27.760 99.760 L 75.760 51.760 C 78.124 49.557 81.808 49.622 84.093 51.907 C 86.378 54.192 86.443 57.876 84.240 60.240 L 46.490 98.000 L 128.000 98.000 C 184.306 98.066 229.934 143.694 230.000 200.000 Z"),
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
        return _arrowBendUpLeft!!
    }

private var _arrowBendUpLeft: ImageVector? = null
