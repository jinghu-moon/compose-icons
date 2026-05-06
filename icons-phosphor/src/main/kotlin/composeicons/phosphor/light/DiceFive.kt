package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.DiceFive: ImageVector
    get() {
        if (_diceFive != null) return _diceFive!!
        _diceFive = phosphorLightIcon(
            name = "DiceFive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 34h-128C47.431 34 34 47.431 34 64v128c0 16.569 13.431 30 30 30h128c16.569 0 30-13.431 30-30v-128C222 47.431 208.569 34 192 34ZM210 192c0 9.941-8.059 18-18 18h-128c-9.941 0-18-8.059-18-18v-128C46 54.059 54.059 46 64 46h128c9.941 0 18 8.059 18 18ZM102 92c0 5.523-4.477 10-10 10C86.477 102 82 97.523 82 92 82 86.477 86.477 82 92 82c5.523 0 10 4.477 10 10ZM138 128c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM174 92c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM102 164c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM174 164c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10Z"),
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
        return _diceFive!!
    }

private var _diceFive: ImageVector? = null
