package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.MoodConfuzed: ImageVector
    get() {
        if (_moodConfuzed != null) return _moodConfuzed!!
        _moodConfuzed = tablerFilledIcon(
            name = "MoodConfuzed",
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
                    PathNode.MoveTo(15.57f, 13.502f),
                    PathNode.CurveTo(13.250918f, 13.340779f, 10.940379f, 13.918414f, 8.97f, 15.152f),
                    PathNode.CurveTo(8.501662f, 15.444711f, 8.359289f, 16.061663f, 8.652f, 16.53f),
                    PathNode.CurveTo(8.944711f, 16.998337f, 9.561663f, 17.14071f, 10.03f, 16.848f),
                    PathNode.CurveTo(11.642129f, 15.838702f, 13.53257f, 15.366092f, 15.43f, 15.498f),
                    PathNode.CurveTo(15.98118f, 15.53666f, 16.45934f, 15.121181f, 16.498f, 14.57f),
                    PathNode.CurveTo(16.53666f, 14.01882f, 16.12118f, 13.54066f, 15.57f, 13.502f),
                    PathNode.Close,
                    PathNode.MoveTo(9.01f, 9.0f),
                    PathNode.LineTo(8.883f, 9.007f),
                    PathNode.CurveTo(8.37995f, 9.066836f, 8.001114f, 9.493402f, 8.001114f, 10.0f),
                    PathNode.CurveTo(8.001114f, 10.506598f, 8.37995f, 10.933164f, 8.883f, 10.993f),
                    PathNode.LineTo(9.0f, 11.0f),
                    PathNode.LineTo(9.127f, 10.993f),
                    PathNode.CurveTo(9.630051f, 10.933164f, 10.008885f, 10.506598f, 10.008885f, 10.0f),
                    PathNode.CurveTo(10.008885f, 9.493402f, 9.630051f, 9.066836f, 9.127f, 9.007f),
                    PathNode.LineTo(9.01f, 9.0f),
                    PathNode.Close,
                    PathNode.MoveTo(15.01f, 9.0f),
                    PathNode.LineTo(14.883f, 9.007f),
                    PathNode.CurveTo(14.37995f, 9.066836f, 14.001114f, 9.493402f, 14.001114f, 10.0f),
                    PathNode.CurveTo(14.001114f, 10.506598f, 14.37995f, 10.933164f, 14.883f, 10.993f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.LineTo(15.127f, 10.993f),
                    PathNode.CurveTo(15.630051f, 10.933164f, 16.008886f, 10.506598f, 16.008886f, 10.0f),
                    PathNode.CurveTo(16.008886f, 9.493402f, 15.630051f, 9.066836f, 15.127f, 9.007f),
                    PathNode.LineTo(15.01f, 9.0f),
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
        return _moodConfuzed!!
    }

private var _moodConfuzed: ImageVector? = null
