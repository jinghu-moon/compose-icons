package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NotionLogo: ImageVector
    get() {
        if (_notionLogo != null) return _notionLogo!!
        _notionLogo = phosphorRegularIcon(
            name = "NotionLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 40h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v120.85L111 44.14C109.594 41.588 106.913 40.003 104 40h-64c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v144h-16c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-16v-120.85l73 132.71c1.406 2.552 4.087 4.137 7 4.14h40c4.418 0 8-3.582 8-8v-152h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM77.53 56h21.74l79.2 144h-21.74Z"),
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
        return _notionLogo!!
    }

private var _notionLogo: ImageVector? = null
