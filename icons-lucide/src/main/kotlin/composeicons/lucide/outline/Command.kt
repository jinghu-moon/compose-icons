package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Command: ImageVector
    get() {
        if (_command != null) return _command!!
        _command = lucideOutlineIcon(
            name = "Command",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 6v12c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3 0-1.657-1.343-3-3-3h-12C4.343 15 3 16.343 3 18c0 1.657 1.343 3 3 3 1.657 0 3-1.343 3-3v-12C9 4.343 7.657 3 6 3 4.343 3 3 4.343 3 6 3 7.657 4.343 9 6 9h12c1.657 0 3-1.343 3-3C21 4.343 19.657 3 18 3 16.343 3 15 4.343 15 6"),
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
        return _command!!
    }

private var _command: ImageVector? = null
