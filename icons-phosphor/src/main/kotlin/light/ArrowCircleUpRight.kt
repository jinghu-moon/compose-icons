package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowCircleUpRight: ImageVector
    get() {
        if (_arrowCircleUpRight != null) return _arrowCircleUpRight!!
        _arrowCircleUpRight = phosphorLightIcon(
            name = "ArrowCircleUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 166.000 96.000 L 166.000 144.000 C 166.000 147.314 163.314 150.000 160.000 150.000 C 156.686 150.000 154.000 147.314 154.000 144.000 L 154.000 110.490 L 100.240 164.240 C 97.876 166.443 94.192 166.378 91.907 164.093 C 89.622 161.808 89.557 158.124 91.760 155.760 L 145.510 102.000 L 112.000 102.000 C 108.686 102.000 106.000 99.314 106.000 96.000 C 106.000 92.686 108.686 90.000 112.000 90.000 L 160.000 90.000 C 163.314 90.000 166.000 92.686 166.000 96.000 Z"),
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
        return _arrowCircleUpRight!!
    }

private var _arrowCircleUpRight: ImageVector? = null
