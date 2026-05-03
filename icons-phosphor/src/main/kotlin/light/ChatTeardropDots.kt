package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatTeardropDots: ImageVector
    get() {
        if (_chatTeardropDots != null) return _chatTeardropDots!!
        _chatTeardropDots = phosphorLightIcon(
            name = "ChatTeardropDots",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 142.000 128.000 C 142.000 133.523 137.523 138.000 132.000 138.000 C 126.477 138.000 122.000 133.523 122.000 128.000 C 122.000 122.477 126.477 118.000 132.000 118.000 C 137.523 118.000 142.000 122.477 142.000 128.000 ZM 88.000 118.000 C 82.477 118.000 78.000 122.477 78.000 128.000 C 78.000 133.523 82.477 138.000 88.000 138.000 C 93.523 138.000 98.000 133.523 98.000 128.000 C 98.000 122.477 93.523 118.000 88.000 118.000 ZM 176.000 118.000 C 170.477 118.000 166.000 122.477 166.000 128.000 C 166.000 133.523 170.477 138.000 176.000 138.000 C 181.523 138.000 186.000 133.523 186.000 128.000 C 186.000 122.477 181.523 118.000 176.000 118.000 ZM 230.000 124.000 C 229.939 178.099 186.099 221.939 132.000 222.000 L 48.000 222.000 C 40.268 222.000 34.000 215.732 34.000 208.000 L 34.000 124.000 C 34.000 69.876 77.876 26.000 132.000 26.000 C 186.124 26.000 230.000 69.876 230.000 124.000 ZM 218.000 124.000 C 218.000 76.504 179.496 38.000 132.000 38.000 C 84.504 38.000 46.000 76.504 46.000 124.000 L 46.000 208.000 C 46.000 209.105 46.895 210.000 48.000 210.000 L 132.000 210.000 C 179.474 209.945 217.945 171.474 218.000 124.000 Z"),
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
        return _chatTeardropDots!!
    }

private var _chatTeardropDots: ImageVector? = null
