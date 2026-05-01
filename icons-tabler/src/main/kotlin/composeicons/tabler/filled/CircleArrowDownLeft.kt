package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowDownLeft: ImageVector
    get() {
        if (_circleArrowDownLeft != null) return _circleArrowDownLeft!!
        _circleArrowDownLeft = tablerFilledIcon(
            name = "CircleArrowDownLeft",
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
                    PathNode.MoveTo(9.0f, 8.0f),
                    PathNode.CurveTo(8.447715f, 8.0f, 8.0f, 8.447715f, 8.0f, 9.0f),
                    PathNode.LineTo(8.0f, 15.0f),
                    PathNode.LineTo(8.007f, 15.117f),
                    PathNode.LineTo(8.036001f, 15.266f),
                    PathNode.LineTo(8.071f, 15.371f),
                    PathNode.LineTo(8.125f, 15.484f),
                    PathNode.LineTo(8.196f, 15.595f),
                    PathNode.CurveTo(8.226f, 15.635f, 8.257f, 15.672f, 8.293f, 15.707f),
                    PathNode.LineTo(8.383001f, 15.787f),
                    PathNode.LineTo(8.479f, 15.854f),
                    PathNode.LineTo(8.577f, 15.906f),
                    PathNode.LineTo(8.687f, 15.95f),
                    PathNode.LineTo(8.799f, 15.98f),
                    PathNode.LineTo(8.925f, 15.997f),
                    PathNode.LineTo(15.0f, 16.0f),
                    PathNode.LineTo(15.117f, 15.993f),
                    PathNode.CurveTo(15.620493f, 15.933684f, 15.999933f, 15.506975f, 16.0f, 15.0f),
                    PathNode.LineTo(15.993f, 14.883f),
                    PathNode.CurveTo(15.933684f, 14.379507f, 15.506975f, 14.000067f, 15.0f, 14.0f),
                    PathNode.LineTo(11.414f, 14.0f),
                    PathNode.LineTo(15.707f, 9.707f),
                    PathNode.LineTo(15.79f, 9.613f),
                    PathNode.CurveTo(16.112535f, 9.19587f, 16.055769f, 8.599978f, 15.660278f, 8.251249f),
                    PathNode.CurveTo(15.264788f, 7.902519f, 14.666476f, 7.920789f, 14.293f, 8.293f),
                    PathNode.LineTo(10.0f, 12.584f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.LineTo(9.993f, 8.883f),
                    PathNode.CurveTo(9.933684f, 8.379507f, 9.506975f, 8.000067f, 9.0f, 8.0f),
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
        return _circleArrowDownLeft!!
    }

private var _circleArrowDownLeft: ImageVector? = null
