package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartPieOff: ImageVector
    get() {
        if (_chartPieOff != null) return _chartPieOff!!
        _chartPieOff = tablerOutlineIcon(
            name = "ChartPieOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.630 5.643 C 2.119 9.162 2.125 14.860 5.643 18.372 C 9.162 21.883 14.861 21.877 18.372 18.358M 20.046 16.068 C 20.381 15.412 20.634 14.718 20.800 14.000 C 20.800 13.448 20.352 13.000 19.800 13.000 L 17.000 13.000M 13.000 13.000 C 11.895 13.000 11.000 12.105 11.000 11.000M 11.000 7.000 L 11.000 4.000 C 10.975 3.761 10.855 3.541 10.667 3.391 C 10.479 3.241 10.239 3.172 10.000 3.200 C 9.286 3.365 8.596 3.617 7.943 3.949"),
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
                pathData = parseSvgPathData("M 15.000 3.500 C 17.572 4.406 19.594 6.428 20.500 9.000 L 16.000 9.000 C 15.448 9.000 15.000 8.552 15.000 8.000 L 15.000 3.500"),
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
        return _chartPieOff!!
    }

private var _chartPieOff: ImageVector? = null
