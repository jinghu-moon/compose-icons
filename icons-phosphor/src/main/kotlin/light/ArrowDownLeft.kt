package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowDownLeft: ImageVector
    get() {
        if (_arrowDownLeft != null) return _arrowDownLeft!!
        _arrowDownLeft = phosphorLightIcon(
            name = "ArrowDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 196.240 68.240 L 78.480 186.000 L 168.000 186.000 C 171.314 186.000 174.000 188.686 174.000 192.000 C 174.000 195.314 171.314 198.000 168.000 198.000 L 64.000 198.000 C 60.686 198.000 58.000 195.314 58.000 192.000 L 58.000 88.000 C 58.000 84.686 60.686 82.000 64.000 82.000 C 67.314 82.000 70.000 84.686 70.000 88.000 L 70.000 177.520 L 187.760 59.760 C 190.124 57.557 193.808 57.622 196.093 59.907 C 198.378 62.192 198.443 65.876 196.240 68.240 Z"),
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
        return _arrowDownLeft!!
    }

private var _arrowDownLeft: ImageVector? = null
