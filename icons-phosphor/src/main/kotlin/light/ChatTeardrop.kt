package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatTeardrop: ImageVector
    get() {
        if (_chatTeardrop != null) return _chatTeardrop!!
        _chatTeardrop = phosphorLightIcon(
            name = "ChatTeardrop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 132.000 26.000 C 77.901 26.061 34.061 69.901 34.000 124.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 132.000 222.000 C 186.124 222.000 230.000 178.124 230.000 124.000 C 230.000 69.876 186.124 26.000 132.000 26.000 ZM 132.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 124.000 C 46.000 76.504 84.504 38.000 132.000 38.000 C 179.496 38.000 218.000 76.504 218.000 124.000 C 218.000 171.496 179.496 210.000 132.000 210.000 Z"),
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
        return _chatTeardrop!!
    }

private var _chatTeardrop: ImageVector? = null
