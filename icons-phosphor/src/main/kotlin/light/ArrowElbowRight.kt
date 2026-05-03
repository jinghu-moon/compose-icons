package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowElbowRight: ImageVector
    get() {
        if (_arrowElbowRight != null) return _arrowElbowRight!!
        _arrowElbowRight = phosphorLightIcon(
            name = "ArrowElbowRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 238.000 80.000 L 238.000 152.000 C 238.000 155.314 235.314 158.000 232.000 158.000 C 228.686 158.000 226.000 155.314 226.000 152.000 L 226.000 94.480 L 124.240 196.240 C 121.897 198.580 118.103 198.580 115.760 196.240 L 19.760 100.240 C 17.557 97.876 17.622 94.192 19.907 91.907 C 22.192 89.622 25.876 89.557 28.240 91.760 L 120.000 183.510 L 217.520 86.000 L 160.000 86.000 C 156.686 86.000 154.000 83.314 154.000 80.000 C 154.000 76.686 156.686 74.000 160.000 74.000 L 232.000 74.000 C 235.314 74.000 238.000 76.686 238.000 80.000 Z"),
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
        return _arrowElbowRight!!
    }

private var _arrowElbowRight: ImageVector? = null
