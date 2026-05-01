package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Gauge: ImageVector
    get() {
        if (_gauge != null) return _gauge!!
        _gauge = tablerFilledIcon(
            name = "Gauge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 3.34f),
                    PathNode.CurveTo(21.1674f, 5.746208f, 23.030024f, 10.779379f, 21.433f, 15.318825f),
                    PathNode.CurveTo(19.835976f, 19.858273f, 15.232252f, 22.616514f, 10.476249f, 21.883377f),
                    PathNode.CurveTo(5.720245f, 21.15024f, 2.160861f, 17.133654f, 2.005f, 12.324f),
                    PathNode.LineTo(2.0f, 12.0f),
                    PathNode.LineTo(2.005f, 11.676f),
                    PathNode.CurveTo(2.118919f, 8.162982f, 4.068822f, 4.967704f, 7.140892f, 3.259883f),
                    PathNode.CurveTo(10.212963f, 1.552061f, 13.95609f, 1.582479f, 17.0f, 3.34f),
                    PathNode.Close,
                    PathNode.MoveTo(16.707f, 7.293f),
                    PathNode.CurveTo(16.3165f, 6.902618f, 15.6835f, 6.902618f, 15.293f, 7.293f),
                    PathNode.LineTo(12.703f, 9.883f),
                    PathNode.LineTo(12.62f, 9.977f),
                    PathNode.LineTo(12.552f, 10.077f),
                    PathNode.CurveTo(11.973346f, 9.91106f, 11.350734f, 10.014447f, 10.856765f, 10.3585f),
                    PathNode.CurveTo(10.362797f, 10.702551f, 10.049967f, 11.250705f, 10.005f, 11.851f),
                    PathNode.LineTo(10.0f, 12.0f),
                    PathNode.LineTo(10.005f, 12.15f),
                    PathNode.CurveTo(10.062304f, 12.911166f, 10.547873f, 13.573339f, 11.256602f, 13.856818f),
                    PathNode.CurveTo(11.965331f, 14.140298f, 12.773616f, 13.995645f, 13.340039f, 13.483959f),
                    PathNode.CurveTo(13.906464f, 12.972274f, 14.132239f, 12.182796f, 13.922f, 11.449f),
                    PathNode.CurveTo(13.99323f, 11.406877f, 14.058764f, 11.355794f, 14.117f, 11.297f),
                    PathNode.LineTo(16.707f, 8.707f),
                    PathNode.LineTo(16.79f, 8.613f),
                    PathNode.CurveTo(17.098803f, 8.214915f, 17.063234f, 7.649269f, 16.707f, 7.293f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.CurveTo(8.686292f, 6.0f, 6.0f, 8.686292f, 6.0f, 12.0f),
                    PathNode.CurveTo(6.0f, 12.552285f, 6.447716f, 13.0f, 7.0f, 13.0f),
                    PathNode.CurveTo(7.552285f, 13.0f, 8.0f, 12.552285f, 8.0f, 12.0f),
                    PathNode.CurveTo(8.0f, 9.790861f, 9.790861f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(12.552285f, 8.0f, 13.0f, 7.552285f, 13.0f, 7.0f),
                    PathNode.CurveTo(13.0f, 6.447716f, 12.552285f, 6.0f, 12.0f, 6.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _gauge!!
    }

private var _gauge: ImageVector? = null
