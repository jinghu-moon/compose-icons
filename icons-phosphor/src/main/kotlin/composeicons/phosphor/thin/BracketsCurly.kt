package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) return _bracketsCurly!!
        _bracketsCurly = phosphorThinIcon(
            name = "BracketsCurly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M35.89 128C52 136.23 52 155.64 52 172c0 24.8 1.35 40 28 40 2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4C44 220 44 193.39 44 172 44 147.2 42.65 132 16 132c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 26.65 0 28-15.2 28-40C44 62.61 44 36 80 36c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4C53.35 44 52 59.2 52 84c0 16.36 0 35.77-16.11 44ZM240 124c-26.65 0-28-15.2-28-40 0-21.39 0-48-36-48-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 26.65 0 28 15.2 28 40 0 16.36 0 35.77 16.11 44C204 136.23 204 155.64 204 172c0 24.8-1.35 40-28 40-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 36 0 36-26.61 36-48 0-24.8 1.35-40 28-40 2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
