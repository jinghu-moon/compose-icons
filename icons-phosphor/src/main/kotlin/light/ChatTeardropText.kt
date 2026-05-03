package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatTeardropText: ImageVector
    get() {
        if (_chatTeardropText != null) return _chatTeardropText!!
        _chatTeardropText = phosphorLightIcon(
            name = "ChatTeardropText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 170.000 112.000 C 170.000 115.314 167.314 118.000 164.000 118.000 L 96.000 118.000 C 92.686 118.000 90.000 115.314 90.000 112.000 C 90.000 108.686 92.686 106.000 96.000 106.000 L 164.000 106.000 C 167.314 106.000 170.000 108.686 170.000 112.000 ZM 164.000 138.000 L 96.000 138.000 C 92.686 138.000 90.000 140.686 90.000 144.000 C 90.000 147.314 92.686 150.000 96.000 150.000 L 164.000 150.000 C 167.314 150.000 170.000 147.314 170.000 144.000 C 170.000 140.686 167.314 138.000 164.000 138.000 ZM 230.000 124.000 C 229.939 178.099 186.099 221.939 132.000 222.000 L 48.000 222.000 C 40.268 222.000 34.000 215.732 34.000 208.000 L 34.000 124.000 C 34.000 69.876 77.876 26.000 132.000 26.000 C 186.124 26.000 230.000 69.876 230.000 124.000 ZM 218.000 124.000 C 218.000 76.504 179.496 38.000 132.000 38.000 C 84.504 38.000 46.000 76.504 46.000 124.000 L 46.000 208.000 C 46.000 209.105 46.895 210.000 48.000 210.000 L 132.000 210.000 C 179.474 209.945 217.945 171.474 218.000 124.000 Z"),
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
        return _chatTeardropText!!
    }

private var _chatTeardropText: ImageVector? = null
