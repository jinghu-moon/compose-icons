package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Baby: ImageVector
    get() {
        if (_baby != null) return _baby!!
        _baby = lucideOutlineIcon(
            name = "Baby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 16.000 C 10.500 16.300 11.200 16.500 12.000 16.500 C 12.800 16.500 13.500 16.300 14.000 16.000"),
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
                pathData = parseSvgPathData("M 15.000 12.000 L 15.010 12.000"),
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
                pathData = parseSvgPathData("M 19.380 6.813 C 20.081 7.832 20.565 8.985 20.800 10.200 C 21.490 10.534 21.928 11.233 21.928 12.000 C 21.928 12.767 21.490 13.466 20.800 13.800 C 19.910 17.949 16.243 20.913 12.000 20.913 C 7.757 20.913 4.090 17.949 3.200 13.800 C 2.510 13.466 2.072 12.767 2.072 12.000 C 2.072 11.233 2.510 10.534 3.200 10.200 C 4.054 6.016 7.730 3.009 12.000 3.000 C 14.000 3.000 15.500 4.100 15.500 5.500 C 15.500 6.900 14.600 8.000 13.500 8.000 C 12.700 8.000 12.000 7.600 12.000 7.000"),
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
                pathData = parseSvgPathData("M 9.000 12.000 L 9.010 12.000"),
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
        return _baby!!
    }

private var _baby: ImageVector? = null
