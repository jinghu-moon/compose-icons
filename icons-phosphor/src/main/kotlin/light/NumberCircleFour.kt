package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberCircleFour: ImageVector
    get() {
        if (_numberCircleFour != null) return _numberCircleFour!!
        _numberCircleFour = phosphorLightIcon(
            name = "NumberCircleFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 160.000 146.000 L 150.000 146.000 L 150.000 80.000 C 150.001 77.435 148.371 75.154 145.945 74.323 C 143.519 73.491 140.832 74.294 139.260 76.320 L 83.260 148.320 C 81.855 150.129 81.603 152.581 82.610 154.639 C 83.618 156.696 85.709 158.000 88.000 158.000 L 138.000 158.000 L 138.000 176.000 C 138.000 179.314 140.686 182.000 144.000 182.000 C 147.314 182.000 150.000 179.314 150.000 176.000 L 150.000 158.000 L 160.000 158.000 C 163.314 158.000 166.000 155.314 166.000 152.000 C 166.000 148.686 163.314 146.000 160.000 146.000 ZM 138.000 146.000 L 100.270 146.000 L 138.000 97.490 Z"),
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
        return _numberCircleFour!!
    }

private var _numberCircleFour: ImageVector? = null
