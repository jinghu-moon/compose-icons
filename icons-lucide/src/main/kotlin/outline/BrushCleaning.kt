package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.BrushCleaning: ImageVector
    get() {
        if (_brushCleaning != null) return _brushCleaning!!
        _brushCleaning = lucideOutlineIcon(
            name = "BrushCleaning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 16.000 22.000 L 15.000 18.000"),
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
                pathData = parseSvgPathData("M 19.000 14.000 C 19.552 14.000 20.000 13.552 20.000 13.000 L 20.000 12.000 C 20.000 10.895 19.105 10.000 18.000 10.000 L 15.000 10.000 C 14.448 10.000 14.000 9.552 14.000 9.000 L 14.000 4.000 C 14.000 2.895 13.105 2.000 12.000 2.000 C 10.895 2.000 10.000 2.895 10.000 4.000 L 10.000 9.000 C 10.000 9.552 9.552 10.000 9.000 10.000 L 6.000 10.000 C 4.895 10.000 4.000 10.895 4.000 12.000 L 4.000 13.000 C 4.000 13.552 4.448 14.000 5.000 14.000"),
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
                pathData = parseSvgPathData("M 19.000 14.000 L 5.000 14.000 L 3.027 20.767 C 2.956 21.065 3.025 21.379 3.214 21.619 C 3.404 21.860 3.694 22.000 4.000 22.000 L 20.000 22.000 C 20.306 22.000 20.596 21.860 20.786 21.619 C 20.975 21.379 21.044 21.065 20.973 20.767 Z"),
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
                pathData = parseSvgPathData("M 8.000 22.000 L 9.000 18.000"),
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
        return _brushCleaning!!
    }

private var _brushCleaning: ImageVector? = null
