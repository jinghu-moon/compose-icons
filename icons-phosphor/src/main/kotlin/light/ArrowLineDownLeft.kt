package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLineDownLeft: ImageVector
    get() {
        if (_arrowLineDownLeft != null) return _arrowLineDownLeft!!
        _arrowLineDownLeft = phosphorLightIcon(
            name = "ArrowLineDownLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.000 48.000 C 230.000 51.314 227.314 54.000 224.000 54.000 L 48.000 54.000 C 44.686 54.000 42.000 51.314 42.000 48.000 C 42.000 44.686 44.686 42.000 48.000 42.000 L 224.000 42.000 C 227.314 42.000 230.000 44.686 230.000 48.000 ZM 179.760 91.760 L 78.000 193.520 L 78.000 112.000 C 78.000 108.686 75.314 106.000 72.000 106.000 C 68.686 106.000 66.000 108.686 66.000 112.000 L 66.000 208.000 C 66.000 211.314 68.686 214.000 72.000 214.000 L 168.000 214.000 C 171.314 214.000 174.000 211.314 174.000 208.000 C 174.000 204.686 171.314 202.000 168.000 202.000 L 86.480 202.000 L 188.240 100.240 C 190.443 97.876 190.378 94.192 188.093 91.907 C 185.808 89.622 182.124 89.557 179.760 91.760 Z"),
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
        return _arrowLineDownLeft!!
    }

private var _arrowLineDownLeft: ImageVector? = null
