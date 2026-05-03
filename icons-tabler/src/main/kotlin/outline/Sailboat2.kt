package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sailboat2: ImageVector
    get() {
        if (_sailboat2 != null) return _sailboat2!!
        _sailboat2 = tablerOutlineIcon(
            name = "Sailboat2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 2.000 20.000 C 2.461 20.643 3.209 21.017 4.000 21.000 C 4.791 21.017 5.539 20.643 6.000 20.000 C 6.461 19.357 7.209 18.983 8.000 19.000 C 8.791 18.983 9.539 19.357 10.000 20.000 C 10.461 20.643 11.209 21.017 12.000 21.000 C 12.791 21.017 13.539 20.643 14.000 20.000 C 14.461 19.357 15.209 18.983 16.000 19.000 C 16.791 18.983 17.539 19.357 18.000 20.000 C 18.461 20.643 19.209 21.017 20.000 21.000 C 20.791 21.017 21.539 20.643 22.000 20.000"),
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
                pathData = parseSvgPathData("M 4.000 18.000 L 3.000 15.000 L 21.000 15.000 L 20.000 18.000"),
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
                pathData = parseSvgPathData("M 12.000 11.000 L 12.000 15.000"),
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
                pathData = parseSvgPathData("M 7.000 3.000 C 8.333 5.667 8.333 8.333 7.000 11.000 L 17.000 11.000 C 18.333 8.333 18.333 5.667 17.000 3.000"),
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
                pathData = parseSvgPathData("M 6.000 3.000 L 18.000 3.000"),
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
        return _sailboat2!!
    }

private var _sailboat2: ImageVector? = null
