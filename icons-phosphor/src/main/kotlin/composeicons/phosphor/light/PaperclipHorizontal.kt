package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PaperclipHorizontal: ImageVector
    get() {
        if (_paperclipHorizontal != null) return _paperclipHorizontal!!
        _paperclipHorizontal = phosphorLightIcon(
            name = "PaperclipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246 128c-.033 29.81-24.19 53.967-54 54h-144C27.013 182 10 164.987 10 144c0-20.987 17.013-38 38-38h144c12.15 0 22 9.85 22 22 0 12.15-9.85 22-22 22h-112c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h112c5.523 0 10-4.477 10-10 0-5.523-4.477-10-10-10h-144c-14.359 0-26 11.641-26 26 0 14.359 11.641 26 26 26h144c23.196 0 42-18.804 42-42C234 104.804 215.196 86 192 86h-112c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h112c29.81 .033 53.967 24.19 54 54Z"),
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
        return _paperclipHorizontal!!
    }

private var _paperclipHorizontal: ImageVector? = null
