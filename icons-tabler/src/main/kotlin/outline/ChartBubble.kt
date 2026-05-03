package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChartBubble: ImageVector
    get() {
        if (_chartBubble != null) return _chartBubble!!
        _chartBubble = tablerOutlineIcon(
            name = "ChartBubble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 3.000 16.000 C 3.000 17.657 4.343 19.000 6.000 19.000 C 7.657 19.000 9.000 17.657 9.000 16.000 C 9.000 14.343 7.657 13.000 6.000 13.000 C 4.343 13.000 3.000 14.343 3.000 16.000"),
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
                pathData = parseSvgPathData("M 14.000 19.000 C 14.000 20.105 14.895 21.000 16.000 21.000 C 17.105 21.000 18.000 20.105 18.000 19.000 C 18.000 17.895 17.105 17.000 16.000 17.000 C 14.895 17.000 14.000 17.895 14.000 19.000"),
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
                pathData = parseSvgPathData("M 10.000 7.500 C 10.000 9.985 12.015 12.000 14.500 12.000 C 16.985 12.000 19.000 9.985 19.000 7.500 C 19.000 5.015 16.985 3.000 14.500 3.000 C 12.015 3.000 10.000 5.015 10.000 7.500"),
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
        return _chartBubble!!
    }

private var _chartBubble: ImageVector? = null
