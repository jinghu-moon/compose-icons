package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Towel: ImageVector
    get() {
        if (_towel != null) return _towel!!
        _towel = phosphorBoldIcon(
            name = "Towel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M197.16 20c-.47 0-.93 0-1.39 0h-123.77C56.536 20 44 32.536 44 48v168c0 11.046 8.954 20 20 20h104c11.046 0 20-8.954 20-20v-164c0-4.418 3.582-8 8-8h.35c4.411 .334 7.792 4.057 7.7 8.48v95.52c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-95.52C228.253 35.073 214.555 20.671 197.16 20ZM72 44h93c-.667 2.614-1.003 5.302-1 8v120h-96v-124c0-2.209 1.791-4 4-4ZM68 212v-16h96v16Z"),
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
        return _towel!!
    }

private var _towel: ImageVector? = null
