package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.SquareStack: ImageVector
    get() {
        if (_squareStack != null) return _squareStack!!
        _squareStack = lucideOutlineIcon(
            name = "SquareStack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 10.000 C 2.900 10.000 2.000 9.100 2.000 8.000 L 2.000 4.000 C 2.000 2.900 2.900 2.000 4.000 2.000 L 8.000 2.000 C 9.100 2.000 10.000 2.900 10.000 4.000"),
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
                pathData = parseSvgPathData("M 10.000 16.000 C 8.900 16.000 8.000 15.100 8.000 14.000 L 8.000 10.000 C 8.000 8.900 8.900 8.000 10.000 8.000 L 14.000 8.000 C 15.100 8.000 16.000 8.900 16.000 10.000"),
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
                pathData = parseSvgPathData("M 16.000 14.000 L 20.000 14.000 C 21.105 14.000 22.000 14.895 22.000 16.000 L 22.000 20.000 C 22.000 21.105 21.105 22.000 20.000 22.000 L 16.000 22.000 C 14.895 22.000 14.000 21.105 14.000 20.000 L 14.000 16.000 C 14.000 14.895 14.895 14.000 16.000 14.000 Z"),
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
        return _squareStack!!
    }

private var _squareStack: ImageVector? = null
