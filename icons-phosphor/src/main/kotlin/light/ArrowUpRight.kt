package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowUpRight: ImageVector
    get() {
        if (_arrowUpRight != null) return _arrowUpRight!!
        _arrowUpRight = phosphorLightIcon(
            name = "ArrowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 198.000 64.000 L 198.000 168.000 C 198.000 171.314 195.314 174.000 192.000 174.000 C 188.686 174.000 186.000 171.314 186.000 168.000 L 186.000 78.480 L 68.240 196.240 C 65.876 198.443 62.192 198.378 59.907 196.093 C 57.622 193.808 57.557 190.124 59.760 187.760 L 177.520 70.000 L 88.000 70.000 C 84.686 70.000 82.000 67.314 82.000 64.000 C 82.000 60.686 84.686 58.000 88.000 58.000 L 192.000 58.000 C 195.314 58.000 198.000 60.686 198.000 64.000 Z"),
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
        return _arrowUpRight!!
    }

private var _arrowUpRight: ImageVector? = null
