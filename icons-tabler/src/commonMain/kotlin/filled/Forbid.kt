package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Forbid: ImageVector
    get() {
        if (_forbid != null) return _forbid!!
        _forbid = tablerFilledIcon(
            name = "Forbid",
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
                    PathNode.MoveTo(9.613f, 8.21f),
                    PathNode.CurveTo(9.19587f, 7.887466f, 8.599978f, 7.944231f, 8.251249f, 8.339722f),
                    PathNode.CurveTo(7.902519f, 8.735212f, 7.920789f, 9.333524f, 8.293f, 9.707f),
                    PathNode.LineTo(14.293f, 15.707f),
                    PathNode.LineTo(14.387f, 15.79f),
                    PathNode.CurveTo(14.80413f, 16.112535f, 15.400022f, 16.055769f, 15.748752f, 15.660278f),
                    PathNode.CurveTo(16.09748f, 15.264788f, 16.07921f, 14.666476f, 15.707f, 14.293f),
                    PathNode.LineTo(9.707f, 8.293f),
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
        return _forbid!!
    }

private var _forbid: ImageVector? = null
