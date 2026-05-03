package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowCircleDownLeft: ImageVector
    get() {
        if (_arrowCircleDownLeft != null) return _arrowCircleDownLeft!!
        _arrowCircleDownLeft = phosphorLightIcon(
            name = "ArrowCircleDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 164.240 91.760 C 166.580 94.103 166.580 97.897 164.240 100.240 L 110.490 154.000 L 144.000 154.000 C 147.314 154.000 150.000 156.686 150.000 160.000 C 150.000 163.314 147.314 166.000 144.000 166.000 L 96.000 166.000 C 92.686 166.000 90.000 163.314 90.000 160.000 L 90.000 112.000 C 90.000 108.686 92.686 106.000 96.000 106.000 C 99.314 106.000 102.000 108.686 102.000 112.000 L 102.000 145.510 L 155.760 91.760 C 158.103 89.420 161.897 89.420 164.240 91.760 Z"),
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
        return _arrowCircleDownLeft!!
    }

private var _arrowCircleDownLeft: ImageVector? = null
