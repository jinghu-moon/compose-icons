package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Bone: ImageVector
    get() {
        if (_bone != null) return _bone!!
        _bone = lucideOutlineIcon(
            name = "Bone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M17 10c.7-.7 1.69 0 2.5 0C20.881 10 22 8.881 22 7.5 22 6.119 20.881 5 19.5 5 19.224 5 19 4.776 19 4.5 19 3.119 17.881 2 16.5 2 15.119 2 14 3.119 14 4.5c0 .81 .7 1.8 0 2.5L7 14c-.7 .7-1.69 0-2.5 0C3.119 14 2 15.119 2 16.5 2 17.881 3.119 19 4.5 19c.28 0 .5 .22 .5 .5C5 20.881 6.119 22 7.5 22 8.881 22 10 20.881 10 19.5 10 18.69 9.3 17.7 10 17Z"),
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
        return _bone!!
    }

private var _bone: ImageVector? = null
