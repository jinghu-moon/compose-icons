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
                pathData = parseSvgPathData("M 16.000 6.000 L 7.586 14.586 C 6.805 15.367 6.805 16.634 7.586 17.415 C 8.367 18.196 9.634 18.196 10.415 17.415 L 18.829 8.829 C 20.391 7.267 20.391 4.734 18.829 3.172 C 17.267 1.610 14.734 1.610 13.172 3.172 L 4.793 11.723 C 3.257 13.235 2.649 15.454 3.201 17.537 C 3.753 19.621 5.380 21.248 7.464 21.800 C 9.547 22.352 11.766 21.744 13.278 20.208 L 21.657 11.657"),
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
