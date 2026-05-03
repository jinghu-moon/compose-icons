package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Hammer: ImageVector
    get() {
        if (_hammer != null) return _hammer!!
        _hammer = lucideOutlineIcon(
            name = "Hammer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.000 12.000 L 5.627 21.373 C 4.799 22.202 3.455 22.202 2.627 21.374 C 1.798 20.545 1.798 19.202 2.626 18.373 L 12.000 9.000"),
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
                pathData = parseSvgPathData("M 18.000 15.000 L 22.000 11.000"),
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
                pathData = parseSvgPathData("M 21.500 11.500 L 19.586 9.586 C 19.211 9.211 19.000 8.702 19.000 8.172 L 19.000 7.828 C 19.000 7.298 18.789 6.789 18.414 6.414 L 16.757 4.757 C 15.632 3.632 14.107 3.000 12.516 3.000 L 9.000 3.000 L 10.243 4.243 C 11.368 5.368 12.000 6.894 12.000 8.485 L 12.000 10.000 L 14.000 12.000 L 15.172 12.000 C 15.702 12.000 16.211 12.211 16.586 12.586 L 18.500 14.500"),
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
        return _hammer!!
    }

private var _hammer: ImageVector? = null
