package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Paperclip: ImageVector
    get() {
        if (_paperclip != null) return _paperclip!!
        _paperclip = lucideOutlineIcon(
            name = "Paperclip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16 6 7.586 14.586c-.781 .781-.781 2.048 0 2.829 .781 .781 2.048 .781 2.829 0L18.829 8.829c1.562-1.562 1.562-4.095 0-5.657-1.562-1.562-4.095-1.562-5.657 0L4.793 11.723C3.257 13.235 2.649 15.454 3.201 17.537c.552 2.083 2.179 3.71 4.263 4.263 2.083 .552 4.303-.055 5.814-1.592l8.379-8.551"),
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
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
