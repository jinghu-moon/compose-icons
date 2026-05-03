package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ColorSwatch: ImageVector
    get() {
        if (_colorSwatch != null) return _colorSwatch!!
        _colorSwatch = tablerOutlineIcon(
            name = "ColorSwatch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 3.000 L 15.000 3.000 C 13.895 3.000 13.000 3.895 13.000 5.000 L 13.000 17.000 C 13.000 19.209 14.791 21.000 17.000 21.000 C 19.209 21.000 21.000 19.209 21.000 17.000 L 21.000 5.000 C 21.000 3.895 20.105 3.000 19.000 3.000"),
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
                pathData = parseSvgPathData("M 13.000 7.350 L 11.000 5.350 C 10.219 4.569 8.953 4.569 8.172 5.350 L 5.344 8.178 C 4.563 8.959 4.563 10.225 5.344 11.006 L 14.344 20.006"),
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
                pathData = parseSvgPathData("M 7.300 13.000 L 5.000 13.000 C 3.895 13.000 3.000 13.895 3.000 15.000 L 3.000 19.000 C 3.000 20.105 3.895 21.000 5.000 21.000 L 17.000 21.000"),
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
                pathData = parseSvgPathData("M 17.000 17.000 L 17.000 17.010"),
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
        return _colorSwatch!!
    }

private var _colorSwatch: ImageVector? = null
