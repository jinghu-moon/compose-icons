package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowCircleUp: ImageVector
    get() {
        if (_arrowCircleUp != null) return _arrowCircleUp!!
        _arrowCircleUp = phosphorLightIcon(
            name = "ArrowCircleUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 164.240 115.760 C 165.845 117.256 166.506 119.508 165.963 121.634 C 165.420 123.760 163.760 125.420 161.634 125.963 C 159.508 126.506 157.256 125.845 155.760 124.240 L 134.000 102.490 L 134.000 168.000 C 134.000 171.314 131.314 174.000 128.000 174.000 C 124.686 174.000 122.000 171.314 122.000 168.000 L 122.000 102.490 L 100.240 124.240 C 97.876 126.443 94.192 126.378 91.907 124.093 C 89.622 121.808 89.557 118.124 91.760 115.760 L 123.760 83.760 C 126.103 81.420 129.897 81.420 132.240 83.760 Z"),
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
        return _arrowCircleUp!!
    }

private var _arrowCircleUp: ImageVector? = null
