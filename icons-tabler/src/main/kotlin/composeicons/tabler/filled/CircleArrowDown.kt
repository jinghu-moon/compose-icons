package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowDown: ImageVector
    get() {
        if (_circleArrowDown != null) return _circleArrowDown!!
        _circleArrowDown = tablerFilledIcon(
            name = "CircleArrowDown",
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
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.CurveTo(11.447715f, 7.0f, 11.0f, 7.447716f, 11.0f, 8.0f),
                    PathNode.LineTo(11.0f, 13.585f),
                    PathNode.LineTo(8.707f, 11.293f),
                    PathNode.LineTo(8.613f, 11.21f),
                    PathNode.CurveTo(8.195871f, 10.887465f, 7.599979f, 10.94423f, 7.251249f, 11.339722f),
                    PathNode.CurveTo(6.902519f, 11.735212f, 6.920789f, 12.333524f, 7.293f, 12.707f),
                    PathNode.LineTo(11.293f, 16.707f),
                    PathNode.CurveTo(11.321f, 16.735f, 11.35f, 16.761f, 11.387f, 16.79f),
                    PathNode.LineTo(11.479f, 16.854f),
                    PathNode.LineTo(11.577f, 16.906f),
                    PathNode.LineTo(11.658f, 16.94f),
                    PathNode.LineTo(11.771f, 16.974f),
                    PathNode.LineTo(11.883f, 16.994f),
                    PathNode.LineTo(12.0f, 17.0f),
                    PathNode.LineTo(12.115f, 16.993f),
                    PathNode.LineTo(12.229f, 16.973f),
                    PathNode.LineTo(12.371f, 16.929f),
                    PathNode.LineTo(12.484f, 16.875f),
                    PathNode.LineTo(12.595f, 16.804f),
                    PathNode.CurveTo(12.63483f, 16.774668f, 12.67228f, 16.742233f, 12.707f, 16.707f),
                    PathNode.LineTo(16.707f, 12.707f),
                    PathNode.LineTo(16.79f, 12.613f),
                    PathNode.CurveTo(17.112535f, 12.19587f, 17.055767f, 11.599978f, 16.660278f, 11.251248f),
                    PathNode.CurveTo(16.264788f, 10.902519f, 15.666476f, 10.92079f, 15.293f, 11.293f),
                    PathNode.LineTo(13.0f, 13.584f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.LineTo(12.993f, 7.883f),
                    PathNode.CurveTo(12.933684f, 7.379507f, 12.506975f, 7.000067f, 12.0f, 7.0f),
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
        return _circleArrowDown!!
    }

private var _circleArrowDown: ImageVector? = null
