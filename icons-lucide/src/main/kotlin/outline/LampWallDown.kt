package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LampWallDown: ImageVector
    get() {
        if (_lampWallDown != null) return _lampWallDown!!
        _lampWallDown = lucideOutlineIcon(
            name = "LampWallDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.929 18.629 C 20.052 18.937 20.014 19.286 19.828 19.561 C 19.642 19.836 19.332 20.000 19.000 20.000 L 9.000 20.000 C 8.668 20.000 8.358 19.835 8.173 19.561 C 7.987 19.286 7.949 18.937 8.072 18.629 L 10.072 13.629 C 10.224 13.249 10.591 13.000 11.000 13.000 L 17.000 13.000 C 17.409 13.000 17.776 13.249 17.928 13.629 Z"),
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
                pathData = parseSvgPathData("M 6.000 3.000 C 7.105 3.000 8.000 3.895 8.000 5.000 L 8.000 7.000 C 8.000 8.105 7.105 9.000 6.000 9.000 L 5.000 9.000 C 4.448 9.000 4.000 8.552 4.000 8.000 L 4.000 4.000 C 4.000 3.448 4.448 3.000 5.000 3.000 Z"),
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
                pathData = parseSvgPathData("M 8.000 6.000 L 12.000 6.000 C 13.105 6.000 14.000 6.895 14.000 8.000 L 14.000 13.000"),
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
        return _lampWallDown!!
    }

private var _lampWallDown: ImageVector? = null
