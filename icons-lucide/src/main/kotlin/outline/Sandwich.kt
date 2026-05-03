package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Sandwich: ImageVector
    get() {
        if (_sandwich != null) return _sandwich!!
        _sandwich = lucideOutlineIcon(
            name = "Sandwich",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.370 11.223 L 10.742 4.446 C 11.476 3.852 12.524 3.852 13.258 4.446 L 21.629 11.223"),
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
                pathData = parseSvgPathData("M 21.000 15.000 C 21.552 15.000 22.000 15.448 22.000 16.000 L 22.000 18.000 C 22.000 18.552 21.552 19.000 21.000 19.000 L 15.750 19.000"),
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
                pathData = parseSvgPathData("M 3.000 15.000 C 2.448 15.000 2.000 15.448 2.000 16.000 L 2.000 18.000 C 2.000 18.552 2.448 19.000 3.000 19.000 L 12.000 19.000"),
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
                pathData = parseSvgPathData("M 6.670 15.000 L 12.800 19.600 C 13.684 20.263 14.937 20.084 15.600 19.200 L 18.750 15.000"),
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
                pathData = parseSvgPathData("M 3.000 11.000 L 21.000 11.000 C 21.552 11.000 22.000 11.448 22.000 12.000 L 22.000 14.000 C 22.000 14.552 21.552 15.000 21.000 15.000 L 3.000 15.000 C 2.448 15.000 2.000 14.552 2.000 14.000 L 2.000 12.000 C 2.000 11.448 2.448 11.000 3.000 11.000 Z"),
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
        return _sandwich!!
    }

private var _sandwich: ImageVector? = null
