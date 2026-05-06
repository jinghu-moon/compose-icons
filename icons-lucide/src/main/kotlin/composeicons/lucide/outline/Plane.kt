package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Plane: ImageVector
    get() {
        if (_plane != null) return _plane!!
        _plane = lucideOutlineIcon(
            name = "Plane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17.8 19.2 16 11 19.5 7.5C21 6 21.5 4 21 3 20 2.5 18 3 16.5 4.5L13 8 4.8 6.2c-.5-.1-.9 .1-1.1 .5l-.3 .5c-.2 .5-.1 1 .3 1.3L9 12 7 15h-3L3 16l3 2 2 3L9 20v-3l3-2 3.5 5.3c.3 .4 .8 .5 1.3 .3l.5-.2c.4-.3 .6-.7 .5-1.2Z"),
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
        return _plane!!
    }

private var _plane: ImageVector? = null
