package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendDownLeft: ImageVector
    get() {
        if (_arrowBendDownLeft != null) return _arrowBendDownLeft!!
        _arrowBendDownLeft = phosphorLightIcon(
            name = "ArrowBendDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.000 56.000 C 229.934 112.306 184.306 157.934 128.000 158.000 L 46.490 158.000 L 84.240 195.760 C 85.845 197.256 86.506 199.508 85.963 201.634 C 85.420 203.760 83.760 205.420 81.634 205.963 C 79.508 206.506 77.256 205.845 75.760 204.240 L 27.760 156.240 C 25.420 153.897 25.420 150.103 27.760 147.760 L 75.760 99.760 C 78.124 97.557 81.808 97.622 84.093 99.907 C 86.378 102.192 86.443 105.876 84.240 108.240 L 46.490 146.000 L 128.000 146.000 C 177.683 145.945 217.945 105.683 218.000 56.000 C 218.000 52.686 220.686 50.000 224.000 50.000 C 227.314 50.000 230.000 52.686 230.000 56.000 Z"),
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
        return _arrowBendDownLeft!!
    }

private var _arrowBendDownLeft: ImageVector? = null
