package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ArrowLineUpLeft: ImageVector
    get() {
        if (_arrowLineUpLeft != null) return _arrowLineUpLeft!!
        _arrowLineUpLeft = phosphorLightIcon(
            name = "ArrowLineUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 230.000 208.000 C 230.000 211.314 227.314 214.000 224.000 214.000 L 48.000 214.000 C 44.686 214.000 42.000 211.314 42.000 208.000 C 42.000 204.686 44.686 202.000 48.000 202.000 L 224.000 202.000 C 227.314 202.000 230.000 204.686 230.000 208.000 ZM 72.000 150.000 C 75.314 150.000 78.000 147.314 78.000 144.000 L 78.000 62.490 L 179.760 164.240 C 182.124 166.443 185.808 166.378 188.093 164.093 C 190.378 161.808 190.443 158.124 188.240 155.760 L 86.490 54.000 L 168.000 54.000 C 171.314 54.000 174.000 51.314 174.000 48.000 C 174.000 44.686 171.314 42.000 168.000 42.000 L 72.000 42.000 C 68.686 42.000 66.000 44.686 66.000 48.000 L 66.000 144.000 C 66.000 147.314 68.686 150.000 72.000 150.000 Z"),
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
        return _arrowLineUpLeft!!
    }

private var _arrowLineUpLeft: ImageVector? = null
