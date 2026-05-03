package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleX: ImageVector
    get() {
        if (_circleX != null) return _circleX!!
        _circleX = tablerFilledIcon(
            name = "CircleX",
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
                    PathNode.MoveTo(10.511f, 9.14f),
                    PathNode.CurveTo(10.077462f, 8.881925f, 9.519582f, 8.987228f, 9.209949f, 9.385581f),
                    PathNode.CurveTo(8.900316f, 9.783935f, 8.935928f, 10.350549f, 9.293f, 10.707f),
                    PathNode.LineTo(10.585f, 12.0f),
                    PathNode.LineTo(9.293f, 13.293f),
                    PathNode.LineTo(9.21f, 13.387f),
                    PathNode.CurveTo(8.887465f, 13.80413f, 8.94423f, 14.400022f, 9.339722f, 14.748752f),
                    PathNode.CurveTo(9.735212f, 15.097481f, 10.333524f, 15.07921f, 10.707f, 14.707f),
                    PathNode.LineTo(12.0f, 13.415f),
                    PathNode.LineTo(13.293f, 14.707f),
                    PathNode.LineTo(13.387f, 14.79f),
                    PathNode.CurveTo(13.80413f, 15.112535f, 14.400022f, 15.05577f, 14.748752f, 14.660278f),
                    PathNode.CurveTo(15.097481f, 14.264788f, 15.07921f, 13.666476f, 14.707f, 13.293f),
                    PathNode.LineTo(13.415f, 12.0f),
                    PathNode.LineTo(14.707f, 10.707f),
                    PathNode.LineTo(14.79f, 10.613f),
                    PathNode.CurveTo(15.112535f, 10.19587f, 15.05577f, 9.599978f, 14.660278f, 9.251248f),
                    PathNode.CurveTo(14.264788f, 8.902519f, 13.666476f, 8.92079f, 13.293f, 9.293f),
                    PathNode.LineTo(12.0f, 10.585f),
                    PathNode.LineTo(10.707f, 9.293f),
                    PathNode.LineTo(10.613f, 9.21f),
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
        return _circleX!!
    }

private var _circleX: ImageVector? = null
