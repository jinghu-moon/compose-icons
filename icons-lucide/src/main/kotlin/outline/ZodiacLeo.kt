package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.ZodiacLeo: ImageVector
    get() {
        if (_zodiacLeo != null) return _zodiacLeo!!
        _zodiacLeo = lucideOutlineIcon(
            name = "ZodiacLeo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 16.000 C 10.000 12.000 7.000 11.500 7.000 8.000 C 7.000 5.239 9.239 3.000 12.000 3.000 C 14.761 3.000 17.000 5.239 17.000 8.000 C 17.000 11.466 14.000 14.196 14.000 18.000 C 14.000 19.657 15.343 21.000 17.000 21.000 C 18.657 21.000 20.000 19.657 20.000 18.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 10.000 16.000 C 10.000 17.657 8.657 19.000 7.000 19.000 C 5.343 19.000 4.000 17.657 4.000 16.000 C 4.000 14.343 5.343 13.000 7.000 13.000 C 8.657 13.000 10.000 14.343 10.000 16.000 Z"),
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
        return _zodiacLeo!!
    }

private var _zodiacLeo: ImageVector? = null
