package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) return _bracketsCurly!!
        _bracketsCurly = phosphorRegularIcon(
            name = "BracketsCurly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M43.18 128c3.39 2.789 6.122 6.292 8 10.26 4.8 9.9 4.8 22 4.8 33.74 0 24.31 1 36 24 36 4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8C62.5 224 50.66 217.86 44.78 205.74c-4.8-9.9-4.8-22-4.8-33.74 0-24.31-1-36-24-36-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 23 0 24-11.69 24-36 0-11.72 0-23.84 4.8-33.74C50.68 38.14 62.52 32 80 32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8C57 48 56 59.69 56 84c0 11.72 0 23.84-4.8 33.74-1.884 3.97-4.622 7.474-8.02 10.26ZM240 120c-23 0-24-11.69-24-36 0-11.72 0-23.84-4.8-33.74C205.32 38.14 193.48 32 176 32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 23 0 24 11.69 24 36 0 11.72 0 23.84 4.8 33.74 1.878 3.968 4.61 7.471 8 10.26-3.39 2.789-6.122 6.292-8 10.26C200 148.16 200 160.26 200 172c0 24.31-1 36-24 36-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 17.48 0 29.32-6.14 35.2-18.26C216 195.84 216 183.74 216 172c0-24.31 1-36 24-36 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _bracketsCurly!!
    }

private var _bracketsCurly: ImageVector? = null
