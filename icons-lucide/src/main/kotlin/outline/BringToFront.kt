package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BringToFront: ImageVector
    get() {
        if (_bringToFront != null) return _bringToFront!!
        _bringToFront = lucideOutlineIcon(
            name = "BringToFront",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 8.000 L 14.000 8.000 C 15.105 8.000 16.000 8.895 16.000 10.000 L 16.000 14.000 C 16.000 15.105 15.105 16.000 14.000 16.000 L 10.000 16.000 C 8.895 16.000 8.000 15.105 8.000 14.000 L 8.000 10.000 C 8.000 8.895 8.895 8.000 10.000 8.000 Z"),
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
                pathData = parseSvgPathData("M 4.000 10.000 C 2.895 10.000 2.000 9.105 2.000 8.000 L 2.000 4.000 C 2.000 2.895 2.895 2.000 4.000 2.000 L 8.000 2.000 C 9.105 2.000 10.000 2.895 10.000 4.000"),
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
                pathData = parseSvgPathData("M 14.000 20.000 C 14.000 21.105 14.895 22.000 16.000 22.000 L 20.000 22.000 C 21.105 22.000 22.000 21.105 22.000 20.000 L 22.000 16.000 C 22.000 14.895 21.105 14.000 20.000 14.000"),
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
        return _bringToFront!!
    }

private var _bringToFront: ImageVector? = null
