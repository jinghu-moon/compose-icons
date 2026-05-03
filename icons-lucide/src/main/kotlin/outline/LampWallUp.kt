package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LampWallUp: ImageVector
    get() {
        if (_lampWallUp != null) return _lampWallUp!!
        _lampWallUp = lucideOutlineIcon(
            name = "LampWallUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.929 9.629 C 20.052 9.937 20.014 10.286 19.828 10.561 C 19.642 10.836 19.332 11.000 19.000 11.000 L 9.000 11.000 C 8.668 11.000 8.358 10.835 8.173 10.561 C 7.987 10.286 7.949 9.937 8.072 9.629 L 10.072 4.629 C 10.224 4.249 10.591 4.000 11.000 4.000 L 17.000 4.000 C 17.409 4.000 17.776 4.249 17.928 4.629 Z"),
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
                pathData = parseSvgPathData("M 6.000 15.000 C 7.105 15.000 8.000 15.895 8.000 17.000 L 8.000 19.000 C 8.000 20.105 7.105 21.000 6.000 21.000 L 5.000 21.000 C 4.448 21.000 4.000 20.552 4.000 20.000 L 4.000 16.000 C 4.000 15.448 4.448 15.000 5.000 15.000 Z"),
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
                pathData = parseSvgPathData("M 8.000 18.000 L 12.000 18.000 C 13.105 18.000 14.000 17.105 14.000 16.000 L 14.000 11.000"),
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
        return _lampWallUp!!
    }

private var _lampWallUp: ImageVector? = null
