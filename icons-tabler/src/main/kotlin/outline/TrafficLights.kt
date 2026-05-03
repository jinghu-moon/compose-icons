package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TrafficLights: ImageVector
    get() {
        if (_trafficLights != null) return _trafficLights!!
        _trafficLights = tablerOutlineIcon(
            name = "TrafficLights",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 7.000 C 7.000 4.239 9.239 2.000 12.000 2.000 C 14.761 2.000 17.000 4.239 17.000 7.000 L 17.000 17.000 C 17.000 19.761 14.761 22.000 12.000 22.000 C 9.239 22.000 7.000 19.761 7.000 17.000 L 7.000 7.000"),
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
                pathData = parseSvgPathData("M 11.000 7.000 C 11.000 7.552 11.448 8.000 12.000 8.000 C 12.552 8.000 13.000 7.552 13.000 7.000 C 13.000 6.448 12.552 6.000 12.000 6.000 C 11.448 6.000 11.000 6.448 11.000 7.000"),
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
                pathData = parseSvgPathData("M 11.000 12.000 C 11.000 12.552 11.448 13.000 12.000 13.000 C 12.552 13.000 13.000 12.552 13.000 12.000 C 13.000 11.448 12.552 11.000 12.000 11.000 C 11.448 11.000 11.000 11.448 11.000 12.000"),
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
                pathData = parseSvgPathData("M 11.000 17.000 C 11.000 17.552 11.448 18.000 12.000 18.000 C 12.552 18.000 13.000 17.552 13.000 17.000 C 13.000 16.448 12.552 16.000 12.000 16.000 C 11.448 16.000 11.000 16.448 11.000 17.000"),
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
        return _trafficLights!!
    }

private var _trafficLights: ImageVector? = null
