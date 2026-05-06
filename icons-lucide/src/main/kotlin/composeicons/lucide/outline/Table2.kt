package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Table2: ImageVector
    get() {
        if (_table2 != null) return _table2!!
        _table2 = lucideOutlineIcon(
            name = "Table2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9 3h-4C3.895 3 3 3.895 3 5v4M9 3h10c1.105 0 2 .895 2 2v4M9 3v18M9 21h10c1.105 0 2-.895 2-2v-10M9 21h-4C3.895 21 3 20.105 3 19v-10M3 9h18"),
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
        return _table2!!
    }

private var _table2: ImageVector? = null
