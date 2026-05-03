package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.View360Number: ImageVector
    get() {
        if (_view360Number != null) return _view360Number!!
        _view360Number = tablerOutlineIcon(
            name = "View360Number",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.000 6.000 C 14.000 5.448 13.552 5.000 13.000 5.000 L 11.000 5.000 C 10.448 5.000 10.000 5.448 10.000 6.000 L 10.000 12.000 C 10.000 12.552 10.448 13.000 11.000 13.000 L 13.000 13.000 C 13.552 13.000 14.000 12.552 14.000 12.000 L 14.000 10.000 C 14.000 9.448 13.552 9.000 13.000 9.000 L 10.000 9.000"),
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
                pathData = parseSvgPathData("M 3.000 5.000 L 5.500 5.000 C 6.328 5.000 7.000 5.672 7.000 6.500 L 7.000 7.500 C 7.000 8.328 6.328 9.000 5.500 9.000 L 4.000 9.000 L 5.500 9.000 C 6.328 9.000 7.000 9.672 7.000 10.500 L 7.000 11.500 C 7.000 12.328 6.328 13.000 5.500 13.000 L 3.000 13.000"),
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
                pathData = parseSvgPathData("M 17.000 7.000 L 17.000 11.000 C 17.000 12.105 17.895 13.000 19.000 13.000 C 20.105 13.000 21.000 12.105 21.000 11.000 L 21.000 7.000 C 21.000 5.895 20.105 5.000 19.000 5.000 C 17.895 5.000 17.000 5.895 17.000 7.000"),
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
                pathData = parseSvgPathData("M 3.000 16.000 C 3.000 17.657 7.030 19.000 12.000 19.000 C 16.970 19.000 21.000 17.657 21.000 16.000"),
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
        return _view360Number!!
    }

private var _view360Number: ImageVector? = null
