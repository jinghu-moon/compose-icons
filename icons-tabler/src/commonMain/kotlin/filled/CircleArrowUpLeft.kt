package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowUpLeft: ImageVector
    get() {
        if (_circleArrowUpLeft != null) return _circleArrowUpLeft!!
        _circleArrowUpLeft = tablerFilledIcon(
            name = "CircleArrowUpLeft",
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
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.LineTo(9.0f, 8.0f),
                    PathNode.LineTo(8.883f, 8.007f),
                    PathNode.LineTo(8.734f, 8.036001f),
                    PathNode.LineTo(8.629f, 8.071f),
                    PathNode.LineTo(8.516f, 8.125f),
                    PathNode.LineTo(8.405f, 8.196f),
                    PathNode.CurveTo(8.365342f, 8.225548f, 8.327909f, 8.257968f, 8.293f, 8.293f),
                    PathNode.LineTo(8.213001f, 8.383001f),
                    PathNode.LineTo(8.146f, 8.479f),
                    PathNode.LineTo(8.094f, 8.577f),
                    PathNode.LineTo(8.05f, 8.687f),
                    PathNode.LineTo(8.020001f, 8.799f),
                    PathNode.LineTo(8.003001f, 8.925f),
                    PathNode.LineTo(8.0f, 15.0f),
                    PathNode.LineTo(8.007f, 15.117f),
                    PathNode.CurveTo(8.066316f, 15.620493f, 8.493025f, 15.999933f, 9.0f, 16.0f),
                    PathNode.LineTo(9.117f, 15.993f),
                    PathNode.CurveTo(9.620493f, 15.933684f, 9.999933f, 15.506975f, 10.0f, 15.0f),
                    PathNode.LineTo(10.0f, 11.415f),
                    PathNode.LineTo(14.293f, 15.707f),
                    PathNode.LineTo(14.387f, 15.79f),
                    PathNode.CurveTo(14.80413f, 16.112535f, 15.400022f, 16.055769f, 15.748752f, 15.660278f),
                    PathNode.CurveTo(16.09748f, 15.264788f, 16.07921f, 14.666476f, 15.707f, 14.293f),
                    PathNode.LineTo(11.415f, 10.0f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.LineTo(15.117f, 9.993f),
                    PathNode.CurveTo(15.64239f, 9.93051f, 16.02818f, 9.469579f, 15.997172f, 8.941395f),
                    PathNode.CurveTo(15.966165f, 8.413211f, 15.529094f, 8.000587f, 15.0f, 8.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _circleArrowUpLeft!!
    }

private var _circleArrowUpLeft: ImageVector? = null
