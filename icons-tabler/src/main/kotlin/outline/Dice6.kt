package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Dice6: ImageVector
    get() {
        if (_dice6 != null) return _dice6!!
        _dice6 = tablerOutlineIcon(
            name = "Dice6",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 5.000 C 3.000 3.895 3.895 3.000 5.000 3.000 L 19.000 3.000 C 20.105 3.000 21.000 3.895 21.000 5.000 L 21.000 19.000 C 21.000 20.105 20.105 21.000 19.000 21.000 L 5.000 21.000 C 3.895 21.000 3.000 20.105 3.000 19.000 L 3.000 5.000"),
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
                pathData = parseSvgPathData("M 8.000 7.500 C 8.000 7.776 8.224 8.000 8.500 8.000 C 8.776 8.000 9.000 7.776 9.000 7.500 C 9.000 7.224 8.776 7.000 8.500 7.000 C 8.224 7.000 8.000 7.224 8.000 7.500"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 15.000 7.500 C 15.000 7.776 15.224 8.000 15.500 8.000 C 15.776 8.000 16.000 7.776 16.000 7.500 C 16.000 7.224 15.776 7.000 15.500 7.000 C 15.224 7.000 15.000 7.224 15.000 7.500"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 8.000 12.000 C 8.000 12.276 8.224 12.500 8.500 12.500 C 8.776 12.500 9.000 12.276 9.000 12.000 C 9.000 11.724 8.776 11.500 8.500 11.500 C 8.224 11.500 8.000 11.724 8.000 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 15.000 12.000 C 15.000 12.276 15.224 12.500 15.500 12.500 C 15.776 12.500 16.000 12.276 16.000 12.000 C 16.000 11.724 15.776 11.500 15.500 11.500 C 15.224 11.500 15.000 11.724 15.000 12.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 15.000 16.500 C 15.000 16.776 15.224 17.000 15.500 17.000 C 15.776 17.000 16.000 16.776 16.000 16.500 C 16.000 16.224 15.776 16.000 15.500 16.000 C 15.224 16.000 15.000 16.224 15.000 16.500"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 8.000 16.500 C 8.000 16.776 8.224 17.000 8.500 17.000 C 8.776 17.000 9.000 16.776 9.000 16.500 C 9.000 16.224 8.776 16.000 8.500 16.000 C 8.224 16.000 8.000 16.224 8.000 16.500"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _dice6!!
    }

private var _dice6: ImageVector? = null
