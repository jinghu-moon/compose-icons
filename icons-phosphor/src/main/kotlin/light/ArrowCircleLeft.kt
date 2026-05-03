package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowCircleLeft: ImageVector
    get() {
        if (_arrowCircleLeft != null) return _arrowCircleLeft!!
        _arrowCircleLeft = phosphorLightIcon(
            name = "ArrowCircleLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 174.000 128.000 C 174.000 131.314 171.314 134.000 168.000 134.000 L 102.490 134.000 L 124.240 155.760 C 125.845 157.256 126.506 159.508 125.963 161.634 C 125.420 163.760 123.760 165.420 121.634 165.963 C 119.508 166.506 117.256 165.845 115.760 164.240 L 83.760 132.240 C 81.420 129.897 81.420 126.103 83.760 123.760 L 115.760 91.760 C 118.124 89.557 121.808 89.622 124.093 91.907 C 126.378 94.192 126.443 97.876 124.240 100.240 L 102.490 122.000 L 168.000 122.000 C 171.314 122.000 174.000 124.686 174.000 128.000 Z"),
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
        return _arrowCircleLeft!!
    }

private var _arrowCircleLeft: ImageVector? = null
