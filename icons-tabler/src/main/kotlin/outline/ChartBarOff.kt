package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartBarOff: ImageVector
    get() {
        if (_chartBarOff != null) return _chartBarOff!!
        _chartBarOff = tablerOutlineIcon(
            name = "ChartBarOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 13.000 C 3.000 12.448 3.448 12.000 4.000 12.000 L 8.000 12.000 C 8.552 12.000 9.000 12.448 9.000 13.000 L 9.000 19.000 C 9.000 19.552 8.552 20.000 8.000 20.000 L 4.000 20.000 C 3.448 20.000 3.000 19.552 3.000 19.000 L 3.000 13.000"),
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
                pathData = parseSvgPathData("M 12.000 8.000 L 14.000 8.000 C 14.552 8.000 15.000 8.448 15.000 9.000 L 15.000 11.000M 15.000 15.000 L 15.000 19.000 C 15.000 19.552 14.552 20.000 14.000 20.000 L 10.000 20.000 C 9.448 20.000 9.000 19.552 9.000 19.000 L 9.000 9.000"),
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
                pathData = parseSvgPathData("M 15.000 11.000 L 15.000 5.000 C 15.000 4.448 15.448 4.000 16.000 4.000 L 20.000 4.000 C 20.552 4.000 21.000 4.448 21.000 5.000 L 21.000 17.000M 20.000 20.000 L 16.000 20.000 C 15.448 20.000 15.000 19.552 15.000 19.000 L 15.000 15.000"),
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
                pathData = parseSvgPathData("M 4.000 20.000 L 18.000 20.000"),
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
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _chartBarOff!!
    }

private var _chartBarOff: ImageVector? = null
