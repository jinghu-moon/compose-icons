package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) return _textStrikethrough!!
        _textStrikethrough = phosphorBoldIcon(
            name = "TextStrikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 128c0 6.627-5.373 12-12 12h-30.14c6.729 7.756 10.342 17.733 10.14 28 0 14.45-7.81 28.32-21.43 38.05C162 215.05 145.44 220 128 220c-17.44 0-34-4.95-46.57-13.95C67.81 196.32 60 182.45 60 168c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 15.18 20.15 28 44 28 23.85 0 44-12.82 44-28 0-12.76-9.3-20.18-35.35-28h-96.65c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h176c6.627 0 12 5.373 12 12ZM75.11 100c6.627 0 12-5.373 12-12C87.11 72 104.69 60 128 60c17.36 0 31.37 6.65 37.48 17.78 3.356 5.45 10.398 7.307 16.005 4.22 5.607-3.086 7.805-10.03 4.995-15.78C176.13 47.3 154.25 36 128 36 91 36 63.11 58.35 63.11 88c0 6.627 5.373 12 12 12Z"),
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
        return _textStrikethrough!!
    }

private var _textStrikethrough: ImageVector? = null
