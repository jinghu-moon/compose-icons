package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ClockAfternoon: ImageVector
    get() {
        if (_clockAfternoon != null) return _clockAfternoon!!
        _clockAfternoon = phosphorLightIcon(
            name = "ClockAfternoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 190.000 128.000 C 190.000 131.314 187.314 134.000 184.000 134.000 L 142.490 134.000 L 172.240 163.760 C 173.845 165.256 174.506 167.508 173.963 169.634 C 173.420 171.760 171.760 173.420 169.634 173.963 C 167.508 174.506 165.256 173.845 163.760 172.240 L 123.760 132.240 C 122.046 130.524 121.534 127.945 122.462 125.705 C 123.389 123.464 125.575 122.002 128.000 122.000 L 184.000 122.000 C 187.314 122.000 190.000 124.686 190.000 128.000 Z"),
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
        return _clockAfternoon!!
    }

private var _clockAfternoon: ImageVector? = null
