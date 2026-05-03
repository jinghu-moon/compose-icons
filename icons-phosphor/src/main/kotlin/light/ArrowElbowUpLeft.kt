package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowUpLeft: ImageVector
    get() {
        if (_arrowElbowUpLeft != null) return _arrowElbowUpLeft!!
        _arrowElbowUpLeft = phosphorLightIcon(
            name = "ArrowElbowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 198.000 80.000 L 198.000 224.000 C 198.000 227.314 195.314 230.000 192.000 230.000 C 188.686 230.000 186.000 227.314 186.000 224.000 L 186.000 86.000 L 62.490 86.000 L 100.240 123.760 C 101.845 125.256 102.506 127.508 101.963 129.634 C 101.420 131.760 99.760 133.420 97.634 133.963 C 95.508 134.506 93.256 133.845 91.760 132.240 L 43.760 84.240 C 41.420 81.897 41.420 78.103 43.760 75.760 L 91.760 27.760 C 93.256 26.155 95.508 25.494 97.634 26.037 C 99.760 26.580 101.420 28.240 101.963 30.366 C 102.506 32.492 101.845 34.744 100.240 36.240 L 62.490 74.000 L 192.000 74.000 C 195.314 74.000 198.000 76.686 198.000 80.000 Z"),
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
        return _arrowElbowUpLeft!!
    }

private var _arrowElbowUpLeft: ImageVector? = null
