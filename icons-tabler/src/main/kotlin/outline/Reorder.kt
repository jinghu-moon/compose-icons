package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Reorder: ImageVector
    get() {
        if (_reorder != null) return _reorder!!
        _reorder = tablerOutlineIcon(
            name = "Reorder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 16.000 C 3.000 15.448 3.448 15.000 4.000 15.000 L 6.000 15.000 C 6.552 15.000 7.000 15.448 7.000 16.000 L 7.000 18.000 C 7.000 18.552 6.552 19.000 6.000 19.000 L 4.000 19.000 C 3.448 19.000 3.000 18.552 3.000 18.000 L 3.000 16.000"),
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
                pathData = parseSvgPathData("M 10.000 16.000 C 10.000 15.448 10.448 15.000 11.000 15.000 L 13.000 15.000 C 13.552 15.000 14.000 15.448 14.000 16.000 L 14.000 18.000 C 14.000 18.552 13.552 19.000 13.000 19.000 L 11.000 19.000 C 10.448 19.000 10.000 18.552 10.000 18.000 L 10.000 16.000"),
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
                pathData = parseSvgPathData("M 17.000 16.000 C 17.000 15.448 17.448 15.000 18.000 15.000 L 20.000 15.000 C 20.552 15.000 21.000 15.448 21.000 16.000 L 21.000 18.000 C 21.000 18.552 20.552 19.000 20.000 19.000 L 18.000 19.000 C 17.448 19.000 17.000 18.552 17.000 18.000 L 17.000 16.000"),
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
                pathData = parseSvgPathData("M 5.000 11.000 L 5.000 8.000 C 5.000 6.343 6.343 5.000 8.000 5.000 L 16.000 5.000 C 17.657 5.000 19.000 6.343 19.000 8.000 L 19.000 11.000"),
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
                pathData = parseSvgPathData("M 16.500 8.500 L 19.000 11.000 L 21.500 8.500"),
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
        return _reorder!!
    }

private var _reorder: ImageVector? = null
