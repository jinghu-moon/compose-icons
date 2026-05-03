package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowCircleDownRight: ImageVector
    get() {
        if (_arrowCircleDownRight != null) return _arrowCircleDownRight!!
        _arrowCircleDownRight = phosphorLightIcon(
            name = "ArrowCircleDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 166.000 112.000 L 166.000 160.000 C 166.000 163.314 163.314 166.000 160.000 166.000 L 112.000 166.000 C 108.686 166.000 106.000 163.314 106.000 160.000 C 106.000 156.686 108.686 154.000 112.000 154.000 L 145.510 154.000 L 91.760 100.240 C 89.557 97.876 89.622 94.192 91.907 91.907 C 94.192 89.622 97.876 89.557 100.240 91.760 L 154.000 145.510 L 154.000 112.000 C 154.000 108.686 156.686 106.000 160.000 106.000 C 163.314 106.000 166.000 108.686 166.000 112.000 Z"),
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
        return _arrowCircleDownRight!!
    }

private var _arrowCircleDownRight: ImageVector? = null
