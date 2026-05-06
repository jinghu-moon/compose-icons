package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Shell: ImageVector
    get() {
        if (_shell != null) return _shell!!
        _shell = lucideOutlineIcon(
            name = "Shell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 11c0 1.105-.895 2-2 2-1.105 0-2-.895-2-2C10 8.791 11.791 7 14 7c2.209 0 4 1.791 4 4 0 3.314-2.686 6-6 6C8.686 17 6 14.314 6 11 6 6.582 9.582 3 14 3c4.418 0 8 3.582 8 8 0 5.523-4.477 10-10 10C6.477 21 2 16.523 2 11 1.996 8.394 2.846 5.858 4.42 3.78c.418-.616 1.142-.949 1.882-.865 .739 .084 1.371 .572 1.639 1.266 .268 .694 .129 1.479-.361 2.039"),
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
        return _shell!!
    }

private var _shell: ImageVector? = null
