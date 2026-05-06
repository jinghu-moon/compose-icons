package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = lucideOutlineIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4 22v-18c0-.315 .148-.611 .4-.8C5.439 2.421 6.702 2 8 2c3 0 5 2 7.333 2q2 0 3.067-.8c.303-.227 .708-.264 1.047-.094C19.786 3.275 20 3.621 20 4v10c0 .315-.148 .611-.4 .8C18.561 15.579 17.298 16 16 16 13 16 11 14 8 14c-1.476 0-2.9 .544-4 1.528"),
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
        return _flag!!
    }

private var _flag: ImageVector? = null
