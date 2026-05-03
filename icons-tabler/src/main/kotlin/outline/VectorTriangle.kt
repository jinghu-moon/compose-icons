package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.VectorTriangle: ImageVector
    get() {
        if (_vectorTriangle != null) return _vectorTriangle!!
        _vectorTriangle = tablerOutlineIcon(
            name = "VectorTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 10.000 5.000 C 10.000 4.448 10.448 4.000 11.000 4.000 L 13.000 4.000 C 13.552 4.000 14.000 4.448 14.000 5.000 L 14.000 7.000 C 14.000 7.552 13.552 8.000 13.000 8.000 L 11.000 8.000 C 10.448 8.000 10.000 7.552 10.000 7.000 L 10.000 5.000"),
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
                pathData = parseSvgPathData("M 3.000 18.000 C 3.000 17.448 3.448 17.000 4.000 17.000 L 6.000 17.000 C 6.552 17.000 7.000 17.448 7.000 18.000 L 7.000 20.000 C 7.000 20.552 6.552 21.000 6.000 21.000 L 4.000 21.000 C 3.448 21.000 3.000 20.552 3.000 20.000 L 3.000 18.000"),
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
                pathData = parseSvgPathData("M 17.000 18.000 C 17.000 17.448 17.448 17.000 18.000 17.000 L 20.000 17.000 C 20.552 17.000 21.000 17.448 21.000 18.000 L 21.000 20.000 C 21.000 20.552 20.552 21.000 20.000 21.000 L 18.000 21.000 C 17.448 21.000 17.000 20.552 17.000 20.000 L 17.000 18.000"),
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
                pathData = parseSvgPathData("M 6.500 17.100 L 11.500 8.000"),
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
                pathData = parseSvgPathData("M 17.500 17.100 L 12.500 8.000"),
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
                pathData = parseSvgPathData("M 7.000 19.000 L 17.000 19.000"),
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
        return _vectorTriangle!!
    }

private var _vectorTriangle: ImageVector? = null
