package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendLeftUp: ImageVector
    get() {
        if (_arrowBendLeftUp != null) return _arrowBendLeftUp!!
        _arrowBendLeftUp = phosphorLightIcon(
            name = "ArrowBendLeftUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 206.000 224.000 C 206.000 227.314 203.314 230.000 200.000 230.000 C 143.694 229.934 98.066 184.306 98.000 128.000 L 98.000 46.490 L 60.240 84.240 C 57.876 86.443 54.192 86.378 51.907 84.093 C 49.622 81.808 49.557 78.124 51.760 75.760 L 99.760 27.760 C 102.103 25.420 105.897 25.420 108.240 27.760 L 156.240 75.760 C 157.845 77.256 158.506 79.508 157.963 81.634 C 157.420 83.760 155.760 85.420 153.634 85.963 C 151.508 86.506 149.256 85.845 147.760 84.240 L 110.000 46.490 L 110.000 128.000 C 110.055 177.683 150.317 217.945 200.000 218.000 C 203.314 218.000 206.000 220.686 206.000 224.000 Z"),
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
        return _arrowBendLeftUp!!
    }

private var _arrowBendLeftUp: ImageVector? = null
