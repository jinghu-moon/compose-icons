package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Paragraph: ImageVector
    get() {
        if (_paragraph != null) return _paragraph!!
        _paragraph = phosphorThinIcon(
            name = "Paragraph",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 44h-112C62.863 44 36 70.863 36 104c0 33.137 26.863 60 60 60h44v44c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-156h32v156c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-156h20c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM140 156h-44C67.281 156 44 132.719 44 104 44 75.281 67.281 52 96 52h44Z"),
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
        return _paragraph!!
    }

private var _paragraph: ImageVector? = null
