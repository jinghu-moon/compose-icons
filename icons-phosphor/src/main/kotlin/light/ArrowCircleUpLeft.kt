package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowCircleUpLeft: ImageVector
    get() {
        if (_arrowCircleUpLeft != null) return _arrowCircleUpLeft!!
        _arrowCircleUpLeft = phosphorLightIcon(
            name = "ArrowCircleUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 164.240 155.760 C 165.845 157.256 166.506 159.508 165.963 161.634 C 165.420 163.760 163.760 165.420 161.634 165.963 C 159.508 166.506 157.256 165.845 155.760 164.240 L 102.000 110.490 L 102.000 144.000 C 102.000 147.314 99.314 150.000 96.000 150.000 C 92.686 150.000 90.000 147.314 90.000 144.000 L 90.000 96.000 C 90.000 92.686 92.686 90.000 96.000 90.000 L 144.000 90.000 C 147.314 90.000 150.000 92.686 150.000 96.000 C 150.000 99.314 147.314 102.000 144.000 102.000 L 110.490 102.000 Z"),
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
        return _arrowCircleUpLeft!!
    }

private var _arrowCircleUpLeft: ImageVector? = null
