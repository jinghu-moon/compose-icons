package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.YinYang: ImageVector
    get() {
        if (_yinYang != null) return _yinYang!!
        _yinYang = tablerFilledIcon(
            name = "YinYang",
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
                    PathNode.MoveTo(8.0f, 5.072f),
                    PathNode.CurveTo(4.86447f, 6.882512f, 3.335833f, 10.57325f, 4.272953f, 14.070579f),
                    PathNode.CurveTo(5.210072f, 17.567907f, 8.379296f, 19.99984f, 12.0f, 20.0f),
                    PathNode.LineTo(12.2f, 19.995f),
                    PathNode.CurveTo(14.32876f, 19.888462f, 16.000063f, 18.131424f, 16.000063f, 16.0f),
                    PathNode.CurveTo(16.000063f, 13.868576f, 14.32876f, 12.111538f, 12.2f, 12.005f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.CurveTo(9.829805f, 12.000034f, 8.05546f, 10.269547f, 8.001189f, 8.100031f),
                    PathNode.CurveTo(7.946917f, 5.930515f, 9.632518f, 4.113476f, 11.8f, 4.005f),
                    PathNode.LineTo(12.0f, 4.0f),
                    PathNode.CurveTo(10.595657f, 3.999827f, 9.216043f, 4.369563f, 8.0f, 5.072f),
                    PathNode.Close,
                    PathNode.MoveTo(12.0f, 6.5f),
                    PathNode.CurveTo(11.171573f, 6.5f, 10.5f, 7.171573f, 10.5f, 8.0f),
                    PathNode.CurveTo(10.5f, 8.828427f, 11.171573f, 9.5f, 12.0f, 9.5f),
                    PathNode.CurveTo(12.828427f, 9.5f, 13.5f, 8.828427f, 13.5f, 8.0f),
                    PathNode.CurveTo(13.5f, 7.171573f, 12.828427f, 6.5f, 12.0f, 6.5f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 14.5f),
                    PathNode.CurveTo(12.828427f, 14.5f, 13.5f, 15.171573f, 13.5f, 16.0f),
                    PathNode.CurveTo(13.5f, 16.828426f, 12.828427f, 17.5f, 12.0f, 17.5f),
                    PathNode.CurveTo(11.171573f, 17.5f, 10.5f, 16.828426f, 10.5f, 16.0f),
                    PathNode.CurveTo(10.5f, 15.171573f, 11.171573f, 14.5f, 12.0f, 14.5f)
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
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
