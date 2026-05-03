package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleArrowUp: ImageVector
    get() {
        if (_circleArrowUp != null) return _circleArrowUp!!
        _circleArrowUp = tablerFilledIcon(
            name = "CircleArrowUp",
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
                    PathNode.MoveTo(12.02f, 7.0f),
                    PathNode.LineTo(11.857f, 7.01f),
                    PathNode.LineTo(11.771f, 7.026f),
                    PathNode.LineTo(11.629f, 7.071f),
                    PathNode.LineTo(11.516f, 7.125f),
                    PathNode.LineTo(11.446f, 7.168f),
                    PathNode.LineTo(11.351f, 7.239f),
                    PathNode.LineTo(11.293f, 7.293f),
                    PathNode.LineTo(7.293f, 11.293f),
                    PathNode.LineTo(7.21f, 11.387f),
                    PathNode.CurveTo(6.887466f, 11.80413f, 6.944231f, 12.400022f, 7.339721f, 12.748752f),
                    PathNode.CurveTo(7.735213f, 13.097481f, 8.333524f, 13.07921f, 8.707f, 12.707f),
                    PathNode.LineTo(11.0f, 10.414f),
                    PathNode.LineTo(11.0f, 16.0f),
                    PathNode.LineTo(11.007f, 16.117f),
                    PathNode.CurveTo(11.06949f, 16.642391f, 11.530421f, 17.02818f, 12.058605f, 16.997171f),
                    PathNode.CurveTo(12.586789f, 16.966166f, 12.999413f, 16.529093f, 13.0f, 16.0f),
                    PathNode.LineTo(13.0f, 10.415f),
                    PathNode.LineTo(15.293f, 12.707f),
                    PathNode.LineTo(15.387f, 12.79f),
                    PathNode.CurveTo(15.80413f, 13.112535f, 16.400023f, 13.05577f, 16.74875f, 12.660278f),
                    PathNode.CurveTo(17.09748f, 12.264788f, 17.07921f, 11.666476f, 16.707f, 11.293f),
                    PathNode.LineTo(12.707f, 7.293f),
                    PathNode.LineTo(12.625f, 7.22f),
                    PathNode.LineTo(12.536f, 7.156f),
                    PathNode.LineTo(12.423f, 7.094f),
                    PathNode.LineTo(12.342f, 7.06f),
                    PathNode.LineTo(12.229f, 7.026f),
                    PathNode.LineTo(12.117f, 7.006f),
                    PathNode.LineTo(12.019f, 7.0f),
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
        return _circleArrowUp!!
    }

private var _circleArrowUp: ImageVector? = null
