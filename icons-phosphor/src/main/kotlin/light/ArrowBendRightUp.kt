package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendRightUp: ImageVector
    get() {
        if (_arrowBendRightUp != null) return _arrowBendRightUp!!
        _arrowBendRightUp = phosphorLightIcon(
            name = "ArrowBendRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.240 84.240 C 201.897 86.580 198.103 86.580 195.760 84.240 L 158.000 46.490 L 158.000 128.000 C 157.934 184.306 112.306 229.934 56.000 230.000 C 52.686 230.000 50.000 227.314 50.000 224.000 C 50.000 220.686 52.686 218.000 56.000 218.000 C 105.683 217.945 145.945 177.683 146.000 128.000 L 146.000 46.490 L 108.240 84.240 C 105.876 86.443 102.192 86.378 99.907 84.093 C 97.622 81.808 97.557 78.124 99.760 75.760 L 147.760 27.760 C 150.103 25.420 153.897 25.420 156.240 27.760 L 204.240 75.760 C 206.580 78.103 206.580 81.897 204.240 84.240 Z"),
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
        return _arrowBendRightUp!!
    }

private var _arrowBendRightUp: ImageVector? = null
