package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NotionLogo: ImageVector
    get() {
        if (_notionLogo != null) return _notionLogo!!
        _notionLogo = phosphorThinIcon(
            name = "NotionLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 44h-48c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v140.43L107.5 46.07C106.797 44.794 105.457 44.001 104 44h-64c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h20v152h-20c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h48c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-20v-140.43l80.5 146.36c.703 1.276 2.043 2.069 3.5 2.07h40c2.209 0 4-1.791 4-4v-156h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM70.77 52h30.86l83.6 152h-30.86Z"),
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
