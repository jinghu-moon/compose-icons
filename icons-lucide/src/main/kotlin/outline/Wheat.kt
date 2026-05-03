package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Wheat: ImageVector
    get() {
        if (_wheat != null) return _wheat!!
        _wheat = lucideOutlineIcon(
            name = "Wheat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 22.000 L 16.000 8.000"),
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
                pathData = parseSvgPathData("M 3.470 12.530 L 5.000 11.000 L 6.530 12.530 C 7.890 13.896 7.890 16.104 6.530 17.470 L 5.000 19.000 L 3.470 17.470 C 2.110 16.104 2.110 13.896 3.470 12.530 Z"),
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
                pathData = parseSvgPathData("M 7.470 8.530 L 9.000 7.000 L 10.530 8.530 C 11.890 9.896 11.890 12.104 10.530 13.470 L 9.000 15.000 L 7.470 13.470 C 6.110 12.104 6.110 9.896 7.470 8.530 Z"),
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
                pathData = parseSvgPathData("M 11.470 4.530 L 13.000 3.000 L 14.530 4.530 C 15.890 5.896 15.890 8.104 14.530 9.470 L 13.000 11.000 L 11.470 9.470 C 10.110 8.104 10.110 5.896 11.470 4.530 Z"),
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
                pathData = parseSvgPathData("M 20.000 2.000 L 22.000 2.000 L 22.000 4.000 C 22.000 6.209 20.209 8.000 18.000 8.000 L 16.000 8.000 L 16.000 6.000 C 16.000 3.791 17.791 2.000 20.000 2.000 Z"),
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
                pathData = parseSvgPathData("M 11.470 17.470 L 13.000 19.000 L 11.470 20.530 C 10.104 21.890 7.896 21.890 6.530 20.530 L 5.000 19.000 L 6.530 17.470 C 7.896 16.110 10.104 16.110 11.470 17.470 Z"),
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
                pathData = parseSvgPathData("M 15.470 13.470 L 17.000 15.000 L 15.470 16.530 C 14.104 17.890 11.896 17.890 10.530 16.530 L 9.000 15.000 L 10.530 13.470 C 11.896 12.110 14.104 12.110 15.470 13.470 Z"),
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
                pathData = parseSvgPathData("M 19.470 9.470 L 21.000 11.000 L 19.470 12.530 C 18.104 13.890 15.896 13.890 14.530 12.530 L 13.000 11.000 L 14.530 9.470 C 15.896 8.110 18.104 8.110 19.470 9.470 Z"),
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
        return _wheat!!
    }

private var _wheat: ImageVector? = null
