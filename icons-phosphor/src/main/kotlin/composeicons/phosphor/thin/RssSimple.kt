package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.RssSimple: ImageVector
    get() {
        if (_rssSimple != null) return _rssSimple!!
        _rssSimple = phosphorThinIcon(
            name = "RssSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M220 192c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4C212 110.39 145.61 44 64 44c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 86 0 156 70 156 156ZM64 108c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4 41.955 .044 75.956 34.045 76 76 0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4-.05-46.371-37.629-83.95-84-84ZM68 180c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _rssSimple!!
    }

private var _rssSimple: ImageVector? = null
