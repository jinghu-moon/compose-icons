package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = lucideOutlineIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.7 10.3c-.452 .452-.707 1.065-.707 1.705 0 .64 .254 1.253 .707 1.705l7.59 7.59c.452 .452 1.065 .707 1.705 .707 .64 0 1.253-.254 1.705-.707l7.59-7.59c.452-.452 .707-1.065 .707-1.705 0-.64-.254-1.253-.707-1.705L13.7 2.71c-.452-.452-1.065-.707-1.705-.707-.64 0-1.253 .254-1.705 .707Z"),
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
        return _diamond!!
    }

private var _diamond: ImageVector? = null
