package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PaintbrushVertical: ImageVector
    get() {
        if (_paintbrushVertical != null) return _paintbrushVertical!!
        _paintbrushVertical = lucideOutlineIcon(
            name = "PaintbrushVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 2.000 L 10.000 4.000"),
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
                pathData = parseSvgPathData("M 14.000 2.000 L 14.000 6.000"),
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
                pathData = parseSvgPathData("M 17.000 2.000 C 17.552 2.000 18.000 2.448 18.000 3.000 L 18.000 12.000 L 6.000 12.000 L 6.000 3.000 C 6.000 2.448 6.448 2.000 7.000 2.000 Z"),
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
                pathData = parseSvgPathData("M 6.000 12.000 C 5.448 12.000 5.000 12.448 5.000 13.000 L 5.000 14.000 C 5.000 15.105 5.895 16.000 7.000 16.000 L 9.000 16.000 C 9.552 16.000 10.000 16.448 10.000 17.000 L 10.000 19.900 C 10.000 21.005 10.895 21.900 12.000 21.900 C 13.105 21.900 14.000 21.005 14.000 19.900 L 14.000 17.000 C 14.000 16.448 14.448 16.000 15.000 16.000 L 17.000 16.000 C 18.105 16.000 19.000 15.105 19.000 14.000 L 19.000 13.000 C 19.000 12.448 18.552 12.000 18.000 12.000"),
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
        return _paintbrushVertical!!
    }

private var _paintbrushVertical: ImageVector? = null
