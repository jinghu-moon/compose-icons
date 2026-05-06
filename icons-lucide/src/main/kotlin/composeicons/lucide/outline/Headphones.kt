package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Headphones: ImageVector
    get() {
        if (_headphones != null) return _headphones!!
        _headphones = lucideOutlineIcon(
            name = "Headphones",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M3 14h3c1.105 0 2 .895 2 2v3c0 1.105-.895 2-2 2h-1C3.895 21 3 20.105 3 19v-7C3 7.029 7.029 3 12 3c4.971 0 9 4.029 9 9v7c0 1.105-.895 2-2 2h-1c-1.105 0-2-.895-2-2v-3c0-1.105 .895-2 2-2h3"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _headphones!!
    }

private var _headphones: ImageVector? = null
