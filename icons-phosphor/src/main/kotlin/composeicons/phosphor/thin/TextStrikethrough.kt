package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextStrikethrough: ImageVector
    get() {
        if (_textStrikethrough != null) return _textStrikethrough!!
        _textStrikethrough = phosphorThinIcon(
            name = "TextStrikethrough",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 128c0 2.209-1.791 4-4 4h-54.84c15.45 7.24 26.84 17.8 26.84 36 0 24.26-26.92 44-60 44C94.92 212 68 192.26 68 168c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4 0 19.85 23.33 36 52 36 28.67 0 52-16.15 52-36 0-19.54-16.13-28.3-42.18-36h-97.82c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4ZM76.33 100c.425 .003 .847-.065 1.25-.2 2.073-.691 3.208-2.917 2.55-5-.684-2.184-1.021-4.462-1-6.75 0-20.52 21-36 48.89-36 20.32 0 37 8.2 44.49 21.92 1.122 1.807 3.462 2.42 5.326 1.395 1.864-1.025 2.599-3.33 1.674-5.245C170.54 53.75 151.29 44 128 44 95.57 44 71.11 62.92 71.11 88c-.017 3.139 .462 6.261 1.42 9.25 .54 1.641 2.072 2.75 3.8 2.75Z"),
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
