package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowDownRight: ImageVector
    get() {
        if (_arrowDownRight != null) return _arrowDownRight!!
        _arrowDownRight = phosphorLightIcon(
            name = "ArrowDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 198.000 88.000 L 198.000 192.000 C 198.000 195.314 195.314 198.000 192.000 198.000 L 88.000 198.000 C 84.686 198.000 82.000 195.314 82.000 192.000 C 82.000 188.686 84.686 186.000 88.000 186.000 L 177.520 186.000 L 59.760 68.240 C 57.557 65.876 57.622 62.192 59.907 59.907 C 62.192 57.622 65.876 57.557 68.240 59.760 L 186.000 177.520 L 186.000 88.000 C 186.000 84.686 188.686 82.000 192.000 82.000 C 195.314 82.000 198.000 84.686 198.000 88.000 Z"),
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
        return _arrowDownRight!!
    }

private var _arrowDownRight: ImageVector? = null
