package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CodeSimple: ImageVector
    get() {
        if (_codeSimple != null) return _codeSimple!!
        _codeSimple = phosphorBoldIcon(
            name = "CodeSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 73 34.06 128 96 183c4.971 4.418 5.418 12.029 1 17-4.418 4.971-12.029 5.418-17 1L8 137C5.417 134.722 3.937 131.444 3.937 128c0-3.444 1.48-6.722 4.063-9L80 55c4.971-4.418 12.582-3.971 17 1 4.418 4.971 3.971 12.582-1 17ZM248 119 176 55c-4.971-4.418-12.582-3.971-17 1-4.418 4.971-3.971 12.582 1 17l61.91 55L160 183c-4.971 4.418-5.418 12.029-1 17 4.418 4.971 12.029 5.418 17 1l72-64c2.583-2.278 4.063-5.556 4.063-9 0-3.444-1.48-6.722-4.063-9Z"),
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
        return _codeSimple!!
    }

private var _codeSimple: ImageVector? = null
