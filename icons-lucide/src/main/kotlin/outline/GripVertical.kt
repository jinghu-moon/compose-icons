package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.GripVertical: ImageVector
    get() {
        if (_gripVertical != null) return _gripVertical!!
        _gripVertical = lucideOutlineIcon(
            name = "GripVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 12.000 C 10.000 12.552 9.552 13.000 9.000 13.000 C 8.448 13.000 8.000 12.552 8.000 12.000 C 8.000 11.448 8.448 11.000 9.000 11.000 C 9.552 11.000 10.000 11.448 10.000 12.000 Z"),
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
                pathData = parseSvgPathData("M 10.000 5.000 C 10.000 5.552 9.552 6.000 9.000 6.000 C 8.448 6.000 8.000 5.552 8.000 5.000 C 8.000 4.448 8.448 4.000 9.000 4.000 C 9.552 4.000 10.000 4.448 10.000 5.000 Z"),
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
                pathData = parseSvgPathData("M 10.000 19.000 C 10.000 19.552 9.552 20.000 9.000 20.000 C 8.448 20.000 8.000 19.552 8.000 19.000 C 8.000 18.448 8.448 18.000 9.000 18.000 C 9.552 18.000 10.000 18.448 10.000 19.000 Z"),
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
                pathData = parseSvgPathData("M 16.000 12.000 C 16.000 12.552 15.552 13.000 15.000 13.000 C 14.448 13.000 14.000 12.552 14.000 12.000 C 14.000 11.448 14.448 11.000 15.000 11.000 C 15.552 11.000 16.000 11.448 16.000 12.000 Z"),
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
                pathData = parseSvgPathData("M 16.000 5.000 C 16.000 5.552 15.552 6.000 15.000 6.000 C 14.448 6.000 14.000 5.552 14.000 5.000 C 14.000 4.448 14.448 4.000 15.000 4.000 C 15.552 4.000 16.000 4.448 16.000 5.000 Z"),
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
                pathData = parseSvgPathData("M 16.000 19.000 C 16.000 19.552 15.552 20.000 15.000 20.000 C 14.448 20.000 14.000 19.552 14.000 19.000 C 14.000 18.448 14.448 18.000 15.000 18.000 C 15.552 18.000 16.000 18.448 16.000 19.000 Z"),
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
        return _gripVertical!!
    }

private var _gripVertical: ImageVector? = null
