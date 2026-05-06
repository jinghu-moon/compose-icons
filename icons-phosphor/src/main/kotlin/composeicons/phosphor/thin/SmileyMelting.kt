package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SmileyMelting: ImageVector
    get() {
        if (_smileyMelting != null) return _smileyMelting!!
        _smileyMelting = phosphorThinIcon(
            name = "SmileyMelting",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 140c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM124 92c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8ZM198.21 56.8C159.754 18.879 98.136 18.345 59.028 55.594 19.92 92.843 17.455 154.414 53.46 194.67c1.475 1.657 4.013 1.805 5.67 .33 1.657-1.475 1.805-4.013 .33-5.67C26.478 152.447 28.576 96.083 64.207 61.753c35.631-34.33 92.034-34.33 127.666 0 35.631 34.33 37.729 90.694 4.747 127.577-1.475 1.657-1.327 4.195 .33 5.67 1.657 1.475 4.195 1.327 5.67-.33C238.154 154.892 236.214 94.226 198.21 56.8ZM152 172h-16c-12 0-25.28-4.92-35.42-13.16C89.89 150.15 84 139.19 84 128c-.003-2.459 .201-4.915 .61-7.34 .342-2.168-1.127-4.206-3.291-4.569-2.165-.362-4.217 1.087-4.599 3.249-.48 2.862-.721 5.758-.72 8.66 0 29.29 32.25 52 60 52h16c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-56c-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h56c11.046 0 20-8.954 20-20 0-11.046-8.954-20-20-20Z"),
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
        return _smileyMelting!!
    }

private var _smileyMelting: ImageVector? = null
