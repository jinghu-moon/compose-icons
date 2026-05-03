package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SmileyMeh: ImageVector
    get() {
        if (_smileyMeh != null) return _smileyMeh!!
        _smileyMeh = phosphorLightIcon(
            name = "SmileyMeh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 26.000 C 71.667 26.000 26.000 71.667 26.000 128.000 C 26.000 184.333 71.667 230.000 128.000 230.000 C 184.333 230.000 230.000 184.333 230.000 128.000 C 229.934 71.694 184.306 26.066 128.000 26.000 ZM 128.000 218.000 C 78.294 218.000 38.000 177.706 38.000 128.000 C 38.000 78.294 78.294 38.000 128.000 38.000 C 177.706 38.000 218.000 78.294 218.000 128.000 C 217.945 177.683 177.683 217.945 128.000 218.000 ZM 174.000 160.000 C 174.000 163.314 171.314 166.000 168.000 166.000 L 88.000 166.000 C 84.686 166.000 82.000 163.314 82.000 160.000 C 82.000 156.686 84.686 154.000 88.000 154.000 L 168.000 154.000 C 171.314 154.000 174.000 156.686 174.000 160.000 ZM 82.000 108.000 C 82.000 102.477 86.477 98.000 92.000 98.000 C 97.523 98.000 102.000 102.477 102.000 108.000 C 102.000 113.523 97.523 118.000 92.000 118.000 C 86.477 118.000 82.000 113.523 82.000 108.000 ZM 174.000 108.000 C 174.000 113.523 169.523 118.000 164.000 118.000 C 158.477 118.000 154.000 113.523 154.000 108.000 C 154.000 102.477 158.477 98.000 164.000 98.000 C 169.523 98.000 174.000 102.477 174.000 108.000 Z"),
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
        return _smileyMeh!!
    }

private var _smileyMeh: ImageVector? = null
