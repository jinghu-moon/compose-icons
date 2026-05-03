package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowBendDoubleUpLeft: ImageVector
    get() {
        if (_arrowBendDoubleUpLeft != null) return _arrowBendDoubleUpLeft!!
        _arrowBendDoubleUpLeft = phosphorLightIcon(
            name = "ArrowBendDoubleUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 84.240 147.760 C 85.845 149.256 86.506 151.508 85.963 153.634 C 85.420 155.760 83.760 157.420 81.634 157.963 C 79.508 158.506 77.256 157.845 75.760 156.240 L 27.760 108.240 C 25.420 105.897 25.420 102.103 27.760 99.760 L 75.760 51.760 C 78.124 49.557 81.808 49.622 84.093 51.907 C 86.378 54.192 86.443 57.876 84.240 60.240 L 40.490 104.000 ZM 128.000 98.000 L 94.490 98.000 L 132.240 60.240 C 134.443 57.876 134.378 54.192 132.093 51.907 C 129.808 49.622 126.124 49.557 123.760 51.760 L 75.760 99.760 C 73.420 102.103 73.420 105.897 75.760 108.240 L 123.760 156.240 C 126.124 158.443 129.808 158.378 132.093 156.093 C 134.378 153.808 134.443 150.124 132.240 147.760 L 94.490 110.000 L 128.000 110.000 C 177.683 110.055 217.945 150.317 218.000 200.000 C 218.000 203.314 220.686 206.000 224.000 206.000 C 227.314 206.000 230.000 203.314 230.000 200.000 C 229.934 143.694 184.306 98.066 128.000 98.000 Z"),
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
        return _arrowBendDoubleUpLeft!!
    }

private var _arrowBendDoubleUpLeft: ImageVector? = null
